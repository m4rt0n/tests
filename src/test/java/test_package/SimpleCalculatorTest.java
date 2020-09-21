package test_package;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SimpleCalculatorTest {

	private Calculator calc;
	
	@BeforeEach
	public void before() {
		calc = new SimpleCalculator();
	}
	
	@Test
	public void testAdd() {
		int sum = calc.add(3, 2);
		assertEquals(5, sum);
	}
	
	@Test
	public void testMultiply() {
		int mult = calc.multiply(2, 3);
		assertEquals(6, mult);
	}
}
