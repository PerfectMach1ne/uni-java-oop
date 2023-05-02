package com.company;

public class Main {
    public static void main(String[] args) {
        Fraction ab = new Fraction(2,3);
        Fraction cd = new Fraction(3,4);
        Fraction ef = new Fraction(7,2);
        System.out.println("a/b = " + ab.toString() + " = " + ab.getUlamek());
        System.out.println("c/d = " + cd.toString() + " = " + cd.getUlamek());
        System.out.println("e/f = " + ef.toString() + " = " + ef.getUlamek());

        Fraction xy = new Fraction(5,3);
        System.out.println("a/b = " + ab.addInv()); // Zad 13
        System.out.println("a/b - c/d = " + ab.add(cd.addInv())); // Zad 13
        System.out.println("c/d - 5/3 = " + cd.add(Fraction.addInv(xy))); // Zad 13
        System.out.println("a/b - e/f = " + ab.sub(ef)); // Zad 14
        System.out.println("e/f - 3 = " + ef.sub(3)); // Zad 14
        System.out.println("c/d - 1 = " + Fraction.diff(cd,1)); // Zad 15
        Fraction xw = new Fraction(Fraction.diff(ef,cd)); // Zad 15
        xw.reduce();
        System.out.println("e/f - c/d = " + xw); // Zad 15
        System.out.println("a/b = " + ab.getNum() + "/" + ab.getDen()); // Zad 16
        System.out.println("a/b -> 5/6"); // Zad 17
        ab.setNum(5); // Zad 17
        ab.setDen(6); // Zad 17
        System.out.println("a/b = " + ab.toString()); // Zad 17
        System.out.println("e/f -> 2/7"); // Zad 17
        ef.setFrac(2,7); // Zad 17
        System.out.println("e/f = " + ef.toString()); // Zad 17
    }
}
