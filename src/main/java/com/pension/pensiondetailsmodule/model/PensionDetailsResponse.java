/**
 * 
 */
package com.pension.pensiondetailsmodule.model;

import java.util.List;

/**
 * @author SAYANDIP PAUL
 *
 */
public class PensionDetailsResponse {
	
	private List<PensionDetails> pensionDetails;
	
	private Integer status;
	
	private String message;

	/**
	 * @return the pensionDetails
	 */
	public List<PensionDetails> getPensionDetails() {
		return pensionDetails;
	}

	/**
	 * @param pensionDetails the pensionDetails to set
	 */
	public void setPensionDetails(List<PensionDetails> pensionDetails) {
		this.pensionDetails = pensionDetails;
	}

	/**
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * 
	 */
	public PensionDetailsResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param pensionDetails
	 * @param status
	 * @param message
	 */
	public PensionDetailsResponse(List<PensionDetails> pensionDetails, Integer status, String message) {
		super();
		this.pensionDetails = pensionDetails;
		this.status = status;
		this.message = message;
	}

	@Override
	public String toString() {
		return "PensionDetailsResponse [pensionDetails=" + pensionDetails + ", status=" + status + ", message="
				+ message + "]";
	}
	
}
