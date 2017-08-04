package com.revature.service;

import com.revature.dao.UserDao;
import com.revature.dao.impl.UserDaoImpl;
import com.revature.pojo.User;

public class LoginService {
	public class Service {
    	private UserDao dao = new UserDaoImpl();
    	public User authenticateUser(User user){
    		UserDao dao = new UserDaoImpl();
    		User TrUser = dao.getUserByEmail(user);
    		
    		if(TrUser != null && TrUser.getUserEmail().equals(user.getUserEmail())
    				&& TrUser.getUserPassword().equals(user.getUserPassword())){
    			return TrUser;
    		}
			return user;
    		
    		
    	}
    }
}
