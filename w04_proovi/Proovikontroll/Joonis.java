package Proovikontroll;

import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;

public class Joonis {
    public static void main(String[] args) throws IOException {
        int width = 100;
        int height = 100;
        BufferedImage picture = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics g = picture.createGraphics();

        g.setColor(Color.WHITE);
        g.fillRect(0, 0, width, height);

        g.setColor(Color.BLACK);
        g.fillArc(0, 0, width, height, 0, 360);

        g.setColor(Color.YELLOW);
        g.drawArc(15, 15, 20, 5, 0, -180);
        g.fillOval(20, 20, 20, 20);
        g.fillOval(60, 20, 20, 20);
        g.fillOval(45, 40, 10, 10);
        g.drawArc(20, 60, 60, 30, 0, -180);

        ImageIO.write(picture, "png", new File("joonis.png"));
    }
}

// * Koosta joonis, kus täppidega on tähistatud failist loetud sisendmassiivi
// väärtused ning ühendatud joontena algse massiivi põhjalt arvutatud libiseva
// keskmise väärtused.
// WTF???