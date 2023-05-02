package com.company;

import java.util.Scanner;

public class Prostokat {
	Scanner sc = new Scanner(System.in);
	
	private double a;
	private double b;
	private double pole;
	
	Prostokat() { }
	
	public void czytajDane() {
		System.out.println("Podaj a:");
		a = sc.nextDouble();
		System.out.println("Podaj b:");
		b = sc.nextDouble();
	}
	
	public double przetworzDane() {
		pole = a * b;
		return pole;
	}
	
	public void wyswietlWynik() {
		System.out.printf("a wynosi %.2f\n", a);
		System.out.printf("b wynosi %.2f\n", b);
		System.out.println("Pole prostok¹ta o bokach a i b wynosi: " + przetworzDane());
	}
}
