package h042;

import java.awt.*;
import java.applet.*;

public class Driehoek extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawLine(10, 10, 300, 10);
        g.drawLine(10, 10, 150, 300);
        g.drawLine(150, 300, 300, 10);
    }
}