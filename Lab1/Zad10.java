package com.company;


public class Main {

	public static void main(String[] args) {
		
		int suma = 0;
		int i = 0;
			
		do {
			if((i + 1) % 2 == 0) {
				suma += i + 1;
			}
			i++;
		} while (i < 100);
		
		System.out.println("Suma liczb parzystych od 1 do 100: "+suma);
	}
}
