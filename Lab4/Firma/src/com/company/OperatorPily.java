package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class OperatorPily implements Pracownik, PracownikHali {
    private String imie;
    private String nazwisko;
    private String adres;
    private double wyplata;
    String rodzajMaszyny;
    int numerStanowiska;
    boolean badanieLekarskie;
    private ArrayList<String> listaOstrzeen;

    public OperatorPily(String imie, String nazwisko, String adres, double wyplata, boolean badanieLekarskie,
                        ArrayList<String> listaOstrzeen, String rodzajMaszyny, int numerStanowiska) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.wyplata = wyplata;
        this.badanieLekarskie = badanieLekarskie;
        this.listaOstrzeen = listaOstrzeen;
        this.rodzajMaszyny = rodzajMaszyny;
        this.numerStanowiska = numerStanowiska;
    }

    @Override
    public void przyznajPremie(double kwota) {
        wyplata += kwota;
        System.out.println("Przyznano premie " + kwota + " operatorowi pily " + imie + nazwisko);
    }

    @Override
    public double obliczNetto() {
        return (0.97 * wyplata) - 350.0;
    }

    @Override
    public void dodajOstrzezenie(String tresc) {
        listaOstrzeen.add(tresc);
    }

    @Override
    public void przyznajKare(double kwota) {
        wyplata -= kwota;
        System.out.println("Przyznano kare " + kwota + " operatorowi pily " + imie + nazwisko);
    }

    @Override
    public void nadajStanowisko() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj stanowisko do nadania: ");
        numerStanowiska = sc.nextInt();

        sc.close();
    }

    @Override
    public boolean sprawdzBadaniaLekarskie() {
        return this.badanieLekarskie;
    }

    @Override
    public void sprawdzAkord() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj minuty wykonanej pracy: ");
        int min = sc.nextInt();
        System.out.println("Akord wynosi " + (obliczNetto() / 60 * min) + "PLN");

        sc.close();
    }

    @Override
    public void wyswietlInfo() {
        System.out.println("Pracownik: " + imie + " " + nazwisko);
        System.out.println("Zawod: Operator pily");
        System.out.println("Adres: " + adres);
        System.out.println("Rodzaj maszyny: " + rodzajMaszyny);
        System.out.println("Numer stanowiska: " + numerStanowiska);
        System.out.println("Badania lekarskie: " + (sprawdzBadaniaLekarskie() ? "Tak" : "Nie"));
        System.out.println("Lista ostrzezen: ");
        int i = 1;
        for (String s : listaOstrzeen) {
            System.out.println(i++ + ": " + s);
        }
    }

    public int getNumerStanowiska() {
        return numerStanowiska;
    }
}
