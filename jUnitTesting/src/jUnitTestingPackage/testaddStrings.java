package jUnitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testaddStrings {

	@Test
    void test() {
		jUnitFunction jUnit = new jUnitFunction();
		String result = jUnit.addStrings("asd","fgh");
		
		assertEquals("asdfgh",result);
	}

}
