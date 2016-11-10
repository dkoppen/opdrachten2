package H12;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Opdracht6 extends Applet{

    boolean geklikt, gevonden;
    int[] salaris = { 1, 1, 2, 2, 2, 2, 3, 4, 4, 4, 4, 4, 5, 5, 5 };
    int getal;
    int hoevaak;
    TextField tekstvak;
    Button knop;

    public void init() {

        tekstvak = new TextField("",5);
        add(tekstvak);

        knop = new Button("OK");
        add(knop);
        knop.addActionListener(new Knoplisterner());
    }

    class Knoplisterner implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String invoer = tekstvak.getText();
            getal = Integer.parseInt(invoer);
            gevonden = false;
            geklikt = true;
            hoevaak = 0;
            for (int i = 0; i < salaris.length; i++) {
                if (salaris[i] == getal) {
                    gevonden = true;
                    hoevaak++;
                }
            }
            repaint();
        }
    }

    public void paint(Graphics g) {

        if (geklikt) {
            if (gevonden == true) {
                g.drawString("De waarde komt " + hoevaak + " keer voor.", 20, 50);
            } else {
                g.drawString("De waarde is niet gevonden.", 20, 50);
            }
        }
    }

}