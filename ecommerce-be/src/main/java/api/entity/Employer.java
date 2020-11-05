package api.entity;

import lombok.Setter;

import lombok.Getter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
@DiscriminatorValue("employer")
public class Employer extends User {
	
}
