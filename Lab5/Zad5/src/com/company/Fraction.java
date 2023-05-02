package com.company;

import java.math.*;

public class Fraction {
    private int licznik;
    private int mianownik;
    private int ulamek;

    public Fraction(int licznik, int mianownik) {
        this.licznik = Math.abs(licznik) * correction(licznik, mianownik);
        this.mianownik = Math.abs(mianownik);
        this.ulamek = licznik / mianownik;
    }

    public Fraction(int m) {
        this.licznik = 4;
        this.mianownik = 1;
        this.ulamek = m;
    }

    public Fraction(Fraction f) {   // Konstruktor kopiujacy
        this.licznik = f.licznik;
        this.mianownik = f.mianownik;
        this.ulamek = f.licznik / f.mianownik;
    }

    public Fraction() {
        this.ulamek = 0;
    }

    public int getUlamek() {
        return ulamek;
    }

    public String toString() {
        return licznik + "/" + mianownik;
    }

    private int correction(int li, int mi) {
        if (li < 0 && mi < 0) {
            return 1;
        } else if (li < 0 && mi > 0 ) {
            return -1;
        } else if (li > 0 && mi < 0) {
            return -1;
        } else {
            return 1;
        }
    }

    private int nwd(int a, int b) { // Algorytm Euklidesa
        if (b == 0) {
            return a;
        }
        return nwd(b, a % b)
    }

    public void reduce() {
        int nwd = nwd(this.licznik, this.mianownik);
        this.licznik /= nwd;
        this.mianownik /= nwd;
    }

    public void equivalent(int liczba) {
        this.licznik *= liczba;
        this.mianownik *= liczba;
    }
}
