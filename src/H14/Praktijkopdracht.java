package H14;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.net.*;


public class Praktijkopdracht extends Applet {

    Button start, next;
    TextField nummer;
    int getal, spel = 23;
    boolean geklikt, gewonnen, verloren, game = true, winst, test = true;
    int hulp1, hulp2;
    Image boosplaatje, blijplaatje, normaalplaatje;
    URL pad;

    @Override
    public void init() {
        start = new Button("Reset");
        start.addActionListener(new Start());

        next = new Button("Ok");
        next.addActionListener(new Update());
        nummer = new TextField("", 5);
        nummer.addActionListener(new Update());
        add(start);
        add(nummer);
        add(next);

        pad = Praktijkopdracht.class.getResource("/resources/");
        boosplaatje = getImage(pad, "boossmiley.jpg");
        blijplaatje = getImage(pad, "blijsmiley.jpg");
        normaalplaatje = getImage(pad, "normaalsmiley.jpg");
    }

    public class Start implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            spel = 23;
            verloren = false;
            gewonnen = false;
            game = true;
            winst = false;
            test = true;
            repaint();
        }
    }

    public class Update implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            updateSpel();
        }
    }

    public void updateSpel() {

        int invoer = 0;

        if (test) {
            invoer = Integer.valueOf(nummer.getText());
        }   nummer.setText("");

        if (invoer > 0 && invoer < 4 && spel > 0 && spel >= invoer) {

            spel -= invoer;
            hulp2 = invoer;
            hulp1 = 69;

            geklikt = true;

            if (spel != 21 && spel > 20) {
                int hulp = spel - 21;
                spel -= hulp;
                winst = true;
            }

            else if (spel != 17 && spel > 16 && spel < 21) {
                int hulp = spel - 17;
                spel -= hulp;
                winst = true;
            }

            else if (spel != 13 && spel > 12 && spel < 17) {
                int hulp = spel - 13;
                spel -= hulp;
                winst = true;
            }

            else if (spel != 9 && spel > 8 && spel < 13) {
                int hulp = spel - 9;
                spel -= hulp;
            }

            else if (spel != 5 && spel > 4 && spel < 9) {
                int hulp = spel - 5;
                spel -= hulp;
                winst = true;
            }

            else if (spel != 1 && spel > 0 && spel < 5) {
                int hulp = spel - 1;
                spel -= hulp;
                winst = true;
            }

            else {
                int random = new Random().nextInt(3) + 1;
                spel -= random;
                getal = random;
                hulp1 = getal;  hulp2 = 69;
                repaint();
            }



            if (spel <=hulp2 &&  hulp1 ==69) {
                geklikt = false;
                game = false;
                gewonnen = false;
                verloren = true;
                test = false;
            }

            if (spel <= hulp1 &&  hulp2 ==69) {
                geklikt = false;
                game = false;
                gewonnen = true;
                verloren = false;
                test = false;
            }
        }
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        int x = 50;
        int y = 50;
        if (game) {
            if (geklikt) {
                g.drawString("De computer pakt: " + getal + " smilys", x, y);
                y += 25;
            }
            g.drawString("Aantal Smilys: " + spel, x, y);
        }

        int x2 = 50;
        int y2 = 35;

        for (int i = 0; i < spel; i++) {
            if (i % 4 == 0) {
                x2 = 50;
                y2 += 50;
            }
            if (winst) {
                g.drawImage(normaalplaatje, x2, y2, 40, 40, this);
            }
            else {
                g.drawImage(boosplaatje, x2, y2, 40, 40, this);
            }
            x2 += 50;
        }



        if (gewonnen) {
            g.drawString("You Won!", 50, 50);
            g.drawImage(blijplaatje, 50, 60, 300, 200, this);
        }



        if (verloren) {
            g.drawString("You Lost.!", 50, 50);
            g.drawImage(boosplaatje, 50, 60, 200, 200, this);
        }
    }
}
