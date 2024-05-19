package kavin.basicofjava;

import java.util.ArrayList;

public class Two_DArrayList {
	public static void main(String[] args)
	{
		ArrayList<ArrayList<String>> Bigshop = new ArrayList();
		
		ArrayList<String> bakeryList = new ArrayList();
		bakeryList.add("Snacks");
		bakeryList.add("Food");
		bakeryList.add("drinks");
		
		ArrayList<String> stationaryList = new ArrayList();
		stationaryList.add("Pen");
		stationaryList.add("Notebook");
		stationaryList.add("pencil");
		
		Bigshop.add(bakeryList);
		Bigshop.add(stationaryList);
		
		System.out.println(Bigshop.get(0).get(2));
		
	}
	
}
