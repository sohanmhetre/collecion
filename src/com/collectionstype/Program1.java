package com.collectionstype;

import java.util.ArrayList;

public class Program1 
{
 public static void main(String[] args) 
{
  ArrayList al = new ArrayList ();
   
  al.add(new Mobile("apple",4,39999.989));
  al.add(new Laptop("ios",2,512));
  al.add(new SmartWartch("boat", 12, false));
  al.add(new Mobile("apple",4,39999.989));
  al.add(new Laptop("ios",2,512));
  al.add(new SmartWartch("boat", 12, false));
  al.add(new Mobile("apple",4,39999.989));
  al.add(new Laptop("ios",2,512));
  al.add(new SmartWartch("boat", 12, false));
  al.add("10 object");
  System.out.println(al.size());
  for (int i = 0; i < al.size(); i++) 
  {
	Object ob=al.get(i);
	System.out.println(ob);
}
}
}
