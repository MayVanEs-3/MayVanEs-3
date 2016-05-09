package personenidentity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Iterator;

public class MembershipList extends HashMap implements Map,Iterable{

	public Iterator<Member> Iterator(){
		return values().iterator();
	}

	/**
	 * gibt die Anzahl der Elemente in der Liste aus
	 */
	@Override
	public int size() {
		System.out.println("Die länge beträgt...");
		return values().size();
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
		if (!values().contains((CharSequence) key)) {
			return false;
		} else
			return true;
	}

	/**
	 * gibt true aus wenn key mindestens auf ein value zugreifen kann
	 */
	public boolean containsValue(Member value) {
		if (!values().contains((CharSequence) value)) {
			return false;
		} else
			return true;

	}

	/**
	 * gibt Objekt zurück
	 */
	@Override
	public Object get(Object key) {
		return key;
	}

	/**
	 * befüllt die Liste mit key/value
	 */
	public Object put(Object key, Member value) {
		return put(key, value);
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

	@Override
	public java.util.Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}
