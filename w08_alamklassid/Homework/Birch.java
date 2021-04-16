
public class Birch extends Tree {

    public Birch(String name, String family) {
        super(name, family);
    }

    @Override
    public void funFact() {
        super.funFact();
        System.out.println("Birch has shallow root system which can damage sidewalks and roads in urban areas.");
    }
}
