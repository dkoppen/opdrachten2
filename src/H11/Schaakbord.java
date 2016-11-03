package H11;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Dennis on 2-11-2016.
 */
public class Schaakbord extends Applet {

    private int marge;
    private int breedteveld;
    private int hoogteveld;
    private Color wit;
    private Color zwart;
    private Color achtergrond;


    public void init() {
        wit = Color.white;
        zwart = Color.black;
        achtergrond = Color.LIGHT_GRAY;
        marge = 60;
        breedteveld = 40;
        hoogteveld = breedteveld;

        int breedtescherm = breedteveld;
        int hoogtescherm  = hoogteveld;
        setSize(breedtescherm, hoogtescherm);
        setBackground(achtergrond);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        for (int rij = 0; rij < 8; rij++) {

            int y = marge + (hoogteveld * rij);

            for (int kolom = 0; kolom < 8; kolom++) {

                int x = marge + (breedteveld * kolom);

                if ((rij + kolom) % 2 == 0) {
                    g.setColor(zwart);
                } else {
                    g.setColor(wit);
                }

                g.fillRect(x, y, breedteveld, hoogteveld);


            }

        }

    }

}


