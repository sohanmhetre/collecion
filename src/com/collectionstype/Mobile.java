package com.collectionstype;

import java.security.PublicKey;

public class Mobile 
{
  String brand;
  int ram;
  double price;
	public Mobile(String brand, int ram, double price) 
	{
	this.brand = brand;
	this.ram = ram;
	this.price = price;
}
	public String toString() 
	{
		return "Mobile [brand=" + brand + ", ram=" + ram + ", price=" + price + "]";
	}
}
class Laptop
{
	String os;
	int noofprocess;
	int memeory;
	public Laptop(String os, int noofprocess, int memeory) 
	{
		this.os = os;
		this.noofprocess = noofprocess;
		this.memeory = memeory;
}
	public String toString() 
	{
		return "Laptop [os=" + os + ", noofprocess=" + noofprocess + ", memeory=" + memeory + "]";
	}
}
 class SmartWartch
 {
	 String brand ;
	 int nooffeture;
	 boolean sim;
	public SmartWartch(String brand, int nooffeture, boolean sim) 
	{
		this.brand = brand;
		this.nooffeture = nooffeture;
		this.sim = sim;
	}
	public String toString() {
		return "SmartWartch [brand=" + brand + ", nooffeture=" + nooffeture + ", sim=" + sim + "]";
	}
	 
 }
