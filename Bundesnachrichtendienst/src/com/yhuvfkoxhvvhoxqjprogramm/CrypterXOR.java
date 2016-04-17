package com.yhuvfkoxhvvhoxqjprogramm;

public class CrypterXOR implements Crypter {
	static char[] key = "MAYDAH".toCharArray();
	static String message = "A";
	static char[] verschluesselt = new char[message.length()];
	// static char[] alleBuchstaben =
	// "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	// char[] encrypted = new char[message.length()];

	public static void main(String[] args) {

		CrypterXOR eins = new CrypterXOR();

		// eins.ausgeben();
		// eins.verschluesseln();
		eins.einzelnVer();
	}
	/**
	 * KOnstruktor1111111111111
	 */
	CrypterXOR() {
		this.erstelleArray();
		this.message = message.toUpperCase();
	}
	/**
	 * BUchstaben ausgeben
	 */
	/*
	public static void ausgeben() {
		for (char a = 'A'; a <= 'Z'; a++) {
			System.out.print(a);

		}
		System.out.println();
	}
	*/
	
	/**
	 * 
	 */
	public void einzelnVer() {
		for (char z = 'A'; z <= 'Z'; z++) {
			System.out.print(cryptChar(z));
		}
	}
	
	/**
	 * 
	 * @param k
	 * @return
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
	 */

	static int index = 0;
	private char cryptChar(char c) {

		int zahl;
		zahl = (int) ((getIndexOfChar(c)) ^ (getIndexOfChar((key[(index) % key.length]))));
		// System.out.println(c +" - "+key[index % key.length]);
		index++;
		return sondersigns[zahl];

	}
	
	/**
	 * verschluesseln
	 */
	/*
	public static void verschluesseln() {
		for (int i = 0; i < message.length(); i++) {
			verschluesselt[i] = (char) (message.indexOf(i) ^ key[i % key.length]);
			// klarText[i] = (char) (verschluesselt[i]^key[i % key.length]);
			System.out.println(message.toCharArray()[i] + " - " + key[i % key.length]);
		}
		System.out.println(new String(verschluesselt));

	}
	*/
	
	/**
	 * Sonderzeichen
	 */
	char[] sondersigns = new char[32];
	public void erstelleArray() {
		int i = 0;
		for (char alphabet = '@'; alphabet <= '_'; alphabet++) {
			sondersigns[i++] = alphabet;
		}
	}
	@Override
	public void reset() {
		index = 0;
	}
	@Override
	public char verschluesseln(char klartextZeichen) throws CrypterException {
		for (int i = 0; i < message.length(); i++) {
			verschluesselt[i] = (char) (message.indexOf(i) ^ key[i % key.length]);
			// klarText[i] = (char) (verschluesselt[i]^key[i % key.length]);
			System.out.println(message.toCharArray()[i] + " - " + key[i % key.length]);
		}
		System.out.println(new String(verschluesselt));
	}
	@Override
	public char entschluesseln(char cypherTextZeichen) throws CrypterException {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
