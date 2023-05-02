package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Program \"Etui na wizytówki\"");
		byte control1;
		
		ArrayList <Wizytowka> wizytowki = new ArrayList<>();
		
		wizytowki.add(new Wizytowka("Jan","Kowalski","Facebook",34367,"ul. Ulicowa 1/22"));
		wizytowki.add(new Wizytowka("Janusz","Kowal","Google",73267,"Aleje Raclawickie 6/78"));
		wizytowki.add(new Wizytowka("Jon","Kawalski","Biedronka",12389,"ul. Dluga 9/98"));
		
		do {
			System.out.println("Wybierz opcjê:");
			Line();
			System.out.println("0\tWyjœciez programu");
			System.out.println("1\tWyœwietl wizytówki");
			System.out.println("2\tDodaj wizytówkê");
			control1 = sc.nextByte();
			switch (control1) {
			case 0:
				System.out.println("Wybrano wyjœcie z programu");
				break;
			case 1:
				for (int i = 0; i < wizytowki.size(); i++) { 
					Line();
					wizytowki.get(i).WyswietlImie();
					System.out.print(" ");
					wizytowki.get(i).WyswietlNazwisko();
					wizytowki.get(i).WyswietlAdres();
					System.out.printf("Firma ");
					wizytowki.get(i).WyswietlFirma();
					System.out.printf("Nr wizytowki: ");
					wizytowki.get(i).WyswietlAdres();
				}
				Line();
				break;
			case 2:
				System.out.println("Podaj imiê: ");
				String tempImie = sc.next();
				System.out.println("Podaj nazwisko: ");
				String tempNazwisko = sc.next();
				sc.nextLine();
				System.out.println("Podaj firmê:");
				String tempFirma = sc.nextLine();
				System.out.println("Podaj numer wizytówki: ");
				int tempNumer = sc.nextInt();
				sc.nextLine();
				System.out.println("Podaj adres: ");
				String tempAdres = sc.nextLine();
				
				wizytowki.add(new Wizytowka(tempImie, tempNazwisko, tempFirma, tempNumer, tempAdres));
				break;
			default:
				System.out.println("Nieprawid³owa operacja!");
				break;
			}
		} while (control1 != 0);
		
		sc.close();
	}
	
	public static void Line() {
		System.out.println("===========================================");
	}
}
