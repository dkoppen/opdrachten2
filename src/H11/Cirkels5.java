package H11;

import java.awt.*;
import java.applet.*;

public class Cirkels5 extends Applet{

    public void init() {}

    public void paint(Graphics g) {
        int teller = 0;
        int y = 20;
        int x = 60;

        while(teller < 5) {
            y += 5;
            x -= 10;
            g.drawOval(y, y, x, x);
            teller++;
        }

    }

}