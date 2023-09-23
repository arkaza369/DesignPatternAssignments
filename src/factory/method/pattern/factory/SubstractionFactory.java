package factory.method.pattern.factory;


import factory.method.pattern.IOperation;
import factory.method.pattern.product.Substraction;

public class SubstractionFactory implements ICalculatorFactory {

	@Override
	public IOperation createOperationFactory() {
		return new Substraction();
	}
	

}