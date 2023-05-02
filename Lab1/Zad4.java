package com.company;

public class Main {

	public static void main(String[] args) {
		int dane [] = new int[10];
		
		for(int i = 0; i < dane.length; i++) {
			dane[i] = dane.length - i - 1;
			System.out.println(dane[i]);
		}
	}
}
