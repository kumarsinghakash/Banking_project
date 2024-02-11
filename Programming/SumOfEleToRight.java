package com.jspiders;

public class SumOfEleToRight {
	public static void main(String[] args) {
		int[] arr= {4,3,7,8,1,2};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		for(int i=0;i<arr.length;i++)
		{
			sum=sum-arr[i];
			arr[i]=sum;
		}
		for(int ele:arr)
		{
			System.out.println(ele);
		}
	}
}
