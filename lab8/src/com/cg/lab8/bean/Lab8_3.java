package com.cg.lab8.bean;

import java.util.Random;

public class Lab8_3 extends Thread{
    static int c=0;
    static int f=1;
    static int x;
    Random rand=new Random();
    public void run()
    {if(c!=1)
    {
     x=rand.nextInt(10)+1;c++;
     System.out.println("Number: "+x);
    }
    else
    {    
    	for(int i=1;i<=x;i++)
    {
    		f=f*i;
    
    }
    System.out.println("Factorial of "+x+" is:"+f);
    }
    }
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	Lab8_3 t1=new Lab8_3();
    	Lab8_3 t2=new Lab8_3();
     t1.start();
     t2.start();
	}
}