package com.cg.Lab3.bean;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Warrantee {

	public static void main(String[] args) {
		LocalDate r=null;
		DateTimeFormatter f=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the date in dd/MM/yyyy format");
		String s1=s.nextLine();
		System.out.println("Enter the warrantee period in months and years");
		int m=s.nextInt();
		int y=s.nextInt();
		LocalDate pd=LocalDate.parse(s1, f);
		if(m>0 && m<13)
		{
			r=pd.plusMonths(m);
			
		}
		else
			System.out.println("Ivalid");
		if(y>0)
		{
			System.out.println("Warranty expires on:" +r.plusYears(y));
		}
		else
			System.out.println("Invalid");
	}

}
