package org.nishad.server;

public class BDatabase {
	
	String accNumber,password;
	int accBalance;
	
	/* Get and set the account number,password and balance info */
	public String getaccNumber() {
		return accNumber;
	}
	
	public String getPassword() {
		return password;
	}
	
	public int getaccBalance() {
		return accBalance;
	}
	
	public void setaccNumber(String accNumber) {
		this.accNumber = accNumber;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setaccBalance(int accBalance) {
		this.accBalance = accBalance;
	}


}
