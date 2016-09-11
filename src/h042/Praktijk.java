package h042;

import java.applet.Applet;
import java.awt.*;

public class Praktijk extends Applet {

    public void init() {
    }


    public void paint(Graphics g)
    {
        //Lijn
        g.setColor(Color.black);
        g.drawLine(50, 50, 320, 50);
        g.drawString("Lijn",50,70);

        //Rechthoek
        g.setColor(Color.black);
        g.drawRect(50, 100, 200, 100);
        g.drawString("Rechthoek",50,220);

        //Afgeronde Rechthoek
        g.setColor(Color.black);
        g.drawRoundRect(50,240,360,100,20,20);
        g.drawString("Afgeronde Rechthoek", 50, 360);

        //Gevulde Rechthoek met ovaal
        g.setColor(Color.magenta);
        g.fillRect(50, 390, 360, 100);
        g.setColor(Color.black);
        g.drawOval(50, 390, 360, 100);
        g.drawString("Gevulde Rechthoek met ovaal", 50, 510);

        //Gevulde Ovaal
        g.setColor(Color.magenta);
        g.fillOval(50, 520, 360, 100);
        g.setColor(Color.black);
        g.drawString("Gevulde Ovaal", 50, 640);

        //Taartpunt met ovaal eromheen
        g.setColor(Color.magenta);
        g.fillArc(38, 686, 360, 50, 0, 45);
        g.setColor(Color.black);
        g.drawOval(50, 680, 360, 100);
        g.drawString("Taartpunt met ovaal eromheen", 50,790);

        //Cirkel
        g.drawOval(70,820,120,120);
        g.drawString("Cirkel", 50, 930);

    }
}