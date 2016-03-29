package com.internationaleaccountmanagement;

import static org.junit.Assert.*;

import org.junit.Test;

class KontoTest {

@Test
	
	public void testBuche(){
		Konto test = new Konto(null, null,Waehrungen.getRubel());
		test.buche(new Betrag(10000, Waehrungen.getDollar()));
		//test.buche(new Betrag(-2000, Waehrungen.getRubel()));
		double expected = 3921.56;
		assertEquals(expected,test.saldo(),0.001);
		
	
	}
	@Test
	public void testsaldo(){
		Konto test = new Konto(null, null, Waehrungen.getEuro());
		double result = test.saldo();
		double expected = 0;
		assertEquals(expected, result, 0.001);
		
	}
	@Test
	public void testgebuehren(){
		Konto test = new Konto(null, null, null );
		double result= test.gebuehren(3);
		assertEquals(0.0, result, 0.001);
	}
	@Test
	public void testtoString(){
		Betrag test2 = new Betrag(15.00, Waehrungen.getEuro());
		Betrag test3= new Betrag(2.00, Waehrungen.getDollar());
		long betrag = test2.subtraktion(test3.getBetrag(), test3.getWaehrung());
		 Betrag result = new Betrag(betrag, test2.getWaehrung());
		String expected ="13,43 €";
		
		assertEquals(expected,result.toString());
	
	}

}
