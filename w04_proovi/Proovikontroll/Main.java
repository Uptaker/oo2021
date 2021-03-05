package Proovikontroll;

public class Main {
    public static void main(String[] args) {
        int[] eksemplar1x = { 1, 2, 3, 4, 5 };
        int[] eksemplar1y = { 2, 2, 2, 4, 4 };

        Hulknurk eksemplar1 = new Hulknurk(eksemplar1x, eksemplar1y);

        int[] eksemplar2x = { 5, 4, 3, 2, 1 };
        int[] eksemplar2y = { 4, 4, 3, 2, 4 };
        Hulknurk eksemplar2 = new Hulknurk(eksemplar2x, eksemplar2y);

        System.out.println(eksemplar1);
        System.out.println(eksemplar2);
    }
}
