package com.jspiders;

public class student extends person{
	int rollno;
	double marks;
	String collagename;

	student(String name,int age,char gender,int rollno,double marksk,String collagename){
		super(name,age,gender);
		System.out.println("Running Student-class constructor");
		this.rollno=rollno;
		this.marks=marks;
		this.collagename=collagename;
	}
}
