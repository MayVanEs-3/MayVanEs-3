package personenidentity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Iterator;

public class MembershipList extends HashMap implements Map {

	private static final long serialVersionUID = 1L;
	Member eins = new Member(0,null, null, 0);
	public int key = eins.getMitgliederID();
	public String value = eins.toString();
	
	private String mitgliederID;
	private String stringListe;

	public Iterator<String> iterator() {
		return new Iterator<String>() {
			private int pos = -1;
			private Member stringListe;

			/**
			 * liefert true solange Iterator nicht Ende der Collection erreich
			 * hat
			 */
			public boolean hasNext() {
				return (this.pos + 1 < this.stringListe.mitgliedsJahre);
			}

			/**
			 * ermittelt nächstes Element
			 */
			public String next() throws NoSuchElementException {

				if (!hasNext()) {
					throw new NoSuchElementException("No more elements");
				}
				return null;
			}

			/**
			 * entfernt aktuelles Element aus Iterator - hier nicht möglich
			 * gemacht
			 */
			public void remove() throws UnsupportedOperationException {
				{
					throw new UnsupportedOperationException("Operation is not supported");
				}
			}
		};
	}

	/**
	 * gibt die Anzahl der Elemente in der Liste aus
	 */
	@Override
	public int size() {
		return 0;
	}

	/**
	 * gibt true zurück wenn key/value nicht vorhanden
	 * 
	 * @return
	 */
	@Override
	public boolean isEmpty() {
		if (size() == 0){
			return true;
		}else{
			return false;
		}
	}

	/**
	 * true wenn Map Zuordnung für den spezifischen Schlüssel enthält
	 */
	@Override
	public boolean containsKey(Object key) {
		if (!stringListe.contains((CharSequence) key)) {
			return false;
		} else
			return true;
	}

	/**
	 * gibt true aus wenn key mindestens auf ein value zugreifen kann
	 */
	public boolean containsValue(Member value) {
		if (!stringListe.contains((CharSequence) value)) {
			return false;
		} else
			return true;

	}

	/**
	 * gibt Objekt zurück
	 */
	@Override
	public Object get(Object key) {
		// TODO Auto-generated method stub
		return key;
	}

	/**
	 * befüllt die Liste mit key/value
	 */
	public Object put(Object key, Member value) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * entfernt Objekt von der Liste
	 */
	@Override
	public Object remove(Object key) {
		{
			throw new UnsupportedOperationException();
		}
	}

	public String toString() {
		return String.format(null, key, value);
	}
}
