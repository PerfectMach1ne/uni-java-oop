package com.company;

import java.util.Scanner;
import java.lang.Math;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Program Seria Liczba");
		System.out.println("Podaj zakres od x do y.");
		System.out.println("Podaj x:");
		int x = scan.nextInt();
		System.out.println("Podaj y:");
		int y = scan.nextInt();
		
		int size = Math.abs(y-x);
		int tablica [] = new int[size];
		
		for(int i = x; x <= y; x++) {
			tablica[i] = x;
			System.out.println(tablica[i]);
		}
		
		scan.close();
	}
}
