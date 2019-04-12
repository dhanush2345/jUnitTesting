package jUnitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testaddNumbers {

	@Test
	void test() {
		jUnitFunction jUnit = new jUnitFunction();
		int result = jUnit.addNumbers(200, 300);
		assertEquals (501,result);
	}

}
