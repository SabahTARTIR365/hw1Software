package src2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import softwarePkj.myCalc;

class jUnitTestCase {

	@Test
	void test() {
		myCalc test =new myCalc();
		int  result =test.add(3, 3);
		
		assertEquals(6, result);
	}

	@Test
	void test2() {
		myCalc test =new myCalc();
		int  result =test.mul(3, 3);
		
		assertEquals(9, result);
	}
	
}
