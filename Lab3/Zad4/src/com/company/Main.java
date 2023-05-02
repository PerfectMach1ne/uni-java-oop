package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program Fabryka Pojazdow\n===========================");

        Samochod mercedes = new Samochod("Mercedes Benc", "Citan Tourer","19UUA662X4A028125",
                                        1700.0, "Hatch-back", 53503.0);

        Ciezarowka volat = new Ciezarowka("Volat", "750440-010", "4A3AC44G35E007025", 4585.0,
                                          "Plandeka", 175500.0, 4.5, 12, 60000);
        Motocykl yamaha = new Motocykl("Yamaha", "XV 535/S VIRAGO 3BT", "2C4RC1BGXDR621563", 188.0, 40000);

        mercedes.info();
        volat.info();
        volat.obliczPrzeladowanie(2000);
        volat.obliczPrzeladowanie(48000);
        volat.obliczPrzeladowanie(90000);
        yamaha.info();
        yamaha.podniesCene(1500);
        yamaha.obnizCene(5500);
    }
}
