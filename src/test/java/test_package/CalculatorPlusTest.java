package test_package;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorPlusTest {

	private Calculator calc;
	
	@BeforeEach
	public void before() {
		calc = new CalculatorPlus();
	}
	
	@Test
	public void testAddLessThenFive() {
		int sum = calc.add(3, 2);
		assertEquals(5, sum);
	}
	
	@Test
	public void testAddGreaterThenFive() {
		int sum = calc.add(6, 2);
		assertEquals(7, sum);
	}
	
	@Test
	public void testMultiplyLessThenFive() {
		int sum = calc.multiply(3, 2);
		assertEquals(10, sum);
	}
	
	@Test
	public void testMultiplyGreaterThenFive() {
		int sum = calc.multiply(6, 2);
		assertEquals(12, sum);
	}
}
