package Assigment1;

import java.util.Scanner;

public class CalculateBill
{	
	double billpay;
	 
	void Bill(long units)
		{
	  	  if(units<100) 
			billpay=units*1.20; 
	  	  
		  else if(units<=300)  
			billpay=100*1.20+(units-100)*2;
	  	  
		  else if(units>300)  
			billpay=100*1.20+200 *2+(units-300)*3;
		 }	 	
}

class ElectricityBill extends CalculateBill
{ 
	public static void main(String args[]) 
	{   
		long units;
	 
		Scanner scn=new Scanner(System.in);
	 
		System.out.println("Enter number of units");
		   
	    units=scn.nextLong();
	 
	    ElectricityBill eb=new ElectricityBill();
	    eb.Bill(units);
	        	
	    System.out.println("Bill to pay : " + eb.billpay); 
	 } 
}