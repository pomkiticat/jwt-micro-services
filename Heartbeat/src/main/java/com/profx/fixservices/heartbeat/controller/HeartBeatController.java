package com.profx.fixservices.heartbeat.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.profx.fixservices.heartbeat.request.HeartBeatRequest;
import com.profx.fixservices.heartbeat.response.HeartBeatResponse;


//import com.profx.fixservices.profx.model.User;

@RestController
public class HeartBeatController {
	
	private static final Logger logger = LoggerFactory.getLogger(HeartBeatController.class);
	
	@PostMapping("/heartBeat")
	public HeartBeatResponse  doLogon(@RequestBody HeartBeatRequest request)throws Exception{
		logger.info("heartBeat");
		HeartBeatResponse response=new HeartBeatResponse();
	
		response.setMsgType(request.getMsgType());
		response.setSenderSubID(request.getSenderSubID());
		response.setSenderCompID(request.getSenderCompID());
		response.setTargetCompID(request.getTargetCompID());
		response.setStatus("status");
		return response;
		
	}

}
