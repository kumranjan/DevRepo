package com.nt.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.nt.service.Arithmetic;

public class AppTest {
	
	@Test
	public void testWithPositive()
	{
		System.out.println("AppTest.testWithPositive()");
		Arithmetic ar=new Arithmetic();
		int actual=ar.sum(10,20);
		int expected=30;
		assertEquals(actual,expected);
	}
	@Test
	public void testWithNegative()
	{
		Arithmetic ar=new Arithmetic();
		System.out.println("AppTest.testWithNegative()");
		int actual=ar.sum(-10,-20);
		int expected=-30;
		assertEquals(expected,actual);
	}
	@Test
	public void testWithMixed()
	{
		Arithmetic ar=new Arithmetic();
		System.out.println("AppTest.testWithNegative()");
		int actual=ar.sum(-150,20);
		int expected=-120;
		assertEquals(expected,actual);
	}

}
