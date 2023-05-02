package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program PocztaPolska"); line();

        Placowka pocztaLublin = new Placowka();
        // TODO: TRZY LISTY, DWIE PACZUCHY, przelicz cene listow i paczuch, PLAY AROUND WITH Class Placowka methods.
        Listy list1 = new Listy("Jan Kowalski", "Kowal Janski",
                "ul. Ulicowa 7/77", "Aleje Raclawickie 15/20","20-678 Lublin",
                "20-123 Lublin", true, false);
        Listy list2 = new Listy("John Covalsky", "Robert Robertowicz",
                "ul. Dluga 8/21", "ul. Krotka 101","21-345 Wroclaw",
                "19-823 Radom", false, true);
        Listy list3 = new Listy("Anna Nowak", "Ewa Nowak",
                "ul. Ceglowa 10", "ul. Marmurowa 9","21-210 Warszawa",
                "21-210 Warszawa", false, false);

        pocztaLublin.dodajList(list1);
        pocztaLublin.dodajList(list2);
        pocztaLublin.dodajList(list3);
        pocztaLublin.wyswietlList(list1);
        System.out.println("Cena listu: " + list1.przeliczCena()); line();
        pocztaLublin.wyswietlList(list2);
        System.out.println("Cena listu: " + list2.przeliczCena()); line();
        pocztaLublin.wyswietlList(list3);
        System.out.println("Cena listu: " + list3.przeliczCena()); line();
        pocztaLublin.usunList((short) 1); // Usuwa list 2

        Paczki paczka1 = new Paczki("Jan Kowalski", "Ewa Nowak",
                "ul. Ulicowa 7/77", "ul. Marmurowa 9", "20-678 Lublin",
                "21-210 Warszawa",false, true, 5.2, 0.2,0.3,
                0.4);
        Paczki paczka2 = new Paczki("Szymon Szymon", "Robert Robertowicz",
                "ul. Szymona 5/7", "ul. Krotka 101", "10-212 Hel",
                "21-345 Wroclaw",true, false, 2.3, 0.5,0.3,
                0.3);

        pocztaLublin.dodajPaczke(paczka1);
        pocztaLublin.dodajPaczke(paczka2);
        pocztaLublin.wyswietlPaczke(paczka1);
        System.out.println("Cena paczki: " + paczka1.przeliczCena()); line();
        pocztaLublin.wyswietlPaczke(paczka2);
        System.out.println("Cena paczki: " + paczka2.przeliczCena());
        pocztaLublin.usunPaczke((short) 1); // Usuwa paczke 2

    }

    public static void line() {
        System.out.println("=====================================");
    }
}
