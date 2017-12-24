package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import calculator.tax;

public class test4 {

	tax tax = new tax();
	@Test
	public void testTax()
	{
		double res= tax.calcTax(35000, 0, 2, 13, false );
		double toch=4316;
		assertTrue(toch == res); 
		}
}
