package com.profx.fixservices.logon.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.profx.fixservices.logon.request.LogonRequest;
import com.profx.fixservices.logon.response.LogonResponse;


//import com.profx.fixservices.profx.model.User;

@RestController
public class LogonController {
	
	private static final Logger logger = LoggerFactory.getLogger(LogonController.class);
	
	@PostMapping("/login")
	public LogonResponse  doLogon(@RequestBody LogonRequest request)throws Exception{
		logger.info("login");
		LogonResponse response=new LogonResponse();
		response.setChecksum(request.getChecksum());
		response.setHeartBtInt(request.getHeartBtInt());
		response.setMsgType(request.getMsgType());
		response.setSenderSubID(request.getSenderSubID());
		response.setSenderCompID(request.getSenderCompID());
		response.setTargetCompID(request.getTargetCompID());
		response.setStatus("status");
		return response;
		//return "login Pampa Aich ";
	}

}
