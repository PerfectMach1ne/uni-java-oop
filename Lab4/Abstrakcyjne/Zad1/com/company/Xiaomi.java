package com.company;

public class Xiaomi extends Smartfon {
    String Model;

    public Xiaomi(double przekatnaEkranu, int pamiecRam, int pamiecWewnetrzna, double cena, String model) {
        super(przekatnaEkranu, pamiecRam, pamiecWewnetrzna, cena);
        Model = model;
    }

    @Override
    void WyswietlInformacje() {
        System.out.println("Model telefonu: " + Model);
        System.out.println("Pamiec RAM: " + PamiecRam);
        System.out.println("Pamiec wewnetrzna: " + PamiecWewnetrzna + "\"");
        System.out.println("Przekatna ekranu: " + PrzekatnaEkranu);
        System.out.println("Cena: " + Cena);
    }
    @Override
    void PodniesCene(double kwota) {
        System.out.println("Stara cena smartfonu " + Model + ": " + Cena);
        Cena += kwota;
        System.out.println("Nowa cena smartfonu " + Model + ": " + Cena);
    }
    @Override
    void OpuscCene(double kwota) {
        System.out.println("Stara cena smartfonu " + Model + ": " + Cena);
        Cena -= kwota;
        System.out.println("Nowa cena smartfonu" + Model + ": " + Cena);
    }
}
