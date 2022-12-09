package com.demo.main;

public class PrimeTrue {
	public static boolean findPrime(int num) {
		int flag = 0;
		for(int i=2;i<num;i++) {
			if(num%i==0) 
				flag=1;
		}
		if(flag==0) {
			System.out.println("Yes " + num + " is prime.");
			return true;
		}
		else
			return false;	
	}
}
