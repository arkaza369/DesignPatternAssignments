package simple.factory.pattern;

public class Substraction implements IOperation {

	@Override
	public int doOperation(int operand1, int operand2) {
		return operand1 - operand2;
	}

}
