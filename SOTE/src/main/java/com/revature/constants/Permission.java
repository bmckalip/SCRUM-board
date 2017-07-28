package com.revature.constants;

/**
 * Defines all available permissions a user can be given. see Role class for some predefined roles containing
 * lists of permissions
 * @author Brian McKalip
 *
 */
public class Permission{
	public static final short 	VIEW = 1, DELETE = 2, 
								ADD_MEMBER = 3, REMOVE_MEMBER = 4,
								ADD_STORY = 5, REMOVE_STORY = 6, MOVE_STORY = 7, 
								ADD_TASK = 8, REMOVE_TASK = 9;
	
	/**
	 * Returns the short associated with the permission name
	 * @param name
	 * @return short permissionId
	 */
	public static short getPermissionByName(String name){
		switch(name.toUpperCase()){
			case "VIEW":
				return VIEW;
			case "DELETE":
				return DELETE;
			case "ADD_MEMBER":
			case "ADDMEMBER":
				return ADD_MEMBER;
			case "REMOVE_MEMBER":
			case "REMOVEMEMBER":
				return REMOVE_MEMBER;
			case "ADD_STORY":
			case "ADDSTORY":
				return ADD_STORY;
			case "REMOVE_STORY":
			case "REMOVESTORY":
				return ADD_TASK;
			case "MOVE_STORY":
			case "MOVESTORY":
				return MOVE_STORY;
			case "ADD_TASK":
			case "ADDTASK":
				return ADD_TASK;
			case "REMOVE_TASK":
			case "REMOVETASK":
				return REMOVE_TASK;
			default:
				return 0;
		}
	}
}
