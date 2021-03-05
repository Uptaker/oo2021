import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;

public class MyHouse {
    public static void main(String[] args) throws IOException {
        int width = 100;
        int height = 100;

        BufferedImage picture = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics g = picture.createGraphics();

        g.setColor(Color.WHITE);
        g.fillRect(0, 0, width, height);

        g.setColor(Color.BLACK);
        g.drawString("My house", 20, 20);
        g.setColor(Color.BLUE);
        g.fillRect(30, 60, 50, 50); // house body
        g.drawLine(60, 50, 30, 30); //
        g.drawLine(30, 60, 60, 50);

        ImageIO.write(picture, "png", new File("house.png"));
    }
}
