package com.surbhi.mpt.bean;

import java.util.ArrayList;
import java.util.List;

public class Account {
private int id;
private String name;
private double balance;


public Account() {
	
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public String toString() {
	return "Account [id=" + id + ", name=" + name + ", balance=" + balance
			+ "]";
}




}
