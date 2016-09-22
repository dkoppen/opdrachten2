package h042;

import java.awt.*;
import java.applet.*;

public class Ovaal extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.fillOval(20, 20, 50, 100);
    }
}