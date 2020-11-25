package com.profx.fixservices.apigateway.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.profx.fixservices.apigateway.model.User;
import com.profx.fixservices.apigateway.repository.UserRepository;
import com.profx.fixservices.apigateway.request.LoginUser;

@Service(value = "userService")
public class UserServiceImpl implements UserDetailsService, UserService {
	 @Autowired
	   private UserRepository userDao;   
	   @Autowired
	   private BCryptPasswordEncoder passwordEncoder;      
	   @Override
	   public User save(LoginUser user) {
	         User newUser = new User();
	         newUser.setUsername(user.getUsername());
	         newUser.setPassword(user.getPassword());
	         return userDao.save(newUser);
	    }
	   public UserDetails loadUserByUsername(String userId) throws
	               UsernameNotFoundException {
	         User user = userDao.findByUsername(userId);
	         if(user == null){
	            throw new UsernameNotFoundException("Invalid username or password.");
	         }
	         return new org.springframework.security.core.userdetails.User(
	            user.getUsername(), user.getPassword(), new ArrayList<>());
	         }
	   //find user and password
	@Override
	public User findOne(String userid) {
		 User newUser = new User();
         newUser.setUsername(userid);
         newUser.setPassword("123456");
         return newUser;
	}
	@Override
	public User findByUserAndPassword(LoginUser user) {
		//fetch and check the login data with the database data
		 User newUser = new User();
		 newUser=userDao.findByNameAndPassword(user);
		return newUser;
	}


}
