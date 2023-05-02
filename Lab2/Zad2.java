package com.company;

public class Kot {
	private String imie;
	private String kolor;
	private String rasa;
	private double waga;
	private byte wiek;
	
	Kot(String imie, String kolor, String rasa, double waga, byte wiek) {
		this.imie = imie;
		this.kolor = kolor;
		this.rasa = rasa;
		this.waga = waga;
		this.wiek = wiek;
	}
	
	public void OdezwijSie() {
		System.out.println("Miau!");
	}
	
	public void Nakarm() {
		waga += 0.5;
	}
	
	public void StarzejSie() {
		wiek++;
	}
	
	
}
