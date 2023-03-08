package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Education {
@Id
private int Adid;
private String Name;
private String dob;
private long phno;
private String gender;
private String address;
public Education(int adid, String name, String dob, long phno, String gender, String address) {
	super();
	Adid = adid;
	Name = name;
	this.dob = dob;
	this.phno = phno;
	this.gender = gender;
	this.address = address;
}
public Education() {
	super();
	// TODO Auto-generated constructor stub
}
public int getAdid() {
	return Adid;
}
public void setAdid(int adid) {
	Adid = adid;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public long getPhno() {
	return phno;
}
public void setPhno(long phno) {
	this.phno = phno;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}





     
	
	
}
