package com.app.fruits;

import java.util.*;

//Q1 Apply inheritance n polymorphism
//a) Arrange Fruit,Apple,Orange,Mango in inheritance hierarchy
//b) Properties (instance variables) : color : String , weight : double , name:String, isFresh : boolean
//c) Add suitable constructors.
//d) Override toString correctly to return state of all fruits (including : name ,color , weight )
//e) Add a taste() method : public String taste()
//For Fruit : it should return "no specific taste"
//Apple : should return "sweet n sour"
//Mango : should return "sweet"
//Orange : should return "sour"
//f) Add all of above classes under the package "com.app.fruits"
//g) Create java application FruitBasket , with main method , as a tester
//h) Prompt user for the basket size n create suitable data structure and give options

public class Fruit {

	private String color;
	private double weight;
	private String name;
	private boolean isFresh;

	
	public Fruit(String name)
	{
		this.name = name;
		this.isFresh=true;
	}

	public Fruit() {
		this.color="";
		this.weight= 0.0;
		this.name = "";
		this.isFresh=false;
	}
	
	
	public Fruit(String color, double weight, String name, boolean isFresh) {

		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = isFresh;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	public void accept() {

		System.out.println("Enter the Fruit Color...");
		this.color = new Scanner(System.in).next();
		System.out.println();
		System.out.println("Enter the Fruit Weight...");
		this.weight = new Scanner(System.in).nextDouble();
		System.out.println();
//		System.out.println("Enter 1. if the Fruit is fresh and 0. if the fruit isn't fresh...");
//		this.isFresh = new Scanner(System.in).nextBoolean();

	}

	@Override
	public String toString() {
		return "Fruit [color=" + color + ", weight=" + weight + ", name=" + name + "]";
	}

	public String taste() {
		return "Not specifies";
	}

}
