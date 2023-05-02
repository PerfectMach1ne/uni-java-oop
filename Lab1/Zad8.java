package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random generator = new Random();
		Scanner scan = new Scanner(System.in);
		
		int tablica [] = new int[100];
		
		for(int i = 0; i < tablica.length; i++) {
			tablica[i] = generator.nextInt(20)+1;
		}
		
		System.out.println("Podaj liczbe:");
		int x = scan.nextInt();
		int ileRazy = 0;
		
		for(int i = 0; i < tablica.length; i++) {
			if(tablica[i] == x) {
				System.out.println("Znaleziono "+x+" w "+i+"-tym elemencie tablicy");
				ileRazy++;
			}
		}
		
		System.out.println("Liczba "+x+" wystapila "+ileRazy+" razy w tablicy.");
				
		scan.close();
	}
}
