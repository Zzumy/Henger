package henger;

public class TomorHenger extends Henger {

    private double fajsuly;

    public TomorHenger(double sugar, double magassag, double fajsuly) {
        super(sugar, magassag);
        this.fajsuly = fajsuly;
    }

    public TomorHenger(double sugar, double magassag) {
        this(sugar, magassag, 1);
    }

    public double getFajsuly() {
        return fajsuly;
    }

    public double suly() {
        return 0;
    }

    @Override
    public String toString() {
        return "TomorHenger{" + "sugar=" + getSugar() + ", magassag=" + getMagassag() + "fajsuly=" + fajsuly + '}';
    }

}
