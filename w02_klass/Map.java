import java.util.Map;
import java.util.HashMap;

// MAKE THIS WORK WITH LangDefinitions.java
public class Map {
    static HashMap<String, String> languages = new HashMap<String, String>();

    public static void main(String[] args) {

        addLang("java", "A different word for coffee.");
        addLang("javascript", "A set of instructions on how to use a device for the purposes of brewing coffee.");
        addLang("python", "A very large and thick snake");
        addLang("bash", "to insult something");
        addLang("c++", "Easiest known language");
        addLang("c#", "A musical note in the 12 tone scale most commonly expressed in the key of C# minor.");
        addLang("c", "Is a letter.");
        addLang("perl", "Has contests held to see who can make the most unreadable code.");

        // user input
        getDef("java");
    }

    public static void addLang(String name, String def) {
        languages.put(name, def);
    }

    public static String getDef(String name) {
        return languages.get(name);
    }
}
