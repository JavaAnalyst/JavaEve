package com.rajorg;


public class InputScan {

	public String fname;
	public String Lname;
	public int phoneNo;
	public String address;

	public String person(String fname, String lname, int phoneNo, String address) {
		/*this.fname = fname;
		this.address = address;
		this.Lname = lname;
		this.phoneNo = phoneNo;*/
		return fname + " " + lname + " " + phoneNo + " " + address;
		
		
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return Lname;
	}

	public void setLname(String lname) {
		Lname = lname;
	}

	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
