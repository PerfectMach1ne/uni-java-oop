package com.company;

public class Ciezarowka extends Samochod{
    private double wysokosc;
    private double dlugosc;
    private double masaDopuszczalna;

    public Ciezarowka(String marka, String model, String vin, double waga, String nadwozie, double cena,
                      double wysokosc, double dlugosc, double masaDopuszczalna) {
        super(marka, model, vin, waga, nadwozie, cena);
        this.wysokosc = wysokosc;
        this.dlugosc = dlugosc;
        this.masaDopuszczalna = masaDopuszczalna;
    }

    public void info() {
        System.out.println("Informacje o ciezarowce");
        System.out.println("Marka i model: " + getMarka() + " " + getModel());
        System.out.println("VIN: " + getVin());
        System.out.println("Wysokosc pojazdu: " + wysokosc + "m");
        System.out.println("Dlugosc pojazdu: " + dlugosc + "m");
        System.out.println("Waga: " + getWaga() + "kg");
        System.out.println("Dopuszczalna masa calkowita: " + masaDopuszczalna + "kg");
        System.out.println("Typ nadwozia: " + getNadwozie());
        System.out.print("Cena: ");
        System.out.format("%.2fPLN\n", getCena());
        System.out.println("---------------------------");
    }

    public void obliczPrzeladowanie(double masaTowaru) {
        double tempMasa = masaDopuszczalna - getWaga();
        if (masaTowaru <= 0.75 * tempMasa) {
            System.out.println("Ciezarowka nie jest przeladowana!");
        } else if (masaTowaru > 0.75 * tempMasa && masaTowaru < 0.95 * tempMasa) {
            System.out.println("Ciezarowka bliska przeladowaniu!");
        } else {
            System.out.println("Ciezarowce grozi przeladowanie!");
        }
    }
}
