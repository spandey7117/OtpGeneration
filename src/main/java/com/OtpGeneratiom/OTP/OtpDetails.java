package com.OtpGeneratiom.OTP;

public class OtpDetails {
	private long id;
	private int otp;
	private String phoneNumber;
	private String message;
	private String response;
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	public OtpDetails(long id, int otp, String phoneNumber, String message,String response) {
		super();
		this.id = id;
		this.otp = otp;
		this.phoneNumber = phoneNumber;
		this.message = message;
		this.response=response;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getOtp() {
		return otp;
	}
	public void setOtp(int otp) {
		this.otp = otp;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
