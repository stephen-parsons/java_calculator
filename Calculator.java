import java.util.ArrayList;

public class Calculator {
	private int operandOne;
	private int operandTwo;
	private String operation;
	private ArrayList<Integer> results = new ArrayList<Integer>();
	public Calculator() {
	}
	public void setOperandOne(int one) {
		this.operandOne = one;
	}
	public void setOperandTwo(int two) {
		this.operandTwo = two;
	}
	public void setOperation(String op) {
		this.operation = op;
	}
	public int getOperandOne() {
		return this.operandOne;
	}
	public int getOperandTwo() {
		return this.operandTwo;
	}
	public String getOperation() {
		return this.operation;
	}
	public void performOperation() {
		int result = 0;
		if (this.getOperation() == "+") { 
			result = getOperandOne() + getOperandTwo();
			results.add(result);
			}
		else { 
			result = getOperandOne() - getOperandTwo();
			results.add(result);
			}	
		System.out.printf("The result is: %d\n", result);	
	}
	public ArrayList getResults() {
		return this.results;
	}
	public static void main(String[] args) {
		Calculator one = new Calculator();
		one.setOperation("+");
		one.setOperandOne(100);
		one.setOperandTwo(50);
		one.performOperation();
		System.out.println(one.getResults());
		one.setOperation("-");
		one.performOperation();
		System.out.println(one.getResults());
	}
}