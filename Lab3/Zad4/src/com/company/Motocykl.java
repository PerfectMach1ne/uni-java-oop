package com.company;

public class Motocykl extends Samochod {
    public Motocykl(String marka, String model, String vin, double waga, double cena) {
        super(marka, model, vin, waga, cena);
    }

    public void info() {
        System.out.println("Informacje o motocyklu");
        System.out.println("Marka i model: " + getMarka() + " " + getModel());
        System.out.println("VIN: " + getVin());
        System.out.println("Waga: " + getWaga() + "kg");
        System.out.print("Cena: ");
        System.out.format("%.2fPLN\n", getCena());
        System.out.println("---------------------------");
    }

    public void podniesCene(double cena) {
        System.out.println("Obecna cena motocykla: " + getCena());
        setCena(getCena() + cena);
        System.out.println("Cena po podniesieniu: " + getCena());
    }

    public void obnizCene(double cena) {
        System.out.println("Obecna cena motocykla: " + getCena());
        setCena(getCena() - cena);
        System.out.println("Cena po obnizeniu: " + getCena());
    }
}
