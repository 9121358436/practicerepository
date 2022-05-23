package com.atos;
import com.org.*;
public class InheritanceDemo {

	public static void main(String[] args) {
	//Employee emp1=new Employee(626, "Neelu", "Devoloper");
	//System.out.println(emp1);
	//Employee emp2=new Employee(627, "Ammu", "sr.Devoloper");
	//System.out.println(emp2);
	Student st=new Student();
	st.setStudentname("neelu");
	st.setStudentmarks(65);
	st.setStudentstatus(1);
	
	System.out.println(st);
	
	System.out.println(=========================================);
Student st2=new Student(203,"ammu",66,0);
System.out.println(st2);
st2.setStudentmarks(69);
System.out.println(st2);
	}

}
