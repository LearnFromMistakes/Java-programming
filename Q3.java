package com.task.java;
// get input of all the data Type and print their values
import java.util.Scanner;
public class Q3 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		short s = sc.nextShort();
		boolean b = sc.nextBoolean();
		char c = sc.next().charAt(0);
		float f = sc.nextFloat();
		double d = sc.nextDouble();
		byte by = sc.nextByte();
		long l = sc.nextLong();
		
		System.out.println(a);
		System.out.println(s);
		System.out.println(b);
		System.out.println(c);
		System.out.println(f);
		System.out.println(d);
		System.out.println(by);
		System.out.println(l);
		
		
	}
}
