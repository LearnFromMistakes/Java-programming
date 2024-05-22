package com.corejava;

public class Pizza {

	String name;
	String type;
	String sauce;
	int price;
	Pizza(String name,String type,String sauce,int price)
	{
		this.name = name;
		this.type = type;
		this.sauce = sauce;
		this.price = price;
		
	}
	Pizza(String name,String type,String sauce)
	{
		this.name = name;
		this.type = type;
		this.sauce = sauce;
		
	}
}
