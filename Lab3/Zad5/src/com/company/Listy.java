package com.company;

public class Listy {
    protected String nazwiskoOdbiorca;
    protected String nazwiskoNadawca;
    protected String adresOdbiorca;
    protected String adresNadawca;
    protected String kodOdbiorca;
    protected String kodNadawca;
    protected boolean polecona;
    protected boolean priorytetowa;
    private static short staticListID = 0;
    protected final short listID;

    public Listy(String nazwiskoOdbiorca, String nazwiskoNadawca, String adresOdbiorca, String adresNadawca,
                 String kodOdbiorca, String kodNadawca, boolean polecona, boolean priorytetowa) {
        this.nazwiskoOdbiorca = nazwiskoOdbiorca;
        this.nazwiskoNadawca = nazwiskoNadawca;
        this.adresOdbiorca = adresOdbiorca;
        this.adresNadawca = adresNadawca;
        this.kodOdbiorca = kodOdbiorca;
        this.kodNadawca = kodNadawca;
        this.polecona = polecona;
        this.priorytetowa = priorytetowa;
        this.listID = staticListID;
        staticListID++;
    }

    public double przeliczCena() {
        if (priorytetowa == true) {
            return 5.0;
        } else if (polecona == true) {
            return 4.7;
        } else {
            return 3.9;
        }
    }

    public String getNazwiskoOdbiorca() {
        return nazwiskoOdbiorca;
    }

    public void setNazwiskoOdbiorca(String nazwiskoOdbiorca) {
        this.nazwiskoOdbiorca = nazwiskoOdbiorca;
    }

    public String getNazwiskoNadawca() {
        return nazwiskoNadawca;
    }

    public void setNazwiskoNadawca(String nazwiskoNadawca) {
        this.nazwiskoNadawca = nazwiskoNadawca;
    }

    public String getAdresOdbiorca() {
        return adresOdbiorca;
    }

    public void setAdresOdbiorca(String adresOdbiorca) {
        this.adresOdbiorca = adresOdbiorca;
    }

    public String getAdresNadawca() {
        return adresNadawca;
    }

    public void setAdresNadawca(String adresNadawca) {
        this.adresNadawca = adresNadawca;
    }

    public String getKodOdbiorca() {
        return kodOdbiorca;
    }

    public void setKodOdbiorca(String kodOdbiorca) {
        this.kodOdbiorca = kodOdbiorca;
    }

    public String getKodNadawca() {
        return kodNadawca;
    }

    public void setKodNadawca(String kodNadawca) {
        this.kodNadawca = kodNadawca;
    }

    public boolean isPolecona() {
        return polecona;
    }

    public void setPolecona(boolean polecona) {
        this.polecona = polecona;
    }

    public boolean isPriorytetowa() {
        return priorytetowa;
    }

    public void setPriorytetowa(boolean priorytetowa) {
        this.priorytetowa = priorytetowa;
    }

    public short getListID() {
        return listID;
    }
}
