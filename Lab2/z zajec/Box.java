package com.company;

public class Box {

    double width;
    double height;
    double depth;

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double volume(){

        return width * height * depth;

    }

    /*void volume(){
        System.out.print("Objętość: ");
        System.out.println(width * height * depth);
    }*/

}
