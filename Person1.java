package com.cg.Lab2.bean;

public class Person1 {

		private String firstName;
		private String lastName;
		private char gender;
		
		public Person1() {
			super();
		}
		public Person1(String firstName, String lastName, char gender) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.gender = gender;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public char getGender() {
			return gender;
		}
		public void setGender(char gender) {
			this.gender = gender;
		}
		@Override
		public String toString() {
			return "Person's First Name is:" + firstName +"\n Person's Last Name" + lastName + "\n Person's Gender" + gender;
		}
		

	
}
