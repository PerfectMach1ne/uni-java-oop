import java.util.ArrayList;
import java.util.Random;

public class LosowaLista extends Lista {
    private double najwieksza;
    private double najmniejsza;
    private double srednia;
    private double suma;

    Random r = new Random();
    int x = r.nextInt(50);
    int y = r.nextInt(100) + 10;

    public LosowaLista() {
        int temp;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                dodaj_przod(y);
            } else {
                dodaj_przod(x);
            }
        }
    }

    static int licz_najwieksza(ArrayList<Integer> l) {
        int najw = l.get(0);

        for (int i = 0; i < l.size(); i++) {
            if (l.get(i) > najw) {
                najw = l.get(i);
            }
        }

        return najw;
    }

    static int licz_najmniejsza(ArrayList<Integer> l) {
        int najm = l.get(0);

        for (int i = 0; i < l.size(); i++) {
            if (l.get(i) < najm) {
                najm = l.get(i);
            }
        }

        return najm;
    }

    static int licz_sume(ArrayList<Integer> l) {
        int suma = 0;
        for (int i = 0; i < l.size(); i++) {
            suma += l.get(0);
        }
        return suma;
    }

    static double licz_srednia(ArrayList<Integer> l) {
        double srednia = licz_sume(l);
        srednia /= l.size();

        return srednia;
    }

    public void wyswietl_info() {
        System.out.println("Najwieksza :" + najwieksza);
        System.out.println("Najmniejsza: " + najmniejsza);
        System.out.println("srednia : " + srednia);
        System.out.println("suma" + suma);
    }
}
