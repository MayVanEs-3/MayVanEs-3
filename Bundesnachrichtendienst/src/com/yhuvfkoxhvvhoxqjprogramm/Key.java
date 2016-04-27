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
	 * �berpr�ft ob die Schl�ssel die gleiche l�nge wie die von der Nachricht
	 * hat. Wenn dies nicht gleich lang ist, wird der Schl�ssel so lange
	 * wiederholt, bis es die l�nge der Nachricht hat
	 * 
	 * @param keyArray
	 *            Schl�ssel die �berpr�ft und evtl. angepasst werden soll
	 * @param messageArray
	 *            Nachricht die nur als Referenz f�r die l�ngen Anpassung dient
	 * @return gibt Schl�ssel falls notwendig in angepasste Form zur�ck,
	 *         ansonsten wird der Orginale Schl�ssel zur�ck gegeben
	 */
	
	// der key wird der nachrichten l�nge angepasst 
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

