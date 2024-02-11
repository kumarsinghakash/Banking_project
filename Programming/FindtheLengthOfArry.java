package com.jspiders;

//find the length of array without using any pre-defined function or length iteration 
public class FindtheLengthOfArry {
	public static void main(String[] args) {
		int arr[]= {'1','2','3','4','5','6'};
		int length=0;
		try {
			while(true) {
				int n=arr[length];
				length++;
			}
				
		}
		catch(Exception e) {
			//System.out.println("length of array: "+length);
			//we can write s.o.p inside the array
		}
		System.out.println("length of array: "+length);
		
		 
	}

}
