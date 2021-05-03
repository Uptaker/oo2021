import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("one", "two", "three");
        List<Integer> integers = Arrays.asList(1, 2, 3);
        List<Long> longs = new ArrayList<>();
        longs.add(10L);
        List<Character> characters = Arrays.asList('a', 'b', 'c');
        List<Double> doubles = Arrays.asList(1.0, 2.0, 3.0);
        List<String> emptyStrings = new ArrayList<>();

        System.out.println(
                Generics.getFirst(strings) + " " + Generics.getFirst(integers) + " " + Generics.getFirst(characters)
                        + " " + Generics.getFirst(doubles) + " " + Generics.getFirst(emptyStrings));

        Generics.printList(strings);

        System.out.println("Sum of integers is " + Generics.sumOfList(integers));

        Generics.lowerBound(integers);

        SimplePair<Integer, String> pair = new SimplePair<>(5, "Markus");

        System.out.println(pair.getKey() + " : " + pair.getValue());

        SimplePair<Integer, SimplePair<Integer, String>> pair2 = new SimplePair<>(1, new SimplePair<>(2, "Nested"));

        System.out.println(pair2.getKey() + "\n\t" + pair2.getValue().getKey() + ": " + pair2.getValue().getValue());

        System.out.println(Generics.getType(1) + " " + Generics.getType("markus") + " " + Generics.getType(3.54) + " "
                + Generics.getType(integers) + " " + Generics.getType(true) + " " + Generics.getType('c') + " "
                + Generics.getType(10L) + " " + Generics.getType(pair));
    }

    String[] stringArray = { "Hello", "this", "world" };
    Integer[] intArray = { 1, 2, 3, 4, 5 };

    // Generics.printArray(stringArray);
    // Generics.printArray(intArray);

    SimpleGenerics<String> sg = new SimpleGenerics<>();
    // sg.set("Markus");

}