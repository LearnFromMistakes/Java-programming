package kavin.basicofjava;

import java.util.Scanner;

public class AppearenceOfChar {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = "apple";
		
		int TCount = s.length();
		
		System.out.println("Enter the Character to check their Occurance:");
		
		String r = sc.next();
		
		int AFR_a = s.replace(r, "").length();
		
		int count = TCount-AFR_a;
		
		if(count>1)
		{
			System.out.println("the given char "+r+" is ocuured more than  "+count+"times");
		}
		else
		{
			System.out.println("number of times the char "+r +" occured in a string is "+count);

		}
		
//		String rev="";
//		
//		char[] arr = s.toCharArray();
//		
//		int len = s.length()-1;
//		
//		for(int i = len;i>=0;i--)
//		{
//			rev = rev+arr[i];
//		}
//		System.out.println(rev);
	}
}
