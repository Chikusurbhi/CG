package com.cg.Lab2.bean;

enum Gender{
	M,F;
	
} class Eperson1 {
	 private String F;
	  private String L;
	   Gender G;
	  private long N;
	public Object display;
	public Eperson1() {
		super();
	}
	public Eperson1(String f, String l, Gender g) {
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
			System.out.println("Gender:" + Gender.F);
			System.out.println("Phone number:" +N);
		}

}
public class Eperson{
	public static void main(String[] args) {
		{
			Eperson1 p=new Eperson1("Aditi","Priya",Gender.F);
			p.getnumber(1234478902);
			p.display();
		}
		
	}
}