package com.company;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Program Średnia");
		System.out.println("Podaj x:");
		int x = scan.nextInt();
		
		int tablica [] = new int[x+1];
		double srednia = 0;
		
		for(int i = 0; i < tablica.length; i++) {
			tablica[i] = i;
			srednia += i;
		}
		
		srednia /= tablica.length;
		
		System.out.println("Średnia arytmetyczna "+tablica.length+" liczb od 0 do "+x+" wynosi "+srednia);
		
		scan.close();
	}
}
