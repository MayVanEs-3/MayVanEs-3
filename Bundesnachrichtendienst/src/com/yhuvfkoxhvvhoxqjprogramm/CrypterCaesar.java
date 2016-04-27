package com.yhuvfkoxhvvhoxqjprogramm;

public class CrypterCaesar implements Crypter {

	private String klarText = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private String key;
	private int keyInt;
	
	
	public CrypterCaesar(Key myKey) {
		this.key = myKey.getKey();
		this.keyInt = getIndex(key.charAt(0)) + 1;

	}

	private int getIndex(char letter) {
		int index = -1;
		for (int i = 0; i < klarText.length(); i++) {
			if (letter == klarText.charAt(i)) {
				return i;
			}
		}
		return index;
	}

	@Override
	public void reset() {
	}

	
	@Override
	public char verschluesseln(char klartextZeichen) {
		int newIndex = (getIndex(klartextZeichen) + keyInt) % klarText.length();
		System.out.println(newIndex);
		return klarText.charAt(newIndex);
		
	}

	@Override
	public char entschluesseln(char cypherTextZeichen) {
		int tmp = (getIndex(cypherTextZeichen) - keyInt);
		if (tmp < 0) {
			tmp *= -1;
		}
		int newIndex = tmp % klarText.length();
		System.out.println(newIndex);
		return klarText.charAt(newIndex);
	}


	
	
}