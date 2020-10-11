package com.app.core;

import static utils.BankAccountValidations.validateBalance;

import java.time.LocalDate;
import java.util.Date;

import custom_excs.BankAccountHandlingException;

/*
 * 2.1. Create a class BankAccount -- acct no(int),customer name(string), acct type(string),
 * balance(double),creationDate
toString , constr.
 */
public class BankAccount implements Comparable<BankAccount> {
	private int acctNo;
	private String customerName;
	private AcType acctType;// enum : AcType
	private double balance;
	private LocalDate creationDate;
	private KYC customerInfo;

	public BankAccount(int acctNo, String customerName, AcType acctType, double balance, LocalDate creationDate) {
		super();
		this.acctNo = acctNo;
		this.customerName = customerName;
		this.acctType = acctType;
		this.balance = balance;
		this.creationDate = creationDate;
	}

	public BankAccount(int acctNo) {
		super();
		this.acctNo = acctNo;
	}

	@Override
	public String toString() {
		return "BankAccount [acctNo=" + acctNo + ", customerName=" + customerName + ", acctType=" + acctType
				+ ", balance=" + balance + ", creationDate=" + creationDate + "\n KYC " + customerInfo;
	}

	// B.L
	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) throws BankAccountHandlingException {
		validateBalance(balance - amount);
		balance -= amount;
	}

	public void fundsTransfer(BankAccount dest, double amount) throws BankAccountHandlingException {
		this.withdraw(amount);
		dest.deposit(amount);
	}

	// link KYC info to the account
	public void linkCustomerInfo(KYC kyc) {
		this.customerInfo = kyc;
	}

	public int getAcctNo() {
		return acctNo;
	}

	public AcType getAcctType() {
		return acctType;
	}

	public KYC getCustomerInfo() {
		return customerInfo;
	}
	

	public String getCustomerName() {
		return customerName;
	}

	public double getBalance() {
		return balance;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}

	@Override
	public boolean equals(Object o) {
		System.out.println("in bank acct equals");
		if (o instanceof BankAccount)
			return this.acctNo == ((BankAccount) o).acctNo;
		return false;

	}
	@Override
	public int hashCode()
	{
		System.out.println("in hashCode");
		return acctNo;
	}

	@Override
	public int compareTo(BankAccount anotherAccount) {
		System.out.println("in compareTo : acct no");

		if (this.acctNo < anotherAccount.acctNo)
			return -1;
		if (this.acctNo == anotherAccount.acctNo)
			return 0;
		return 1;

		

	}

}
