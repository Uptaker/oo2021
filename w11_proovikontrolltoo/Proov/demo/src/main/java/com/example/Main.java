package com.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // create drink, bottle, barrel and crate
        Jook alko1 = new Jook("Mingi alko", 0.7, 0.789);
        Joogipudel alko1pudel = new Joogipudel(2, "A", 600, 0.1, alko1);
        Joogivaat joogivaat = new Joogivaat(50, 20, alko1); // (total, currently)
        Kast kast = new Kast(alko1pudel);

        // get mass and total price
        System.out.println("Joogi summa (kg): " + alko1pudel.getTotalMass());
        System.out.println("Komplekti hind (eur): " + round(alko1pudel.getTotalPrice()));

        // fill bottle
        joogivaat.fillBottle(alko1pudel);

        // create list with all bottles filled by barrel
        List<Joogipudel> vaatTyhjendus = joogivaat.emptyAllToBottles(alko1pudel);
        System.out.println(vaatTyhjendus);

        // total masses of crate
        System.out.println("Kogu kasti mass kui oleks täis (kg) " + kast.getTotalMass());
        System.out.println("Kogu kasti mass praegu (kg) " + kast.getCurrentMass());

        // total prices of crate
        System.out.println("Kogu kasti hind kui oleks täis (eur) " + round(kast.getTotalPrice()));
        System.out.println("Kogu kasti hind praegu (eur) " + round(kast.getCurrentPrice()));

        // Fill crate from barrel
        Joogivaat joogivaat2 = new Joogivaat(300, 300, alko1); // new barrel (full)
        kast.fillFromBarrel(joogivaat2);

        // check the crate current price and mass after filling it up with barrel
        System.out.println("PÄRAST TÄITMIST - Kogu kasti mass praegu (kg) " + kast.getCurrentMass());
        System.out.println("PÄRAST TÄITMIST - Kogu kasti hind praegu (eur) " + round(kast.getCurrentPrice()));

    }

    public static double round(double d) {
        return Math.round(d * 100.0) / 100.0;
    }
}
