package com.company;

public class Apple extends Xiaomi{
    int RokWydania;
    boolean GigaBytes;

    public Apple(double przekatnaEkranu, int pamiecRam, int pamiecWewnetrzna, double cena, String model, int rokWydania, boolean gigaBytes) {
        super(przekatnaEkranu, pamiecRam, pamiecWewnetrzna, cena, model);
        RokWydania = rokWydania;
        GigaBytes = gigaBytes;
    }

    @Override
    void WyswietlInformacje() {
        System.out.println("Model telefonu: " + Model);
        System.out.println("Pamiec RAM: " + PamiecRam + (GigaBytes ? "GB" : "MB"));
        System.out.println("Pamiec wewnetrzna: " + PamiecWewnetrzna + "\"");
        System.out.println("Przekatna ekranu: " + PrzekatnaEkranu);
        System.out.println("Cena: " + Cena);
        System.out.println("Rok wydania: " + RokWydania);
    }

}
