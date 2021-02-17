import java.util.HashMap;

// MAKE THIS WORK WITH Map.java
public class LangDefinitions {
    private HashMap h = null;
}

    public static void addLang(String name, String def) {
        h.put(name, def);
    }

public static String getDef(String name) {
    return h.get(name);
}
