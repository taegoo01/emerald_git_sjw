package com.javalec.ex;

public class MyCalculator {

	public Calculator calculator;
	private int firstNum;
	private int SecondNum;
	
	public MyCalculator(){
		
	}
	
	public void add(){
		calculator.addition(firstNum,SecondNum);
	}

	public Calculator getCalculator() {
		return calculator;
	}

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	public int getFirstNum() {
		return firstNum;
	}

	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}

	public int getSecondNum() {
		return SecondNum;
	}

	public void setSecondNum(int secondNum) {
		SecondNum = secondNum;
	}



	
	
}
