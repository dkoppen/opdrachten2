package H13;

import java.awt.*;
import java.applet.*;

/**
 * Created by Dennis on 25-11-2016.
 */

public class Opdracht3 extends Applet
{
    int y=0;
    public void init(){}
    public void paint(Graphics g)
    {
        for(int teller=0; teller <10; teller++)
        {
            for(int teller1=0; teller1<10; teller1++)
            {
                teken(g, teller*22+10*(teller1%2),teller1*12);
            }
        }
    }
    void teken (Graphics g, int x1, int y1)
    {
        g.setColor(Color.red);
        g.fillRect(x1, y1, 20,10);
    }
}