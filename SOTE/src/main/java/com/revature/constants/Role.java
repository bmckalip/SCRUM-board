package com.revature.constants;

import java.util.ArrayList;
import java.util.List;

import static com.revature.constants.Permission.*;

/**
 * defines default roles each containing lists of permissions
 * @author Brian McKalip
 *
 */
public class Role {
	//state
	private List<Short> permissions = new ArrayList<>();
	
	public List<Short> getPermissions(){
		return permissions;
	}

	@Override
	public String toString() {
		return "Role [permissions=" + permissions + "]";
	}
	
	//define some (static) default roles
	public static  final Role AUTHOR = new Role();
	public static final Role ADMIN = new Role();
	public static final Role CONTRIBUTOR = new Role();
	public static final Role VIEWER = new Role();
	static{
		//add role permissions to viewer role
		VIEWER.permissions.add(VIEW);
		
		//inherit all permissions from viewer role
		CONTRIBUTOR.permissions.addAll(VIEWER.permissions);
		
		//add additional role permissions to contributor role
		CONTRIBUTOR.permissions.add(ADD_STORY);
		CONTRIBUTOR.permissions.add(REMOVE_STORY);
		CONTRIBUTOR.permissions.add(MOVE_STORY);
		CONTRIBUTOR.permissions.add(ADD_TASK);
		CONTRIBUTOR.permissions.add(REMOVE_TASK);
		
		//inherit all permissions from contributor role
		ADMIN.permissions.addAll(CONTRIBUTOR.permissions);
		
		//add additional role permissions to admin role
		ADMIN.permissions.add(ADD_MEMBER);
		ADMIN.permissions.add(REMOVE_MEMBER);
		
		//inherit all permissions from admin role
		AUTHOR.permissions.addAll(ADMIN.permissions);
		
		//add additional permissions to author role
		AUTHOR.permissions.add(DELETE);
	}
}
