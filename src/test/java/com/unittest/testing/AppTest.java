package com.unittest.testing;

import static org.junit.Assert.assertEquals;


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
	public void testResult1Input1() {
		
		double input = 1 ;
		double expected = 1;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected, actual,2);
	}
	
	@Test
	public void testResultminus1Inputminus1() {
		
		double input = -1 ;
		double expected = -1;
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
	public void testResult499Input499() {
		
		double input = 499 ;
		double expected = 499;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected, actual,2);
	}
	
	@Test
	public void testResultminus499Inputminus499() {
		
		double input = -499 ;
		double expected = -499;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected, actual,2);
	}
	
	@Test
	public void testResult500Input500() {
		
		double input = 500 ;
		double expected = 500;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected, actual,2);
	}
	
	@Test
	public void testResultminus500Inputminus500() {
		
		double input = -500 ;
		double expected = -500;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected, actual,2);
	}
	
	@Test
	public void testResult501Input501() {
		
		double input = 501 ;
		double expected = 501;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected, actual,2);
	}
	
	@Test
	public void testResultminus501Inputminus501() {
		
		double input = -501 ;
		double expected = -501;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected, actual,2);
	}
	
	@Test
	public void testResult999Input999() {
		
		double input = 999 ;
		double expected = 999;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected, actual,2);
	}
	
	@Test
	public void testResultminus999Inputminus999() {
		
		double input = -999 ;
		double expected = -999;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected, actual,2);
	}
	
	@Test
	public void testResult1001Input1001() {
		
		double input = 1001 ;
		double expected = 1001;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected, actual,2);
	}
	
	@Test
	public void testResultminus1001Inputminus1001() {
		
		double input = -1001 ;
		double expected = -1001;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected, actual,2);
	}
	
	@Test
	public void testResult1010Input1010() {
		
		double input = 1010 ;
		double expected = 1010;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected, actual,2);
	}
	
	@Test
	public void testResultminus1010Inputminus1010() {
		
		double input = -1010 ;
		double expected = -1010;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected, actual,2);
	}
	
	@Test
	public void testResult2000Input2000() {
		
		double input = 2000 ;
		double expected = 2000;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected, actual,2);
	}
	
	@Test
	public void testResultminus2000Inputminus2000() {
		
		double input = -2000 ;
		double expected = -2000;
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
	public void testResultTrueinput1() {
		
		double input = 1 ;
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
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected, actual,2);
	}
	
	@Test
	public void testResult32Calculateinput1() {	
		double input = 1 ;
		double expected = 33.80;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected, actual,2);
	}
	
	@Test
	public void testResult32CalculateinputMinus1() {	
		double input = -1 ;
		double expected = 30.2;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected, actual,2);
	}
	
	@Test
	public void testResult930Calculateinput499() {	
		double input = 499 ;
		double expected = 930.20 ;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected, actual,2);
	}
	
	@Test
	public void testResultMinus866CalculateinputMinus499() {	
		double input = -499 ;
		double expected = -866.20 ;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected, actual,2);
	}
	
	@Test
	public void testResult932Calculateinput500() {	
		double input = 500 ;
		double expected = 932 ;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected, actual,2);
	}
	
	@Test
	public void testResultMinus868CalculateinputMinus500() {	
		double input = -500 ;
		double expected = -868 ;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected, actual,2);
	}
	
	@Test
	public void testResult1830Calculateinput999() {	
		double input = 999 ;
		double expected = 1830.20 ;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected, actual,2);
	}
	
	@Test
	public void testResultMinus1766CalculateinputMinus999() {	
		double input = -999 ;
		double expected = -1766.20 ;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected, actual,2);
	}
	
	@Test
	public void testResult1832Calculateinput1000() {	
		double input = 1000 ;
		double expected = 1832;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected, actual,2);
	}
	
	@Test
	public void testResultMinas1768CalculateinputMinus1000() {	
		double input = -1000 ;
		double expected = -1768;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected, actual,2);
	}
	
	@Test
	public void testResult1833Calculateinput1001() {	
		double input = 1001 ;
		double expected = 1833.80 ;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected, actual,2);
	}
	
	@Test
	public void testResultMinus1769CalculateinputMinus1001() {	
		double input = -1001 ;
		double expected = -1769.80 ;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected, actual,2);
	}
	
	@Test
	public void testResult1850Calculateinput1010() {	
		double input = 1010 ;
		double expected = 1850 ;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected, actual,2);
	}
	
	@Test
	public void testResultMinus1786CalculateinputMinus1010() {	
		double input = -1010 ;
		double expected = -1786 ;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected, actual,2);
	}
	
	@Test
	public void testResult3632Calculateinput2000() {	
		double input = 2000 ;
		double expected = 3632;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected, actual,2);
	}
	
	@Test
	public void testResultMinas3568CalculateinputMinus2000() {	
		double input = -2000 ;
		double expected = -3568;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected, actual,2);
	}
	
	@Test
	public void testResultMassageOutputFromInput0() {	
		double input = 0 ;
		String expected = "0 celcius = 32.00 fahrenhiet";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultMassageOutputFromInput1() {	
		double input = 1 ;
		String expected = "1 celcius = 33.80 fahrenhiet";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultMassageOutputFromInputMinus1() {	
		double input = -1 ;
		String expected = "-1 celcius = 30.20 fahrenhiet";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultMassageOutputFromInput499() {	
		double input = 499 ;
		String expected = "499 celcius = 930.20 fahrenhiet";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultMassageOutputFromInputMinus499() {	
		double input = -499 ;
		String expected = "-499 celcius = -866.20 fahrenhiet";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultMassageOutputFromInput500() {	
		double input = 500 ;
		String expected = "500 celcius = 932.00 fahrenhiet";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultMassageOutputFromInputMinus500() {	
		double input = -500 ;
		String expected = "-500 celcius = -868.00 fahrenhiet";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultMassageOutputFromInput501() {	
		double input = 501 ;
		String expected = "501 celcius = 933.80 fahrenhiet";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultMassageOutputFromInputMinus501() {	
		double input = -501 ;
		String expected = "-501 celcius = -869.80 fahrenhiet";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultMassageOutputFromInput999() {	
		double input = 999 ;
		String expected = "999 celcius = 1830.20 fahrenhiet";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultMassageOutputFromInputMinus999() {	
		double input = -999 ;
		String expected = "-999 celcius = -1766.20 fahrenhiet";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultMassageOutputFromInput1000() {	
		double input = 1000 ;
		String expected = "1000 celcius = 1832.00 fahrenhiet";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultMassageOutputFromInputMinus1000() {	
		double input = -1000 ;
		String expected = "-1000 celcius = -1768.00 fahrenhiet";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultMassageOutputFromInput1001() {	
		double input = 1001 ;
		String expected = "1001 celcius = 1833.80 fahrenhiet";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultMassageOutputFromInputMinus1001() {	
		double input = -1001 ;
		String expected = "-1001 celcius = -1769.80 fahrenhiet";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultMassageOutputFromInput1010() {	
		double input = 1010 ;
		String expected = "1010 celcius = 1850.00 fahrenhiet";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultMassageOutputFromInputMinus1010() {	
		double input = -1010 ;
		String expected = "-1010 celcius = -1786.00 fahrenhiet";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultMassageOutputFromInput2000() {	
		double input = 2000 ;
		String expected = "2000 celcius = 3632.00 fahrenhiet";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultMassageOutputFromInputMinus2000() {	
		double input = -2000 ;
		String expected = "-2000 celcius = -3568.00 fahrenhiet";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	
}