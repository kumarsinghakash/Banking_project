package com.jspiders;

public class Nestedloop {
	public static void main(String[] args)
	{
		int n=5;
		//int i;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(i+" ");
		    }
			System.out.println();
		}
	}
}
