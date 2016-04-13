package com.yhuvfkoxhvvhoxqjprogramm;

import java.util.HashMap;
import java.util.Scanner;

class CrypterXOR {

	// int [] M = {0,1};//MESSAGE
	// int [] K = {0,1};

	HashMap<Character, Character> verschluesseln;
	HashMap<Character, Character> entschluesseln;

	public CrypterXOR() {
		super();
		verschluesseln = new HashMap<Character, Character>();
		entschluesseln = new HashMap<Character, Character>();
	}

	public static void main(String[] args) {

		CrypterXOR neu = new CrypterXOR();
		System.out.println("Gebe ein: ");

		Scanner sc = new Scanner(System.in);
		String klarText = sc.nextLine();
		String keyText;
		String encryptedText = "";

		int numLaenge = klarText.length();

		boolean[] text = new boolean[numLaenge];
		boolean[] key = new boolean[numLaenge];
		boolean[] encrypted = new boolean[numLaenge];

		for (int i = 0; i < numLaenge; i++) {
			if (klarText.charAt(i) == '1') {
				text[1] = true;
			}

		}

	}
	/*
	 * private static boolean printbinary(String key) { int result = 0; while
	 * (key > null){ if(key % 2 == 0){ result = 0+ result; }else{ result = 1+
	 * result; key = key/2; } } System.out.println(); return false; }
	 */

}
