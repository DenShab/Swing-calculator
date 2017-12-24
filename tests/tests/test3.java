package tests;

import static org.junit.Assert.*;
import calculator.MetodCalc;

public class test3 {

	 @org.junit.Test
	 public void testPlus()
	 {
	 MetodCalc mc = new MetodCalc();
	 double res= mc.calc(15, "+", 5);
	 assertEquals(Double.toString(20), Double.toString(res));
	 }
	 
	 @org.junit.Test
	 public void test_Minus()
	 {
	 MetodCalc mc = new MetodCalc();
	 double res=mc.calc(15, "-", 5);
	 assertEquals(Double.toString(10), Double.toString(res));
	 }

	 @org.junit.Test
	 public void test_Multiply()
	 {
	 MetodCalc mc = new MetodCalc();
	 double res=mc.calc(15, "*", 5);
	 assertEquals(Double.toString(75), Double.toString(res) );
	 }
	
	 @org.junit.Test
	 public void test_Divide()
	 {
	 MetodCalc mc = new MetodCalc();
	 double res=mc.calc(15, "/", 5);
	 assertEquals(Double.toString(3), Double.toString(res) );
	 } 
}
