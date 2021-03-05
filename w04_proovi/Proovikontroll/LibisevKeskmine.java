package Proovikontroll;

import java.util.ArrayList;
import java.util.List;

public class LibisevKeskmine {
    public static void main(String[] args) {
        double[] arr = { 111, 222, 333, 444, 555 };
        System.out.println("Keskmised: " + avg(arr));
    }

    public static List avg(double[] nums) {
        List<Double> result = new ArrayList<Double>();
        for (int i = 0; i < nums.length - 2; i++) {
            double avg = (nums[i] + nums[i + 1] + nums[i + 2]) / 3;
            result.add(avg);
        }
        return result;
    }
}

// Koosta funktsioon massiivi libiseva keskmise leidmiseks. Väljundiks on
// massiiv, mis on sisendist kahe elemendi võrra lühem ning mille iga elemendi
// väärtuseks on sisendmassiivi vastava elemendi ning selle järgmise ja
// ülejärgmise elemendi keskmine.
