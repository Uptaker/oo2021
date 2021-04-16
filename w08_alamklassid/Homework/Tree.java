
public abstract class Tree {
    public String name = "none";
    public String family = "none";
    public int species = 0;

    public Tree(String name, String family) {
        this.family = family;
        this.name = name;
    }

    public void treeInfo() {
        System.out.println("I am a " + this.name + " from the " + this.family + " family");
    }

    public void getSpecies() {
        if (this.species == 0) {
            System.out.println("There's no data concerning the amount of species for " + this.name);
        } else {
            System.out.println(this.name + " has " + this.species + " species.");
        }
    }

    public void funFact() {
        System.out.println(this.name + " tree FACT:");
    }
}
