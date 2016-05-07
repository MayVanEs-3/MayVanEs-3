package junitTests;

import static org.junit.Assert.*;

import org.junit.Test;

import personenidentity.Member;

public class MemberTest {

	@Test
	public void test() {
		
		Member test1 = new Member("Kogoro", "Ran", 2, 2);
		Member test2 = new Member("Edogawa", "Conan", 2, 2);
		test1.isMembership();
		test2.isMembership();
		test1.equals(test2);
		test1.toString();
		test2.toString();
		test1.checkMemberID(test2);
		test1.isCheckMitgliedsJahre(test2);
		test1.checkNachname(test2);
		test1.checkVorname(test2);
		test1.equals(test2);
		equals(true);
	
		
	}

	
	
	
	
}
