package com.company;

public class Main {
    public static void main(String[] args) {
        String[] nazwy = new String[] {"RUTINOSCORBIN", "gRiPeX", "apap", "ibuprom"};
        double[] ceny = {3.99, 2.49, 2.99, 2.79};
        double[] refunacje = {0.15, 0.0, 0.35, 0.0};

        Lekarstwa apteka = new Lekarstwa(nazwy, ceny, refunacje);

        apteka.wyswietl();  // void wyswietl()
        System.out.println("=========================================");
        // double kosztCalkowity() i double cena(String lek, boolean ubezpieczony)
        System.out.println("Koszt calkowity zamowienia: " + apteka.kosztCalkowity() + "PLN");
        // public String maksymalnaRefundacji()
        System.out.println("Lek o najwiekszej refundacji: " + apteka.maksymalnaRefundacji());
    }
}
