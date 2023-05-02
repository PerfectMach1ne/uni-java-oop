package com.company;

public abstract class Populacja {
    double wielkoscPopulacji;
    double dlugoscZycia;
    double tempoPrzyrostu;
    double wiekPopulacji;

    abstract void rozmnazajSie();
    abstract void wymieraj();
    abstract void liczSredniazycia();
    abstract void ustalWiekPopulacji();
}
