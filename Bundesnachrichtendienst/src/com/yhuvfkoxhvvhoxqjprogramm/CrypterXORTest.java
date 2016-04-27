package com.yhuvfkoxhvvhoxqjprogramm;
/*
import static org.junit.Assert.*;
import Ausnahme.IllegalKeyException;
import Ausnahme.IllegalMessageException;
import Interface.Crypter;
import Crypter.CrypterCaesar;
import Crypter.CrypterFactory;
import Crypter.CrypterNull;
import Crypter.CrypterSubstitution;
import Crypter.CrypterVerfahren;
import Crypter.CrypterXOR;



import org.junit.Test;

public class CrypterXORTest {

	@Test
	public void testCaesar() throws IllegalKeyException, IllegalMessageException {
		Crypter caesar = CrypterFactory.createCrypter(CrypterVerfahren.CAESAR);
		assertEquals("FDHVDU", caesar.verschluesseln(klartextZeichen)("C", "CAESAR"));
		assertEquals("CAESAR", caesar.entschluesseln(cypherTextZeichen)("C", "FDHVDU"));
	}

	@Test
	public void testCaesarKeyException() throws IllegalKeyException, IllegalMessageException {

		Crypter caesar = CrypterFactory.createCrypter(CrypterVerfahren.CAESAR);

		try {
			caesar.encrypt("C", "caesAr");
			fail();
		} catch (IllegalMessageException imex) {
			assertTrue(true);
		}

		try {
			caesar.encrypt("c", "CAESAR");
			fail();
		} catch (IllegalKeyException ikex) {
			assertTrue(true);
		}

		try {
			caesar.encrypt("CC", "CAESAR");
			fail();
		} catch (IllegalKeyException ikex) {
			assertTrue(true);
		}

		try {
			caesar.encrypt("1", "CAESAR");
			fail();
		} catch (IllegalKeyException ikex) {
			assertTrue(true);
		}

		try {
			caesar.decrypt("1", "FDHVDU");
			fail();
		} catch (IllegalKeyException ikex) {
			assertTrue(true);
		}

		try {
			caesar.decrypt("CC", "FDHVDU");
			fail();
		} catch (IllegalKeyException ikex) {
			assertTrue(true);
		}

	}


}
*/
