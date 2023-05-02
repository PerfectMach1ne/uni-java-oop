package com.company;

public class Main {
    public static void main(String[] args) {
        Fraction ab = new Fraction(4,3);
        Fraction abCopy = new Fraction(ab);

        System.out.println("a/b = " + ab.toString() + " = " + ab.getUlamek()); // Ze zwyklego konstruktora
        System.out.println("a/b = " + abCopy.toString() + " = " + abCopy.getUlamek()); // Z konstruktora kopiujacego
    }
}
