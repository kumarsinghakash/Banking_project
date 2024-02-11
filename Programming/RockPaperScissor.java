package com.jspiders;

import java.util.Scanner;

public class RockPaperScissor {
	public static void main(String[] args)
	{
		Scanner ip=new Scanner(System.in);
		String[] arr= {"rock","paper","scissor"};
		System.out.println("=============PRS==============");
		System.out.println("Enter the Target");
		int t=ip.nextInt();
		int c=0,p=0;
		System.out.println("Start the Game");
		while(true)
		{
			int rd=(int)(Math.random()*arr.length);
			String p1=arr[rd];
			System.out.println("Enter the value:");
			String p2=ip.next();
			System.out.println(p1+" "+p2);
		if((p1.equals("rock")&&p2.equals("scissor"))||(p1.equals("paper")&&p2.equals("rock"))||(p1.equals("scissor")&&p2.equals("paper")))
		{
			//System.out.println("Computer won");
			c++;
		}
		else if((p2.equals("rock")&&p1.equals("scissor"))||(p2.equals("paper")&&p1.equals("rock"))||(p2.equals("scissor")&&p1.equals("paper")))
		{
			//System.out.println("Player won");
			p++;
		}
		else
		{
			System.out.println("Drew...");
		}
		System.out.println("computer: "+c +" ,Player: "+p);
		if(c==t)
		{
			System.out.println("Computer won the game"); break;
		}
		else if(p==t) {
			System.out.println("Player won the Game");break;
		}
		}
	}
}
