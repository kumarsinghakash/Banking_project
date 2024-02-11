package com.jspiders;
//Print word of even lenght
//str-->"hello hi how are you guys";
//o/p-->"hi,guys"
public class PrintWordEvenLength {
	
	public static void main(String[] args) {
		String s1="hello hi how are you guys";
		String[] arr=s1.split(" ");
		for(String a:arr)
		{
			int i=a.length();
			if(i%2==0)
			{
				System.out.println(a);
			}
		}
		
	}
}
