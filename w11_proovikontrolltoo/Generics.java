import java.util.List;

public class Generics {

    public static <T> T getFirst(List<T> list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.print("objekt: " + obj + " ");
        }
        System.out.println();
    }

    public static double sumOfList(List<? extends Number> list) {
        double sum = 0.0;
        for (Number number : list) {
            sum += number.doubleValue();
        }
        return sum;
    }

    public static void lowerBound(List<? super Integer> list) {
        for (Object obj : list) {
            System.out.print("obj: " + obj + " ");
        }
        System.out.println();
    }

    public static <T> String getType(T type) {
        return type.getClass().getSimpleName();
    }

    public static <E> void printArray(E[] elements) {
        for (E element : elements) {
            System.out.print("elem " + element + " ");
        }
        System.out.println();
    }

}
