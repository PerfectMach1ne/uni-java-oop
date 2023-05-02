package com.company;

public class Main {
    public static void main(String[] args) {
        Fraction ab = new Fraction(-7,12);
        Fraction cd = new Fraction(-3,-4);
        System.out.println("a/b = " + ab.toString() + " = " + ab.getUlamek());
        System.out.println("c/d = " + cd.toString() + " = " + cd.getUlamek());

        System.out.println("a/b * c/d = " + ab.mult(cd).toString());
        Fraction xy = new Fraction(ab.mult(cd));
        xy.reduce();
        System.out.println("a/b * c/d = " + xy.toString());
        System.out.println("5 * c/d = " + cd.mult(5).toString());
    }
}
