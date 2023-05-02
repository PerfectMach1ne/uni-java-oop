package com.company;

import java.util.ArrayList;

public class Zamowienie {
    private ArrayList<Produkt> produktList = new ArrayList<Produkt>();
    private double cenaZamowienia = 0;
    private String nazwaZamowienia;

    Zamowienie(String nazwaZamowienia) {
        this.nazwaZamowienia = nazwaZamowienia;
    }

    public void zamowProdukt(Produkt p) {
        produktList.add(p);
        cenaZamowienia += liczZamowienie(produktList.lastIndexOf(p), p);
        System.out.println("Cena zamowienia " + nazwaZamowienia + ": " + cenaZamowienia);
    }

    public void zamowProdukt(Produkt p, double znizka) {
        produktList.add(p);
        cenaZamowienia += liczZamowienie(produktList.lastIndexOf(p), p, znizka);
        System.out.println("Cena zamowienia " + nazwaZamowienia + ": " + cenaZamowienia);
    }

    public double liczZamowienie(int index, Produkt p) {
        return produktList.get(index).getCena() * produktList.get(index).getIloscSztuk();
    }

    public double liczZamowienie(int index, Produkt p, double znizka) {
        return znizka * produktList.get(index).getCena() * produktList.get(index).getIloscSztuk();
    }

    public void listaProduktow() {
        for (int i = 0; i < produktList.size(); i++) {
            System.out.println("Numer zamowionego produktu: " + i);
            System.out.println("Nazwa produktu: " + produktList.get(i).getNazwa());
            System.out.println("Opis: " + produktList.get(i).getOpis());
        }
    }
}
