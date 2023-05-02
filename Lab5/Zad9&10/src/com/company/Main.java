package com.company;

public class Main {
    public static void main(String[] args) {
        Fraction ab = new Fraction(-21,2);
        Fraction cd = new Fraction(4,-5);
        System.out.println("a/b = " + ab.toString() + " = " + ab.getUlamek());
        System.out.println("c/d = " + cd.toString() + " = " + cd.getUlamek());

        System.out.println("(a/b) / (c/d) = " + Fraction.quot(ab,cd));
        System.out.println("(a/b) / 3 = " + Fraction.quot(ab,3));
        System.out.println("7 / 9 = " + Fraction.quot(7,9));
    }
}
