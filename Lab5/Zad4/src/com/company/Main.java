package com.company;

public class Main {
    public static void main(String[] args) {
        Fraction ab = new Fraction(-3,4);
        Fraction cd = new Fraction(3,-4);
        Fraction ef = new Fraction(2,5);
        Fraction gh = new Fraction(-2,-5);
        System.out.println("a/b = " + ab.toString() + " = " + ab.getUlamek());
        System.out.println("c/d = " + cd.toString() + " = " + cd.getUlamek());
        System.out.println("e/f = " + ef.toString() + " = " + ef.getUlamek());
        System.out.println("g/h = " + gh.toString() + " = " + gh.getUlamek());
    }
}
