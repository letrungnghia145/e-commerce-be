package com.tmdt.app.enums;

public enum Permission {
	//Chia quyen theo role
	//dinh nghia tat ca quyen co trong he thong
	
	//bai dang
	POST_CREATE("post:create"),
	POST_UPDATE("post:update"),
	POST_DELETE("post:delete"),
	POST_VIEW_MANAGEMENT("post:view"),
	
	//profile
	PROFILE_CREATE("profile:create"),
	PROFILE_UPDATE("profile:update"),
	
	//tai khoan
	ACCOUNT_ALL("account:get"),
	ACCOUNT_UPGRADE("account:upgrade"),
	ACCOUNT_MANAGEMENT("account:management"),
	
	//goi dich vu
	SERVICE_PACK_CURRENT("pack:current"),	//xem goi dich vu hien tai
	SERVICE_PACK_CREATE("pack:create"),
	SERVICE_PACK_UPDATE("pack:update"),
	SERVICE_PACK_DELETE("pack:delete"),
	
	//loi nhuan
	PROFIT("profit:management");

	private String permission;

	private Permission(String permission) {
		this.permission = permission;
	}

	@Override
	public String toString() {
		return this.permission;
	}
}
