package com.corejava;

public class ArrayOfObjects {
	public static void main(String[] args)
	{
		Food[] Fridge = new Food[3];
		

		Food food1 = new Food("Pizza");
		Food food2 = new Food("Burger");
		Food food3 = new Food("Rice");
		
		Fridge[0] = food1;
		System.out.println(Fridge[0].name);

	}
}
