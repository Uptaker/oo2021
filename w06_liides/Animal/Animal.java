public interface Animal {
    // public int health;
    // public boolean sneaky;
    // public boolean defending;

    public String speak();

    public String eat();

    public String beSneaky();

    public String lookAround();

    public String attack(Dog victim);

    public String attack(Cat victim);

    public String defend();
}