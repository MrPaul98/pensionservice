/**
 * 
 */
package com.pension.pensiondetailsmodule.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pension.pensiondetailsmodule.model.PensionDetailsResponse;
import com.pension.pensiondetailsmodule.service.PensionDetailsServiceImpl;

/**
 * @author SAYANDIP PAUL
 *
 */
@RestController
@CrossOrigin
public class PensionDetailsController {

	@Autowired
	private PensionDetailsServiceImpl pensionDetailsServiceImpl;

	@GetMapping(value = "/getAllPensionDetails")
	public PensionDetailsResponse getAllPensionDetails(@RequestHeader(value = "Authorization") String authorizationHeader)
			throws NumberFormatException, IOException {
		String token = authorizationHeader.substring(7);
		return pensionDetailsServiceImpl.getAllPensionDetails(token);
	}

	@GetMapping(value = "/getPensionDetailsByAadhaarNumber/{aadhaar}")
	public PensionDetailsResponse getPensionDetailsByAadhaarNumber(@PathVariable("aadhaar") long aadhaar,
			@RequestHeader(value = "Authorization") String authorizationHeader) throws NumberFormatException, IOException {
		String token = authorizationHeader.substring(7);
		return pensionDetailsServiceImpl.getPensionDetailsByAadhaarNumber(aadhaar, token);
	}
}
