package com.profx.fixservices.heartbeat.request;

public class HeartBeatRequest {
	

	private String senderCompID;
	private String targetCompID;
	private String	senderSubID;
	private String msgType;
	
	
	public String getSenderCompID() {
		return senderCompID;
	}
	public void setSenderCompID(String senderCompID) {
		this.senderCompID = senderCompID;
	}
	public String getTargetCompID() {
		return targetCompID;
	}
	public void setTargetCompID(String targetCompID) {
		this.targetCompID = targetCompID;
	}
	public String getSenderSubID() {
		return senderSubID;
	}
	public void setSenderSubID(String senderSubID) {
		this.senderSubID = senderSubID;
	}
	public String getMsgType() {
		return msgType;
	}
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}
	
	
	


}
