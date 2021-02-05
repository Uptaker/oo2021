public class second {
    public static void main(String[] args) {
        System.out.println(myName());
        System.out.println(add(5, 10));
        System.out.println(fullName("Markus", "Tammeoja"));
        myMath();
        myLogical();
        areStringsEqual();
    }

    public static String myName() {
        return "Markus";
    }

    public static int add(int number1, int number2) {
        return number1 + number2;
    }

    public static String fullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public static void myMath() {
        System.out.println(Math.pow(5, 2));

        int number = (int) Math.pow(2, 2);
        System.out.println(number);
    }

    public static void myLogical() {
        System.out.println(5 < 10 && 5 > 4);
    }

    public static void areStringsEqual() {
        String name1 = "Raimo";
        String name2 = "Raimo";
        System.out.println(name1 == name2);
        String newName1 = new String("Raimo"); // uus objekt
        String newName2 = new String("Raimo"); // new object
        System.out.println(newName1 == newName2);
        System.out.println(newName1.equals(newName2));
    }
}
// function add(number1, number2)