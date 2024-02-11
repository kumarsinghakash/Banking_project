package com.jspiders;

public class person {
	String name;
	int age;
	char gender;
	person(String name,int age,char gender){
		System.out.println("Running person-class constructor");
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
}
