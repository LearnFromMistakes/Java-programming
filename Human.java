package com.corejava;

public class Human {
	
	String name;
	int age;
	double weight;
	
	Human(String name,int age,double weight) //Constructor have Same name as their class
	{
		this.name = name; // the values are assigned by this keyword
		this.age = age;
		this.weight = weight;
	}
	
	void eat()
	{
		System.out.println(this.name+"Eating");
	}

}
