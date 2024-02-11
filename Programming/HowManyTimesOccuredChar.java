package com.jspiders;

public class HowManyTimesOccuredChar {
	public static void main(String[] args) {
		int[] arr=new int[128];
		String s="hello hi";
		for(int i=0;i<=s.length();i++)
		{
			arr[s.charAt(i)]++;
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				System.out.println((char)(i)+"-"+arr[i]);
			}
		}
		
	}
}
