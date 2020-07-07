package com.roytuts.java.code.quality.sonarqube;

public class CalculatorApp {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();

		System.out.println("Calculator App");
		System.out.println("------------------------------");
		System.out.println("Addition: " + calculator.add(5, 4));
		System.out.println("Subtraction: " + calculator.subtract(5, 4));
		System.out.println("Multiplication: " + calculator.multiply(5, 4));
		System.out.println("Division: " + calculator.divide(5, 4));
	}

}
