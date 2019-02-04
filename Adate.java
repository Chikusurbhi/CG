package com.cg.lab3.bean;

import java.time.LocalDate;
import java.time.Period;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Adate {

	public static void main(String[] args) {
		DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the date in dd/MM/yyyy format");
		String input=scan.nextLine();
		LocalDate enteredDate= LocalDate.parse(input, formatter);
	    System.out.println("Entered Date:"+enteredDate);
	    scan.close();
	    LocalDate end=LocalDate.now();
	    
	    Period period= enteredDate.until(end);
	    System.out.println("Days"+period.getDays());
	    System.out.println("Months"+period.getMonths());
	    System.out.println("Years"+period.getYears());

	}

}
