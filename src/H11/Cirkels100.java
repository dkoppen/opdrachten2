package H11;

import java.awt.*;
import java.applet.*;


public class Cirkels100 extends Applet{

    public void init() {}

    public void paint(Graphics g) {
        int teller = 0;
        int y = 20;

        while(teller < 100) {
            y += 5;
            g.drawOval(20, 20, y, y);
            teller++;
        }

    }

}