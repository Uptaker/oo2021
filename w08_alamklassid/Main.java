public class Main {

    public static void main(String[] args) {
        Child child = new Child("Mari", "developer");
        child.favouriteHobbyIs("dancing");
        child.firstThingIDo();
        Child2 child2 = new Child2("Mari", "developer", 22);
        child.myAgeIs();
        child2.myAgeIs();
    }

}
