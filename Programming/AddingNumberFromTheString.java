package com.jspiders;

public class AddingNumberFromTheString {
	public static void main(String[] args) {
		String s="hello 100 hi bye 200 welcome 23";
		String[] arr=s.split(" ");
		int sum=0;
		for(String ele: arr)
		{
			try {
				int n=Integer.parseInt(ele);
				sum=sum+n;
			}
			catch(Exception e)
			{
				
			}
		}
		System.out.println(sum);
	}
}

//String s1="";
//for(String a:arr)
//{
//	for(int i=0;i<a.length();i++)
//	{
//		char c=a.charAt(i)
//				if(c>=48||c<=57)
//				{
//					s=s+c;
//				}
//	}
//}