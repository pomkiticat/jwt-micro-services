package com.profx.fixservices.order.response;

public class SingleOrderResponse {
	
private String clOrdID;
	
	private String accountID;

	private String symbol;

	private String currency;	

	private String	side;  

	private String orderQty;

	//private String OrdType Enum

	private String price;

	private String minQty;

	private String deviation;	

	private String timeInForce;	 
		
	private String onBehalfOfCompID;
		
	private String onBehalfOfSubID;
			
	private String	secondaryClOrdID;
			
	private String	secondaryExecID;
			
	private String	msgType;
	
	private String settlDate;
	
	private String status;

	public String getClOrdID() {
		return clOrdID;
	}

	public void setClOrdID(String clOrdID) {
		this.clOrdID = clOrdID;
	}

	public String getAccountID() {
		return accountID;
	}

	public void setAccountID(String accountID) {
		this.accountID = accountID;
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

	public String getSide() {
		return side;
	}

	public void setSide(String side) {
		this.side = side;
	}

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

	public String getMinQty() {
		return minQty;
	}

	public void setMinQty(String minQty) {
		this.minQty = minQty;
	}

	public String getDeviation() {
		return deviation;
	}

	public void setDeviation(String deviation) {
		this.deviation = deviation;
	}

	public String getTimeInForce() {
		return timeInForce;
	}

	public void setTimeInForce(String timeInForce) {
		this.timeInForce = timeInForce;
	}

	public String getOnBehalfOfCompID() {
		return onBehalfOfCompID;
	}

	public void setOnBehalfOfCompID(String onBehalfOfCompID) {
		this.onBehalfOfCompID = onBehalfOfCompID;
	}

	public String getOnBehalfOfSubID() {
		return onBehalfOfSubID;
	}

	public void setOnBehalfOfSubID(String onBehalfOfSubID) {
		this.onBehalfOfSubID = onBehalfOfSubID;
	}

	public String getSecondaryClOrdID() {
		return secondaryClOrdID;
	}

	public void setSecondaryClOrdID(String secondaryClOrdID) {
		this.secondaryClOrdID = secondaryClOrdID;
	}

	public String getSecondaryExecID() {
		return secondaryExecID;
	}

	public void setSecondaryExecID(String secondaryExecID) {
		this.secondaryExecID = secondaryExecID;
	}

	public String getMsgType() {
		return msgType;
	}

	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	public String getSettlDate() {
		return settlDate;
	}

	public void setSettlDate(String settlDate) {
		this.settlDate = settlDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public SingleOrderResponse() {}

	public SingleOrderResponse(String clOrdID, String accountID, String symbol, String currency, String side,
			String orderQty, String price, String minQty, String deviation, String timeInForce, String onBehalfOfCompID,
			String onBehalfOfSubID, String secondaryClOrdID, String secondaryExecID, String msgType, String settlDate,
			String status) {
		super();
		this.clOrdID = clOrdID;
		this.accountID = accountID;
		this.symbol = symbol;
		this.currency = currency;
		this.side = side;
		this.orderQty = orderQty;
		this.price = price;
		this.minQty = minQty;
		this.deviation = deviation;
		this.timeInForce = timeInForce;
		this.onBehalfOfCompID = onBehalfOfCompID;
		this.onBehalfOfSubID = onBehalfOfSubID;
		this.secondaryClOrdID = secondaryClOrdID;
		this.secondaryExecID = secondaryExecID;
		this.msgType = msgType;
		this.settlDate = settlDate;
		this.status = status;
	}

	

}
