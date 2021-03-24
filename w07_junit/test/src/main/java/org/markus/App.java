package org.markus;

/**
 * Hello world!
 *
 */
public class App {
    public String name;

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public String getName() {
        return name;
    }

    public int sum(int x, int y) {
        return x + y;
    }

    public int[] toArray(int... args) {
        int length = args.length;
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = args[i];
        }
        return arr;
    }
}
