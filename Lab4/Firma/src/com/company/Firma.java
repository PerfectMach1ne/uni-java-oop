package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Firma {
    public static void main(String[] args) {
        System.out.println("Program \"Firma\".");

        Sprzataczka sprzataczka1 = new Sprzataczka("Anna","Kowalska", "ul. Ulicowa 23", 2000,
                new ArrayList<String>(Arrays.asList("Nieobecnosc 26.04.21", "Spoznienie 15.10.20")));
        sprzataczka1.przyznajPremie(250.0);
        sprzataczka1.przyznajKare(50.0);
        sprzataczka1.dodajOstrzezenie("Nieobecnosc 28.05.21");
        System.out.println("Pracownik: " + sprzataczka1.getImie() + " " + sprzataczka1.getNazwisko());
        System.out.println("Zawod: Sprzataczka");
        System.out.println("Adres: " + sprzataczka1.getAdres());
        System.out.println("Wyplata: " + sprzataczka1.getWyplata());
        System.out.println("Wyplata netto: " + sprzataczka1.obliczNetto());
        System.out.println("Lista ostrzezen: ");
        {
            int i = 1;
            for (String s : sprzataczka1.getListaOstrzeen()) {
                System.out.println(i++ + ": " + s);
            }
        }
        line();

        OperatorPily operatorPily1 = new OperatorPily("Zdzislaw", "Pilat", "ul. Pilowa 177/7",
                3700, true, new ArrayList<String>(Arrays.asList("Naruszenie BHP 13.08.21",
                "Zaspanie 26.05.21")), "Husqvarna", 27);
        operatorPily1.wyswietlInfo();
        operatorPily1.nadajStanowisko();
        System.out.println("Stanowisko operatora pily: " + operatorPily1.getNumerStanowiska());
        line();

        KierowcaDostawczaka kierowcaDostawczaka1 = new KierowcaDostawczaka("Dariusz", "Szybki",
                "ul. Powolna 3/25", 5000, false,
                new ArrayList<String>(Arrays.asList("Wypadek drogowy 28.06.21")), "BMW", 33);
        kierowcaDostawczaka1.wyswietlInformacje();

        KierownikMontazu kierMontaz1 = new KierownikMontazu(true, 12);
        kierMontaz1.wyswietlInfo();
    }

    public static void line() {
        System.out.println("========================================");
    }
}
