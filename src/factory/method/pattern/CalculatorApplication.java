package factory.method.pattern;

import factory.method.pattern.factory.AdditionFactory;
import factory.method.pattern.factory.ICalculatorFactory;
import factory.method.pattern.factory.SubstractionFactory;
import factory.method.pattern.factory.MultiplicationFactory;

public class CalculatorApplication {

	public static void main(String[] args) {
		// calculating ((9+3)-3)*3)
		ICalculatorFactory additionFactory  = new AdditionFactory();
		IOperation addition = additionFactory.createOperationFactory();
		int additionResult = addition.doOperation(9, 3);
		System.out.println("Result additionResult: " + additionResult);
		
		ICalculatorFactory substractionFactory  = new SubstractionFactory();
		IOperation substraction = substractionFactory.createOperationFactory();
		int substractionResult = substraction.doOperation(additionResult, 3);
		System.out.println("ResultsubstractionResult : " + substractionResult);
		
		ICalculatorFactory multiplicationFactory  = new MultiplicationFactory();
		IOperation multiplication = multiplicationFactory.createOperationFactory();
		int multiplicationResult = multiplication.doOperation(substractionResult, 3);
		System.out.println("Result multiplicationResult: " + multiplicationResult);
		

	}

}
