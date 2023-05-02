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
        this.licznik = m;
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
        if (a < 0) {    // Bugfix dla pozycji minusa
            a = Math.abs(a);
        } else if (b < 0) {
            b = Math.abs(b);
        }

        if (b == 0) {
            return a;
        }
        return nwd(b, a % b);
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

    public Fraction mult(Fraction f) {
        Fraction mult = new Fraction(this.licznik * f.licznik,this.mianownik * f.mianownik);
        return mult;
    }

    public Fraction mult(int i) {
        Fraction mult = new Fraction(this.licznik * i, this.mianownik * i);
        return mult;
    }

    public static Fraction product(int a, int b) {
        Fraction prod = new Fraction(a * b);
        return prod;
    }

    public static Fraction product(Fraction a, Fraction b) {
        Fraction prod = new Fraction(a.licznik * b.licznik, a.mianownik * b.mianownik);
        return prod;
    }

    public static Fraction product(Fraction f, int i) {
        Fraction prod = new Fraction(f.licznik * i, f.mianownik);
        return prod;
    }
}
