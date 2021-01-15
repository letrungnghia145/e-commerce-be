package com.tmdt.app.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class UserPackage {
	@EmbeddedId
	private PkUserPackage pk;
	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("userId")
	private User user;
	@MapsId("packageId")
	@JoinColumn(name = "package_id")
	@ManyToOne(fetch = FetchType.LAZY)
	private Package packageType;

	private Long duration;
	private Long countLeftPost;

	public UserPackage(User user, Package packageType, Long duration, Long countLeftPost) {
		super();
		this.pk = new PkUserPackage(user.getId(), packageType.getId());
		this.user = user;
		this.packageType = packageType;
		this.duration = duration;
		this.countLeftPost = countLeftPost;
	}

}
