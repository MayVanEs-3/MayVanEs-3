package com.yhuvfkoxhvvhoxqjprogramm;

public class Werkzeug {
	private final static char CAT = '@';
	private final static int MINIMUM = 65;
	private final static int MAXIMUM = 90;
	private final static int L�NGE = 26;

	/**
	 * �berpr�ft den �bergebenen Wert des Parameter ob dies vollst�ndig in
	 * Gro�buchstaben geschrieben ist
	 * 
	 * @param key
	 *            der �berpr�ft werden soll
	 * @return <b>false</b> wenn mindestens ein kleiner Buchstabe gibt,
	 *         <b>true</b> wenn alle Buchstaben gro� sind
	 */

	static boolean checkUppercase(String text) {
		for (int i = 0; i < text.length(); i++) {
			// greifen in dem Text an die stelle i zu
			if (text.charAt(i) >= MINIMUM && text.charAt(i) <= MAXIMUM) {

			} else {
				return false;
			}
		}
		return true;
	}

	/**
	 * �berpr�ft ob die Buchstaben die innerhalb des Textes maximal ein mal
	 * vorkommen
	 * 
	 * @param key
	 *            Text der �berpr�ft werden soll
	 * @return <b>false</b> wenn eine Buchstabe mindestens zwei mal existiert,
	 *         <b>true</b> wenn alle Buchstaben nur ein mal vorkommen
	 */

	// �berpr�ft ob die Buchstaben die innerhalb des Textes maximal ein mal
	// vorkommen

	static boolean checkIfDifferentLetters(String key) {
		boolean[] letterExist = new boolean[L�NGE];

		for (int i = 0; i < letterExist.length; i++) {
			if (letterExist[key.charAt(i) - 'A']) {
				return false;
			} else {
				letterExist[key.charAt(i) - 'A'] = true;
			}
		}
		return true;
	}

	
	/**
	 * Gibt den Index der gesuchten Buchstabe zur�ck
	 * 
	 * @param gesuchteChar
	 *            Buchstabe die gesucht werden soll
	 * @param klarText
	 *            Liste in dem die Buchstabe gesucht werden soll
	 * @return gibt den index der gesuchten Buchstabe zur�ck
	 */

	
	
	static int getIndex(char gesuchteChar, char[] klarText) {
		for (int i = 0; i < klarText.length; i++) {
			if (klarText[i] == gesuchteChar) {
				return i;
			}
		}
		return 0;
	}

	/**
	 * Gibt den Niedrigsten Dezimal Wert der Alphabet [A-Z] der Asci Tabelle
	 * zur�ck
	 * 
	 * @return dezimal Wert der Alphabet an der niedrigsten Stelle
	 */
	
	//
	public static int getAbcminvalue() {
		return MINIMUM;
	}

	/**
	 * Gibt den H�hsten Dezimal Wert der Alphabet [A-Z] der Asci Tabelle zur�ck
	 * 
	 * @return dezimal Wert der Alphabet an der h�hsten Stelle
	 */
	public static int getAbcmaxvalue() {
		return MAXIMUM;
	}

	/**
	 * Gibt den l�nge der Alphabet [A-Z] der Asci Tabelle zur�ck
	 * 
	 * @return l�nge der Alphabet
	 */
	public static int getAbclength() {
		return L�NGE;
	}

	/**
	 * Liefert das @ Zeichen zur�ck
	 * 
	 * @return @ Zeichen von der ASCI Tabelle
	 */
	
	// die nummer der @ zeichen aus der ASCI tabbelle gibt er hier zur�ck 
	public static char getAbcat() {
		return CAT;
	}

}



