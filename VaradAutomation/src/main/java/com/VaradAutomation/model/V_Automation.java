package com.VaradAutomation.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


//this model class for Admin information 
@Entity
@Table(name="VaradAutoAdmin")
public class V_Automation {
	
	//Admin id is auto genereted
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long VA_id; 
	private	String VA_name;	//Admin name
	
	//private Address address ;	//Address class object current/permanent
	
	private long Mobile_no;	//contact
	
	private String email;
	private Date DOB ;//date of birth
	private float Experience ;//in year
	private Date joining_date;
	private String dapartment;
	//designation
	//certification
	public Long getVA_id() {
		return VA_id;
	}
	public void setVA_id(Long vA_id) {
		VA_id = vA_id;
	}
	public String getVA_name() {
		return VA_name;
	}
	public void setVA_name(String vA_name) {
		VA_name = vA_name;
	}

	public long getMobile_no() {
		return Mobile_no;
	}
	public void setMobile_no(long mobile_no) {
		Mobile_no = mobile_no;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public float getExperience() {
		return Experience;
	}
	public void setExperience(float experience) {
		Experience = experience;
	}
	public Date getJoining_date() {
		return joining_date;
	}
	public void setJoining_date(Date joining_date) {
		this.joining_date = joining_date;
	}
	public String getDapartment() {
		return dapartment;
	}
	public void setDapartment(String dapartment) {
		this.dapartment = dapartment;
	}
	@Override
	public String toString() {
		return "V_Automation [VA_id=" + VA_id + ", VA_name=" + VA_name + ",Mobile_no="
				+ Mobile_no + ", email=" + email + ", DOB=" + DOB + ", Experience=" + Experience + ", joining_date="
				+ joining_date + ", dapartment=" + dapartment + "]";
	}
	
	
	
	

}
