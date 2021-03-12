public class Cat implements Animal {
    public int health = 25;
    public boolean sneaky = false;
    public boolean defending = false;

    @Override
    public String speak() {
        return "meow";
    }

    @Override
    public String eat() {
        this.health = this.health++;
        return "khajiit eat sweetroll";
    }

    @Override
    public String beSneaky() {
        this.sneaky = true;
        return "You're now sneaky!";
    }

    @Override
    public String lookAround() {
        this.health--;
        return "IS THAT A BOX?!?!?";
    }

    @Override
    public String defend() {
        this.defending = true;
        return "Defending!";
    }

    @Override
    public String attack(Cat victim) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String attack(Dog victim) {
        if (victim.defending == true) {
            System.out.println("Opponent was defending and took no damage!");
        } else if (this.sneaky) {
            victim.health = victim.health - 5;
            System.out.println("Sneak attack!");
            this.sneaky = false;
        } else {
            victim.health--;
        }
        return "Opponent health: " + victim.health;
    }
}
