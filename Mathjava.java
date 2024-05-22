package com.corejava;
import java.util.Scanner;

public class Mathjava {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		sc.close();
		double z = Math.sqrt((a*a)+(b*b));
		
		int year =2005;
		if((year%400 == 0) || ((year%4==0) && (year%100!=0)))
		{
			System.out.println("leap year");
		}
		else
		{
			
		}
		System.out.println(z);
	}
}
