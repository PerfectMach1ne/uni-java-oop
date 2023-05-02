package com.company;

import java.util.ArrayList;

public class KierownikMarketingu extends Kierownictwo {
    Boolean Samochod;
    String numerRejestracyjny;
    String numerSluzbowy;
    ArrayList<Klient> listaKlientow = new ArrayList<Klient>(); // add this class

    public KierownikMarketingu(Boolean samochod, String numerRejestracyjny, String numerSluzbowy, ArrayList<Klient> listaKlientow) {
        Samochod = samochod;
        this.numerRejestracyjny = numerRejestracyjny;
        this.numerSluzbowy = numerSluzbowy;
        this.listaKlientow = listaKlientow;
    }

    void nadajAuto(String numerRejestracyjny) {

    }

    void wyswietlInformacje() {

    }

    void dodajKlienta() {

    }

    void usunKlienta() {

    }

    void liczPremie(int iloscKlientow) {

    }

    @Override
    void ustalWyplate() {

    }

    @Override
    void wyswietlInfo() {

    }

    @Override
    void liczPremie() {

    }
}
