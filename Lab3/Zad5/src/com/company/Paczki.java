package com.company;

public class Paczki extends Listy {
    protected double waga;
    protected double wysokosc;
    protected double szerokosc;
    protected double glebokosc;
    protected double gabaryt;
    private static short staticPaczkaID = 0;
    protected final short paczkaID;

    public Paczki(String nazwiskoOdbiorca, String nazwiskoNadawca, String adresOdbiorca, String adresNadawca,
                  String kodOdbiorca, String kodNadawca, boolean polecona, boolean priorytetowa, double waga,
                  double wysokosc, double szerokosc, double glebokosc) {
        super(nazwiskoOdbiorca, nazwiskoNadawca, adresOdbiorca, adresNadawca,
                kodOdbiorca, kodNadawca, polecona, priorytetowa);
        this.waga = waga;
        this.wysokosc = wysokosc;
        this.szerokosc = szerokosc;
        this.glebokosc = glebokosc;
        this.gabaryt = waga + (wysokosc * szerokosc * glebokosc) / 6000;
        this.paczkaID = staticPaczkaID;
        staticPaczkaID++;
    }

    public double przeliczCena(double gabaryt) {
        if (gabaryt <= 5.0) {
            return gabaryt * 1.5;
        } else if (gabaryt > 5.0 && gabaryt <= 10.0 ) {
            return gabaryt * 2.3;
        } else if (gabaryt > 10.0 && gabaryt <= 15.0){
            return gabaryt * 2.9;
        } else if (gabaryt > 15.0 && gabaryt < 20.0) {
            return gabaryt * 3.6;
        } else {
            return gabaryt * 4.7;
        }
    }

    public double getWaga() {
        return waga;
    }

    public void setWaga(double waga) {
        this.waga = waga;
    }

    public double getWysokosc() {
        return wysokosc;
    }

    public void setWysokosc(double wysokosc) {
        this.wysokosc = wysokosc;
    }

    public double getSzerokosc() {
        return szerokosc;
    }

    public void setSzerokosc(double szerokosc) {
        this.szerokosc = szerokosc;
    }

    public double getGlebokosc() {
        return glebokosc;
    }

    public void setGlebokosc(double glebokosc) {
        this.glebokosc = glebokosc;
    }

    public double getGabaryt() {
        return gabaryt;
    }

    public void setGabaryt(double gabaryt) {
        this.gabaryt = gabaryt;
    }

    public short getPaczkaID() {
        return paczkaID;
    }

}
