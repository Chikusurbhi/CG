package com.cg.Lab3.bean;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		System.out.println("Enter the array of strings");
		Scanner scan=new Scanner(System.in);
		String array=scan.nextLine();
		String[] sarray=array.split(" ");
		int l=sarray.length;
		Arrays.sort(sarray);
		for(int i=0;i<l;i++)
		{
			if((i<l/2)||(l%2 !=0)&& (i<=i/2))
				System.out.println(sarray[i].toUpperCase());
			else
				System.out.println(sarray[i].toLowerCase());
		}
		
		

	}

}
