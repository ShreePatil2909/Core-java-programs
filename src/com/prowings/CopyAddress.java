package com.prowings;

public class CopyAddress {
	int pin;
	String city;
	public CopyAddress(int pin, String city) {
		super();
		this.pin = pin;
		this.city = city;
	}
	public CopyAddress(CopyAddress cd) {
		this.pin=cd.pin;
		this.city=cd.city;
	}
	
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "CopyAddress [pin=" + pin + ", city=" + city + "]";
	}
	
}
