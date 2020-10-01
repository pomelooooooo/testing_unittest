package com.unittest.testing;

import static org.hamcrest.CoreMatchers.both;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.everyItem;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class AppTest
{
	Fahrenheit object;
	
	@Before
	
	
	public void newClassFahrenheit() {
		object = new Fahrenheit();
		
	}
	
	@Test
	public void testResult0Input0() {
		
		double input = 0 ;
		double expected = 0;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected, actual,2);
	}
	
	@Test
	public void testResult1000Input1000() {
		
		double input = 1000 ;
		double expected = 1000;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected, actual,2);
	}
	
	@Test
	public void testResultminus1000Inputminus1000() {
		
		double input = -1000 ;
		double expected = -1000;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected, actual,2);
	}
	
	@Test
	public void testResultTrueinput0() {
		
		double input = 0 ;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultTrueinput1000() {
		
		double input = 1000 ;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultTrueinputminus1000() {
		
		double input = -1000 ;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultTrueinput2000() {
		
		double input = 2000 ;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultTrueinputminus2000() {
		
		double input = -2000 ;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultTrueinputminus1010() {
		
		double input = -1010 ;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testResultTrueinputminus1001() {
		
		double input = -1001 ;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testResultTrueinputminus999() {
		
		double input = -999 ;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testResultTrueinputminus501() {
		
		double input = -501 ;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testResultTrueinputminus500() {
		
		double input = -500 ;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testResultTrueinputminus499() {
		
		double input = -499 ;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testResultTrueinputminus1() {
		
		double input = -1 ;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testResultTrueinput499() {
		
		double input = 499 ;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testResultTrueinput500() {
		
		double input = 500 ;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testResultTrueinput501() {
		
		double input = 501 ;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testResultTrueinput999() {
		
		double input = 999 ;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testResultTrueinput1001() {
		
		double input = 1001 ;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testResultTrueinput1010() {
		
		double input = 1010 ;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResult32Calculateinput0() {	
		double input = 0 ;
		double expected = 32.00;
		object.input(0);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected, actual,2);
	}
	
	@Test
	public void testResult32Calculateinput1000() {	
		double input = 1000 ;
		double expected = 1832;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected, actual,2);
	}
	
	@Test
	public void testResult32CalculateinputMinus1000() {	
		double input = -1000 ;
		double expected = -1768;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected, actual,2);
	}
	
	@Test
	public void testResultMassageOutputFromInput0() {	
		double input = 0 ;
		String expected = "0 celcius = 32 fahrenhiet";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultMassageOutputFromInput1000() {	
		double input = 1000 ;
		String expected = "1000 celcius = 1832 fahrenhiet";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultMassageOutputFromInputMinus1000() {	
		double input = -1000 ;
		String expected = "-1000 celcius = -1768 fahrenhiet";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
}