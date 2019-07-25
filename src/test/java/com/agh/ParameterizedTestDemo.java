package com.agh;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.agh.extensions.LoggingExtension;
import com.agh.service.DemoService;

@Execution(ExecutionMode.CONCURRENT)
@ExtendWith(LoggingExtension.class)
class ParameterizedTestDemo {

	private DemoService demoService = new DemoService();
	
	@ParameterizedTest(name="fibonacci({0}) = {1}")
	@MethodSource("fibonacciParams")
	void factorial(int in, long out) {
		assertEquals(demoService.fibonacci(in), out);
	}
	
	private static Stream<Arguments> fibonacciParams() {
		return Stream.of(
				Arguments.of(0, 0),
				Arguments.of(1, 1),
				Arguments.of(2, 1),
				Arguments.of(40, 102334155),
				Arguments.of(41, 165580141),
				Arguments.of(42, 267914296),
				Arguments.of(43, 433494437)
		);
	}
	
	

}
