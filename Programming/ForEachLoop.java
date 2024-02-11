package com.jspiders;

public class ForEachLoop {
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		int sum=0;
		int max=0;
		int min=50;
// --> For Sum
//		for(int a:arr)
//		{
//			sum=sum+a;
//		}
//		System.out.println(sum);
//--> For Max
//		for(int a:arr)
//		{
//			if(a>max)
//			{
//				max=a;
//			}
//		}
//		System.out.println(max);
//-->For Min
		for(int a:arr)
		{
			if(a<min)
			{
				min=a;
			}
		}
		System.out.println(min);
		
	}
}
