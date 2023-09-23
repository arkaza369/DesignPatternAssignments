package factory.method.pattern.factory;


import factory.method.pattern.IOperation;
import factory.method.pattern.product.Division;


public class DivisionFactory implements ICalculatorFactory {

	@Override
	public IOperation createOperationFactory() {
		return new Division();
	}
	

}