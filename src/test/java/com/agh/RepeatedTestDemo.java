package com.agh;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.RepeatedTest;
	
class RepeatedTestDemo {
	int i = 0;
	
	@RepeatedTest(15)
	void repeatedTest() {
		System.out.println("--> " + i++);
		assertEquals(3, i);
	}

}
