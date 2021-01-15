package com.tmdt.app.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import com.tmdt.app.enums.DomainType;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Domain extends AbstractModel {
	private DomainType type;
	private String description;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "domain")
	private Set<Post> posts;
}
