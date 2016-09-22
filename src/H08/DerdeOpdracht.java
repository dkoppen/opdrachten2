package H08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class DerdeOpdracht extends Applet {
    TextField tekstvak;
    Label label;
    Button okknop;
    String s;


    public void init() {
        tekstvak = new TextField("", 30);
        tekstvak.addActionListener(new TekstvakListener());

        okknop = new Button("ok");
        KnopListener kl = new KnopListener();
        okknop.addActionListener(kl);

        label = new Label("Type hier uw bedrag");

        add(label);
        add(tekstvak);
        add(okknop);

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
    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            repaint();
        }
    }


}
