package pl.wszib.zadanie.domain;

public class Car {

    private String marka;
    private String rodzaj;
    private String rocznik;
    private double cena;
    private int przebiegKilometry;

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getRodzaj() {
        return rodzaj;
    }

    public void setRodzaj(String rodzaj) {
        this.rodzaj = rodzaj;
    }

    public String getRocznik() {
        return rocznik;
    }

    public void setRocznik(String rocznik) {
        this.rocznik = rocznik;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public int isPrzebiegKilometry() {
        return przebiegKilometry;
    }

    public void setPrzebiegKilometry(int przebiegKilometry) {
        this.przebiegKilometry = przebiegKilometry;
    }
}
