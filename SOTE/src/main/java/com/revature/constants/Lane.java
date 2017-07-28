package com.revature.constants;

/**
 * defines the type lane (for swim lanes)
 * @author Brian McKalip
 *
 */
public class Lane{
	public static final short TODO = 1, IN_PROGRESS = 2, TEST = 3, VERIFY = 4, DONE = 5;
	
	public static short getLaneByName(String name){
		switch(name.toUpperCase()){
			case "TODO":
			case "TO DO":
				return Lane.TODO;
			case "IN PROGRESS":
			case "INPROGRESS":
				return Lane.IN_PROGRESS;
			case "TEST":
			case "TESTING":
				return Lane.TEST;
			case "VERIFY":
			case "VERIFYING":
				return Lane.VERIFY;
			case "DONE":
				return Lane.DONE;
			default:
				return 0;
		}
	}
};


