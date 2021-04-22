import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.ArrayList;

public class Homework {

    public static void main(String[] args) {
        ArrayList<Integer> ages = getAges();
        System.out.println(ages);

        // int[] ints = ages.stream().mapToInt(i -> i).toArray();
        // convert from ArrayList to int[] to be able to use IntStream
        // uus - mapToInt()

        // Will they run in the same order?
        new Thread(getAmount(ages)).start();
        new Thread(getUnder18(ages)).start();
        new Thread(getOver18(ages)).start();
        new Thread(getPensionEligible(ages)).start();
        new Thread(getAverageAge(ages)).start();
        new Thread(getOver100(ages)).start();

    }

    public static ArrayList<Integer> getAges() {
        ArrayList<Integer> ages = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File("data.txt"))) {
            while (scanner.hasNextLine()) {
                ages.add(Integer.parseInt(scanner.nextLine()));
            }
            return ages;
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            return ages;
        }
    }

    public static Runnable getAmount(ArrayList<Integer> ages) {
        return () -> {
            // how many people are in this file
            System.out.println("Number of people: " + ages.stream().count());
        };
    }

    public static Runnable getUnder18(ArrayList<Integer> ages) {
        return () -> {
            // how many of them are under 18
            System.out.println("Under 18: " + ages.stream().filter(e -> e < 18).count());
        };
    }

    public static Runnable getOver18(ArrayList<Integer> ages) {
        return () -> {
            // how many of them are over 18
            System.out.println("Over 18: " + ages.stream().filter(e -> e > 18).count());
        };
    }

    public static Runnable getPensionEligible(ArrayList<Integer> ages) {
        return () -> {
            // how many of them can apply for a pension
            System.out.println("Eligible for pension: " + ages.stream().filter(e -> e >= 65).count());
        };
    }

    public static Runnable getAverageAge(ArrayList<Integer> ages) {
        return () -> {
            int[] ints = ages.stream().mapToInt(i -> i).toArray();
            // average age
            System.out.println("Average age: " + IntStream.of(ints).average().getAsDouble());
        };
    }

    public static Runnable getOver100(ArrayList<Integer> ages) {
        return () -> {
            int[] ints = ages.stream().mapToInt(i -> i).toArray();
            // anybody 100+?
            System.out.println("Anybody 100 or over: " + IntStream.of(ints).anyMatch(e -> e >= 100));
        };
    }

}