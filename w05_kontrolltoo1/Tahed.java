import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Tahed {
    public static void main(String[] args) throws IOException {
        File file = new File("andmed.txt");
        ArrayList<String> words = new ArrayList<String>();
        words.addAll(fileToArray(file));
        System.out.println("A tähte on kokku: " + checkTotal(words));
        checkStats(words);
        showTable(words, longestLength(words));

    }

    public static ArrayList<String> fileToArray(File file) throws IOException {
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        ArrayList<String> array = new ArrayList<String>();
        while (line != null) {
            array.add(line);
            line = br.readLine();
        }
        fr.close();
        br.close();
        return array;
    }

    // * Loe programmi abil kokku, kui palju on tekstifailis a-tähti (nii suuri kui
    // väikeseid)
    public static int checkTotal(ArrayList<String> array) {
        int count = 0;
        for (int i = 0; i < array.size(); i++) {
            String word = array.get(i);
            if (word.contains("a") || word.contains("A")) {
                for (int j = 0; j < word.length(); j++) {
                    if (word.toLowerCase().charAt(j) == 'a') {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    // * Leia, kui palju oli a-tähti igas sõnas, sõnades keskmiselt, suhtarvuna
    // tähtede üldarvu
    public static void checkStats(ArrayList<String> array) {
        double sum = 0;
        double letterCount = 0;
        double wordLettersWithA = 0;
        for (int i = 0; i < array.size(); i++) {
            String word = array.get(i);
            if (word.contains("a") || word.contains("A")) {
                int count = 0;
                for (int j = 0; j < word.length(); j++) {
                    if (word.toLowerCase().charAt(j) == 'a') {
                        count++;
                        sum++;
                    }
                }
                System.out.println(word + " - " + count + " A tähte");
                for (int j = 0; j < word.length(); j++) {
                    wordLettersWithA++;
                }
            }
            for (int j = 0; j < word.length(); j++) {
                letterCount++;
            }
        }
        System.out.println("Tähtede üldarv: " + letterCount);
        System.out.println("Tähtede üldarv sõnadel, kus esines A-tähti: " + wordLettersWithA);
        System.out.println("Sõnad, kus esines A-tähti % A-de osakaal:" + sum / wordLettersWithA * 100 + "%");
        System.out.println("Kõikide sõnadega % A-de osakaal: " + sum / letterCount * 100 + "%");
    }

    // * Loe kokku, mitu sõna oli ühe, kahe, kolme jne a-tähega. Koosta tabel, kus
    // ridadeks tähtede arv sõnas ning veergudeks a-tähtede arv. Lahtris näidatakse,
    // mitu vastavat sõna oli tekstis.
    public static void showTable(ArrayList<String> array, int biggest) {
        int[] stats = new int[biggest + 1];
        for (int i = 0; i < array.size(); i++) {
            String word = array.get(i);
            if (word.contains("a") || word.contains("A")) {
                int count = 0;
                for (int j = 0; j < word.length(); j++) {
                    if (word.toLowerCase().charAt(j) == 'a') {
                        count++;
                    }
                }
                stats[count] = stats[count] + 1;
            } else {
                stats[0] = stats[0] + 1;
            }
        }
        System.out.println("# | Sõnade arv, kus esineb # kogus A-tähti");
        for (int i = 0; i < biggest + 1; i++) {
            System.out.println(i + " | " + stats[i]);
        }
    }

    public static int longestLength(ArrayList<String> array) {
        int biggest = 0;
        // find one with longest amount of letter A's
        for (int i = 0; i < array.size(); i++) {
            String word = array.get(i);
            if (word.contains("a") || word.contains("A")) {
                int count = 0;
                for (int j = 0; j < word.length(); j++) {
                    if (word.toLowerCase().charAt(j) == 'a') {
                        count++;
                        if (count > biggest) {
                            biggest = count;
                        }
                    }
                }
            }
        }
        return biggest;
    }

}

// * Loe programmi abil kokku, kui palju on tekstifailis a-tähti (nii suuri kui
// väikeseid)
// * Leia, kui palju oli a-tähti igas sõnas, sõnades keskmiselt, suhtarvuna
// tähtede üldarvu
// * Loe kokku, mitu sõna oli ühe, kahe, kolme jne a-tähega. Koosta tabel, kus
// ridadeks tähtede arv sõnas ning veergudeks a-tähtede arv. Lahtris näidatakse,
// mitu vastavat sõna oli tekstis.
