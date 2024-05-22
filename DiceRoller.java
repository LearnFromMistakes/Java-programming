package com.corejava;

import java.util.Random;

public class DiceRoller {
	Random ran;
	int num;
	DiceRoller()
	{
		ran = new Random();
		roll();
	}
	void roll()
	{
		num = ran.nextInt(6)+1;
		System.out.println(num);
	}
}
