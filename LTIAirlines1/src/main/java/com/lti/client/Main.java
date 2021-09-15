package com.lti.client;

import com.lti.model.Flight;

public class Main {

	public static void main(String[] args) {
		Flight f = new Flight(1001, "Hyd", "Mumbai");
		System.out.println(f.getFlightId()+" "
							+f.getSource()+" "
							+f.getDestination());
		int num1=10,num2=20;
		if(add(num1,num2)==30) {
			System.out.println("Test passed");
		}
		else {
			System.out.println("test failed");
		}
	}
	public static int add(int n1,int n2)
	{
		return n1+n2;
	}
	
}

