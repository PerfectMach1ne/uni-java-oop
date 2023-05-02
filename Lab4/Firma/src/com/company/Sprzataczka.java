package com.company;

import java.util.ArrayList;

public class Sprzataczka implements Pracownik {
    private String imie;
    private String nazwisko;
    private String adres;
    private double wyplata;
    private ArrayList<String> listaOstrzeen;

    public Sprzataczka(String imie, String nazwisko, String adres, double wyplata, ArrayList<String> listaOstrzeen) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.wyplata = wyplata;
        this.listaOstrzeen = listaOstrzeen;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getAdres() {
        return adres;
    }

    public double getWyplata() {
        return wyplata;
    }

    public ArrayList<String> getListaOstrzeen() {
        return listaOstrzeen;
    }

    @Override
    public void przyznajPremie(double kwota) {
        wyplata += kwota;
        System.out.println("Przyznano premie " + kwota + " sprzataczce " + imie + nazwisko);
    }

    @Override
    public double obliczNetto() {
        return (0.97 * wyplata) - 175.0;
    }

    @Override
    public void dodajOstrzezenie(String tresc) {
        listaOstrzeen.add(tresc);
    }

    @Override
    public void przyznajKare(double kwota) {
        wyplata -= kwota;
        System.out.println("Przyznano kare " + kwota + " sprzataczce " + imie + nazwisko);
    }
}
