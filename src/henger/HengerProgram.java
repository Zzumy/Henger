package henger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HengerProgram {

    private List<Henger> hengerek;

    public HengerProgram() {
        hengerek = new ArrayList<>();
        hengerek.add(new Henger(1, 1.5));
        hengerek.add(new TomorHenger(1, 1.5));
        hengerek.add(new TomorHenger(1, 1.5, 1));
        hengerek.add(new Cso(1, 1.5, 2));
        hengerek.add(new Cso(1, 1.5, 1, 2));
    }

    public double atlagTerfogat() {
        double osszTerfogat = 0;
        for (Henger henger : hengerek) {
            osszTerfogat += henger.terfogat();
        }
        return osszTerfogat / hengerek.size();
    }

    public double csovekSulya() {
        double osszSuly = 0;
        for (Henger henger : hengerek) {
            if (henger instanceof Cso cso) {
                osszSuly += cso.suly();
            }
        }
        return osszSuly;
    }

    private List<Henger> lista() {
        return Collections.unmodifiableList(hengerek);
    }

    public void run() {
        for (Henger henger : lista())
        {
            System.out.println(henger);
        }
        lista();
        System.out.println("");
        System.out.printf("Összesen %d db henger van a programban\n", Henger.hengerDarab());
        System.out.println("A csövek összsúlya: " + csovekSulya());
        System.out.println("A hengerek átlagtérfogata: " + atlagTerfogat());
    }

    public static void main(String[] args) {
        new HengerProgram().run();
    }

}
