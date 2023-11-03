package com.app.fruits;

public class Mango extends Fruit {

	public Mango() {
		super("Yellow", 10, "Mango", true);

	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public String taste()
	{
		return "Sweet";
	}
	public void pulp()
	{
		System.out.println("Name: "+getName()+" Color: "+getColor()+" Creating Pulp!......");
	}
}
