package com.corejava;

public class Car {
	String name = "Aadi";
	int price = 12000;
	String model = "Aadi_a6";
	
	public String toString()
	{
		return name+"\n"+model+"\n"+price;
	}
	
	void drive()
	{
		System.out.println("You are driving a car");
	}
	void Break()
	{
		System.out.println("You are is Stop");
	}
}
