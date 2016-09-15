package h06;

import java.applet.Applet;
import java.awt.*;

public class Geld extends Applet {
    int a, b, c;
    double uitkomst;


    public void init() {
        a = 113;
        b = 4;
        c = 3;
        uitkomst = a/b;
    }

    public void paint(Graphics g) {
        g.drawString("Jan: " + uitkomst, 20, 20);
        g.drawString("Ali: " + uitkomst, 20, 40);
        g.drawString("Jeannette: " + uitkomst, 20, 60);
        g.drawString("ik: " + uitkomst, 20, 80);
    }
}
