package com.cg.lab3.bean;

import java.util.Scanner;

public class Positive
{
	public static boolean order(String s1)
	{
		for(int i=0;i<s1.length()-1;i++) 
		{
			if(s1.charAt(i) > s1.charAt(i+1))
				return false;
	    
	}
	return true;
	}
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("enter a string");
String s1;
s1=s.nextLine();
System.out.println("the entered string s:"+s1);
System.out.println(order(s1.toLowerCase()));
		
		
		
		
		
		
	}

}
