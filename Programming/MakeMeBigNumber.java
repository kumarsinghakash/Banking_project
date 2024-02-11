package com.jspiders;

public class MakeMeBigNumber {
	public static void sort(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int n=23454;
		String s=n+"";
		int[] arr=new int [s.length()];
		int rem=0,k=0;
		while(n!=0)
		{
			rem=n%10;
			arr[k]=rem;
			k++;
			n=n/10;
		}
		sort(arr);
		for(int a:arr)
		{
			System.out.print(a);
		}
		
		
	}
}
