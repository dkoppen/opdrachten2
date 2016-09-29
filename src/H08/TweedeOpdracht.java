package H08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TweedeOpdracht extends Applet {

    Button man;
    Button vrouw;
    Button lman;
    Button lvrouw;
    int f;
    int j;
    int h;
    int i;
    int z;

    public void init() {
        setLayout(new FlowLayout());

        man = new Button("mannen");
        KnopListener kl = new KnopListener();
        man.addActionListener(kl);
        add(man);

        vrouw = new Button("vrouwen");
        KnopListener1 ht = new KnopListener1();
        vrouw.addActionListener(ht);
        add(vrouw);

        lman = new Button("leerlingen mannen");
        KnopListener2 rs = new KnopListener2();
        lman.addActionListener(rs);
        add(lman);

        lvrouw = new Button("leerlingen vrouwen");
        KnopListener3 az = new KnopListener3();
        lvrouw.addActionListener(az);
        add(lvrouw);

        f = 0;
        j = 0;
        h = 0;
        i = 0;
        z = 0;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("mannen : " + f, 100, 40);
        g.drawString("vrouwen : " + j, 100, 55);
        g.drawString("leerlingen mannen : " + h, 100, 70);
        g.drawString("leelingen vrouwen : " + i, 100, 85);
        g.drawString("totaal = " + z, 100, 100);

    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            f = f + 1;
            z = z + 1;
            repaint();
        }
    }

    class KnopListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            j = j + 1;
            z = z + 1;
            repaint();
        }
    }

    class KnopListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            h = h + 1;
            z = z + 1;
            repaint();
        }
    }

    class KnopListener3 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            i = i + 1;
            z = z + 1;
            repaint();
        }
    }
}


