package com.company;

public class Kon {

    //Atrybuty
    String imie;
    String kolor;
    double waga;
    int wiek;

    //Konstruktor
    Kon(String imie, String kolor, double waga, int wiek){
        this.imie = imie;
        this.kolor = kolor;
        this.waga = waga;
        this.wiek = wiek;
    }

    Kon(){
        imie = "n/a";
        kolor = "nieokreslony";
        waga = 0;
        wiek = 0;
    }

    //metody
//    void nadajWartosci(String i, String k, double wa, int wi ){
//
//        imie = i;
//        kolor = k;
//        waga = wa;
//        wiek = wi;
//
//    }

    void dajGlos(){
        System.out.println("Ihahaha! Powiedział: " + imie);
    }

    double jedz(double karma){

        waga = waga + karma;
        return waga;

    }

    void wyswietlInfo(){
        System.out.println("Imie: " + imie);
        System.out.println("Kolor: " + kolor);
        System.out.println("Waga: " + waga);
        System.out.println("Wiek: " + wiek);
    }

}
