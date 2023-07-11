package com;

import javax.persistence.Entity;
import javax.persistence.Id;


import org.hibernate.annotations.Table;

@Entity
public class customer {
	@Id
	private int CID;
	private String CNAME;
	private String PLACE;
	private String PAN;
	
	
	public int getCID() {
		return CID;
	}
	public void setCID(int cID) {
		CID = cID;
	}
	public String getCNAME() {
		return CNAME;
	}
	public void setCNAME(String cNAME) {
		CNAME = cNAME;
	}
	public String getPLACE() {
		return PLACE;
	}
	public void setPLACE(String pLACE) {
		PLACE = pLACE;
	}
	public String getPAN() {
		return PAN;
	}
	public void setPAN(String pAN) {
		PAN = pAN;
	}
	
	//public void display() {
	//	System.out.println(CID+ CNAME+PLACE+PAN);
	//	}

	
	
	

}
