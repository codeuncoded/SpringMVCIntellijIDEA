package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
	private String firstName="first";
	private String lastName="last";
	private String Country;
	private LinkedHashMap<String, String> countryOptions;
	private String favoriteLanguage;
	private String[] operatingSystems={"windows", "linux", "mac os"};
	public String[] getOperatingSystems() {
		return operatingSystems;
	}
	public void setOperatingSystems(String[] operatingSystem) {
		this.operatingSystems = operatingSystem;
	}
	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}
	public void setFavoriteLanguage(String favouriteLanguage) {
		this.favoriteLanguage = favouriteLanguage;
	}
	//<label, value>
	public Student(){
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("india", "INDIA");
		countryOptions.put("brazil", "BRAZIL");
	}
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
