package com.cg.Lab3.bean;

import java.util.Scanner;

public class Jobseeker {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the user name");
		String s1= s.nextLine();
		int n=s1.length();
		if(s1.length()>=12)
		{
			if((s1.charAt(n-4)=='_')&&(s1.charAt(n-3)=='j')&&(s1.charAt(n-2)=='o')&&(s1.charAt(n-1))=='b')
					{
				      System.out.println("True");
					}
		}
		else
			System.out.println("False");
				}

}
