package h06;

import java.applet.Applet;
import java.awt.*;

public class Seconde extends Applet {
    int a, b, c, d, uitkomst;


    public void init() {
        super.init();
        a = 60;
        b = 60;
        c = 24;
        d = 365;
        uitkomst = (a * b * c * d);
    }
    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
    }


}
