package com.company;

public class Wizytowka {
	String imie;
	String nazwisko;
	String firma;
	int numer;
	String adres;
	
	Wizytowka() {}
	
	Wizytowka(String imie, String nazwisko, String firma, int numer, String adres) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.firma = firma;
		this.numer = numer;
		this.adres = adres;
	}
	
	public void WyswietlImie() {
		System.out.print(imie);
	}
	
	public void WyswietlNazwisko() {
		System.out.println(nazwisko);
	}
	
	public void WyswietlAdres() {
		System.out.println(adres);
	}
	
	public void WyswietlFirma() {
		System.out.println(firma);
	}
	
	public void WyswietlNumer() {
		System.out.println(numer);
	}
	
}
