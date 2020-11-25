package com.profx.fixservices.apigateway.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.profx.fixservices.apigateway.model.User;
import com.profx.fixservices.apigateway.request.LoginUser;
import com.profx.fixservices.apigateway.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	   @Autowired
	    private UserService userService;
	    @PostMapping("/signup")
	    public User saveUser(@RequestBody LoginUser user){
	      return userService.save(user);
	    }
}
