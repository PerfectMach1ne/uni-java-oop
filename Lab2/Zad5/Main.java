package com.company;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Program \"Kalkulator\"");
		
		System.out.println("Podaj liczbê a: ");
		double a = sc.nextDouble();
		System.out.println("Podaj liczbê b: ");
		double b = sc.nextDouble();
		
		Kalkulator k = new Kalkulator(a, b);
		
		do {
			System.out.println("Wybierz opcjê:");
			Line();
			System.out.println("0\tWyjœciez programu");
			System.out.println("+\tDodawanie");
			System.out.println("-\tOdejmowanie");
			System.out.println("*\tMno¿enie");
			System.out.println("/\tDzielenie");
			System.out.println("%\tModulo");
			
		} while (k.Operation());
		
		sc.close();
	}
	
	public static void Line() {
		System.out.println("===========================================");
	}
}
