package com.internationaleaccountmanagement;

public class Waehrung {
		/**
		 * Deklaration der einzelnen Werte
		 */
	private String Name;
	private String Kuerzel;
	private double Kurs;

	Waehrung(String name, String kuerzel, double kurs) {
		/**
		 * this. zeigt auf Klassenvariable und wird zur lokalen Variable zugeordnet
		 */
		this.Name = name;
		this.Kuerzel = kuerzel;
		this.Kurs = kurs;

	}
		
	String getKuerzel() {
		/**
		 * Gibt Kürzel aus
		 */
		return Kuerzel;

	}

	double getKurs() {
		/**
		 * Gibt Kurs aus
		 */
		return Kurs;

	}

	String getName() {
		/**
		 * Gibt Name aus
		 */
		return Name;
	}

	@Override
	public int hashCode() {
		/**
		 * Liefert Wert als int- Wert zur Identifikation des Objektes
		 */
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Kuerzel == null) ? 0 : Kuerzel.hashCode());
		long temp;
		temp = Double.doubleToLongBits(Kurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		return result;
	}

	@Override
	public String toString() {
		/**
		 * Gibt den Wert als String codiert zurück
		 */
		return (this.getName() + " " + this.getKuerzel() + " 1$ = " + this.getKurs()) + " " + this.getKuerzel();

	}

	@Override
	public boolean equals(Object obj) {
		/**
		 * Vergleichen zweier Objekte
		 */
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Waehrung other = (Waehrung) obj;
		if (Kuerzel == null) {
			if (other.Kuerzel != null)
				return false;
		} else if (!Kuerzel.equals(other.Kuerzel))
			return false;
		if (Double.doubleToLongBits(Kurs) != Double.doubleToLongBits(other.Kurs))
			return false;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		return true;
	}

	public long umrechnen(long bet, Waehrung w) {
		/**
		 * Von einer Währung in Dollar umrechnen und vom Dollar zur Zielwährung
		 */

		double i = bet * this.Kurs;
		i = i / w.getKurs();
		long ergebnis = (long) i;
		return ergebnis;

	}
}