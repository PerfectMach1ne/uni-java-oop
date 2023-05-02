package com.company;

import java.util.ArrayList;

//WPROWADZENIE DO KLAS I OBIEKTÓW
public class Main {

    public static void main(String[] args) {

        ArrayList <Kon> stajnia = new ArrayList<>();

        stajnia.add(new Kon("Kasztanek", "Brązowy", 400.5, 5));
        stajnia.add(new Kon("Bieluch", "Biały", 397.3, 6));
        stajnia.add(new Kon());

        for(int i = 0; i < stajnia.size(); i++){
            stajnia.get(i).wyswietlInfo();
            System.out.println("---------------");
        }









        /*ArrayList <Integer> liczby = new ArrayList<>();

        liczby.add(10);
        liczby.add(13);
        liczby.add(7);
        liczby.add(19);

        for (int i = 0; i < liczby.size(); i++){
            System.out.println(liczby.get(i));
        }

        liczby.remove(1);
        System.out.println("-------------");


        for (int i = 0; i < liczby.size(); i++){
            System.out.println(liczby.get(i));
        }

        System.out.println("-------------");
        liczby.add(1, 67);

        for (int i = 0; i < liczby.size(); i++){
            System.out.println(liczby.get(i));
        }

        liczby.set(1, 17);
        System.out.println("-------------");

        for (int i = 0; i < liczby.size(); i++){
            System.out.println(liczby.get(i));
        }
*/


//        int x = 10;
//        Integer y = 10;



//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(x + y);
















/*        Kon stajnia [] = new Kon[4];

        stajnia[0] = new Kon("Kasztanek", "Brązowy", 400.5, 5);
        stajnia[1] = new Kon("Bieluch", "Biały", 397.3, 6);
        stajnia[2] = new Kon();


        //stajnia[1].wyswietlInfo();
        //stajnia[3].wyswietlInfo(); obiekt nie istnieje -> konstrukcja zwraca błąd!

        for(int i = 0; i < 3; i++){
            stajnia[i].wyswietlInfo();
            System.out.println("----------------");
        }*/















/*
        Kon kasztanek = new Kon("Kasztanek", "Brązowy", 400.5, 5);
        Kon bieluch = new Kon("Bieluch", "Biały", 397.3, 6);
        Kon znajda = new Kon();

//        kasztanek.nadajWartosci("Kasztanek", "Brązowy", 400.5, 5);
//        kasztanek.nadajWartosci("Bieluch", "Biały", 397.3, 6);

//        kasztanek.imie = "Kasztanek";
//        kasztanek.kolor = "Brązowy";
//        kasztanek.waga = 400.5;
//        kasztanek.wiek = 5;

//        bieluch.imie = "Bieluch";
//        bieluch.kolor = "Biały";
//        bieluch.waga = 397.3;
//        bieluch.wiek = 6;

        kasztanek.dajGlos();
        bieluch.dajGlos();

        System.out.println("Kon " + kasztanek.imie + " po karmieniu waży: " + kasztanek.jedz(2.5));
        System.out.println("Kon " + kasztanek.imie + " waży teraz: " + kasztanek.waga);

        System.out.println("------------------------");
        kasztanek.wyswietlInfo();

        System.out.println("------------------------");
        bieluch.wyswietlInfo();

        System.out.println("------------------------");
        znajda.wyswietlInfo();
*/

       /* Box mybox = new Box();
        Box mybox2 = new Box();

        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

//        double vol = mybox.width * mybox.depth * mybox.height;
//        System.out.println("Objętość pudła: " + vol);
//
//        vol = mybox2.width * mybox2.depth * mybox2.height;
//        System.out.println("Objętość pudła: " + vol);

        double vol = mybox.volume();
        System.out.println("Objetosc: " + vol);
        System.out.println("Objetość: " + mybox2.volume());*/

    }
}
