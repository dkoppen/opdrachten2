package H12;

import java.awt.*;
import java.applet.*;


public class Opdracht1 extends Applet{

    double inkomen[], totaal, gemiddelde;


    public void init() {
        inkomen = new double [10];

        for (int teller = 0; teller < inkomen.length; teller ++) {
            inkomen[teller] = 50 * teller + 50;
            totaal += inkomen[teller];
        }
    }

    public void paint(Graphics g) {
        gemiddelde = totaal / inkomen.length;
        g.drawString("Gemiddelde = " + gemiddelde, 50, 30);

    }
}