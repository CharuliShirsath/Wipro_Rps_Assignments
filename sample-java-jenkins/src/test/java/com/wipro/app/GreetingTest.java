package com.wipro.app;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.wipro.model.Greeting;

public class GreetingTest {
	private Greeting greeting=null;
	
	@BeforeEach
	void setup() {
		greeting = new Greeting("Hi");
	}

	@Test
	void test() {
		assertEquals("Hi", greeting.getMessage());
	}

}
