package com.internationaleaccountmanagement;

public class Waehrung {

	private String name;
	private String kuerzel;
	private double kurs;

	Waehrung(String name, String kuerzel, double kurs) {
		this.name = name;
		this.kuerzel = kuerzel;
		this.kurs = kurs;

	}

	String getkuerzel() {
		return kuerzel;

	}

	double getkurs() {
		return kurs;

	}

	String getname() {
		return name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kuerzel == null) ? 0 : kuerzel.hashCode());
		long temp;
		temp = Double.doubleToLongBits(kurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return (this.getname() + " " + this.getkurs() + " " + this.getkuerzel());

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Waehrung other = (Waehrung) obj;
		if (kuerzel == null) {
			if (other.kuerzel != null)
				return false;
		} else if (!kuerzel.equals(other.kuerzel))
			return false;
		if (Double.doubleToLongBits(kurs) != Double.doubleToLongBits(other.kurs))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public long umrechenen(long bet, Waehrung w) {
		/**
		 * von einer Währung nach DOLLAR!!!
		 */

		double i = bet * this.kurs;
		i = i / w.getkurs();
		long ergebnis = (long) i;
		return ergebnis;

	}

	public double getbuche() {
		// TODO Auto-generated method stub
		return 0;
	}

}
