package com.profx.fixservices.order.response;

public class OrderStatusResponse {
	private String msgType;

	private String clOrdID;

	private String senderCompID;

	private String targetCompID;

	private String senderSubID;

	private String status;
	
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public OrderStatusResponse() {}
	public OrderStatusResponse(String msgType, String clOrdID, String senderCompID, String targetCompID,
			String senderSubID, String status) {
		super();
		this.msgType = msgType;
		this.clOrdID = clOrdID;
		this.senderCompID = senderCompID;
		this.targetCompID = targetCompID;
		this.senderSubID = senderSubID;
		this.status = status;
	}
	
	

}
