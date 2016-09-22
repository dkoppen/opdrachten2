package h042;

import java.applet.Applet;
import java.awt.*;

public class Stoplicht extends Applet
{

    public void paint( Graphics g )
    {
        g.setColor(Color.gray);
        g.fillRect(200,100,50,150);
        g.setColor(Color.red);
        g.fillOval(200,100,50,50);
        g.setColor(Color.orange);
        g.fillOval(200,150,50,50);
        g.setColor(Color.green);
        g.fillOval(200,200,50,50);

    }
}