package com.tmdt.app.enums;

import java.util.Set;

import com.google.common.collect.Sets;

public enum UserRole {
	ROLE_ADMIN(Sets.newHashSet(
			Permission.POST_CREATE,
			Permission.POST_DELETE,
			Permission.POST_UPDATE,
			Permission.POST_VIEW_MANAGEMENT,
			Permission.ACCOUNT_ALL,
			Permission.ACCOUNT_UPGRADE,
			Permission.ACCOUNT_MANAGEMENT,
			Permission.SERVICE_PACK_CREATE,
			Permission.SERVICE_PACK_UPDATE,
			Permission.SERVICE_PACK_DELETE,
			Permission.PROFIT
	)), 
	
	ROLE_EMPLOYEE(Sets.newHashSet(
			Permission.PROFILE_CREATE,
			Permission.PROFILE_UPDATE
	)), 
	
	ROLE_EMPLOYER(Sets.newHashSet(
			Permission.PROFILE_CREATE,
			Permission.PROFILE_UPDATE,
			Permission.SERVICE_PACK_CURRENT
	));

	public Set<Permission> permissions;

	private UserRole(Set<Permission> permissions) {
		this.permissions = permissions;
	};
	@Override
	public String toString() {
		return permissions.toString();
	}
}
