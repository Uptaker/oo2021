
public class Main {
    public static void main(String[] args) {
        Willow w = new Willow("Willow", "Salicaceae");
        w.species = 400;
        Birch b = new Birch("Birch", "Betulaceae");

        // willow info
        w.treeInfo();
        w.getSpecies();
        w.funFact();

        System.out.println("");

        // birch info
        b.treeInfo();
        b.getSpecies();
        b.funFact();
    }
}
