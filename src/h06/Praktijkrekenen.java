package h06;

import java.awt.*;
import java.applet.*;

/**
 * Created by Dennis on 14-9-2016.
 */

public class Praktijkrekenen extends Applet {
    double a, b, c, d, e , f, finaleuitkomst;
    int uitkomst1;

    public void init() {
        super.init();
        a = 5.9;
        b = 6.3;
        c = 6.9;
        d=3;
        e=10;
        f=2;
        uitkomst1 = (int) ((a + b+ c) / d*e);
        finaleuitkomst=(double) uitkomst1 / e;

    }
    public void paint(Graphics g) {
        g.drawString("De eerste stap is: " + uitkomst1, 20, 20);
        g.drawString("het antwoord is: " + finaleuitkomst, 30, 40);


    }


}


