package com.corejava;

public class ConstructorOverload {
	// having an Same name but different parameters in the Constructor class

	public static void main(String[] args)
	{
		Pizza pizza = new Pizza("Kfc","Chicken","Tomato");
		System.out.println("Here is your Pizza");
		System.out.println(pizza.name);
//		pizza = new Pizza("Dominos","Veg","soya");
		System.out.println(pizza.type);
		System.out.println(pizza.sauce);
	}
}
