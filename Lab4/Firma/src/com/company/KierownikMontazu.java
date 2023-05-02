package com.company;

public class KierownikMontazu extends Kierownictwo {
    boolean wyrobionaNorma;
    int godzinyPonadNorme;

    public KierownikMontazu(boolean wyrobionaNorma, int godzinyPonadNorme) {
        this.wyrobionaNorma = wyrobionaNorma;
        this.godzinyPonadNorme = godzinyPonadNorme;
    }

    void liczPremie(int nadgodz) {
        if (wyrobionaNorma && godzinyPonadNorme > 0) {

        }
    }

    @Override
    void ustalWyplate() {
        System.out.println("Wyplata kierownika montazu: " + 3500 + liczPremie(12););
    }

    @Override
    void wyswietlInfo() {
        System.out.println("Wyrobiona norma: " + wyrobionaNorma);
        System.out.println("Godziny ponad norme: " + godzinyPonadNorme);
        ustalWyplate();
    }

    @Override
    void liczPremie() {
        if (wyrobionaNorma && godzinyPonadNorme > 0) {

        }
    }
}
