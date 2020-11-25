package com.profx.fixservices.marketDataRequest.request;

public class MarketDataSnapshotRequest {

	private String symbol;
	private String streamName;
	private String noMDEntries;
	private String mDEntryType;
	private String mDEntryPx;
	private String mDEntrySize;
	private String quoteEntryID;
	private String issuer;
	private String senderCompID;
	private String targetCompID;
	private String senderSubID;
	private String msgType;

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getStreamName() {
		return streamName;
	}

	public void setStreamName(String streamName) {
		this.streamName = streamName;
	}

	public String getNoMDEntries() {
		return noMDEntries;
	}

	public void setNoMDEntries(String noMDEntries) {
		this.noMDEntries = noMDEntries;
	}

	public String getmDEntryType() {
		return mDEntryType;
	}

	public void setmDEntryType(String mDEntryType) {
		this.mDEntryType = mDEntryType;
	}

	public String getmDEntryPx() {
		return mDEntryPx;
	}

	public void setmDEntryPx(String mDEntryPx) {
		this.mDEntryPx = mDEntryPx;
	}

	public String getmDEntrySize() {
		return mDEntrySize;
	}

	public void setmDEntrySize(String mDEntrySize) {
		this.mDEntrySize = mDEntrySize;
	}

	public String getQuoteEntryID() {
		return quoteEntryID;
	}

	public void setQuoteEntryID(String quoteEntryID) {
		this.quoteEntryID = quoteEntryID;
	}

	public String getIssuer() {
		return issuer;
	}

	public void setIssuer(String issuer) {
		this.issuer = issuer;
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
