/**
 * 
 */
package com.pension.pensiondetailsmodule.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.pension.pensiondetailsmodule.model.AuthorizationResponse;
import com.pension.pensiondetailsmodule.model.JwtRequest;

/**
 * @author SAYANDIP PAUL
 *
 */
//@FeignClient(name = "Authorization-Service", url = "http://localhost:8400")  
@FeignClient(name = "Authorization-Service", url = "http://3.141.18.28:8400")	
public interface AuthorizationClient {
	
	@GetMapping(value = "/api/authorize/{token}")
	public AuthorizationResponse authorizeRequest(@PathVariable("token") String token);
}