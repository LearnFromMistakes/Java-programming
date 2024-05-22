package com.corejava;

public class ObjectPassing {
	public static void main(String[] args)
	{
		Garage garage = new Garage();
		
		Car1 car = new Car1("BMW","2003");
		Car1 car1 = new Car1("mustag","2005");
		
		garage.Break(car);
	}
}
