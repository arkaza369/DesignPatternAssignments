package factory.method.pattern.factory;

import factory.method.pattern.IOperation;

public interface ICalculatorFactory {
	public IOperation createOperationFactory();

}
