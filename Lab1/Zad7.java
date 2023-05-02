package com.company;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Program Minmax");
		System.out.println("Podaj ilosc elementow w tablicy:");
		int x = scan.nextInt();
		
		int tablica [] = new int[x];
		
		for(int i = 0; i < tablica.length; i++) {
			tablica[i] = i + 1;
			System.out.println(tablica[i]);
		}
		
		System.out.println("Najmniejsza wartosc w tablicy: "+tablica[0]);
		System.out.println("Najwieksza wartosc w tablicy: "+tablica[x - 1]);
		
		if ((tablica.length) % 2 == 0) {
			System.out.println("Pierwsza srodkowa wartosc w tablicy: "+tablica[tablica.length / 2 - 1]);
			System.out.println("Druga srodkowa wartosc w tablicy: "+tablica[tablica.length / 2]);
		} else {
			System.out.println("Srodkowa wartosc w tablicy: "+tablica[tablica.length / 2]);
		}
				
		scan.close();
	}
}
