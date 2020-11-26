package api.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@DiscriminatorValue("employer")
public class Employer extends User {

	// Mapping
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "post_employer")
	private Set<Post> employer_post = new HashSet<>();

	@ManyToMany(mappedBy = "employers", fetch = FetchType.LAZY)
	private Set<FollowList> followLists = new HashSet<>();
}
