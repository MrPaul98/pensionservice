/**
 * 
 */
package com.pension.pensiondetailsmodule.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author SAYANDIP PAUL
 *
 */
@Entity
@Table(name = "Pension_Details")
public class PensionDetails {

	@Id
	@Column(name = "aadhaar")
	public long aadhaar;
	
	@Column(name = "name")
	public String name;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "dob")
	public LocalDate dateOfBirth;
	
	@Column(name = "pan_Number")
	public String panNumber;
	
	@Column(name = "salary")
	public double salary;
	
	@Column(name = "allowances")
	public double allowances;
	
	@Column(name = "pension_Type")
	public String pensionType;
	
	@Column(name = "bank_Name")
	public String bankName;
	
	@Column(name = "account_Number")
	public String accountNumber;
	
	@Column(name = "bank_Type")
	public String bankType;

	/**
	 * @return the aadhaar
	 */
	public long getAadhaar() {
		return aadhaar;
	}

	/**
	 * @param aadhaar the aadhaar to set
	 */
	public void setAadhaar(long aadhaar) {
		this.aadhaar = aadhaar;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the dateOfBirth
	 */
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * @return the panNumber
	 */
	public String getPanNumber() {
		return panNumber;
	}

	/**
	 * @param panNumber the panNumber to set
	 */
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}

	/**
	 * @return the allowances
	 */
	public double getAllowances() {
		return allowances;
	}

	/**
	 * @param allowances the allowances to set
	 */
	public void setAllowances(double allowances) {
		this.allowances = allowances;
	}

	/**
	 * @return the pensionType
	 */
	public String getPensionType() {
		return pensionType;
	}

	/**
	 * @param pensionType the pensionType to set
	 */
	public void setPensionType(String pensionType) {
		this.pensionType = pensionType;
	}

	/**
	 * @return the bankName
	 */
	public String getBankName() {
		return bankName;
	}

	/**
	 * @param bankName the bankName to set
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	/**
	 * @return the accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * @return the bankType
	 */
	public String getBankType() {
		return bankType;
	}

	/**
	 * @param bankType the bankType to set
	 */
	public void setBankType(String bankType) {
		this.bankType = bankType;
	}

	/**
	 * @param aadhaar
	 * @param name
	 * @param dateOfBirth
	 * @param panNumber
	 * @param salary
	 * @param allowances
	 * @param pensionType
	 * @param bankName
	 * @param accountNumber
	 * @param bankType
	 */
	public PensionDetails(long aadhaar, String name, LocalDate dateOfBirth, String panNumber, double salary,
			double allowances, String pensionType, String bankName, String accountNumber, String bankType) {
		super();
		this.aadhaar = aadhaar;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.panNumber = panNumber;
		this.salary = salary;
		this.allowances = allowances;
		this.pensionType = pensionType;
		this.bankName = bankName;
		this.accountNumber = accountNumber;
		this.bankType = bankType;
	}

	/**
	 * 
	 */
	public PensionDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PensionDetails [aadhaar=" + aadhaar + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", panNumber="
				+ panNumber + ", salary=" + salary + ", allowances=" + allowances + ", pensionType=" + pensionType
				+ ", bankName=" + bankName + ", accountNumber=" + accountNumber + ", bankType=" + bankType + "]";
	}
	
	
}
