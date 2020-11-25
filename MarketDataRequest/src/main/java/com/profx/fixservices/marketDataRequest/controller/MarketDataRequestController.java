package com.profx.fixservices.marketDataRequest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.profx.fixservices.marketDataRequest.request.MarketDataRequest;
import com.profx.fixservices.marketDataRequest.request.MarketDataSnapshotRequest;
import com.profx.fixservices.marketDataRequest.response.MarketDataResponse;
import com.profx.fixservices.marketDataRequest.response.MarketDataSnapshotResponse;



@RestController
public class MarketDataRequestController {
	private static final Logger logger = LoggerFactory.getLogger(MarketDataRequestController.class);
	
	@PostMapping("/marketDataRequest")
	public MarketDataResponse doMarketDataRequest(@RequestBody MarketDataRequest request)throws Exception{
		System.out.print("MarketDataRequest");
		MarketDataResponse response=new MarketDataResponse();
		String[] symbol= {"USD","EUR"}; 
		String[] streamReferenc={"AA","BB"};
		logger.info("MarketDataRequest");
		
		response.setMarketDepth(request.getMarketDepth());
		response.setStreamReference(streamReferenc);
		response.setMsgType(request.getMsgType());
		response.setOrderQty(request.getOrderQty());
		response.setSenderSubID(request.getSenderCompID());
		response.setSenderCompID(request.getSenderCompID());
		response.setSymbol(symbol);
		response.setStatus("status");
		response.setSubscriptionRequestType(request.getSubscriptionRequestType());
		response.setTargetCompID(request.getTargetCompID());
		return response;
		//return "MarketDataRequest";
	}
	
	@PostMapping("/marketDataSnapshot")
	
	public MarketDataSnapshotResponse doMarketDataSnapshot(@RequestBody MarketDataSnapshotRequest request) {
		logger.info("marketDataSnapshot");
		MarketDataSnapshotResponse response=new MarketDataSnapshotResponse();
	 String[] mDEntryType= {"MD","Entry","TYpe"};
		 String[] mDEntryPx= {"MD","Entry","px"};
		 String[] mDEntrySize ={"MD","Entry","size"};;
		 String[] quoteEntryID= {"quote","Entry","TYpe"};;
	   String[] issuer= {"issue","Entry","TYpe"};
	   
	   response.setIssuer(issuer);
	   response.setmDEntryPx(mDEntryPx);
	   response.setmDEntrySize(mDEntrySize);
	   response.setmDEntryType(mDEntryType);
	   response.setQuoteEntryID(quoteEntryID);
	   response.setNoMDEntries(request.getNoMDEntries());
	   response.setSenderCompID(request.getSenderCompID());
	   response.setSenderSubID(request.getSenderSubID());
	   response.setSymbol(request.getSymbol());
	   response.setStreamName(request.getStreamName());
	   response.setTargetCompID(request.getTargetCompID());
	   response.setMsgType(request.getMsgType());
	   response.setStatus("Status");
		return response;
	}
	
	

}
