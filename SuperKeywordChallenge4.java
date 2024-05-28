package com.kavins;
class Manager
{
	String name;
	int id;
	void details(String emp_name,int emp_id)
	{
		this.name=emp_name;
		this.id =emp_id;
		System.out.println(this.name+" "+id);
	}
	
}
class emp extends Manager
{
	void personal_details()
	{
		System.out.println(super.id);
	}
}
public class SuperKeywordChallenge4 {
	public static void main(String[] args) {
		
		emp e = new emp();
		e.details("a", 12);
		e.personal_details();
	}
}
