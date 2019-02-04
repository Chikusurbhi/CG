package com.cg.Lab3.bean;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Zone {

	public static void main(String[] args) {
		ZonedDateTime ct= ZonedDateTime.now();
		ZonedDateTime ctLondon= ZonedDateTime.now(ZoneId.of("Europe/London"));
		ZonedDateTime ctPacific= ZonedDateTime.now(ZoneId.of("US/Pacific"));
		ZonedDateTime ctCario= ZonedDateTime.now(ZoneId.of("Africa/Cairo"));
		ZonedDateTime ctSydney= ZonedDateTime.now(ZoneId.of("Australia/Sydney"));
		ZonedDateTime ctNewYork= ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("India"+ ct);
		System.out.println("London"+ctLondon);
		System.out.println("Pacific"+ctPacific);
		System.out.println("Pacific"+ctCario);
		System.out.println("Sydney"+ctSydney);
		System.out.println("NewYork"+ctNewYork);
		
	}

}
