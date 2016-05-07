package com.yhuvfkoxhvvhoxqjprogramm;

public class CrypterXOR implements Crypter {
	static char[] message = "TPERULES".toCharArray();
	static String key;
	static char[] verschluesselt = new char [key.length()];
	
	public static void main(String[] args) {
		CrypterXOR eins = new CrypterXOR();
		eins.ausgeben();
		// eins.verschluesseln();
		eins.einzelnVer();
		//eins.entschluesseln();
	}
	/**
	 * KOnstruktor
	 */
	CrypterXOR() {
		this.erstelleArray();
		this.key = key.toUpperCase();
		this.message = message;
	}
	
	/**
	 * komplette alphabet wird ausgegeben
	 */
	  void ausgeben() {
		for (char a = 'A'; a <= 'Z'; a++) {
			System.out.print(a);

		}
		System.out.println();
	}
	
	/**
	 * Sonderzeichen die dazu müssen
	 */
	char[] sondersigns = new char[32];
	public void erstelleArray() {
		int i = 0;
		for (char alphabet = '@'; alphabet <= '_'; alphabet++) {
			sondersigns[i++] = alphabet;
		}
	}
	
	/**
	 * Gibt den Index der gesuchten Buchstabe zurück
	 * 
	 * @param k
	 *            Buchstabe die gesucht werden soll
	 * @param sondersigns
	 *            Liste in dem die Buchstabe gesucht werden soll
	 * @return gibt den index der gesuchten Buchstabe zurück
	 */


	public int getIndexOfChar(char k) {
		for (int i = 1; i <= 26; i++) {
			if (sondersigns[i] == k) {
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * verschluesselt die einzelnen Buchstaben
	 * char zahl hinterlegt
	 * in int casten
	 */

	 int index = 0;
	private char cryptChar(char c) {

		int zahl;
		zahl = (int) ((getIndexOfChar(c)) ^ (getIndexOfChar((message[(index) % message.length]))));
		// System.out.println(c +" - "+key[index % key.length]);
		index++;
		return sondersigns[zahl];

	}
	/**
	 * verschluesselt die Nachricht mit dem Key und der message
	 */
	
	@Override
	public char verschluesseln(char klartextZeichen) throws CrypterException {
		for (int i = 0; i < key.length(); i++) {
			verschluesselt[i] = (char) (key.indexOf(i) ^ message[i % message.length]);
			System.out.println(key.toCharArray()[i] + " - " + message[i % message.length]);
		}
		System.out.println(new String(verschluesselt));
		return klartextZeichen;
		
	}
	
	public void einzelnVer() {
		for (char z = 'A'; z <= 'Z'; z++) {
			System.out.print(cryptChar(z));
		}
	}
	/*
	 * von verschluesseln auf resetten und dann weiter zu entschluesseln
	 */
	@Override
	public void reset() {
		index = 0;
	}
	/**
	 * entschlüesselt die Nachricht
	 */
	@Override
	public char entschluesseln(char cypherTextZeichen) throws CrypterException {
		
		return verschluesseln(cypherTextZeichen);
	}
	
	

}
