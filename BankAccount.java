package com.elc.blc;

public class BankAccount {
	private String accountHolder;
	private int accountNumber;
	private double balance;

	public void setAccountDetails(String holder, int accNum, double bal) {
    accountHolder=holder;
    accountNumber=accNum;
    balance=bal;
	}
	public String getAccountDetails() {
		return "Account Holder:" +accountHolder + "\nAccount Number:" +accountHolder + "\nBalance:" +balance;
	}

}
