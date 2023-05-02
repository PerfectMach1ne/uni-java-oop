import java.util.Scanner;

public class Poczta {
    public String nadawca;
    public String odbiorca;
    public String temat;
    public String tresc;

    public Poczta(String nadawca, String odbiorca, String temat, String tresc) {
        this.nadawca = nadawca;
        this.odbiorca = odbiorca;
        this.temat = temat;
        this.tresc = tresc;
    }

    public void wypisz(Poczta p) {
        System.out.println("Nadawca: " + p.nadawca);
        System.out.println("Odbiorca: " + p.nadawca);
        System.out.println("Temat: " + p.nadawca);
        System.out.println("Tresc: " + p.nadawca);
    }

    public void wczytaj(Poczta p) {
        Scanner sc = new Scanner(System.in);

        p.nadawca = sc.next();
        p.odbiorca = sc.next();
        p.temat = sc.next();
        p.tresc = sc.next();

        sc.close();
    }

}
