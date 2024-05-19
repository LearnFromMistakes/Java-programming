package kavin.basicofjava;
import java.util.ArrayList;

public class Arraylist {
	public static void main(String[] args)
	{
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("Burger");
		food.add("Pizza");
		
		for(int i =0;i<food.size();i++)
		{
			System.out.println(food.get(i));
		}
		
		ArrayList<Integer> num = new ArrayList();
		
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		
		for(int i = 0;i<num.size();i++)
		{
			System.out.println(num.get(i));
		}
	}
}
