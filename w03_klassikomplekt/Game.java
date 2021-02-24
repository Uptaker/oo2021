import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        int width = 20;
        int height = 10;

        World world = new World(width, height);
        GameCharacter player = new GameCharacter("Markus", 2, 3, 'C', GameCharacterType.WIZARD);
        GameCharacter dummy = new GameCharacter("Dummy", 5, 6, 'D', GameCharacterType.WIZARD);
        GameCharacter witch = new GameCharacter("Witch", 8, 9, '?', GameCharacterType.WIZARD);

        ArrayList<GameCharacter> characters = new ArrayList<>();
        characters.add(player);
        characters.add(dummy);
        characters.add(witch);

        world.addCharacters(characters);
        world.render();
        System.out.println(player);

        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (!input.equals("end")) {
            input = scanner.nextLine().toLowerCase();

            if (input.equals("")) {
                player.move();
            } else if (input.equals("l")) {
                player.setDirection(Direction.LEFT);
            } else if (input.equals("r")) {
                player.setDirection(Direction.RIGHT);
            } else if (input.equals("u")) {
                player.setDirection(Direction.UP);
            } else if (input.equals("d")) {
                player.setDirection(Direction.DOWN);
            }
            if (player.x == witch.x && player.y == witch.y) {
                player.moveToRandom();

                dummy.isVisible = dummy.isVisible == true ? false : true;
                // if (dummy.isVisible) {
                // dummy.isVisible = false;
                // } else {
                // dummy.isVisible = true;
                // }

            }

            // player == witch =>
            // telepordib playeri suvalisse kohta (width, height piires)

            world.render();
            System.out.println(player);
        }
    }
}