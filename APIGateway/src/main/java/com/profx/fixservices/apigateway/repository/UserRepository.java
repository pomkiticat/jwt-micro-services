package com.profx.fixservices.apigateway.repository;

import org.springframework.stereotype.Repository;

import com.profx.fixservices.apigateway.model.User;
import com.profx.fixservices.apigateway.request.LoginUser;

@Repository
public class UserRepository {
	
	public User findByUsername(String userId) {
		//check the database for fetch the user time of authentication
		User user=new User(userId,"123456");
		return user;
	}
	
	public User findByNameAndPassword(LoginUser loginUser) {
		//check the database for user id and password time of generate token
		User user=new User("admin","123456");
		return user;
	}
	
public User save(User newUser) {
		
		User user=new User(newUser);
		return user;
	}

}
