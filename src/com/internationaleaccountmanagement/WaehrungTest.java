package com.internationaleaccountmanagement;
import static org.junit.Assert.*;

import org.junit.Test;

class WaehrungTest {

	@Test
	public void testUmrechnen() {
		Waehrung test = new Waehrung(null, null, 1.000);
		long result = test.umrechnen(2, Waehrungen.getEuro());
		
		assertEquals(1, result);
	}
	@Test
	public void test2Umrechnen() {
		Waehrung test = new Waehrung(null, null, 1.000);
		long result = test.umrechnen(2, Waehrungen.getDollar());
		
		assertEquals(2, result);
	}
	@Test
	public void test3Umrechnen() {
		Waehrung test = new Waehrung(null, null, 1.000);
		long result = test.umrechnen(2, Waehrungen.getRubel());
	
		assertEquals(78, result);
	}
	@Test
	public void test4Umrechnen() {
		Waehrung test = new Waehrung(null, null, 1.000);
		long result = test.umrechnen(2, Waehrungen.getYen());
		assertEquals(219, result);
	}
	@Test
	public void test5Umrechnen() {
		Waehrung test = new Waehrung(null, null, 1.000);
		long result = test.umrechnen(2, Waehrungen.getSchweizerFranken());
		
		assertEquals(1, result);
	}
	@Test
	public void testtoString(){
		Waehrung test = Waehrungen.getDollar();
		String expected ="-20,03 €";
		Betrag test2 = new Betrag(-20.03, Waehrungen.getEuro());
		
		assertEquals(expected,test2.toString());
	
	}
}
