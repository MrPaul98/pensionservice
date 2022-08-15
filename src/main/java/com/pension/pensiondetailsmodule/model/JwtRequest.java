/**
 * 
 */
package com.pension.pensiondetailsmodule.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author SAYANDIP PAUL
 *
 */
@NoArgsConstructor
@AllArgsConstructor
public class JwtRequest {

	private String username;
	private String password;
	/**
	 * @return the userName
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "JwtRequest [username=" + username + ", password=" + password + "]";
	}
	
}
