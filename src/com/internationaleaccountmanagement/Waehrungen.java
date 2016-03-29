package com.internationaleaccountmanagement;

public class Waehrungen {
	
	/**
	 * Objekte von Waehrung mit Wechselkursen und Kürzel durch getter ausgeben
	 */

		
	static final Waehrung getDollar() {
		return new Waehrung("Dollar", "$", 1.0000);
	}

	static final Waehrung getEuro() {
		return new Waehrung("Euro", "€", 1.2690);
	}

	static final Waehrung getYen() {
		return new Waehrung("Yen", "Y", 0.0091);
	}

	static final Waehrung getRubel() {
		return new Waehrung("Rubel", "RUB", 0.0255);
	}

	static final Waehrung getSchweizerFranken() {
		return new Waehrung("Schweizer Franken", "CHF", 1.0509);
	}

}