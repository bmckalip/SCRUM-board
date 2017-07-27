package com.revature.constants;

/**
 * defines the type lane
 * @author Brian McKalip
 *
 */
public enum Lane{
	NULL, TODO, IN_PROGRESS, TEST, VERIFY, DONE;
	
	public static Lane getLaneByName(String name){
		switch(name.toLowerCase()){
			case "todo":
			case "to do":
				return Lane.TODO;
			case "in progress":
			case "inprogress":
				return Lane.IN_PROGRESS;
			case "test":
			case "testing":
				return Lane.TEST;
			case "verify":
			case "verifying":
				return Lane.VERIFY;
			case "done":
				return Lane.DONE;
			default:
				return Lane.NULL;
		}
	}
	
	public static Lane getLaneById(int id){
		switch(id){
			case 1:
				return Lane.TODO;
			case 2:
				return Lane.IN_PROGRESS;
			case 3:
				return Lane.TEST;
			case 4:
				return Lane.VERIFY;
			case 5:
				return Lane.DONE;
			default:
				return Lane.NULL;
		}
	}
};


