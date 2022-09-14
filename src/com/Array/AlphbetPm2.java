package com.Array;

public class AlphbetPm2 
{
  public static void main(String[] args) 
{ 
	char [] ab;
	ab = new char['a'];
	ab[2]='c';
	ab[0]='a';
	ab[3]='d';
	ab[4]='e';
	ab[1]='b';
	System.out.println(ab.length);		
	for (int i = 0; i < ab.length; i++) 
	{
		System.out.println(ab[i]);
	}
}
}
