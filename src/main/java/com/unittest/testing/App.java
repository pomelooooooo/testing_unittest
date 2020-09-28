package com.unittest.testing;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;



public class App 
{
	CtoF object;
	
	@Before
	public void newClassFahrenheit() {
		object = new CtoF();
	}
	
	@Test
	public void testResult0Input0() {
		double input = 0;
		double expected = 0;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected, actual, 2);
	}
	
	@Test
	public void testResult1000Input1000() {
		double input = 1000;
		double expected = 1000;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected, actual, 2);
	}
	
	@Test
	public void testResultMinus1000InputMinus1000() {
		double input = -1000;
		double expected = -1000;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected, actual, 2);
	}
	
	@Test
	public void testResulTrueInput0() {
		double input = 0;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResulTrueInput1() {
		double input = 1;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResulTrueInputMinus1() {
		double input = -1;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResulTrueInput1000() {
		double input = 1000;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResulTrueInputMinus1000() {
		double input = -1000;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResulTrueInput2000() {
		double input = 2000;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResulTrueInputMinus2000() {
		double input = -2000;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResulTrueInput499() {
		double input = 499;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResulTrueInputMinus499() {
		double input = -499;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResulTrueInput500() {
		double input = 500;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResulTrueInputMinus500() {
		double input = -500;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResulTrueInput501() {
		double input = 501;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResulTrueInputMinus501() {
		double input = -501;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResulTrueInput1010() {
		double input = 1010;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResulTrueInputMinus1010() {
		double input = -1010;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResulTrueInput1001() {
		double input = 1001;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResulTrueInputMinus1001() {
		double input = -1001;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResulTrueInputMinus999() {
		double input = -999;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResulTrueInput999() {
		double input = 999;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
}
