package com.practice.aws.java_lambda_api;

import java.util.Collections;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaJavaAPI implements RequestHandler<Object, GatewayResponse>{

	@Override
	public GatewayResponse handleRequest(Object input, Context context) {
		String message = "Hello from Java Lambda";
		System.out.println(message);
		
		GatewayResponse response = new GatewayResponse(
				message,
				200,
				Collections.singletonMap("X-API", "Valve"),
				false);
		
		return response;
	}

}
