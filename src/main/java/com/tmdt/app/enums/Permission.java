package com.tmdt.app.enums;

public enum Permission {
	//Chia quyen theo role
	//dinh nghia tat ca quyen co trong he thong
	POST("create:post"),
	MANAGE_ACCOUNT("manage:account");
	

	private String permission;

	private Permission(String permission) {
		this.permission = permission;
	}

	@Override
	public String toString() {
		return this.permission;
	}
}
