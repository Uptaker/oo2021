import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileReadWrite {
    public static void main(String[] args) throws IOException {
        File fileWrite = new File("out_dummy1.txt");
        File file = new File("dummy1.txt");
        System.out.println(file.getName() + "\n" + file.isFile() + "\n" + file.isDirectory() + "\n" + file.isHidden()
                + "\n" + file.isDirectory() + "\n");

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();
        while (line != null) {
            String[] lineData = line.split(",");

            System.out.println(lineData[0] + " | " + lineData[lineData.length - 1]);
            line = br.readLine();
        }
        fr.close();
        br.close();

        if (!fileWrite.exists()) {
            fileWrite.createNewFile();
        }

        PrintWriter pw = new PrintWriter(fileWrite);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String line2 = scanner.nextLine();
            String[] lineData = line2.split(",");
            pw.println("Number is " + lineData[0] + " and name is " + lineData[1] + " and lang is " + lineData[2]
                    + " and year is " + lineData[3]);
        }
        scanner.close();
        pw.close();
    }
}