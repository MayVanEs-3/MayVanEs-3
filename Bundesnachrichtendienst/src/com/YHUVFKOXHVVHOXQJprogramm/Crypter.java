package com.YHUVFKOXHVVHOXQJprogramm;

/**
 * Grundlegendes Interface, um Verschl�sselung durchzuf�hren. Mit Hilfe dieses
 * Interfaces kann man Nachrichten verschl�sseln (�ber die
 * {@link #verschluesseln(char)} Methode) und wieder entschl�sseln (�ber die
 * {@link #entschluesseln(char)} Methode).
 *
 * Der Eingabetext, der Zeichenweise �bergeben wird ({@literal klarTextZeichen}
 * ) darf nur aus den Gro�-Buchstaben A-Z bestehen. Kleinbuchstaben werden in
 * Gro�buchstaben umgewandelt, alle anderen Zeichen f�hren zu einer Ausnahme.
 *
 * Zwischen den beiden Methoden muss bei gleichem Schl�ssel folgendes gelten:
 * {@code zeichen == decrypt(encrypt(zeichen))}.
 *
 */
public interface Crypter {
	/**
	 * Setzt die Verschl�sselung zur�ck. Diese Methode ist bei einigen
	 * Verfahren sinnvoll, bei denen eine Position im Schl�ssel verwaltet wird,
	 * da diese beim Wechsel von Ver- auf Entschl�sselung zur�ckgesetzt werden
	 * muss.
	 */
	public void reset();

	/**
	 * Verschl�sselt das gegebene Zeichen.
	 *
	 * @param klartextZeichen
	 *            Zeichen, das verschl�sselt werden soll.
	 *
	 * @return verschl�sseltes Zeichen.
	 * @throws CrypterException
	 *             Wird geworfen, wenn Probleme mit der Verschl�sselung
	 *             auftreten.
	 */
	public char verschluesseln(char klartextZeichen) throws CrypterException;

	/**
	 * Entschl�sselt das gegebenen Zeichen.
	 *
	 * @param cypherTextZeichen
	 *            Zeichen, das entschl�sselt werden soll.
	 *
	 * @return entschlsseltes Zeichen.
	 * @throws CrypterException
	 *             Wird geworfen, wenn Probleme mit der Verschl�sselung
	 *             auftreten.
	 */
	public char entschluesseln(char cypherTextZeichen) throws CrypterException;
}
