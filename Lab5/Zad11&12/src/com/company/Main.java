package com.company;

public class Main {
    public static void main(String[] args) {
        Fraction ab = new Fraction(2,3);
        Fraction cd = new Fraction(3,4);
        System.out.println("a/b = " + ab.toString() + " = " + ab.getUlamek());
        System.out.println("c/d = " + cd.toString() + " = " + cd.getUlamek());

        System.out.println("a/b + c/d = " + Fraction.sum(ab,cd));
        System.out.println("c/d + 5 = " + Fraction.sum(cd,5));
    }
}
