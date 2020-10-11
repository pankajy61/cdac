package com.app.core;

import java.util.Date;
import static utils.BankAccountValidations.sdf;
import custom_excs.BankAccountHandlingException;

import static utils.BankAccountValidations.validateBalance;

/*
 * 2.1. Create a class BankAccount -- acct no(int),customer name(string), acct type(string),
 * balance(double),creationDate
toString , constr.
 */
public class BankAccount {
	private int acctNo;
	private String customerName;
	private String acctType;
	private double balance;
	private Date creationDate;
	private KYC customerInfo;

	public BankAccount(int acctNo, String customerName, String acctType, double balance, Date creationDate) {
		super();
		this.acctNo = acctNo;
		this.customerName = customerName;
		this.acctType = acctType;
		this.balance = balance;
		this.creationDate = creationDate;
	}

	@Override
	public String toString() {
		return "BankAccount [acctNo=" + acctNo + ", customerName=" + customerName + ", acctType=" + acctType
				+ ", balance=" + balance + ", creationDate=" + sdf.format(creationDate) + "\n KYC "+customerInfo;
	}

	// B.L
	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) throws BankAccountHandlingException {
		validateBalance(balance - amount);
		balance -= amount;
	}

	public void fundsTransfer(BankAccount dest, double amount) throws BankAccountHandlingException
	{
		this.withdraw(amount);
		dest.deposit(amount);
	}
	//link KYC info to the account
	public void linkCustomerInfo(KYC kyc)
	{
		this.customerInfo=kyc;
	}

	public int getAcctNo() {
		return acctNo;
	}
	

}
