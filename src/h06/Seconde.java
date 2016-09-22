package h06;

import java.applet.Applet;
import java.awt.*;

public class Seconde extends Applet {
    int a, b, c, d, uitkomst;
    int uitkomst2;
    int uitkomst3;


    public void init() {
        super.init();
        a = 60;
        b = 60;
        c = 24;
        d = 365;
        uitkomst = (a * b * c * d);
        uitkomst2 = (a * b * c);
        uitkomst3 = (a * b);
    }
    public void paint(Graphics g) {
        g.drawString("Seconde in jaar: " + uitkomst, 20, 20);
        g.drawString("Seconde in maand: " + uitkomst2, 20, 40);
        g.drawString("Seconde in dag: " + uitkomst3, 20, 60);
    }


}
