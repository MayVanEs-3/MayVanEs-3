package personenidentity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MembershipList extends HashMap implements Map{	
	
	
	Member eins = new Member(null, null, 0, 0);
	public int key = eins.getMitgliederID();
	public String value = eins.toString();
	// String value = eins.getMitgliedsJahre + eins.getVorname+ eins.getNachname;

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean containsKey(Object key) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean containsValue(Object value) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public Object get(Object key) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Object put(Object key, Object value) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Object remove(Object key) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
	
	
	
	

}