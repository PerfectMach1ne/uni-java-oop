package com.company;

import java.util.ArrayList;

public class Produkt {

    private String nazwa;
    private double cena;
    private int iloscSztuk;
    private String opis;

    public Produkt(String nazwa, double cena, int iloscSztuk, String opis) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.iloscSztuk = iloscSztuk;
        this.opis = opis;
    }

    public double getCena() {
        return cena;
    }

    public int getIloscSztuk() {
        return iloscSztuk;
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getOpis() {
        return opis;
    }
}
