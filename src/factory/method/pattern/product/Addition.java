package factory.method.pattern.product;

import factory.method.pattern.IOperation;

public class Addition implements IOperation {

	@Override
	public int doOperation(int operand1, int operand2) {
		
		return operand1 + operand2;
	}

}
