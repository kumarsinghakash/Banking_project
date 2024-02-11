package com.jspiders;
//arr-->{2,7,8,9,6,3,4,8,13
//target->10,
//2,8
//2,8
//7,3
//6,4
public class Assingnment1 {
	public static void main(String[] args) {
		int[] arr= {2,7,8,9,6,3,4,8,13};
		int target=10;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==target)
				{
					System.out.println(arr[i]+" "+arr[j]);
				}
					
			}
		}
	}
}
