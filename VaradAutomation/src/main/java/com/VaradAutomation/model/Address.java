package com.VaradAutomation.model;

import org.springframework.boot.autoconfigure.web.WebProperties.Resources.Chain.Strategy;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="address")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long A_id;
	private String Colony;
	private String State;
	private String Country;
	private String District;
	private String Taluka;
	private int Pincode;
	@Override
	public String toString() {
		return "Address [A_id=" + A_id + ", Colony=" + Colony + ", State=" + State + ", Country=" + Country
				+ ", District=" + District + ", Taluka=" + Taluka + ", Pincode=" + Pincode + "]";
	}
	public long getA_id() {
		return A_id;
	}
	public void setA_id(long a_id) {
		A_id = a_id;
	}
	public String getColony() {
		return Colony;
	}
	public void setColony(String colony) {
		Colony = colony;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getDistrict() {
		return District;
	}
	public void setDistrict(String district) {
		District = district;
	}
	public String getTaluka() {
		return Taluka;
	}
	public void setTaluka(String taluka) {
		Taluka = taluka;
	}
	public int getPincode() {
		return Pincode;
	}
	public void setPincode(int pincode) {
		Pincode = pincode;
	}
	
	
	
}
