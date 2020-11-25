package com.profx.fixservices.order.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.profx.fixservices.order.request.*;

import com.profx.fixservices.order.response.*;

@RestController
public class OrderController {
	private static final Logger logger = LoggerFactory.getLogger(OrderController.class);

	@PostMapping("/orderSingleRequest")
	public SingleOrderResponse getSingleOrderRequest(@RequestBody SingleOrderRequest request) throws Exception {
		SingleOrderResponse response = new SingleOrderResponse("clOrdID", "accountID", "symbol", "currency", "side",
				"orderQty", "price", "minQty", "deviation", "timeInForce", "onBehalfOfCompID", "onBehalfOfSubID",
				"secondaryClOrdID", "secondaryExecID", "msgType", "settlDate", "status");
		logger.info("orderSingleRequest");
		return response;
	}

	@PostMapping("/excutionRepost")
	public ExcutionResponse getExcutionReport(@RequestBody ExcutionRequest request) throws Exception {
		ExcutionResponse response = new ExcutionResponse("clOrdID", "execID", "execType", "side", "orderQty", "price",
				"minQty", "deviation", "timeInForce", "ordStatus", "lastQty", "lastPx", "avgPx", "settlDate", "msgType",
				"senderCompID", "targetCompID", "senderSubID", "status");
		logger.info("excution report");
		return response;
	}

	@PostMapping("/orderStatusRequest")
	public OrderStatusResponse getOrderStatusRequest(@RequestBody OrderStatusRequest request) throws Exception {
		OrderStatusResponse response = new OrderStatusResponse("msgType", "clOrdID", "senderCompID", "targetCompID",
				"senderSubID", "status");
		logger.info("order status request");
		return response;
	}
}
