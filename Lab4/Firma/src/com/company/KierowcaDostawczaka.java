package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class KierowcaDostawczaka implements Pracownik, Kierowca {
    private String imie;
    private String nazwisko;
    private String adres;
    private double wyplata;
    String rodzajMaszyny;
    int numerStanowiska;
    boolean badanieTechniczne;
    private ArrayList<String> listaOstrzeen;
    private String pojazd;
    private int numerPojazdu;

    public KierowcaDostawczaka(String imie, String nazwisko, String adres, double wyplata, boolean badanieTechniczne,
                               ArrayList<String> listaOstrzeen, String rodzajMaszyny, int numerStanowiska) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.wyplata = wyplata;
        this.badanieTechniczne = badanieTechniczne;
        this.listaOstrzeen = listaOstrzeen;
        this.rodzajMaszyny = rodzajMaszyny;
        this.numerStanowiska = numerStanowiska;
    }

    @Override
    public void nadajPojazd(String nazwa, int numer) {
        pojazd = nazwa;
        numerPojazdu = numer;
        System.out.println("Nadano pracownikowi pojazd " + pojazd + " o numerze " + numerPojazdu);
    }

    @Override
    public boolean sprawdzBadanieTechniczne() {
        return this.badanieTechniczne;
    }

    @Override
    public void wyswietlInformacje() {
        System.out.println("Pracownik: " + imie + " " + nazwisko);
        System.out.println("Zawod: Kierowca dostawczaka");
        System.out.println("Adres: " + adres);
        System.out.println("Rodzaj maszyny: " + rodzajMaszyny);
        System.out.println("Numer stanowiska: " + numerStanowiska);
        System.out.println("Nazwa pojazdu: " + pojazd);
        System.out.println("Numer pojazdu: " + numerPojazdu);
        System.out.println("Badania lekarskie: " + (sprawdzBadanieTechniczne() ? "Tak" : "Nie"));
        System.out.println("Lista ostrzezen: ");
        int i = 1;
        for (String s : listaOstrzeen) {
            System.out.println(i++ + ": " + s);
        }
    }

    @Override
    public void przyznajPremie(double kwota) {
        wyplata += kwota;
        System.out.println("Przyznano premie " + kwota + " kierowcy dostawczaka " + imie + nazwisko);
    }

    @Override
    public double obliczNetto() {
        return (0.97 * wyplata) - 250.0;
    }

    @Override
    public void dodajOstrzezenie(String tresc) {
        listaOstrzeen.add(tresc);
    }

    @Override
    public void przyznajKare(double kwota) {
        wyplata -= kwota;
        System.out.println("Przyznano kare " + kwota + " kierowcy dostawczaka " + imie + nazwisko);
    }
}
