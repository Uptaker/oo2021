import java.io.IOException;
import java.util.Scanner;

public interface Difficulty {

    public void pickWord() throws IOException;

    public void result(int integer);

    public void startGame(Scanner sc) throws IOException;

    public String hiddenWord();

    public String printAttemptedLetters(String input);

    public String revealWord(String input);
}