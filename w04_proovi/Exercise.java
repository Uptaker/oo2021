import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Exercise {
    public static void main(String[] args) throws IOException {
        // Loete sisse numbrid failist ja arvutate summa
        // ja trükite summa uude faili
        File file = new File("numbers.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();
        int sum = 0;
        while (line != null) {
            sum = sum + Integer.parseInt(line);
            System.out.println(line);
            line = br.readLine();
        }
        br.close();
        fr.close();
        System.out.println(sum);

        // printing to new file
        PrintWriter pw = new PrintWriter("out_numbers");
        pw.println("Sum is: " + sum);
        pw.close();
    }
}
