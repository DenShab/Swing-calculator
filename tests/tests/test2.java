package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import calculator.tax;



public class test2 {

	tax tax = new tax();
	@Test
	public void testTax()
	 {
		double res= tax.deduction(500000, true);
		double toch=300000601;
		assertTrue(res == toch);
	 }

}






//assertTrue(result == abs); 
