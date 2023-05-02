package com.company;

public class Fraction {
    private int licznik;
    private int mianownik;
    private int ulamek;

    public Fraction(int licznik, int mianownik) {
        this.licznik = licznik;
        this.mianownik = mianownik;
        this.ulamek = licznik / mianownik;
    }

    public Fraction() {
        this.ulamek = 0;
    }

    public Fraction(int m) {
        this.licznik = m;
        this.mianownik = 1;
        this.ulamek = m;
    }

    public String toString() {
        return licznik + "/" + mianownik;
    }

    public int getUlamek() {
        return ulamek;
    }
}
