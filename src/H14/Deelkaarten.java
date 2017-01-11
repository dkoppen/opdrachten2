package H14;

import java.awt.*;
import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class Deelkaarten extends Applet {

    String[] soorten = {"harten", "klaver", "ruiten", "schoppen"};
    String[] getallen = {"aas", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien", "boer", "vrouw", "heer"};
    String[] deck = new String[52];

    String[] player1 = new String[13];
    String[] player2 = new String[13];
    String[] player3 = new String[13];
    String[] player4 = new String[13];

    Button knop;
    boolean geklikt;


    @Override
    public void init() {

        setSize(10,30);

        knop = new Button("kaarten delen");
        knop.addActionListener(new Deelknop());
        add(knop);
    }

    public String deeldeck () {
        int random = new Random().nextInt(deck.length);
        String kaart = deck[random];

        String[] deck2 = new String[deck.length - 1];
        int index = 0;

        for (int i = 0; i < deck.length; i++) {
            if (i != random) {
                deck2[index] = deck[i];
                index++;
            }
        }

        deck = deck2;

        return kaart;

    }

    class Deelknop implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            setSize(900, 550);
            geklikt = true;

            deck = new String[52];
            int index = 0;

            for (int i = 0; i < soorten.length; i++) {
                String kleur = soorten[i];

                for (int j = 0; j < getallen.length; j++) {
                    String kaart = getallen[j];
                    deck[index] = kleur + " " + kaart;
                    index++;
                }
            }


            for (int i = 0; i < 13; i++ ) {
                player1[i] = deeldeck();
                player2[i] = deeldeck();
                player3[i] = deeldeck();
                player4[i] = deeldeck();
            }

            repaint();
        }
    }

    @Override
    public void paint(Graphics g) {

        int x1 = 50;
        int x2 = 250;
        int x3 = 450;
        int x4 = 650;
        int y1 = 70;
        int y2 = 110;


        if (geklikt == true) {
            g.drawString("Player 1", x1, y1);
            g.drawString("Player 2", x2, y1);
            g.drawString("Player 3", x3, y1);
            g.drawString("Player 4", x4, y1);


            for (int i = 0; i < 13; i++) {
                g.drawString(player1[i], x1, y2);
                g.drawString(player2[i], x2, y2);
                g.drawString(player3[i], x3, y2);
                g.drawString(player4[i], x4, y2);
                y2 += 25;
            }
        }
    }
}