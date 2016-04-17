package com.yhuvfkoxhvvhoxqjprogramm;

class CrypterSubstitution {
	/*
	 * String x = v.verschluesseln(wort); 
	 * String y = v.entschl�sseln(x);
	 */

	public class Verschluesselung {
		// Attribut f�r das GeheimAlphabet
		private String geheimAlphabet;

		/**
		 * Erstellt eine Verschluesselung mit dem geheimAlphabet
		 */
		public Verschluesselung(String g) {
			if (g.length() == 26) {
				geheimAlphabet = g; // <- g f�r geheim
			} else {
				geheimAlphabet = "uflpwdrasjmconqybvtexhzkgi";
			}
		}

		/**
		 * Das Wort wird mit dem geheim Alphabet verschl�sselt
		 * 
		 * @param verschl
		 *            der eingegebene Text
		 * @return zur�ck zum verschl�sselten Text
		 */
		public String verschluesseln(String verschluesseln) {
			String verschluesselterText = "";
			for (int i = 0; i < verschluesseln.length(); i++) {
				verschluesselterText = verschluesselterText
						+ geheimAlphabet.charAt((int) verschluesseln.charAt(i) - 97);
			}
			return verschluesselterText.toUpperCase(); // <- toUpperCase gibt es in Gro�buchstaben aus
		}

		/**
		 * Das verschl�sselte Wort wird wieder entschl�sselt
		 * 
		 * @param entschluesseln
		 *            das zu entschl�sselte Wort
		 * @return zur�ck zum entschl�sselten Text
		 */
		// Funktioniert nicht
		public String entschluesseln(String entschluesseln) {
			String entschluesselterText = "";
			String x = this.verschluesseln(entschluesseln);
			for (int i = 0; i < entschluesseln.length(); i++) {
				entschluesselterText = entschluesselterText + x.charAt((int) entschluesseln.charAt(i) - 97);
			}
			return entschluesselterText.toLowerCase();
		}
	}

	/**
	 * Das hier ist eine Klasse Verschl�sseln die die monoalphabetische
	 * Substitution anwendet
	 */

	private char[] geheim;

	public char[] getArray() {
		return geheim;
	}

	public void setArray(char[] geheim) {
		this.geheim = geheim;
	}

	/**
	 * @param geheim
	 *            das �bergeben vom Geheimalphabet
	 * @return
	 */
	public void Verschluesselung(String geheimniss) {
		int zahl = 0;
		geheim = new char[((int) 'z')];
		for (char i = 'a'; i < 'z'; i++) {
			geheim[i] = geheimniss.charAt(zahl);
			zahl++;
		}
	}

	/**
	 * Klartext in Geheimtext umwandelt
	 * 
	 * @param eingabe
	 *            des Klartext
	 * @return zur�ck zum verschl�sselten Text
	 */
	public String verschluesseln(String klartext) {
		klartext = klartext.toLowerCase();
		for (char i = 'a'; i < 'z'; i++) {
			klartext = klartext.replace(i, geheim[i]); // urspr�ngliche Alphabet durch Geheimalphabet im [i] gespeichert ersetzt
		}
		return klartext;

	}

	/**
	 * Geheimtext in Klartext umwandelt
	 * 
	 * @param eingabe
	 *            des Geheimtext
	 * @return zur�ck zum Klartext
	 */
	public String entschluesseln(String geheimtext) {
		geheimtext = geheimtext.toUpperCase();
		for (char i = 'a'; i < 'z'; i++) {
			geheimtext = geheimtext.replace(geheim[i], i); // hier wird das Geheimalphabet durch das "urspr�ngliche" Aplhabet ersetzt

		}
		return geheimtext;

	}

}
