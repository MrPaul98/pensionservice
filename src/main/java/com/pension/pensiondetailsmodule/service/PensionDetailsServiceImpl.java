/**
 * 
 */
package com.pension.pensiondetailsmodule.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pension.pensiondetailsmodule.feignclient.AuthorizationClient;
import com.pension.pensiondetailsmodule.model.AuthorizationResponse;
import com.pension.pensiondetailsmodule.model.PensionDetails;
import com.pension.pensiondetailsmodule.model.PensionDetailsResponse;
import com.pension.pensiondetailsmodule.repository.PensionDetailsRepository;

/**
 * @author SAYANDIP PAUL
 *
 */
@Service
public class PensionDetailsServiceImpl implements PensionDetailsService{

	@Autowired
	private AuthorizationClient authorizationClient;
	
	@Autowired
	private PensionDetailsRepository pensionDetailsRepository;
	
	@Override
	public PensionDetailsResponse getAllPensionDetails(String token) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		AuthorizationResponse response = authorizationClient.authorizeRequest(token);
		PensionDetailsResponse pensionDetailsResponse = new PensionDetailsResponse();
		if(response.getStatusCode() == 200) {
			//pensionDetailsResponse.setPensionDetails(csvdata());
			pensionDetailsResponse.setPensionDetails(pensionDetailsRepository.findAll());
			pensionDetailsResponse.setStatus(200);
			pensionDetailsResponse.setMessage("Sucessfully get all Pension Details");
		}else {
			pensionDetailsResponse.setPensionDetails(null);
			pensionDetailsResponse.setStatus(400);
			pensionDetailsResponse.setMessage("Not Sucessfully get all Pension Details");
		}
		return pensionDetailsResponse;
	}

	@Override
	public PensionDetailsResponse getPensionDetailsByAadhaarNumber(long aadhaarNumber, String token) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		  AuthorizationResponse response = authorizationClient.authorizeRequest(token);
		  PensionDetailsResponse pensionDetailsResponse = new PensionDetailsResponse();
		  if(response.getStatusCode() == 200) { 
			  //List<PensionDetails> pensionDetails = csvdata(); 
			  List<PensionDetails> pensionDetails =  pensionDetailsRepository.findById(aadhaarNumber);
			  if(pensionDetails != null){ 
					/*
					 * Only for local machine
					 * pensionDetailsResponse.setPensionDetails( pensionDetails.stream() .filter(d
					 * -> d.getAadhaar() == aadhaarNumber).collect(Collectors.toList()));
					 */
				  pensionDetailsResponse.setPensionDetails(pensionDetails);
				  pensionDetailsResponse.setStatus(200); 
				  pensionDetailsResponse.setMessage("Sucessfully get Pension Details of Aadhaar Number :- " +aadhaarNumber); 
			  }else { 
				  pensionDetailsResponse.setPensionDetails(null);
				  pensionDetailsResponse.setStatus(400);
				  pensionDetailsResponse.setMessage("Aadhaar Number not found."); 
			  } 
		  }else {
				  pensionDetailsResponse.setPensionDetails(null);
				  pensionDetailsResponse.setStatus(500);
				  pensionDetailsResponse.setMessage(response.getMessage()); 
		  }
		 
		return pensionDetailsResponse;
	}
	
	/*
	 * public List<PensionDetails> csvdata() throws NumberFormatException,
	 * IOException { List<PensionDetails> pensionerDetailList = new ArrayList<>();
	 * BufferedReader br = new BufferedReader(new
	 * FileReader("src/main/resources/pension_details.csv")); String line = "";
	 * while ((line = br.readLine()) != null) { String[] data = line.split(",");
	 * PensionDetails pensionerDetail = new PensionDetails (
	 * Long.parseLong(data[0]), data[6], data[5], data[7],
	 * Double.parseDouble(data[9]), Double.parseDouble(data[2]), data[8], data[3],
	 * data[1], data[4]);
	 * 
	 * pensionerDetailList.add(pensionerDetail);
	 * 
	 * } return pensionerDetailList; }
	 */
	
	
}
