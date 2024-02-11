package com.jspiders;

public class sample1 {
	sample1(double arg1){
		System.out.println("Running Sample1 constructor");
		System.out.println("Arg1 value is"+arg1);
	}
}
class sample2 extends sample1{
	sample2(int arg1){
		super(1.5);
		System.out.println("Running sample2 constructor");
		System.out.println("Arg1 value is"+arg1);		
	}
}
class sample3 extends sample2{
	sample3(){
		super(12);//Explicit calling
		System.out.println("Running Sample3 constructor");
	}
}
