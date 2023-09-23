package factory.method.pattern.factory;


import factory.method.pattern.IOperation;
import factory.method.pattern.product.Multiplication;


public class MultiplicationFactory implements ICalculatorFactory {

	@Override
	public IOperation createOperationFactory() {
		return new Multiplication();
	}
	

}