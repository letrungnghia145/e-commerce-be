package api.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@DiscriminatorValue("employee")
public class Employee extends User{
	@OneToOne(fetch = FetchType.LAZY)
	private FollowList followList;
	
}
