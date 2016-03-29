package com.internationaleaccountmanagement;
import java.text.DecimalFormat;

public class Betrag {
	private long betrag;
	private Waehrung w1;

	Betrag(double y, Waehrung w1) {
		betrag = (long) (y * 100);
		this.w1 = w1;
	}

	Betrag(long x, Waehrung w1) {
		betrag = x;
		this.w1 = w1;
	}

	long getBetrag() {
		return betrag;
	}

	Waehrung getWaehrung() {
		return w1;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (betrag ^ (betrag >>> 32));
		result = prime * result + ((w1 == null) ? 0 : w1.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Betrag other = (Betrag) obj;
		if (betrag != other.betrag)
			return false;
		if (w1 == null) {
			if (other.w1 != null)
				return false;
		} else if (!w1.equals(other.w1))
			return false;
		return true;
	}

	int getVorzeichen(int a) {

		if (a < 0) {
			return -1;

		} else {
			return 1;
		}
	}

	long addition(long a, Waehrung w) {

		if (!this.w1.equals(w)) {
			long t = w.umrechnen(a, w1);
			return getBetrag() + t;
		}
		return getBetrag() + a;
	}

	long subtraktion(long a, Waehrung w) {
		if (!this.w1.equals(w)) {
			long t = w.umrechnen(a, w1);
			return getBetrag() - t;
		}
		return getBetrag() - a;
	}

	long multiplikation(double a) {

		double z = getBetrag();

		return (long) (z * a);
	}

	public long multiplikation(int a) {

		return (getBetrag() * a);
	}

	public long prozent(double psatz) {

		double ergebnis = (getAsDouble() * psatz / 100);
		long neuBetrag = (long) ergebnis;
		return neuBetrag;
	}

	public long promille(double prosatz) {

		double ergebnis = (getAsDouble() * prosatz / 1000);
		long neuBetrag = (long) ergebnis;
		return neuBetrag;
	}

	long getVorkomma() {

		return (long) getAsDouble();
	}

	double getAsDouble() {

		double ergebnis = (double) getBetrag();

		return ergebnis / 100;
	}

	@Override
	public String toString() {
		DecimalFormat p = new DecimalFormat("#0.00");

		return p.format(getAsDouble()) + " " + w1.getKuerzel();
	}

	int getNachkomma() {
		int gN = (int) (getBetrag() - (getVorkomma() * 100));
		return gN;
	}
}