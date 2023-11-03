package com.app.fruits;

public class Orange extends Fruit {

	public Orange() {
		super("orange", 5,"orange", true);

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	
	public String taste() {
		return "Sour";
	}
	public void juice()
	{
		System.out.println("Name: "+getName()+" Weight: "+getWeight()+" Extracting Juice!.........");
	}
}
