package com.yhuvfkoxhvvhoxqjprogramm;

class CrypterNull implements Crypter {
	
	/**
	 * Instanzierung der Null Verschlüsselung
	 */
	CrypterNull() {
		super();
	}

	
	

	@Override
	public void reset() {
		
	}
	/**
	 * Diese Verschlüsselelte Methode, gibt die eingegebene Nachricht
	 * unverschlüsselt wieder zurück
	 * 
	 * @param key
	 *            Schlüssel für die Verschlüsselung
	 * @param message
	 *            Nachricht die Verschlüsselt werden soll
	 * @return message <b>Nachricht wird unverändert</b> zurückgegeben da Null
	 *         eine Verschlüsselung ist
	 */
	@Override
	public char verschluesseln(char klartextZeichen) throws CrypterException {
		return klartextZeichen;
	}
	/**
	 * Diese ist eine Entschüsselungs Methode, die den eingegebenen
	 * verschlüsselten Nachricht verschlüsselt wieder zurück gibt
	 * 
	 * @param key
	 *            Der Schlüssel für die Verschlüsselung (nicht notwendig)
	 * @param cypherText
	 *            Das ist die Verschlüsselte Nachricht die entschlüsselt werden
	 *            soll
	 */
	@Override
	public char entschluesseln(char cypherTextZeichen) throws CrypterException {
		// TODO Auto-generated method stub
		return cypherTextZeichen;
	}

}



