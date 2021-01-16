package com.tmdt.app.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class User extends AbstractModel {
	private String name;
	private String phone;
	private String email;
	private String password;

	// Employer
	private String address;
	private String representativeCompany;
	private String employmentEmail;
	
	
	@ElementCollection(fetch = FetchType.LAZY)
	@CollectionTable(name = "employer_employee", joinColumns = @JoinColumn(name = "employee_id"))
	private Set<User> employees;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	private Set<Order> orders;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "user")
	private Set<UserPackage> userPackages;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	private Set<Post> posts;

	@ManyToOne(fetch = FetchType.EAGER)
	private Role role;

}
