package com.revature.services;

import com.revature.dao.UserDao;
import com.revature.dao.UserDaoImpl;
import com.revature.pojo.UserModel;

public class UserService {

	/**
	 * Takes in a user model with username and password fields,  
	 * then compares the username and password against those in the database.
	 * Returns the database user model only if the passwords and usernames match, 
	 * otherwise the method will return null.
	 * 
	 * @param UserModel
	 * @return UserModel from database or null
	 */
	public UserModel validateUser(UserModel user){
		
		UserDao dao = new UserDaoImpl();
		UserModel dbUser = dao.getUserById(user);
		
		if(user != null && dbUser != null){
			if( user.getUsername().equals(dbUser.getUsername() )  
				&& user.getPassword().equals(dbUser.getPassword())){
				//returns user from db if usernames and passwords match
				return dbUser;
			}
		}
		//else
		return null;
	}

}
