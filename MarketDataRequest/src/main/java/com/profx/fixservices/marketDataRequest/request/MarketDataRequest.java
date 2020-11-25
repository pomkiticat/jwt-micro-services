package com.profx.fixservices.marketDataRequest.request;

public class MarketDataRequest {
	
	private String subscriptionRequestType;
	private String marketDepth;
	private String orderQty;
	private String symbol ;
	private String streamReference;
	private String senderCompID;
	private String targetCompID;
	private String senderSubID;
	private String msgType;
	public String getSubscriptionRequestType() {
		return subscriptionRequestType;
	}
	public void setSubscriptionRequestType(String subscriptionRequestType) {
		this.subscriptionRequestType = subscriptionRequestType;
	}
	public String getMarketDepth() {
		return marketDepth;
	}
	public void setMarketDepth(String marketDepth) {
		this.marketDepth = marketDepth;
	}
	public String getOrderQty() {
		return orderQty;
	}
	public void setOrderQty(String orderQty) {
		this.orderQty = orderQty;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getStreamReference() {
		return streamReference;
	}
	public void setStreamReference(String streamReference) {
		this.streamReference = streamReference;
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
	public String getMsgType() {
		return msgType;
	}
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}
	
	


}
