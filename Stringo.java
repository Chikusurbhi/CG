package com.cg.lab3.bean;
import java.lang.String;
import java.util.Scanner;

public class Stringo {
	public static void main(java.lang.String[] args)
	{
	  Scanner s= new Scanner(System.in);
	  String s1,s2,s3;
	  int a,b,i,j,index=0;
	 
	  System.out.println("Enter the string");
	  s1=s.nextLine();
	  System.out.println("Length of string : "+s1.length());
	  
	  char c[]=s1.toCharArray();
	  char d[]=new char[50];
	  System.out.println("Choices");
	  System.out.println("1. Add the String to itself");
	  System.out.println("2. Replace odd positions with #");
	  System.out.println("3. Remove duplicate characters in the string");
	  System.out.println("4. Change odd characters to upper case");
	  System.out.println("Enter your choice");
	  a=s.nextInt();
	  switch(a) {
	  case 1:{
		      s2= s1+s1;
		      System.out.println(s2);
		      break;
	  }
	  case 2: 
		      for(i=0;i<s1.length();i++)
		      {
		    	  if(i%2==0)
		    		  c[i]='#';
		      
		      System.out.println(c[i]);
		      }
		      break;
		  
	  
	  case 3:
		      for(i=0;i<s1.length();i++)
		      {
		    	  for(j=0;j<i;j++)
		    	  {
		    		  if(c[i]==c[j])
		    			  break;
		    	  }
		    	  if(j==i)
		    		  d[index++]=c[i];
		      }
		      s3= new String(d);
		      System.out.println(s3);
		      break;
	  case 4:
		  for(i=0; i<s1.length();i++)
		  {
			  if(i%2==0)
			  {
				c[i]=Character.toUpperCase(c[i]);
			  }
		  }
		  String s4= new String(c);
		  System.out.println(s4);
		  break;
	  
	  default: System.exit(0);
	           
	  }
	}
}
