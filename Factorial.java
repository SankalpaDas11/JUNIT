package com.demo.main;

import java.util.Scanner;

public class Factorial {
	
	public static boolean fact() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number to find factorial.");
	int num = sc.nextInt();
	 int fact=1;
	 int store = num;
	 if(num>0) {
	while(num!=0) {
	 fact=fact*num;
	 num--;
	} 
	System.out.println("the factorial of " + store + " is : "+fact);
	 return true;}
	 else if(num==0) {
			System.out.println("the factorial of  0 is : 1");
			return true;
	 }
	 else {
		 System.out.println("Input number must be greater than 0");
		 return false;}
	}
}