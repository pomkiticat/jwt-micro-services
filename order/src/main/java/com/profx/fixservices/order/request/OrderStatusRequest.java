package com.profx.fixservices.order.request;

public class OrderStatusRequest {
	private String msgType;

	private String clOrdID;

	private String senderCompID;

	private String targetCompID;

	private String senderSubID;

	public String getMsgType() {
		return msgType;
	}

	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	public String getClOrdID() {
		return clOrdID;
	}

	public void setClOrdID(String clOrdID) {
		this.clOrdID = clOrdID;
	}

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

}
