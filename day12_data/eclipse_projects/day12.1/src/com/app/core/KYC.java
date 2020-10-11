package com.app.core;

public class KYC {
	private String email, city;
	private String adharCard;
	private String phoneNo;
	public KYC(String email, String city, String adharCard, String phoneNo) {
		super();
		this.email = email;
		this.city = city;
		this.adharCard = adharCard;
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "KYC [email=" + email + ", city=" + city + ", adharCard=" + adharCard + ", phoneNo=" + phoneNo + "]";
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	
	
	
	
}
