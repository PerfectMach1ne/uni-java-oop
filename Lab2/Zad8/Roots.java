package com.company;

import java.util.Scanner;
import java.lang.Math;

public class Roots {
	Scanner sc = new Scanner(System.in);
	
	private double a;
	private double b;
	private double c;
	private double delta;
	private boolean isNotQuadratic;
	private double x1;
	private double x2;
	Roots() { }
	
	public void czytajDane() {
		System.out.println("Podaj a:");
		a = sc.nextDouble();
		if (a < 0.0) {
			isNotQuadratic = false;
			System.out.println("Podaj b:");
			b = sc.nextDouble();
			System.out.println("Podaj c:");
			c = sc.nextDouble();
		} else if (a == 0.0) {
			isNotQuadratic = true;
			System.out.println("Podaj b:");
			b = sc.nextDouble();
			System.out.println("Podaj c:");
			c = sc.nextDouble();
		} else {
			isNotQuadratic = false;
			System.out.println("Podaj b:");
			b = sc.nextDouble();
			System.out.println("Podaj c:");
			c = sc.nextDouble();
		}
		
	}
	
	public void przetworzDane() {
		delta = Math.pow(b, 2.0) - 4 * a * c;
		
		switch ((int)Math.signum(delta)) {
		case -1:
			wyswietlWynik();
			break;
		case 0:
			x1 = -b / (2 * a);
			wyswietlWynik();
			break;
		case 1: 
			x1 = (-b - Math.sqrt(delta)) / (2 * a);
			x2 = (-b + Math.sqrt(delta)) / (2 * a);
			wyswietlWynik();
			break;
		default:
			System.out.println("Wyst¹pi³ nieoczekiwany b³¹d.");
		}
	}
	
	public void wyswietlWynik() {
		if (isNotQuadratic == true) {
			System.out.printf("Równanie %.2fx^2 + %.2fx + %.2f = 0 nie jest równaniem kwadratowym.\n", a, b, c);
		} else if ((int)Math.signum(delta) == -1) {
			System.out.printf("Równanie %.2fx^2 + %.2fx + %.2f = 0 nie ma pierwiastków.\n", a, b, c);
		} else if ((int)Math.signum(delta) == 0) {
			System.out.printf("Równanie %.2fx^2 + %.2fx + %.2f = 0 ma 1 pierwiastek:\n", a, b, c);
			System.out.printf("x = %.2f\n", x1);
		} else {
			System.out.printf("Równanie %.2fx^2 + %.2fx + %.2f = 0 ma 2 pierwiastki:\n", a, b, c);
			System.out.printf("x1 = %.2f\n", x1);
			System.out.printf("x2 = %.2f\n", x2);
		}
	}
}
