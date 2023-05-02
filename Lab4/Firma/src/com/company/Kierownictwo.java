package com.company;

public abstract class Kierownictwo {
    String imie;
    String nazwisko;
    String adres;
    double wyplata;

    abstract void ustalWyplate();

    abstract void wyswietlInfo();

    abstract void liczPremie();
}
