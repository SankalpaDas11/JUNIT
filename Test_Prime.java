package com.demo.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import com.demo.main.PrimeTrue;

public class Test_Prime {
	@Test
	public void test() {
		assertEquals(true,PrimeTrue.findPrime(3));
		//assertEquals(true,PrimeTrue.findPrime(10));

	}
}
