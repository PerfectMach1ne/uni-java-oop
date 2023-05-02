package com.company;

class ParentClass
{
    public void displayMethod(String msg){
        System.out.println(msg);
    }
}
class SubClass extends ParentClass
{
    @Override
    public void displayMethod(String msg){
        System.out.println("Message is: "+ msg);
    }
}

public class Main {
    public static void main(String[] args) {
        Xiaomi x1 = new Xiaomi(6.81, 12, 128, 3800, "Xiaomi Mi 11");
        Xiaomi x2 = new Xiaomi(6.67, 6,64,2800,"Xiaomi Redmi Note 10 Pro");
        Apple i1 = new Apple(4.7,2, 128, 820, "Apple iPhone 7", 2016, true);
        Apple i2 = new Apple(6.1,4,256, 4100, "Apple iPhone 12", 2020,true);
        Apple i3 = new Apple(3.5, 128, 16,350, "Apple iPhone 3G",2008,false);
        SubClass sub = new SubClass();
        ParentClass par = new ParentClass();
        par.displayMethod("beh");
        sub.displayMethod("beh");

        x1.WyswietlInformacje();
        Line();
        x2.WyswietlInformacje();
        Line();
        x2.PodniesCene(550);
        Line();
        x1.OpuscCene(190);

        Line();

        i1.WyswietlInformacje();
        Line();
        i2.WyswietlInformacje();
        Line();
        i3.WyswietlInformacje();
        Line();
        i3.PodniesCene(80);
        Line();
        i1.OpuscCene(120);
        Line();
    }

    public static void Line() {
        System.out.println("============================");
    }
}
