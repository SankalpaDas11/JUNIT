package com.demo.main;

public class Junit_Demo {
	public static int max(int[]arr) {
		int max=0;
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
			
		}return max;
	}

}