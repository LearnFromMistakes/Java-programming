package com.task.java;
//Check Whether the Given input number is Divisible by Both 2 and 5 (or)
//3 and 9 
import java.util.Scanner;
public class Q2 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num%2 == 0)
		{
			System.out.println("Num divisible by 2");
			if(num%5==0)
			{
				System.out.println("Num divisible by 2 and 5");
			}
		}
		else if(num%3 == 0)
		{
			System.out.println("Num divisible by 3");
			if(num%9==0)
			{
				System.out.println("Num divisible by 3 and 9");
			}
		}
	}
}
