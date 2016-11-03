import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Toets extends Applet {

    private Label label;
    private Button knop;
    private TextField tekstvak;
    private int invoer;
    private int tijdInLondon;
    private int tijdInTokyo;
    private int tijdInNewyork;
    private int tijdInSydney;
    private int invoergetal;
    private boolean geklikt;
    private String s;


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

        if (geklikt) {
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
                g.drawString("Ongeldige Invoer", x, y);
            }
        }
    }


    private class KnopListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            invoer = Integer.parseInt(s);

            tijdInLondon = invoer - 1;
            if (tijdInLondon < 0) {
                tijdInLondon += 24;
            }
            tijdInTokyo = invoer + 7;
            if (tijdInTokyo > 23) {
                tijdInTokyo -= 24;
            }
            tijdInNewyork = invoer - 6;
            if (tijdInNewyork < 0) {
                tijdInNewyork += 24;
            }
            tijdInSydney = invoer + 9;
            if (tijdInSydney > 23) {
                tijdInSydney -= 24;
            }
            geklikt = true;

            repaint();




            }
        }
    }


