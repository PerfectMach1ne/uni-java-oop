package com.company;

import java.util.Scanner;

public class Kalkulator {
	private double a;
	private double b;
	Scanner sc = new Scanner(System.in);
	
	Kalkulator(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public boolean Operation() {
		boolean exitBool = true;
		
		char control = sc.next().charAt(0);
		switch (control) {
		case '0':
			System.out.println("Wybrano wyjœcie z programu");
			exitBool = false;
			break;
		case '+':
			System.out.println(Addition(this.a, this.b));
			break;
		case '-':
			System.out.println(Subtraction(this.a, this.b));
			break;
		case '*':
			System.out.println(Multiplication(this.a, this.b));
			break;
		case '/':
			System.out.println(Division(this.a, this.b));
			break;
		case '%':
			System.out.println(Modulo(this.a, this.b));
			break;
		default:
			System.out.println("Nieprawid³owa operacja!");
			break;
		}
		return exitBool;
	}
	
	private double Addition(double a, double b) {
		return a + b;
	}
	
	private double Subtraction(double a, double b) {
		return a - b;
	}
	
	private double Multiplication(double a, double b) {
		return a * b;
	}
	
	private double Division(double a, double b) {
		return a / b;
	}
	
	private double Modulo(double a, double b) {
		return a % b;
	}
}
