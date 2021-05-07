package com.example;

public class Kast {
    public Joogipudel pudelid;
    public String kastityyp = "Joogikast";
    public double kastihind = 3; // eurodes
    public double kastimass = 3000; // grammides
    public int pesad = 24; // mitu pudelit mahub
    public int t2idetudpesad = 0;

    public Kast(Joogipudel pudelid) {
        this.pudelid = pudelid;
    }

    // get total price (if it was full)
    public double getTotalPrice() {
        return pudelid.getTotalPrice() * pesad + this.kastihind;
    }

    // get total price
    public double getCurrentPrice() {
        return pudelid.getTotalPrice() * t2idetudpesad + this.kastihind;
    }

    // get total mass (if it was full)
    public double getTotalMass() {
        return pudelid.getTotalMass() * pesad + (this.kastimass / 1000);
    }

    // get total mass
    public double getCurrentMass() {
        return pudelid.getTotalMass() * t2idetudpesad + (this.kastimass / 1000);
    }

    // fill crate from barrel as much as it can
    public void fillFromBarrel(Joogivaat joogivaat) {
        if (this.t2idetudpesad != this.pesad) {
            boolean empty = false;
            int count = 0;
            while (!empty) {
                if (joogivaat.kogus >= pudelid.getMaht() && this.t2idetudpesad != this.pesad) {
                    this.t2idetudpesad += 1;
                    joogivaat.kogus -= pudelid.getMaht();
                    count++;

                } else {
                    System.out.println(count + " pudelit oli täidetud kasti sisse! Joogivaadi sees jäi "
                            + joogivaat.kogus + " liitrit");
                    if (this.t2idetudpesad == this.pesad) {
                        System.out.println("Kast on nüüd täis!");
                    }
                    empty = true;
                }
            }
        } else {
            System.out.println("See kast on juba täis!");
        }
    }

}
