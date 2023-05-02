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

    private int nwd(int a, int b) { // Algorytm Euklidesa dla NWD
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
        Fraction fMult = new Fraction(this.licznik * f.licznik,this.mianownik * f.mianownik);
        return fMult;
    }

    public Fraction mult(int i) {
        Fraction fMult = new Fraction(this.licznik * i, this.mianownik * i);
        return fMult;
    }

    public static Fraction product(int a, int b) {
        Fraction fProd = new Fraction(a * b);
        return fProd;
    }

    public static Fraction product(Fraction a, Fraction b) {
        Fraction fProd = new Fraction(a.licznik * b.licznik, a.mianownik * b.mianownik);
        return fProd;
    }

    public static Fraction product(Fraction f, int i) {
        Fraction fProd = new Fraction(f.licznik * i, f.mianownik);
        return fProd;
    }

    public Fraction multInv() {
        Fraction fInv = new Fraction(this.mianownik,this.licznik);
        return fInv;
    }

    public static Fraction multInv(Fraction f) {
        Fraction fInv = new Fraction(f.mianownik, f.licznik);
        return fInv;
    }

    public Fraction div(Fraction f) {
        Fraction fDiv = new Fraction(this.licznik * f.mianownik, this.mianownik * f.licznik);
        return fDiv;
    }

    public Fraction div(int i) {
        Fraction fDiv = new Fraction(this.licznik, this.mianownik * i);
        return fDiv;
    }

    public static Fraction quot(Fraction a, Fraction b) {
        Fraction fQuot = new Fraction(a.licznik * b.mianownik, a.mianownik * b.licznik);
        return fQuot;
    }

    public static Fraction quot(Fraction f, int i) {
        Fraction fQuot = new Fraction(f.licznik, f.mianownik * i);
        return fQuot;
    }

    public static Fraction quot(int a, int b) {
        Fraction fQuot = new Fraction(a, b);
        return fQuot;
    }

    private int nww(int a, int b) {
        return Math.abs(a * b) / nwd(a, b); // Z zaleznosci miedzy NWD i NWW
    }

    public Fraction add(int i) {
        Fraction fAdd = new Fraction(this.licznik + this.mianownik * i, this.mianownik);
        return fAdd;
    }

    public Fraction add(Fraction f) {
        Fraction fAdd = new Fraction(this.licznik * f.mianownik + this.mianownik * f.licznik,
                nww(this.mianownik, f.mianownik));
        return fAdd;
    }

    public static Fraction sum(Fraction f, int i) {
        Fraction fSum = new Fraction(f.licznik + f.mianownik * i, f.mianownik);
        return fSum;
    }

    public static Fraction sum(Fraction a, Fraction b) {
        Fraction fSum = new Fraction(a.licznik * b.mianownik + a.mianownik * b.licznik,
                nwwStatic(a.mianownik, b.mianownik));
        return fSum;
    }

    private static int nwdStatic(int a, int b) { // Algorytm Euklidesa dla NWD
        if (a < 0) {    // Bugfix dla pozycji minusa
            a = Math.abs(a);
        } else if (b < 0) {
            b = Math.abs(b);
        }

        if (b == 0) {
            return a;
        }
        return nwdStatic(b, a % b);
    } // "Non-static method 'nww(int, int)' cannot be referenced from a static context"

    private static int nwwStatic(int a, int b) {
        return Math.abs(a * b) / Fraction.nwdStatic(a, b); // Z zaleznosci miedzy NWD i NWW
    } // "Non-static method 'nww(int, int)' cannot be referenced from a static context"
}
