package com.jspiders;

public class taxifare {
	public static void main(String[] args)
	{
		int distance =40;
		int choice=0;
		if(distance>0 && distance<=2)
		{
			choice=1;
		}
		else if(distance>2 && distance<=7)
		{
			choice=2;
		}
		else if(distance>7 && distance<=12)
		{
			choice=3;
		}
		else if(distance>12 && distance<=17)
		{
			choice=4;
		}
		else
		{
			choice=5;
		}
		switch(choice)
		{
		case 1:
			System.out.println(30);break;
		case 2:
			System.out.println(30+(distance-2)*15);break;
		case 3:
			System.out.println(30+(5*15)+(distance-7)*20);break;
		case 4:
			System.out.println(30+(5*15)+(5*20)+(distance-12)*25);break;
		case 5:
			System.out.println(30+(5*15)+(5*25)+(distance-17)*30);break;
		default:
			System.out.println("invalid case");
		}
	}
}
