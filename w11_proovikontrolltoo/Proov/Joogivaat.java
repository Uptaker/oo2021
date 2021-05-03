import java.util.ArrayList;
import java.util.List;

public class Joogivaat {
    public double ruumala; // kogu ruumala liitrites
    public double kogus; // olemasolev kogus liitrites
    public Jook jook;

    public Joogivaat(double ruumala, double kogus, Jook jook) {
        this.ruumala = ruumala;
        this.kogus = kogus;
        this.jook = jook;
    }

    public void fillBottle(Joogipudel pudel) {
        if (pudel.isT2idetud()) {
            System.out.println("See pudel on juba täidetud!");
        } else {
            if (this.kogus >= pudel.getMaht()) {
                this.kogus = this.kogus - pudel.getMaht();
                pudel.setT2idetud(true);
                System.out.println("Valati " + pudel.getMaht() + " liitrit jooki. Alles on " + this.kogus + " liitrit");
            } else {
                System.out.println("Vaati sees ei ole piisavalt jooki, et pudeli täita!");
            }
        }
    }

    public List<Joogipudel> emptyAllToBottles(Joogipudel template) {
        boolean filled = false;
        List<Joogipudel> pudelid = new ArrayList<Joogipudel>();
        while (filled == false) {
            if (this.kogus >= template.getMaht()) {
                Joogipudel p = new Joogipudel(template.maht, template.tyyp, template.mass, template.taaraHind,
                        this.jook);
                p.setT2idetud(true);
                this.kogus = this.kogus - template.getMaht();
                pudelid.add(p);
            } else {
                filled = true;
            }
        }
        System.out.println("Pudelid täidetud!");
        return pudelid;
    }
}
