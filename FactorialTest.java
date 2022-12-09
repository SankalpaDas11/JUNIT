package com.demo.test;
import com.demo.main.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class FactorialTest {
	@Test
	public void test() {
		assertEquals(true,Factorial.fact());
	}
}