package h042;

import java.awt.*;
import java.applet.*;

public class Huis extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setColor(Color.white);
        g.drawRect(200, 200, 200, 200);
        g.drawRect(250, 250, 40, 40);
        g.drawRect(300, 300, 50, 100);
        g.drawLine(200, 200, 300, 100);
        g.drawLine(400, 200, 300, 100);
    }

}