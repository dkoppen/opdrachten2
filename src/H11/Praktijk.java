package H11;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Gebruiker on 26-10-2016.
 * Af
 */
public class Praktijk extends Applet{

    TextField tekstvak;
    Button knop;
    int invoergetal;
    boolean geklikt;

    public void init() {

        tekstvak = new TextField( 5 );
        knop = new Button( "Ok" );
        knop.addActionListener( new knopListener() );

        add(tekstvak);
        add(knop);
    }

    class knopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {

            String invoer = tekstvak.getText();
            invoergetal = Integer.parseInt( invoer );

            geklikt = true;

            repaint();
        }
    }

    public void paint(Graphics g) {
        int teller;
        int totaal = 0;
        int y = 30;

        if (geklikt) {
            for (teller= 1; teller <= 10; teller++) {
                y += 20;
                totaal = teller * invoergetal;
                g.drawString(teller + " x " + invoergetal + " = "+ totaal, 100, y );
            }
        }
    }
}