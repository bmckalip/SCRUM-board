package com.revature.constants;

public class Driver {

	public static void main(String[] args) {
		Role admin = Role.VIEWER;
		System.out.println(admin.getPermissions());
		short perm = Permission.ADD_MEMBER;
	}
}
