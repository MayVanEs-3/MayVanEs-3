package com.yhuvfkoxhvvhoxqjprogramm;

class CrypterSubstitution {
	/*
	 * String x = v.verschluesseln(wort); 
	 * String y = v.entschlüsseln(x);
	 */

	public class Verschluesselung {
		// Attribut für das GeheimAlphabet
		private String geheimAlphabet;

		/**
		 * Erstellt eine Verschluesselung mit dem geheimAlphabet
		 */
		public Verschluesselung(String g) {
			if (g.length() == 26) {
				geheimAlphabet = g; // <- g für geheim
			} else {
				geheimAlphabet = "uflpwdrasjmconqybvtexhzkgi";
			}
		}

		/**
		 * Das Wort wird mit dem geheim Alphabet verschlüsselt
		 * 
		 * @param verschl
		 *            der eingegebene Text
		 * @return zurück zum verschlüsselten Text
		 */
		public String verschluesseln(String verschluesseln) {
			String verschluesselterText = "";
			for (int i = 0; i < verschluesseln.length(); i++) {
				verschluesselterText = verschluesselterText
						+ geheimAlphabet.charAt((int) verschluesseln.charAt(i) - 97);
			}
			return verschluesselterText.toUpperCase(); // <- toUpperCase gibt es in Großbuchstaben aus
		}

		/**
		 * Das verschlüsselte Wort wird wieder entschlüsselt
		 * 
		 * @param entschluesseln
		 *            das zu entschlüsselte Wort
		 * @return zurück zum entschlüsselten Text
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
	 * Das hier ist eine Klasse Verschlüsseln die die monoalphabetische
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
	 *            das übergeben vom Geheimalphabet
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
	 * @return zurück zum verschlüsselten Text
	 */
	public String verschluesseln(String klartext) {
		klartext = klartext.toLowerCase();
		for (char i = 'a'; i < 'z'; i++) {
			klartext = klartext.replace(i, geheim[i]); // ursprüngliche Alphabet durch Geheimalphabet im [i] gespeichert ersetzt
		}
		return klartext;

	}

	/**
	 * Geheimtext in Klartext umwandelt
	 * 
	 * @param eingabe
	 *            des Geheimtext
	 * @return zurück zum Klartext
	 */
	public String entschluesseln(String geheimtext) {
		geheimtext = geheimtext.toUpperCase();
		for (char i = 'a'; i < 'z'; i++) {
			geheimtext = geheimtext.replace(geheim[i], i); // hier wird das Geheimalphabet durch das "ursprüngliche" Aplhabet ersetzt

		}
		return geheimtext;

	}

}
