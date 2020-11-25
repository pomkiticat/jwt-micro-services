package com.profx.fixservices.order.response;

public class ExcutionResponse {

	private String clOrdID;

	private String execID;

	private String execType;

	private String side;

	private String orderQty;

//OrdType Enum

	private String price;

	private String minQty;

	private String deviation;

	private String timeInForce;

	private String[] symbol;

	private String[] currency;

	private String[] orderID;

	private String ordStatus;

	private String lastQty;

	private String lastPx;

	private String avgPx;

	private String settlDate;

	private String msType;

	private String senderCompID;

	private String targetCompID;

	private String senderSubID;

	private String status;
	
	public String getClOrdID() {
		return clOrdID;
	}

	public void setClOrdID(String clOrdID) {
		this.clOrdID = clOrdID;
	}

	public String getExecID() {
		return execID;
	}

	public void setExecID(String execID) {
		this.execID = execID;
	}

	public String getExecType() {
		return execType;
	}

	public void setExecType(String execType) {
		this.execType = execType;
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

	public String[] getSymbol() {
		return symbol;
	}

	public void setSymbol(String[] symbol) {
		this.symbol = symbol;
	}

	public String[] getCurrency() {
		return currency;
	}

	public void setCurrency(String[] currency) {
		this.currency = currency;
	}

	public String[] getOrderID() {
		return orderID;
	}

	public void setOrderID(String[] orderID) {
		this.orderID = orderID;
	}

	public String getOrdStatus() {
		return ordStatus;
	}

	public void setOrdStatus(String ordStatus) {
		this.ordStatus = ordStatus;
	}

	public String getLastQty() {
		return lastQty;
	}

	public void setLastQty(String lastQty) {
		this.lastQty = lastQty;
	}

	public String getLastPx() {
		return lastPx;
	}

	public void setLastPx(String lastPx) {
		this.lastPx = lastPx;
	}

	public String getAvgPx() {
		return avgPx;
	}

	public void setAvgPx(String avgPx) {
		this.avgPx = avgPx;
	}

	public String getSettlDate() {
		return settlDate;
	}

	public void setSettlDate(String settlDate) {
		this.settlDate = settlDate;
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
	
	
	
	public String getMsType() {
		return msType;
	}

	public void setMsType(String msType) {
		this.msType = msType;
	}

	public ExcutionResponse() {}

	public ExcutionResponse(String clOrdID, String execID, String execType, String side, String orderQty, String price,
			String minQty, String deviation, String timeInForce, 
			String ordStatus, String lastQty, String lastPx, String avgPx, String settlDate, String msgType,
			String senderCompID, String targetCompID, String senderSubID, String status) {
		super();
		this.clOrdID = clOrdID;
		this.execID = execID;
		this.execType = execType;
		this.side = side;
		this.orderQty = orderQty;
		this.price = price;
		this.minQty = minQty;
		this.deviation = deviation;
		this.timeInForce = timeInForce;
		this.ordStatus = ordStatus;
		this.lastQty = lastQty;
		this.lastPx = lastPx;
		this.avgPx = avgPx;
		this.settlDate = settlDate;
		this.msType = msgType;
		this.senderCompID = senderCompID;
		this.targetCompID = targetCompID;
		this.senderSubID = senderSubID;
		this.status = status;
	}
	
	

}
