package api.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Domain {
	@Id
	private String domain_id;
	private String domain_name;
	
	@OneToMany(mappedBy = "post_domain")
	
	private Set<Post> domain_posts = new HashSet<>();
}
