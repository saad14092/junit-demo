package com.agh;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.JRE;

import com.agh.annotations.UnitTest;

@DisplayName("JUnit Jupiter Demo")
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class JupiterDemo {

	@UnitTest
	void add_two_numbers() {
		assertEquals(2, 1 + 1, () -> "1 + 1 equals 2");
	}
	
	@Test
	void should_throw_exception_on_cast() {
		var nfe = assertThrows(NumberFormatException.class, () -> Integer.valueOf("NaN"));
		assertEquals("For input string: \"NaN\"", nfe.getMessage());
	}
	
	
	@UnitTest
	@DisabledOnJre(JRE.JAVA_11)
	void runs_if_not_jdk_11() {
		System.out.println("I'm running");
	}
}
