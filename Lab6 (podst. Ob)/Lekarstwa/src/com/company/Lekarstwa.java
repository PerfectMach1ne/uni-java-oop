package com.company;

import java.util.Arrays;

public class Lekarstwa {
    private String[] nazwa;         // Tablica z nazwami lekow
    private double[] cena;          // Tablica z cenami poszczegolnych lekow
    private double[] refundacja;    // Tablica z procentem refundacji danego leku

    public Lekarstwa(String[] nazwa, double[] cena, double[] refundacja) {
        for (int i = 0; i < nazwa.length ; i++) {
            nazwa[i] = nazwa[i].toLowerCase();
            char c = nazwa[i].charAt(0);
            String firstChar = String.valueOf(c);
            String str = nazwa[i].replaceFirst(firstChar, firstChar.toUpperCase());
            nazwa[i] = str;
        }
        this.nazwa = nazwa;
        this.cena = cena;
        this.refundacja = refundacja;
    }

    public double cena(String lek, boolean ubezpieczony) {
        int i = 0;
        do {
            if (lek.equals(this.nazwa[i])) break;
            i++;
        } while (i < this.nazwa.length - 1);

        if (ubezpieczony == true) {
            return this.cena[i] * (1.0 - this.refundacja[i]);
        }
        return this.cena[i];
    }

    public double kosztCalkowity() {
        double kosztCalk = 0.0;
        for (int i = 0; i <= (this.nazwa.length - 1); i++) {
            kosztCalk += cena(this.nazwa[i], (this.refundacja[i] == 0.0) ? false : true);
        }

        int optimize = (int)(100 * kosztCalk);
        kosztCalk = optimize / 100.0;

        return kosztCalk;
    }

    public String maksymalnaRefundacji() {
        String lek = new String();
        double testRefundacja = 0.0;

        for (int i = 0; i <= (this.nazwa.length - 1); i++) {
            if (testRefundacja < this.refundacja[i]) {
                testRefundacja = this.refundacja[i];
                lek = this.nazwa[i];
            }
        }

        return lek;
    }

    public void wyswietl() {
        for (int i = 0; i < this.nazwa.length; i++) {
            System.out.println("=========================================");
            System.out.println("Nazwa leku: " + this.nazwa[i]);
            System.out.println("Cena leku: " + this.cena[i] + "PLN");
            System.out.println("Procent refundacji: " + this.refundacja[i] * 100 + "%");
        }
    }
}

