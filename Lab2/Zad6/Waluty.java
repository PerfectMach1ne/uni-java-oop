package com.company;

import java.util.Scanner;

public class Waluty {
	Scanner sc = new Scanner(System.in);
	private double wartosc;
	
	Waluty(double wartosc) {
		this.wartosc = wartosc;
	}
	
	public boolean Przelicz(byte controlB) {
		boolean exitBool = true;
		
		char controlA = sc.next().charAt(0);
		switch (controlA) {
		case '0':
			System.out.println("Wybrano wyjœcie z programu");
			exitBool = false;
			break;
		case '1':
			if (controlB == 0) System.out.println(PLNtoEUR(wartosc));
			if (controlB == 1) System.out.println(EURtoPLN(wartosc));
			if (controlB == 2) System.out.println(USDtoEUR(wartosc));
			break;
		case '2':
			if (controlB == 0) System.out.println(PLNtoUSD(wartosc));
			if (controlB == 1) System.out.println(EURtoUSD(wartosc));
			if (controlB == 2) System.out.println(USDtoPLN(wartosc));
			break;
		default:
			System.out.println("Nieprawid³owa operacja!");
			break;
		}
		return exitBool;
	}
	
	private double PLNtoEUR (double x) {
		return 0.21 * x;
	}
	
	private double PLNtoUSD (double x) {
		return 0.25 * x;
	}
	
	private double EURtoPLN (double x) {
		return 4.67 * x;
	}
	
	private double EURtoUSD (double x) {
		return 1.18 * x;
	}
	
	private double USDtoPLN (double x) {
		return 3.96 * x;
	}
	
	private double USDtoEUR (double x) {
		return 0.85 * x;
	}
	
}
