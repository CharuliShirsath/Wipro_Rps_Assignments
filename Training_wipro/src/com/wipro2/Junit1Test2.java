package com.wipro2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Junit1Test2 {

	@Test
	void testAdd() {
		Junit1 s=new Junit1();
		// expected  ,actual
		assertEquals(9,s.add(4, 5));
		assertNotNull(s.add(42, 15));
		//fail("Not yet implemented");
	}
	

	@Test
	
		void testProd() {
			Junit1 s=new Junit1();
			assertEquals(10,s.prod(2,5));
			//fail("Not yet implemented");
	}
}
//	@Test
//	void testDiv() {
//		fail("Not yet implemented");
//	}


