package h042;

import java.awt.*;
import java.applet.*;

public class Dobbelsteen extends Applet {

    public void init() {
    }
    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillRoundRect(50,50,100,100,20,20);
        g.setColor(Color.white);
        g.fillOval(70,70,10,10);
        g.fillOval(120,70,10,10);
        g.fillOval(70,120,10,10);
        g.fillOval(120,120,10,10);
    }
}