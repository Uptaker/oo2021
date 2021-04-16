public class Child extends Parent {

    public Child(String name, String dream) {
        super(name, dream);
    }

    @Override
    public void firstThingIDo() {
        super.firstThingIDo();
        System.out.println("I get up to mischief");
    }

    @Override
    public void howISpendMyEvenings() {
        System.out.println("I run around");
    }

}
