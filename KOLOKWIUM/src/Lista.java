import java.util.ArrayList;

public class Lista {
    public ArrayList<Integer> liczby;

    public Lista() {
        liczby = new ArrayList<Integer>();
    }

    public Lista(Lista l) {
        l.liczby = new ArrayList<Integer>();
    }

    public void dodaj_przod(int i) {
        liczby.add(i);
    }

    public void dodaj_tyl(int i) {
        liczby.add(0,i);
    }

    public void usun_przod(int i) {
        liczby.remove(liczby.size() - 1);
    }

    public void usun_tyl(int i) {
        liczby.remove(0);
    }

    public int pierwszy_el() {
        return liczby.get(0);
    }

    public int ostatni_el() {
        return liczby.get(liczby.size() - 1);
    }

    public boolean pusta_lista() {
        if (liczby.isEmpty()) {
            return true;
        }
        return false;
    }
}
