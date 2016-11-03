package H11;

import java.awt.*;
import java.applet.*;


public class Getallen extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int y = 0;

        for(teller = 0; teller < 10; teller++) {
            y += 20;
            g.drawString("" + teller, 50, y );

        }
    }
}



