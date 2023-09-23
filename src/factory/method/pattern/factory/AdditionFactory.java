package factory.method.pattern.factory;

import factory.method.pattern.IOperation;
import factory.method.pattern.product.Addition;

public class AdditionFactory implements ICalculatorFactory {

	@Override
	public IOperation createOperationFactory() {
		return new Addition();
	}
	

}
