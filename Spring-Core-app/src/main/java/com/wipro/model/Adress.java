package com.wipro.model;

public class Adress {
	private String doorNumber;
	private String street;
	private String locality;
	private String city;
	private Long pincode;
	
	
	public Adress() {
		
	}
	public Adress(String doorNumber, String street, String locality, String city, Long pincode) {
		super();
		this.doorNumber = doorNumber;
		this.street = street;
		this.locality = locality;
		this.city = city;
		this.pincode = pincode;
	}
	
	
	public String getDoorNumber() {
		return doorNumber;
	}
	public void setDoorNumber(String doorNumber) {
		this.doorNumber = doorNumber;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Long getPincode() {
		return pincode;
	}
	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [doorNumber=" + doorNumber + ", street=" + street + ", locality=" + locality + ", city=" + city
				+ ", pincode=" + pincode + "]";
	}
	
	
	
	
}
