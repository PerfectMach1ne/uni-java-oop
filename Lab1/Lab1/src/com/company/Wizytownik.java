package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Wizytownik extends Wizytowka {
	private Scanner sc = new Scanner(System.in);
	private ArrayList <Wizytowka> wizytowki = new ArrayList<>(); 
	
	Wizytownik() {};
	
	public void menu() {
		byte control1;
		do {
			System.out.println("Wybierz opcjê:");
			Line();
			System.out.println("0\tWyjœcie z programu");
			System.out.println("1\tWyœwietl wizytówki");
			System.out.println("2\tDodaj wizytówkê");
			System.out.println("3\tUsuñ wizytówkê");
			
			control1 = sc.nextByte();
			
			switch (control1) {
			case 0:
				System.out.println("Wybrano wyjœcie z programu");
				break;
			case 1:
				wyswietlWizytowki(wizytowki);
				break;
			case 2:
				dodajWizytowke(wizytowki);
				break;
			case 3:
				usunWizytowke(wizytowki);
				break;
			default:
				System.out.println("Nieprawid³owa operacja!");
				break;
			}
		} while (control1 != 0);
		
		sc.close();
	}
	
	private void wyswietlWizytowki(ArrayList <Wizytowka> wiz) {
		for (int i = 0; i < wiz.size(); i++) { 
			Line();
			wiz.get(i).WyswietlImie();
			System.out.print(" ");
			wiz.get(i).WyswietlNazwisko();
			wiz.get(i).WyswietlAdres();
			System.out.printf("Firma ");
			wiz.get(i).WyswietlFirma();
			System.out.printf("Nr wizytowki: ");
			wiz.get(i).WyswietlNumer();
		}
		Line();
	}
	
	private void dodajWizytowke(ArrayList <Wizytowka> wiz) {
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
	}
	
	private void usunWizytowke(ArrayList <Wizytowka> wiz) {
		System.out.println("Któr¹ wizytowkê chcesz usun¹æ? (od " + wizytowki.indexOf(wiz) + " do " + wizytowki.lastIndexOf(wiz) + ")");
		int index = sc.nextInt();
		wizytowki.remove(index);
	}
	
	public void Line() {
		System.out.println("===========================================");
	}
}
