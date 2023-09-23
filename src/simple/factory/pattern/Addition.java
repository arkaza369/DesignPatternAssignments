package simple.factory.pattern;

public class Addition implements IOperation {

	@Override
	public int doOperation(int operand1, int operand2) {
		
		return operand1 + operand2;
	}

}
