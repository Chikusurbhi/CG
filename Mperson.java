package com.cg.Lab2.bean;

public class Mperson {
  private String F;
  private String L;
  private char G;
  private long N;
public Object display;
public Mperson() {
	super();
}
public Mperson(String f, String l, char g) {
	super();
	F = f;
	L = l;
	G = g;
	
}
public void getnumber(long n) {
	N= n;
}
 
	public void display()
	{
		System.out.println("Firstname:" +F);
		System.out.println("Lastname:" +L);
		System.out.println("Gender:" +G);
		System.out.println("Phone number:" +N);
	}
}
