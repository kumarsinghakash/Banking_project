package com.jspiders;
//find the length of String without using any pre-defined function or length iteration 
public class FindTheLengthOfString {
	public static void main(String[] args) {
		String s="hello";
		//char arr[]=s.toCharArray();
		int len=0;
		try {
			while(true)
			{
				char c=s.charAt(len);
				len++;
			}
		}
		catch(Exception a){
			System.out.println("Length of string: "+len);
		}
		
	}
}
