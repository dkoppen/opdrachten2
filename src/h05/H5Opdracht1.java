package h05;

import java.applet.Applet;
import java.awt.*;

public class H5Opdracht1 extends Applet {

    Color achtergrond;
    Color tekst;
    Color vulling;
    Color lijn;
    int hoogte1;
    int breedte1;
    int hoogte2;
    int breedte2;
    int lijn320;
    int lijn400;
    int lijn10;
    int lijn78;

    public void init() {
        super.init();
        achtergrond = new Color(255, 255, 255);
        tekst = new Color(0, 0, 0);
        lijn = new Color(0, 0, 0);
        vulling = new Color(255, 0, 255);
        hoogte1 = 50;
        breedte1 = 50;
        hoogte2 = 25;
        breedte2 = 40;
        lijn320 = 320;
        lijn400 = 400;
        lijn10 = 10;
        lijn78 = 78;
    }

    public void paint(Graphics g){
        super.paint(g);

        //LijnVariabelen
        g.drawLine(hoogte1, hoogte1, lijn320, hoogte1);
        g.setColor(lijn);
        g.drawString("Lijn",50,70);


        //Rechthoek
        g.drawRect(hoogte1, hoogte1 * 2, hoogte1 * 4, hoogte1 * 2);
        g.setColor(lijn);
        g.drawString("Rechthoek", hoogte1, lijn320 - hoogte1 * 2);

        //Afgeronde Rechthoek
        g.setColor(lijn);
        g.drawRoundRect(hoogte1, lijn320 - hoogte1 * 2 + breedte2 - 20, lijn320 - 20, hoogte1 * 2, breedte2 - 20, breedte2 - 20);
        g.drawString("Afgeronde Rechthoek", hoogte1, lijn320 + breedte2);

        //Gevulde Rechthoek met ovaal
        g.setColor(vulling);
        g.fillRect(lijn320 + breedte2 * 2, hoogte1 * 2, lijn320 + breedte2, hoogte1 * 2);
        g.setColor(lijn);
        g.drawOval(lijn320 + breedte2 * 2, hoogte1 * 2, lijn320 + breedte2, hoogte1 * 2);
        g.drawString("Gevulde Rechthoek met ovaal", 400, 220);

        //Gevulde Ovaal
        g.setColor(vulling);
        g.fillOval(lijn320 + breedte2 * 2, lijn320 - hoogte1 * 2 + breedte2 - 20, lijn320 + breedte2, hoogte1 * 2);
        g.setColor(lijn);
        g.drawString("Gevulde Ovaal",lijn400 + hoogte1, lijn320 + breedte2);

        //Taartpunt met ovaal eromheen
        g.setColor(Color.magenta);
        g.fillArc(lijn400 * 2 - lijn10, lijn78, lijn320 + breedte2, hoogte1, 0, lijn400 / 10);
        g.setColor(lijn);
        g.drawOval(lijn400 * 2, lijn78 - 8, lijn320 + breedte2, hoogte1 * 2);
        g.drawString("Taartpunt met ovaal eromheen", lijn400 * 2, hoogte1 * 4);

        //Cirkel
        g.drawOval(lijn400 * 2, lijn320 - hoogte1 * 2 - 10, lijn320 - hoogte1 * 3, lijn320 - hoogte1 * 3);
        g.drawString("Cirkel", lijn400 * 2, lijn400 - breedte2 + 20);
    }
}
