package com.company;

public class Main {
    public static void main(String[] args) {
        Fraction ab = new Fraction(-7,12);
        Fraction cd = new Fraction(-3,-4);
        System.out.println("a/b = " + ab.toString() + " = " + ab.getUlamek());
        System.out.println("c/d = " + cd.toString() + " = " + cd.getUlamek());

        System.out.print("a/b * c/d = " + Fraction.product(ab, cd).toString() + " = ");
        Fraction xy = new Fraction(Fraction.product(ab, cd)); // Zredukowana wersja
        xy.reduce();
        System.out.println(xy.toString());

        System.out.print("a/b * 6 = " + Fraction.product(ab, 6).toString() + " = ");
        Fraction wz = new Fraction(Fraction.product(ab, 6)); // Zredukowana wersja
        wz.reduce();
        System.out.println(wz.toString());

        System.out.println("5 * 7 = " + Fraction.product(5, 7).toString());
    }
}
