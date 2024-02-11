package com.jspiders;

public class SecondTimesOccurElementFirstInArray {
	public static void main(String[] args) {
		int arr[]= {1,7,4,3,4,8,7};
		int k=2,ans=-1;
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		int[] temp=new int[max+1];
		for(int ele:arr)
		{
			temp[ele]++;
			if(temp[ele]==k)
			{
				ans=ele;
				break;
			}
		}
		System.out.println(ans);
	}
}
