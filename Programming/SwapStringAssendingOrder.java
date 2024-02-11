package com.jspiders;

public class SwapStringAssendingOrder {
	public static void main(String[] args) {
		String s="apple";
		char[] arr=new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			arr[i]=s.charAt(i);
		}
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)>s.charAt(j))
				{
					char temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		String ans =new String(arr);
		System.out.println(ans);
	}

}
