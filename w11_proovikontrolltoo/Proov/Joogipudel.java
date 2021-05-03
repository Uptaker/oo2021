public class Joogipudel {
    public double maht; // volume, liters?
    public String tyyp; // bottle type
    public double mass; // grams
    public double taaraHind;
    public Jook jook;
    public boolean t2idetud = false;

    public Joogipudel(double maht, String tyyp, double mass, double taaraHind, Jook jook) {
        this.maht = maht;
        this.tyyp = tyyp;
        this.mass = mass;
        this.taaraHind = taaraHind;
        this.jook = jook;
    }

    public double getTotalMass() { // mass koos joogiga.. idk kas õige
        return (this.mass + (this.maht * jook.erikaal * 1000)) / 1000;
    }

    public double getTotalPrice() { // jook + taara hind? (omahind)
        return this.getTotalMass() * jook.liitriHind;
    }

    public double getMaht() {
        return this.maht;
    }

    public void setMaht(double maht) {
        this.maht = maht;
    }

    public boolean isT2idetud() {
        return this.t2idetud;
    }

    public void setT2idetud(boolean t2idetud) {
        this.t2idetud = t2idetud;
    }

}
