import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Example {
    public static void main(String[] args) {

        Logger logger = Logger.getLogger(Example.class.getName());
        FileHandler fh;
        SimpleFormatter sf = new SimpleFormatter();

        try {
            fh = new FileHandler("mylog.txt");
            fh.setFormatter(sf);
            logger.addHandler(fh);
        } catch (Exception e) {
            System.out.println("I hope this doesn't happen");
            logger.warning(e.getMessage());
        }

        try {
            int divideByZero = 5 / 0;
        } catch (ArithmeticException e) {
            logger.warning(e.getMessage());
        }

        try {
            getArrayElement(3);
        } catch (Exception e) {
            logger.severe(e.getMessage());
        }

        System.out.println("Game is over, here");

    }

    public static int getArrayElement(int posi) {
        int[] intArray = new int[] { 1, 2, 3 };
        return intArray[posi];
    }
}
