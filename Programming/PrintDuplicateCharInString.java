package com.jspiders;

public class PrintDuplicateCharInString {
	public static void main(String[] args) {
		String s="hello";
		char[] arr1=s.toCharArray();
		char[] arr2=s.toCharArray();
		for(int i=0;i<arr1.length;i++)
		{
			int c=0;
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					c++;
					arr2[j]='\0';
				}
			}
			if(c>1) {
				System.out.print(arr1[i]);
				
				//System.out.println(arr1[i]+"-"+c);
			}
		}
	}
}
