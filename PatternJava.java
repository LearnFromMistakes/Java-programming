package com.corejava;
import java.util.Scanner;
public class PatternJava {

	public static void main(String[] args) {

		pattern();

		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		
		for(int a =1;a<=i;a++)
		{
			for(int b=j;b>=a;b--)
			{
				System.out.print("  ");
			}
			for(int b=1;b<=a;b++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();
	}
	static void pattern()
	{
		System.out.println("Simply hello");
	}

}
