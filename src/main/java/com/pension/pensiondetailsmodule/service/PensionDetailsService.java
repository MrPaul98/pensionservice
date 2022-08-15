/**
 * 
 */
package com.pension.pensiondetailsmodule.service;

import java.io.IOException;
import java.util.List;

import com.pension.pensiondetailsmodule.model.PensionDetails;
import com.pension.pensiondetailsmodule.model.PensionDetailsResponse;

/**
 * @author SAYANDIP PAUL
 *
 */
public interface PensionDetailsService {

	public PensionDetailsResponse getAllPensionDetails(String token) throws NumberFormatException, IOException;
	
	public PensionDetailsResponse getPensionDetailsByAadhaarNumber(long aadhaarNumber, String token) throws NumberFormatException, IOException;
}
