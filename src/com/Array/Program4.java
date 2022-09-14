     //non primetive array//

package com.Array;
class Student
{
	String name;
	String course;
	long contnum;
	int rating;
	public Student(String name, String course, long contnum, int rating) 
	{
		this.name = name;
		this.course = course;
		this.contnum = contnum;
		this.rating = rating;
	}
	public String toString()
	{
		return"name="+name+" "+"coures="+course+" "+"contnum="+contnum+" "+"rating="+rating;
		
	}
}
public class Program4 
{
public static void main(String[] args) 
{
	Student []ar = new Student[4];
	Student s1= new Student("sam","tasting",7664547l,1);
	
	ar [0]=s1;
	ar[1]= new Student("ram","develpment",654688444l,2);
	ar[2]= new Student("sham","testing",332211344l,3);
	ar[3]= new Student("mark","develpment",66753325677l,2);
	
	for (int i = 0; i < ar.length; i++) 
	{
		System.out.println(ar[i]);
	}
}
}
