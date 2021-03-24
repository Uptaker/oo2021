import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        boolean isGameActive = true;

        while (isGameActive) {
            System.out.println("Please select a difficulty:");
            System.out.println("easy - 12 failed guesses, easy words");
            System.out.println("normal - 8 failed guesses, common words");
            System.out.println("hard - 3 failed guesses, difficult words");
            System.out.println("hardcore - 1 failed guess, insanely difficult");
            String input = sc.nextLine().toLowerCase();
            if (input.equals("easy")) {
                Difficulty game = new Easy();
                game.startGame(sc);
                game = null;
            } else if (input.equals("quit")) {
                System.out.println("You've quit the game.");
                isGameActive = false;
                sc.close();
            } else if (input.equals("normal")) {
                Difficulty game = new Normal();
                game.startGame(sc);
                game = null;
            } else if (input.equals("hard")) {
                Difficulty game = new Hard();
                game.startGame(sc);
                game = null;
            } else if (input.equals("hardcore")) {
                Difficulty game = new Hardcore();
                game.startGame(sc);
                game = null;
            } else {
                System.out.println("( ! ) Invalid command.");
            }

        }
    }
}
