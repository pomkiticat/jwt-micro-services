package com.profx.fixservices.order.request;

public class ExcutionRequest {

	private String orderQty;

//OrdType Enum

	private String price;

	private String symbol;

	private String currency;

	private String orderID;

	private String ordStatus;

	private String settlDate;

	private String msgType;

	private String senderCompID;

	private String targetCompID;

	private String senderSubID;

	public String getOrderQty() {
		return orderQty;
	}

	public void setOrderQty(String orderQty) {
		this.orderQty = orderQty;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public String getOrdStatus() {
		return ordStatus;
	}

	public void setOrdStatus(String ordStatus) {
		this.ordStatus = ordStatus;
	}

	public String getSettlDate() {
		return settlDate;
	}

	public void setSettlDate(String settlDate) {
		this.settlDate = settlDate;
	}

	public String getMsgType() {
		return msgType;
	}

	public void setMsgType(String msgType) {
		this.msgType = msgType;
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

	public ExcutionRequest() {}
	public ExcutionRequest(String orderQty, String price, String symbol, String currency, String orderID,
			String ordStatus, String settlDate, String msgType, String senderCompID, String targetCompID,
			String senderSubID) {
		super();
		this.orderQty = orderQty;
		this.price = price;
		this.symbol = symbol;
		this.currency = currency;
		this.orderID = orderID;
		this.ordStatus = ordStatus;
		this.settlDate = settlDate;
		this.msgType = msgType;
		this.senderCompID = senderCompID;
		this.targetCompID = targetCompID;
		this.senderSubID = senderSubID;
	}
	
	

}
