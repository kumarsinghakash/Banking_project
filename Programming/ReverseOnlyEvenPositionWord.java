package com.jspiders;
 
//Reverse only even position word
//str-->"hello hi how are you guys";
//o/p-->hello ih how era you syug

public class ReverseOnlyEvenPositionWord {
	static void reverse(String s)
	{
		String rev="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			rev=c+rev;
		}
		System.out.print(rev+" ");
	}
	public static void main(String[] args) {
		String s="hello hi how are you guys";
		String[] arr=s.split(" ");
		int i=0;
		for(String a:arr)
		{
			i++;
			if(i%2==0)
			{
				reverse(a);
			}
			else {System.out.print(a+" ");}
		}
			
	}
}
