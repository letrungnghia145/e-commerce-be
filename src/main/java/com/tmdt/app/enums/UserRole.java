package com.tmdt.app.enums;

import java.util.Set;

import com.google.common.collect.Sets;

public enum UserRole {
	ROLE_ADMIN(Sets.newHashSet(Permission.POST)), ROLE_EMPLOYEE(Sets.newHashSet()), ROLE_EMPLOYER(Sets.newHashSet());

	public Set<Permission> permissions;

	private UserRole(Set<Permission> permissions) {
		this.permissions = permissions;
	};
	@Override
	public String toString() {
		return permissions.toString();
	}
}
