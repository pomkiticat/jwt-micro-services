package com.profx.fixservices.apigateway.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.profx.fixservices.apigateway.jwt.JwtTokenUtil;
import com.profx.fixservices.apigateway.model.User;
import com.profx.fixservices.apigateway.request.LoginUser;
import com.profx.fixservices.apigateway.services.UserService;

@RestController
@RequestMapping("/token")
public class AuthenticationController {
	private static final Logger logger = LoggerFactory.getLogger(AuthenticationController.class);

	@Autowired
	private AuthenticationManager authenticationManager;
	@Autowired
	private JwtTokenUtil jwtTokenUtil;
	@Autowired
	private UserService userService;

	@PostMapping("/generate-token")
	public ResponseEntity<?> generateToken(@RequestBody LoginUser loginUser) throws AuthenticationException {
		logger.info("aslgflasjgflas");
		try {
		final Authentication authentication = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(loginUser.getUsername(), loginUser.getPassword()));
		//SecurityContextHolder.getContext().setAuthentication(authentication);
		logger.info("user :"+loginUser.getUsername());
	//	final User user = userService.findOne(loginUser);
		final User user = userService.findByUserAndPassword(loginUser);
		logger.info("user post :"+user.getUsername());
		}catch(Exception ex) {
			logger.info(ex.getMessage());
			
		}
		// final String token = jwtTokenUtil.generateToken(user);
		final String token = jwtTokenUtil.doGenerateToken(loginUser.getUsername());
		// return ResponseEntity.ok(new AuthToken(token));
		return ResponseEntity.ok(token);
	}

}
