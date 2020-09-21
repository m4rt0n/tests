package test_package;

public class CalculatorPlus implements Calculator{

	@Override
	public int add(int a, int b) {
		if(a>5) {
			return 5+b;
		}
		
		return a+b;
	}
	
	@Override
	public int multiply(int a, int b) {
		if(a < 5) {
			return 5*b;
		}
		return a*b;
	}
}
