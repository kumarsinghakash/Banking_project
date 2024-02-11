package com.jspiders;

public class employee extends person {
	int id;
	double salary;
	String desination;	

employee(String name,int age,char gender,int id,double salay,String desination){
	super(name,age,gender);
	System.out.println("Running employee class constructor");
	this.id=id;
	this.salary=salary;
	this.desination=desination;
	}
}
