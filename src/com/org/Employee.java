package com.org;

public class Employee {
int employeeid;
String employeename;
String employeedesignation;
public Employee(int employeeid, String employeename, String employeedesignation) {
	super();
	this.employeeid=employeeid;
	this.employeename=employeename;
	this.employeedesignation=employeedesignation;
	

	}


	
public String toString() {
	return "Employee [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
			+ "]";
}



public void display() {
	System.out.println("Employee details");
	System.out.println("calling Manager details");

}

}
