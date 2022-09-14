package com.collectionstype;

import java.util.ArrayList;

public class ClientDecl 
{
 public static void main(String[] args) 
{
	 ArrayList al = new ArrayList ();
	 al.add(new Clinent1("ram","pune",4.5f ));
	  al.add(new Client2("sham","mumbai",3.5f));
	  al.add(new Client3("sam","bangalore",5.5f));
	  al.add(new Client4("mark","chennai",6.7f));
	  System.out.println(al.size());
	  for (int i = 0; i < al.size(); i++) 
	 {
		Object ob=al.get(i);
		System.out.println(ob);
	}
}
}
