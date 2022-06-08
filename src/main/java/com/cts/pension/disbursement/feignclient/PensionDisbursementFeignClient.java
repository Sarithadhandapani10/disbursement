package com.cts.pension.disbursement.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

import com.cts.pension.disbursement.exception.AadharNumberNotFound;
import com.cts.pension.disbursement.exception.AuthorizationException;
import com.cts.pension.disbursement.model.PensionerDetail;

import io.swagger.annotations.ApiParam;

@FeignClient(name ="PensionerDetail-Microservice",url = "saritha-pms-detailslb-1224191489.us-east-1.elb.amazonaws.com/pensioner/jwt/t1")
public interface PensionDisbursementFeignClient {
	
	@GetMapping("/PensionerDetailByAadhaar/{aadharNumber}")
	public PensionerDetail getPensionerDetailByAadhaar(
			@RequestHeader(value = "Authorization", required = true) String requestTokenHeader,
			@ApiParam(name = "aadharNumber", value = "Aadhar Card Number") 
			@PathVariable long aadharNumber) throws AuthorizationException, AadharNumberNotFound;
}
