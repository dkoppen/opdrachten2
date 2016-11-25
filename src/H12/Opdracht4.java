package H12;

import java.awt.*;
import java.applet.*;


public class Opdracht4 extends Applet{

    boolean gevonden;
    double[] inkomen = { 1.0, 5.5, 10.2, 12.5, 15.6 };
    double zoek;

    public void init() {
        zoek = 12.5;
        gevonden = false;
        int getal = 0;
        while(getal < inkomen.length) {
            if(inkomen[getal] == zoek) {
                gevonden = true;
            }
            getal ++;
        }
    }

    public void paint(Graphics g) {
        if(gevonden == true) {
            g.drawString("De waarde is gevonden.", 30, 50);
        }
        else {
            g.drawString("De waarde is niet gevonden.", 30, 50);
        }
    }

}