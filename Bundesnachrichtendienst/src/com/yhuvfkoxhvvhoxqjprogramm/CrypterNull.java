package com.yhuvfkoxhvvhoxqjprogramm;

class CrypterNull implements Crypter {
	
	/**
	 * Instanzierung der Null Verschl�sselung
	 */
	CrypterNull() {
		super();
	}

	
	

	@Override
	public void reset() {
		
	}
	/**
	 * Diese Verschl�sselelte Methode, gibt die eingegebene Nachricht
	 * unverschl�sselt wieder zur�ck
	 * 
	 * @param key
	 *            Schl�ssel f�r die Verschl�sselung
	 * @param message
	 *            Nachricht die Verschl�sselt werden soll
	 * @return message <b>Nachricht wird unver�ndert</b> zur�ckgegeben da Null
	 *         eine Verschl�sselung ist
	 */
	@Override
	public char verschluesseln(char klartextZeichen) throws CrypterException {
		return klartextZeichen;
	}
	/**
	 * Diese ist eine Entsch�sselungs Methode, die den eingegebenen
	 * verschl�sselten Nachricht verschl�sselt wieder zur�ck gibt
	 * 
	 * @param key
	 *            Der Schl�ssel f�r die Verschl�sselung (nicht notwendig)
	 * @param cypherText
	 *            Das ist die Verschl�sselte Nachricht die entschl�sselt werden
	 *            soll
	 */
	@Override
	public char entschluesseln(char cypherTextZeichen) throws CrypterException {
		// TODO Auto-generated method stub
		return cypherTextZeichen;
	}

}



