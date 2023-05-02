package com.company;

public class Main {
    public static void main(String[] args) {
        Fraction ab = new Fraction(5,2);
        Fraction cd = new Fraction(2,3);
        System.out.println("a/b = " + ab.toString() + " = " + ab.getUlamek());
        System.out.println("a/b = " + cd.toString() + " = " + cd.getUlamek());
    }
}
