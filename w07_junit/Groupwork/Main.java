import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        boolean isGameActive = true;

        while (isGameActive) {
            System.out.println("Please select a difficulty:");
            System.out.println("easy, normal, hard");
            String input = sc.nextLine().toLowerCase();
            if (input.equals("easy")) {

            } else if (input.equals("quit")) {
                System.out.println("You've quit the game.");
                isGameActive = false;
                sc.close();
            } else if (input.equals("normal")) {
                Difficulty game = new Normal();
                game.startGame(sc);
                game = null;
                input = "";
            } else if (input.equals("hard")) {

            } else {
                System.out.println("( ! ) Invalid command.");
            }

        }
    }
}
