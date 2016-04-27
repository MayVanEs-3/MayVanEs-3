package com.yhuvfkoxhvvhoxqjprogramm;

public class Werkzeug {
	private final static char CAT = '@';
	private final static int MINIMUM = 65;
	private final static int MAXIMUM = 90;
	private final static int LÄNGE = 26;

	/**
	 * Überprüft den übergebenen Wert des Parameter ob dies vollständig in
	 * Großbuchstaben geschrieben ist
	 * 
	 * @param key
	 *            der überprüft werden soll
	 * @return <b>false</b> wenn mindestens ein kleiner Buchstabe gibt,
	 *         <b>true</b> wenn alle Buchstaben groß sind
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
	 * Überprüft ob die Buchstaben die innerhalb des Textes maximal ein mal
	 * vorkommen
	 * 
	 * @param key
	 *            Text der überprüft werden soll
	 * @return <b>false</b> wenn eine Buchstabe mindestens zwei mal existiert,
	 *         <b>true</b> wenn alle Buchstaben nur ein mal vorkommen
	 */

	// Überprüft ob die Buchstaben die innerhalb des Textes maximal ein mal
	// vorkommen

	static boolean checkIfDifferentLetters(String key) {
		boolean[] letterExist = new boolean[LÄNGE];

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
	 * Gibt den Index der gesuchten Buchstabe zurück
	 * 
	 * @param gesuchteChar
	 *            Buchstabe die gesucht werden soll
	 * @param klarText
	 *            Liste in dem die Buchstabe gesucht werden soll
	 * @return gibt den index der gesuchten Buchstabe zurück
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
	 * zurück
	 * 
	 * @return dezimal Wert der Alphabet an der niedrigsten Stelle
	 */
	
	//
	public static int getAbcminvalue() {
		return MINIMUM;
	}

	/**
	 * Gibt den Höhsten Dezimal Wert der Alphabet [A-Z] der Asci Tabelle zurück
	 * 
	 * @return dezimal Wert der Alphabet an der höhsten Stelle
	 */
	public static int getAbcmaxvalue() {
		return MAXIMUM;
	}

	/**
	 * Gibt den länge der Alphabet [A-Z] der Asci Tabelle zurück
	 * 
	 * @return länge der Alphabet
	 */
	public static int getAbclength() {
		return LÄNGE;
	}

	/**
	 * Liefert das @ Zeichen zurück
	 * 
	 * @return @ Zeichen von der ASCI Tabelle
	 */
	
	// die nummer der @ zeichen aus der ASCI tabbelle gibt er hier zurück 
	public static char getAbcat() {
		return CAT;
	}

}



