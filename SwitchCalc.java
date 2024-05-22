package com.corejava;
import java.util.Scanner;

public class SwitchCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two values a and b");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Choose your Operator '+','-','*','/','%' ");
		char Operator = sc.next().charAt(0);
		
		switch(Operator)
		{
		case '+':
			int add = a+b;
			System.out.println(add);
			break;
		case '-':
			int sub = a-b;
			System.out.println(sub);
			break;
		case '*':
			int mul = a*b;
			System.out.println(mul);
			break;
		case '/':
			int div = a/b;
			System.out.println(div);
			break;
		case '%':
			int mod = a%b;
			System.out.println(mod);
			break;
		}
		

	}

}
