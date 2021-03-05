import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;

public class OnlineRW {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(new URL("http://tlu.ee/~ray/lengths.txt").openStream()));

        PrintWriter pw = new PrintWriter(new FileWriter("answer.txt"));

        String line = br.readLine();
        String[] lineData = line.split(" ");
        System.out.println(line);
        System.out.println(sum(lineData));
        System.out.println(average(lineData));

        pw.println("Sum is: " + sum(lineData));
        pw.println("Average is: " + average(lineData));

        pw.close();
        br.close();
    }

    public static int sum(String[] input) {
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            sum = sum + Integer.parseInt(input[i]);
        }
        return sum;
    }

    public static double average(String[] input) {
        return sum(input) / input.length;
    }
}
