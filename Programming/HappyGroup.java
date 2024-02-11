package com.jspiders;

public class HappyGroup {
	public static void main(String[] args) {
		int[] arr= {4,3,2,1,15,2,3};
		int max=arr[0];
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("max: "+max);
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=max) {
			sum=sum+arr[i];
			}
		}
		System.out.println("sum: "+sum);
		if(sum==max)
		{
			System.out.println("HAPPY GROUP");
		}
		else
		{
			System.out.println("UNHAPPY GOURP");
		}
	}

}
