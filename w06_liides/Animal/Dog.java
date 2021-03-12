public class Dog implements Animal {
    public int health = 50;
    public boolean sneaky = false;
    public boolean defending = false;

    @Override
    public String speak() {
        return "woof";
    }

    @Override
    public String eat() {
        this.health = this.health++;
        return "You ate a bone";
    }

    @Override
    public String beSneaky() {
        return "You're a dog, you can't be sneaky!";
    }

    @Override
    public String lookAround() {
        return "There's nothing interesting around you.";
    }

    @Override
    public String attack(Cat victim) {
        if (victim.defending == true) {
            System.out.println("Opponent was defending and took no damage!");
        } else {
            victim.health = victim.health - 2;
        }
        return "Opponent health: " + victim.health;
    }

    @Override
    public String defend() {
        this.defending = true;
        return "Defending!";
    }
}
