public class StringLetterCapitalizer {
    public static void main(String[] args) {
        String example = "I want to speak to your manager";
        System.out.println(letterCapitalizer(example));
    }

    public static char[] letterCapitalizer(String string) {
        char[] copy = new char[string.length()];
        for (int i = 0; i < string.length(); i++) {
            int rand = (int) Math.floor(Math.random() * 11);
            copy[i] = string.charAt(i);
            if (rand > 5) {
                copy[i] = Character.toUpperCase(copy[i]);
            } else {
                copy[i] = Character.toLowerCase(copy[i]);
            }
        }
        return copy;
    }
}
// 3) Olemasolevast stringist luua uus string, kus muudad suvaliselt
// olemasolevad tähed kas suureks või väikseks