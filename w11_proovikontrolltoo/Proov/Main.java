import java.util.List;

public class Main {
    public static void main(String[] args) {

        // create drink and bottle
        Jook alko1 = new Jook("Mingi alko", 0.7, 0.789);
        Joogipudel alko1pudel = new Joogipudel(2, "A", 600, 0.1, alko1);
        Joogivaat joogivaat = new Joogivaat(50, 20, alko1); // (total, currently)

        // get mass and total price
        System.out.println("Joogi summa (kg): " + alko1pudel.getTotalMass());
        System.out.println("Komplekti hind (eur): " + round(alko1pudel.getTotalPrice()));

        // fill bottle
        joogivaat.fillBottle(alko1pudel);

        List<Joogipudel> vaatTyhjendus = joogivaat.emptyAllToBottles(alko1pudel);
        System.out.println(vaatTyhjendus);

        // for (Joogipudel joogipudel : vaatTyhjendus) {
        // System.out.println(joogipudel);
        // }

    }

    public static double round(double d) {
        return Math.round(d * 100.0) / 100.0;
    }
}
