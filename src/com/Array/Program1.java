package com.Array;

import java.util.Iterator;

public class Program1 
{
public static void main(String[] args) 
{
	long [] cn ;
	cn=new long[5];
	cn[2]=67;
	cn[0]=23;
	cn[3]=6;
	cn[4]=12;
	cn[1]=97;
	System.out.println(cn.length);
	for (int i = 0; i < cn.length; i++) 
	{
		System.out.println(cn[i]);
	}
}
}
