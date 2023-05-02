package com.company;

import java.util.Scanner;
import java.lang.Math;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Wprowadz bok a trojkata:");
		double a = scan.nextDouble();
		System.out.println("Wprowadz bok b trojkata:");
		double b = scan.nextDouble();
		System.out.println("Wprowadz bok c trojkata:");
		double c = scan.nextDouble();
		
		if (Math.pow(a,2.0) + Math.pow(b,2.0) == Math.pow(c,2.0)) {
			System.out.println("Trojkat jest prostokatny!");
		} else {
			System.out.println("Trojkat nie jest prostokatny!");
		}
		
		scan.close();
	}
}
