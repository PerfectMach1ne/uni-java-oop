package com.company;

public class Main {
    public static void main(String[] args) {
        Fraction ab = new Fraction(-5,7);
        Fraction cd = new Fraction(2,5);
        System.out.println("a/b = " + ab.toString() + " = " + ab.getUlamek());
        System.out.println("c/d = " + cd.toString() + " = " + cd.getUlamek());

        System.out.println("b/a = " + ab.multiInv().toString());
        System.out.println("d/c = " + Fraction.multiInv(cd).toString());
        System.out.println("(a/b) / (c/d) = " + Fraction.product(ab, cd.multiInv()));
    }
}
