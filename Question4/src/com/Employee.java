package com;

import java.util.ArrayList;


public class Employee {
	
	private int EmpID;
	private String EmpName;
	private ArrayList<String> Programming;
	
	
	public int getEmpID() {
		return EmpID;
	}
	public void setEmpID(int empID) {
		EmpID = empID;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public ArrayList<String> getProgramming() {
		return Programming;
	}
	public void setProgramming(ArrayList<String> programming) {
		Programming = programming;
	}
}
	
	