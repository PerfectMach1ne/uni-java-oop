package com.company;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner rok = new Scanner(System.in);
		
		System.out.println("Podaj rok: ");
		int x = rok.nextInt();
		
		if(x % 4 == 0) {
			System.out.println("Rok "+x+" jest przestepny.");
		} else {
			System.out.println("Rok "+x+" nie jest przestepny.");
		}
		
	}
}
