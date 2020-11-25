package com.profx.fixservices.apigateway.services;



import com.profx.fixservices.apigateway.model.User;
import com.profx.fixservices.apigateway.request.LoginUser;


public interface UserService {
	 public User save(LoginUser user);
	 public User findOne(String userid);
	 public User findByUserAndPassword(LoginUser user);
}
