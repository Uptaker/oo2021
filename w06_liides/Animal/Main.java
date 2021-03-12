public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        cat.attack(dog);
        cat.beSneaky(); // stealth mode
        cat.attack(dog); // stealth damage

        dog.beSneaky();
        dog.defend();
        cat.attack(dog); // dog defending, no damage
    }
}
