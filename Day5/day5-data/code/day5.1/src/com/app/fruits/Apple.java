package com.app.fruits;

public class Apple extends Fruit {

	public Apple() {
		super("red", 3,"Apple",true);

	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public String taste()
	{
		return "Sweet and sour";
	}
	
	public void jam()
	{
		System.out.println("Name: "+getName()+"  Making Jam!.......");
	}
}
