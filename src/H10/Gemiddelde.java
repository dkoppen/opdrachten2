package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gemiddelde extends Applet {

    TextField tekstvak;
    Button knop;
    double totaal;
    int aantalcijfers;
    double invoer;
    double gemiddelde;
    boolean geklikt;
    String s;

    @Override
    public void init() {
        super.init();

        tekstvak = new TextField("",5);
        add (tekstvak);

        knop = new Button("ok");
        add(knop);
        KnopListner kl = new KnopListner();
        knop.addActionListener(kl);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        int x = 50;
        int y = 80;

        if (geklikt) {
            if (invoer < 5.5) {
                g.drawString("Het cijfer is onvoldoende ", x, y);
            } else {
                g.drawString("Het cijfer is voldoende ", x, y);
            }
            y = y + 20;
            g.drawString("Gemiddelde" + gemiddelde, x, y);
        }
    }

    class KnopListner implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            double invoer = Double.parseDouble(s);

            totaal = totaal + invoer;
            aantalcijfers++;

            gemiddelde = totaal / aantalcijfers;

            geklikt = true;


        }
    }


}
