package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import calculator.MetodCalc;
import calculator.tax;
public class testCalc1 {
	tax tax = new tax();
	@Test
	public void testTax()
	 {
	 
	 double res= tax.calcTax(500000, 500000, 1, 13, true);
	 double toch=65000.0;
	 assertEquals(Double.toString(res),Double.toString(toch));
	 }
}



//assertTrue(result == abs); 