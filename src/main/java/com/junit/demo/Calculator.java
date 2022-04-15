package com.junit.demo;

public class Calculator {

	public int calculatesum(int operand1,int operand2) {
		System.out.println("calculate sum method");
		int sum =-1;
		if(operand1>=0 && operand2>=0) {
			sum= operand1+operand2;
		}
		return sum;
	}
	
	public int divide(int operand1,int operand2) {
		int result = operand1/operand2;
		return result;
	}
	
	
	
	
}
