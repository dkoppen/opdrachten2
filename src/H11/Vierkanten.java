package H11;

import java.awt.*;
import java.applet.*;


public class Vierkanten extends Applet{

    public void init() {}

    public void paint(Graphics g) {
        int teller = 0;
        int y = 0;

        while(teller < 5) {
            y += 20;
            g.drawRect(y, y, 20, 20);
            teller++;
        }


    }
}