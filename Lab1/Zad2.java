package com.company;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Kalkulator");
		System.out.println("Podaj pierwsza liczbe x:");
		double x = read.nextDouble();
		
		System.out.println("Wybierz operacje:");
		System.out.println("+ : Dodawanie");
		System.out.println("- : Odejmowanie");
		System.out.println("* : Mnozenie");
		System.out.println("/ : Dzielenie");
		char operacja = read.next().charAt(0);
		
		System.out.println("Podaj druga liczbe x:");
		double y = read.nextDouble();
		
		
		switch(operacja) {
		case '+':
			System.out.println(x+" + "+y+" = "+(x+y));
			break;
		case '-':
			System.out.println(x+" - "+y+" = "+(x-y));
			break;
		case '*':
			System.out.println(x+" * "+y+" = "+(x*y));
			break;
		case '/':
			if (y == 0) {
				System.out.println("Nie mozna dzielic przez 0!");
				break;
			}
			System.out.println(x+" / "+y+" = "+(x/y));
			break;
		default:
			System.out.println("Wybrano nieprawidlowa operacje!");
		}
		
	}
}
