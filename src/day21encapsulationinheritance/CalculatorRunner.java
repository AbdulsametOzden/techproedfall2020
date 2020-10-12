package day21encapsulationinheritance;

public class CalculatorRunner {

	public static void main(String[] args) {
		
		SimpleCalculator.add(3, 5, 7);
		
		NormalCalculator.absolute(-12);
		NormalCalculator.sqrRoot(20);
		NormalCalculator.divide(12, 4);
		
		AdvancedCalculator.exponent(2, 3);
		AdvancedCalculator.sqrRoot(-16);
		AdvancedCalculator.subtract(2, 1.2);
		AdvancedCalculator.absolute(-21);

	}

}
