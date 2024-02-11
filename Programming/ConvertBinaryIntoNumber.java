package com.jspiders;

public class ConvertBinaryIntoNumber {
	public static void main(String[] args) {
		int bin=1000;
		String s=""+bin;
		int k=1;
		int sum=0;
		for(int i=s.length()-1;i>=0;i--)
		{
			sum=sum+((s.charAt(i)-48)*k);
			k=k*2;
		}
		System.out.println(sum );
		
	}
}
