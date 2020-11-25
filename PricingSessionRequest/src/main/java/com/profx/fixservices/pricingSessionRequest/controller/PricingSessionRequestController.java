package com.profx.fixservices.pricingSessionRequest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.profx.fixservices.pricingSessionRequest.request.PricingSessionRequest;
import com.profx.fixservices.pricingSessionRequest.response.BidOfferInfoResponse;
import com.profx.fixservices.pricingSessionRequest.response.PricingSessionResponse;




@RestController
public class PricingSessionRequestController {
	
	private static final Logger logger = LoggerFactory.getLogger(PricingSessionRequestController.class);
	@PostMapping("/pricingSessionRequest")
	public PricingSessionResponse doPricingSessionRequest(@RequestBody PricingSessionRequest request)throws Exception{
		PricingSessionResponse response=new PricingSessionResponse();
		try {
		System.out.print("PricingSessionRequest controller");
		 String[] bitsize = {"bit","size"};
	 String[] offersize= {"offer","size"};
	 		 String[] bitspotrate= {"bit","spot","rate"};
		 String[] offerspotrate= {"offer","spot","rate"};
		 String[] symbol= {"USD","EUR"};
		 String[]  currency= {"AA","VV"};
		BidOfferInfoResponse bioresponse=new BidOfferInfoResponse();
		
		bioresponse.setBitsize(bitsize);
		bioresponse.setBitspotrate(bitspotrate);
		bioresponse.setOffersize(offersize);
		bioresponse.setOfferspotrate(offerspotrate);
		
		response.setBidOffer(bioresponse);
		response.setChecksum(request.getChecksum());
		response.setCurrency(currency);
		response.setHeartBtInt(request.getHeartBtInt());
		response.setMsgType(request.getMsgType());
		response.setSenderCompID(request.getSenderCompID());
		response.setSenderSubID(request.getSenderSubID());
		response.setSymbol(symbol);
		response.setTargetCompID(request.getTargetCompID());
		response.setStatus("Status");
		
		
		
		logger.info("PricingSessionRequest controller");
		}catch(Exception ex) {
			logger.info(ex.getMessage());
		}
		//return "PricingSessionRequest";
		return response;
	}

}
