import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Dennis on 12-10-2016.
 */
public class Toets extends Applet {

    Label label;
    Button knop;
    TextField tekstvak;
    double invoer;
    double tijdInLondon;
    double tijdInTokyo;
    double tijdInNewyork;
    double tijdInSydney;
    double invoergetal;
    boolean geklikt;
    String s;


    @Override
    public void init() {
        super.init();

        tekstvak = new TextField("", 20);


        knop = new Button("Toon Tijden");
        KnopListener kl = new KnopListener();
        knop.addActionListener(kl);

        label = new Label("Voer een uur in");

        add(label);
        add(tekstvak);
        add(knop);
        s = "";


    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        int x = 40;
        int y = 80;
        if (invoer >= 0 && invoer < 24) {
            g.drawString("Tijd in London: " + tijdInLondon + ":00 uur", x, y);
            y = y + 20;
            g.drawString("Tijd in Tokyo: " + tijdInTokyo + ":00 uur", x, y);
            y = y + 20;
            g.drawString("Tijd in New York: " + tijdInNewyork + ":00 uur", x, y);
            y = y + 20;
            g.drawString("Tijd in Sydney: " + tijdInSydney + ":00 uur", x, y);
            y = y + 20;
        } else {
            if (geklikt) {
                g.drawString("Ongeldige Invoer", x, y);
            }
        }
    }


    class KnopListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            double invoer = Double.parseDouble(s);

            tijdInLondon = invoer + invoergetal - 1;
            tijdInTokyo = invoer + invoergetal + 7;
            tijdInNewyork = invoer + invoergetal - 6;
            tijdInSydney = invoer + invoergetal + 9;
            geklikt = true;

            repaint();

        }
    }
}

