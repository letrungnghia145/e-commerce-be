package com.tmdt.app.model;

import java.math.BigDecimal;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import com.tmdt.app.enums.PackageType;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Package extends AbstractModel {
	private final Long duration = 30L;
	private PackageType type;
	private BigDecimal price;
	private String description;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "packageType")
	private Set<Order> orders;

	@OneToMany(mappedBy = "packageType")
	private Set<UserPackage> userPackages;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "packageType")
	private Set<Post> posts;
}
