
public class Willow extends Tree {

    public Willow(String name, String family) {
        super(name, family);
    }

    @Override
    public void funFact() {
        super.funFact();
        System.out.println(
                "Compared to other wooden plants, willow has short life span. It can survive up to 30 years in the wild.");
    }
}
