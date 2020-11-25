package com.profx.fixservices.logon.response;

public class LogonResponse {
	
	
	private String senderCompID;
	private String targetCompID;
	private String	senderSubID;
	private String msgType;
	private String heartBtInt;
	private String checksum;
	private String status;
	

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
	public String getHeartBtInt() {
		return heartBtInt;
	}
	public void setHeartBtInt(String heartBtInt) {
		this.heartBtInt = heartBtInt;
	}
	public String getChecksum() {
		return checksum;
	}
	public void setChecksum(String checksum) {
		this.checksum = checksum;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
