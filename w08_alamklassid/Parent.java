public abstract class Parent {
    public String name = "default";
    public String dream;
    public int age = 10;

    public Parent(String name, String dream) {
        this.name = name;
        this.dream = dream;
    }

    public void firstThingIDo() {
        System.out.println("I brush my teeth");
    }

    public void myAgeIs() {
        System.out.println("My age is " + this.age);
    }

    public void favouriteHobbyIs(String hobby) {
        System.out.println(this.name + " favourite hobby is " + hobby);
    }

    public abstract void howISpendMyEvenings();

}