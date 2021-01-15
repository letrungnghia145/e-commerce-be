package com.tmdt.app.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User extends AbstractModel {
	private String name;
	private String phone;
	private String email;
	private String password;

	private String address;
	private String representativeCompany;
	private String employmentEmail;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	private Set<Order> orders;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "user")
	private Set<UserPackage> userPackages;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	private Set<Post> posts;

	@ManyToOne(fetch = FetchType.LAZY)
	private Role role;

}
