package com.jspiders;

public class ConvertNumberToBinary {
	public static void main(String[] args) {
		int num=8;
		int rem=0;
		String bin="";
		while(num>0)
		{
			rem=num%2;
			bin=rem+bin;
			num=num/2;
		}
		System.out.println(bin);
		
	}
}
