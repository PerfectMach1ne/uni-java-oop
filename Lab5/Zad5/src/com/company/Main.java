package com.company;

public class Main {
    public static void main(String[] args) {
        Fraction ab = new Fraction(-15,20);
        Fraction cd = new Fraction(-3,-4);
        System.out.println("a/b = " + ab.toString() + " = " + ab.getUlamek());
        System.out.println("c/d = " + cd.toString() + " = " + cd.getUlamek());

        ab.reduce();
        System.out.println("a/b = " + ab.toString() + " = " + ab.getUlamek());
        cd.equivalent(4);
        System.out.println("c/d = " + cd.toString() + " = " + cd.getUlamek());
    }
}
