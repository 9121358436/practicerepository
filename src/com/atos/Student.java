package com.atos;



public class Student {
 private int studentid;
 private String studentname;
 private int studentmarks;
 private boolean studentstatus;
 public Student() {
	 super();
	 studentstatus=true;

	}
public Student(int studentid,String studentname ,int studentmarks,boolean studentsstatus) {
	super();
	this.studentid=studentid;
	this.studentname=studentname;
	this.studentmarks=studentmarks;
	this.studentstatus=studentstatus;

}
}
