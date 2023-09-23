package simple.factory.pattern;

public class CalculatorApplication {

	public static void main(String[] args) {
		// calculating ((9+3)-3)*3)
		System.out.println("Hello Calculator!!");
		IOperation addition = CalculatorFactory.getOperation("ADDITION");
		int additionResult = addition.doOperation(9, 3);
		System.out.println("Result additionResult: " + additionResult);
		
		IOperation substraction = CalculatorFactory.getOperation("SUBSTRACTION");
		int substractionResult = substraction.doOperation(additionResult, 3);
		System.out.println("ResultsubstractionResult : " + substractionResult);
		
		IOperation multiplication = CalculatorFactory.getOperation("MULTIPLICATION");
		int multiplicationResult = multiplication.doOperation(substractionResult, 3);
		System.out.println("Result multiplicationResult: " + multiplicationResult);
		
		//we can do operation in one go
		
		int result = CalculatorFactory.getOperation("MULTIPLICATION")
				.doOperation(CalculatorFactory.getOperation("SUBSTRACTION")
				.doOperation(CalculatorFactory.getOperation("ADDITION")
				.doOperation(9, 3),3),3);
		System.out.println("Result : " + result);

	}

}
