package com.company;

public abstract class Smartfon {
    double PrzekatnaEkranu;
    int PamiecRam;
    int PamiecWewnetrzna;
    double Cena;

    public Smartfon(double przekatnaEkranu, int pamiecRam, int pamiecWewnetrzna, double cena) {
        PrzekatnaEkranu = przekatnaEkranu;
        PamiecRam = pamiecRam;
        PamiecWewnetrzna = pamiecWewnetrzna;
        Cena = cena;
    }

    abstract void WyswietlInformacje();
    abstract void PodniesCene(double kwota);
    abstract void OpuscCene(double kwota);
}
