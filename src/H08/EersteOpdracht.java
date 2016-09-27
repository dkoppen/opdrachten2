package H08;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EersteOpdracht extends Applet {

    TextField tekstvak;
    Label label;
    Button knop;
    Button knop2;
    String s;


    public void init() {
        tekstvak = new TextField("", 30);
        tekstvak.addActionListener(new TekstvakListener());

        knop = new Button("Ok");
        KnopListener kl = new KnopListener();
        knop.addActionListener(kl);

        knop2 = new Button("Reset");
        KnopListener1 rs = new KnopListener1();
        knop2.addActionListener(rs);

        label = new Label("Type iets " +
                "en druk op enter " + "klik op Ok");
        add(label);
        add(tekstvak);
        add(knop);
        add(knop2);

        s = "";
    }

    public void paint(Graphics g) {
        g.drawString(s, 40, 100);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();

            repaint();

        }
    }

    class KnopListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = "";
            repaint();
        }
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            repaint();
        }
    }
}

