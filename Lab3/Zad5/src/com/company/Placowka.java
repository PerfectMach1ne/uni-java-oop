package com.company;

import java.util.ArrayList;

public class Placowka {
    ArrayList<Listy> listyArrayList = new ArrayList<Listy>();
    ArrayList<Paczki> paczkiArrayList = new ArrayList<Paczki>();

    public void dodajList(Listy l) {
        listyArrayList.add(l);
    }

    public void dodajPaczke(Paczki p) {
        paczkiArrayList.add(p);
    }

    public void usunList(short id) {
        listyArrayList.remove(id);
    }

    public void usunPaczke(short id) {
        paczkiArrayList.remove(id);
    }

    public void wyswietlList(Listy l) {
        System.out.println("Identyfikator listu: " + l.getListID());
        System.out.println("Nazwisko odbiorcy: " + l.getNazwiskoOdbiorca());
        System.out.println("Nazwisko nadawcy: " + l.getNazwiskoNadawca());
        System.out.println("Adres odbiorcy: " + l.getAdresOdbiorca());
        System.out.println("Adres nadawcy: " + l.getAdresNadawca());
        System.out.println("Kod pocztowy odbiorcy: " + l.getKodOdbiorca());
        System.out.println("Kod pocztowy nadawcy: " + l.getKodNadawca());
        if (l.isPolecona() == true) {
            System.out.println("List polecony");
        } else if (l.isPriorytetowa() == true) {
            System.out.println("List priorytetowy");
        }
    }

    public void wyswietlPaczke(Paczki p) {
        System.out.println("Identyfikator listu: " + p.getPaczkaID());
        System.out.println("Nazwisko odbiorcy: " + p.getNazwiskoOdbiorca());
        System.out.println("Nazwisko nadawcy: " + p.getNazwiskoNadawca());
        System.out.println("Adres odbiorcy: " + p.getAdresOdbiorca());
        System.out.println("Adres nadawcy: " + p.getAdresNadawca());
        System.out.println("Kod pocztowy odbiorcy: " + p.getKodOdbiorca());
        System.out.println("Kod pocztowy nadawcy: " + p.getKodNadawca());
        if (p.isPolecona() == true) {
            System.out.println("Paczka polecona");
        } else if (p.isPriorytetowa() == true) {
            System.out.println("Paczka priorytetowa");
        }
        System.out.println("Waga paczki: " + p.getWaga());
        System.out.println("Wysokosc paczki: " + p.getWysokosc());
        System.out.println("Szerokosc paczki: " + p.getSzerokosc());
        System.out.println("Glebokosc paczki: " + p.getGlebokosc());
        System.out.println("Waga gabarytowa: " + p.getGabaryt());
    }
}
