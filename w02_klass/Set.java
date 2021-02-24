
import java.util.HashSet;

public class Set {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<String>();
        names.add("Markus");
        names.add("Markus");
        names.add("Markus");
        names.add("Karl");
        names.add("Siim");
        names.add("Markus");
        names.remove("Karl");
        // NO DUPLICATESSSS
        System.out.println(names);
    }
}