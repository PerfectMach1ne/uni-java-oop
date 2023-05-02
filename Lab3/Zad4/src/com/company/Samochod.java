package com.company;

public class Samochod {
    private String marka;
    private String model;
    private String vin;
    private double waga;
    private String nadwozie;
    private double cena;

    public Samochod(String marka, String model, String vin, double waga, String nadwozie, double cena) {
        this.marka = marka;
        this.model = model;
        this.vin = vin;
        this.waga = waga;
        this.nadwozie = nadwozie;
        this.cena = cena;
    }

    // Dla klasy Motocykl
    public Samochod(String marka, String model, String vin, double waga, double cena) {
        this.marka = marka;
        this.model = model;
        this.vin = vin;
        this.waga = waga;
        this.cena = cena;
    }

    public void info() {
        System.out.println("Informacje o samochodzie");
        System.out.println("Marka i model: " + marka + " " + model);
        System.out.println("VIN: " + vin);
        System.out.println("Waga: " + waga + "kg");
        System.out.println("Typ nadwozia: " + nadwozie);
        System.out.print("Cena: ");
        System.out.format("%.2fPLN\n", cena);
        System.out.println("---------------------------");
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public String getVin() {
        return vin;
    }

    public double getWaga() {
        return waga;
    }

    public String getNadwozie() {
        return nadwozie;
    }

    public double getCena() {
        return cena;
    }
}
