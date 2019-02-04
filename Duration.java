package com.cg.lab3.bean;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Duration {

	public static void main(String[] args) {
		System.out.println("Enter the date in dd/MM/yyyy");
		DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner scan= new Scanner(System.in);
		
		String s1= scan.nextLine();
		LocalDate entereddate1= LocalDate.parse(s1, formatter);
		System.out.println("First date is:"+ entereddate1);
		
		String s2= scan.nextLine();
		LocalDate entereddate2= LocalDate.parse(s2, formatter);
		System.out.println("Second date is:"+ entereddate2);
		scan.close();
		
		Period period=entereddate1.until(entereddate2);
		
		System.out.println("Days:" + period.getDays());
		System.out.println("Month" + period.getMonths());
		System.out.println("Years" +period.getYears());
		
		
		
		
	}

}
