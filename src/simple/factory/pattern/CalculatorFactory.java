package simple.factory.pattern;

public class CalculatorFactory {
	public static IOperation getOperation(String type) {
		switch(Operation.valueOf(type)) {
		case ADDITION:
			return new Addition();
		case SUBSTRACTION:
			return new Substraction();
		case MULTIPLICATION:
			return new Multiplication();
		case DIVISION:
			return new Division();
		default:
			return null;
			
		}
	}

}
