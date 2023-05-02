package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program Obsluga Zamowien (jablek)");

        Produkt apple1 = new Produkt("Antonowka", 0.30,485, "Tradycyjne jasno-zolte jablka z lekko kwaskowatym miazszem.");
        Produkt apple2 = new Produkt("Champion", 0.65, 300, "Jablka o lekko wydluzonym ksztalcie; bardzo slodkie");
        Produkt apple3 = new Produkt("Ligol", 0.46, 628, "Duze jablka o mocnej skorce i slodko-kwaskowatym smaku");

        Zamowienie zamowienie1 = new Zamowienie("Zamowienie A");

        zamowienie1.zamowProdukt(apple1);
        zamowienie1.zamowProdukt(apple3);
        zamowienie1.zamowProdukt(apple2, 0.85);
        zamowienie1.zamowProdukt(apple2);
        System.out.println("===============================");
        zamowienie1.listaProduktow();
    }
}
