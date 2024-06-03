package com.VaradAutomation.model;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Varad_Auto_Client_Info")
public class Varad_Auto_Client_Info {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator ="Varad_Client" )
//	@SequenceGenerator(
//			name = "Varad_Client",
//			sequenceName = "varad_client_id",
//			allocationSize = 10)	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Varad_Client;
	private String C_Fname;
	private String C_Lname;
	private Date C_DOB;
	private long Contact_no;
	private String email;
	//@Autowired
	//Address addr=new Address();
//	@Autowired
//	Address address;
	
	@Override
	public String toString() {
		return "Varad_Auto_Client_Info [Varad_Client=" + Varad_Client + ", C_Fname=" + C_Fname + ", C_Lname=" + C_Lname
				+ ", C_DOB=" + C_DOB + ", Contact_no=" + Contact_no + ", email=" + email + "]";
	}
	public Long getVarad_Client() {
		return Varad_Client;
	}
	public void setVarad_Client(Long varad_Client) {
		Varad_Client = varad_Client;
	}
	public String getC_Fname() {
		return C_Fname;
	}
	public void setC_Fname(String c_Fname) {
		C_Fname = c_Fname;
	}
	public String getC_Lname() {
		return C_Lname;
	}
	public void setC_Lname(String c_Lname) {
		C_Lname = c_Lname;
	}
	public Date getC_DOB() {
		return C_DOB;
	}
	public void setC_DOB(Date c_DOB) {
		C_DOB = c_DOB;
	}
	
	public long getContact_no() {
		return Contact_no;
	}
	public void setContact_no(long contact_no) {
		Contact_no = contact_no;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
