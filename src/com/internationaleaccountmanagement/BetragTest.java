package com.internationaleaccountmanagement;
import static org.junit.Assert.*;

import org.junit.Test;
import org.omg.Messaging.SyncScopeHelper;

class BetragTest {

	@Test
	public void testAddition() {
		
		Betrag test = new Betrag(3, Waehrungen.getEuro());
		long result = test.addition(5, Waehrungen.getEuro());
		assertEquals(8,result);
	}
	@Test
	public void testSubtraktion(){
		Betrag test = new Betrag(10, Waehrungen.getDollar());
		long result = test.subtraktion(2, Waehrungen.getDollar());
		assertEquals(8, result);
	}
	
	@Test
	public void testtoString(){
		String expected ="1023323,54 €";
		Betrag test2 = new Betrag(1023323.545345, Waehrungen.getEuro());
		
		assertEquals(expected,test2.toString());
	}
	@Test
	public void testgetNachkomma(){
		int expected = 54;
		Betrag test2 = new Betrag(1023323.545345, Waehrungen.getEuro());
		int result = test2.getNachkomma();
		assertEquals(expected,result);
	}
	@Test
	public void testpromille(){
		
		Betrag test4 = new Betrag(1000.0, Waehrungen.getEuro());
		System.out.println(test4.promille(5));
		assertEquals(5,test4.promille(5));
	}
	@Test
	public void testprozent(){
		Betrag test3 = new Betrag(102.11, Waehrungen.getSchweizerFranken());
		System.out.println(test3.prozent(2));
		assertEquals(2, test3.prozent(2));
	}
	@Test
	public void testVorkomma(){
		
	}

}
