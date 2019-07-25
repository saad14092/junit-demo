package com.agh;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.jupiter.api.DynamicNode;
import org.junit.jupiter.api.TestFactory;
	
class DynamicTestDemo {

	@TestFactory
	Stream<DynamicNode> oddNumbers() {
		return IntStream.iterate(1, n -> n + 2)
						.limit(15)
						.mapToObj(n -> dynamicTest("odd test " + n, () -> assertTrue(n % 2 != 0)));
	}
}
