package com.yhuvfkoxhvvhoxqjprogramm;


class Key {
	private String myKey;
	
	public Key(String stringkey){
		this.myKey = stringkey; 
	}
	public String getKey(){
		return myKey;
	}
	
	/**
	 * Überprüft ob die Schlüssel die gleiche länge wie die von der Nachricht
	 * hat. Wenn dies nicht gleich lang ist, wird der Schlüssel so lange
	 * wiederholt, bis es die länge der Nachricht hat
	 * 
	 * @param keyArray
	 *            Schlüssel die überprüft und evtl. angepasst werden soll
	 * @param messageArray
	 *            Nachricht die nur als Referenz für die längen Anpassung dient
	 * @return gibt Schlüssel falls notwendig in angepasste Form zurück,
	 *         ansonsten wird der Orginale Schlüssel zurück gegeben
	 */
	
	// der key wird der nachrichten länge angepasst 
	// bsp. esma key= AB = ABABA 
	static String checkKeyLength(String key, String message) {
		String anpassen = "";
		if (key.length() < message.length()) {

			int wasFehlt = message.length() - key.length() + 1;

			anpassen = new String(key);

			for (int i = 0; i < wasFehlt; i++) {
				if (i == key.length()) {
					i = 0;
					wasFehlt -= key.length();
				}
				anpassen += key.charAt(i);
			}
		} else {
			return new String(key);
		}
		return new String(anpassen);
	}


}

