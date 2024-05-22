package com.corejava;

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human human = new Human("Kavins",21,50);
		Human human1 = new Human("Loki",22,60);
		
//		human.name = "Panbu";
		System.out.println(human.name);
		
		human.eat();

	}

}
