package kavin.basicofjava;

import java.util.ArrayList;
import java.util.Scanner;

public class Methods {
	
	void Voting(int age)
	{
		String res = (age>18)?"eligible":"NotEligible";
		System.out.println(res);
	}
	void arr()
	{
//		ArrayList<String> array = new ArrayList<String>();
//		Scanner sc = new Scanner(System.in);
//		String name = sc.nextLine();
//		array.add(name);
//		System.out.println(array);
//		sc.close();
		int [][] marks =  {{1,2,3},{4,5,6},{7,8,9}};
		for(int i =0;i<marks.length;i++)
		{
			for(int j = 0;j<marks.length;j++)
			{
				System.out.print(marks[i][j]+" ");
			}
			System.out.println();
		}
	} 
	public static void main(String[] args)
	{
		Methods obj = new Methods();
		obj.Voting(17);
		obj.arr();
	}
}
