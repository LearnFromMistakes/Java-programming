package com.task.java;
// Get input from the user to find whether the String have vowels are not
import java.util.Scanner;
public class Q4 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		char word = sc.next().charAt(0);
		
		if(word=='a'||word=='e'||word=='i'|| word == 'o'||word =='u')
		{
			System.out.println("the input word is Vowels");
		}
		else
		{
			System.out.println("the input word is Consonant");
		}
	}
}
