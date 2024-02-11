package com.jspiders;

public class StringDemo {
	public static void main(String[] args) {
		String s="hello";
		int l=s.length()-1;
		for(int i=l;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
	}
}
