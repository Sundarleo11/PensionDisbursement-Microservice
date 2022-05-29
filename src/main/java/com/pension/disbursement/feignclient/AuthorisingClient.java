package com.pension.disbursement.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;

//@FeignClient(name = "Authorizatiion-Microservice", url = "http://localhost:8000/auth/api")
@FeignClient(name = "Authorizatiion-Microservice", url = "http://pms-prod-auth-lb-1622755753.us-east-1.elb.amazonaws.com/auth/api")
public interface AuthorisingClient {

	@PostMapping("/authorize")
	public boolean authorizeTheRequest(@RequestHeader(value = "Authorization", required = true) String requestTokenHeader);
}
