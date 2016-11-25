package H13;

import java.applet.*;
import java.awt.*;

/**
 * Created by Dennis on 25-11-2016.
 */

public class Pratijk extends Applet
{
    public void init()
    {
        setSize(1000,800);
    }
    public void paint(Graphics g)
    {
        for(int teller=0; teller <10; teller++)
        {
            for(int teller1=0; teller1<3; teller1++)
            {
                tekenboom(g, teller*80+20*(teller1%2),(teller1+5)*40);
            }
        }
    }
    void tekenboom(Graphics g,int x,int y)
    {
        g.setColor(new Color(51,25,0));
        g.fillRect(x, y, 20, 40);
        g.setColor(Color.green);
        g.fillOval(x-20, y-30, 60, 40);
    }
}