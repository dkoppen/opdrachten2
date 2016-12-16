import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;
import java.net.*;

public class ToetsJava2Slotmachine extends Applet
{

    String[]afbeeldingen={"fruit_1.jpg","fruit_2.jpg","fruit_3.jpg","fruit_4.jpg","fruit_5.jpg","fruit_6.jpg","fruit_7.jpg","fruit_8.jpg","fruit_9.jpg","fruit_10.jpg","fruit_11.jpg","fruit_12.jpg","fruit_13.jpg","fruit_14.jpg","fruit_15.jpg","fruit_16.jpg","fruit_17.jpg","fruit_18.jpg","fruit_19.jpg","fruit_20.jpg",};

    private Image afbeelding1,afbeelding2,afbeelding3;
    URL pad;

    double getal1, getal2, getal3;
    int krediet,nummer1, nummer2, nummer3;

    boolean begin;
    boolean winst;
    boolean jackpot;

    Button koop;
    Button Play;

    public void init()
    {
        begin = false;
        krediet = 10;

        pad = Image.class.getResource("/resources/");

        koop = new Button("Koop Krediet");
        Play = new Button("Play");
        Listen1 l1=new Listen1();
        Listen2 l2=new Listen2();
        koop.addActionListener(l2);
        Play.addActionListener(l1);

        add(Play);
        add(koop);
    }

    public void paint(Graphics g)
    {
        slots(g);

        g.drawString(""+ krediet , 60,200);

        if(winst == true)
        {
            g.drawString("Gewonnen: +4 punten.", 40, 140);
            winst = false;
        }
        if(jackpot == true)
        {
            g.drawString("Jackpot Gewonnen: +20 punten!", 40, 140);
            jackpot = false;
        }
    }


    class Listen1 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            begin = true;
            if (krediet > 0)
            {
                krediet--;

                getal1 = Math.random();
                nummer1 = (int)(getal1 * 20);

                getal2 = Math.random();
                nummer2 = (int)(getal2 * 20);

                getal3 = Math.random();
                nummer3 = (int)(getal3 * 20);

                repaint();
            }
        }
    }


    class Listen2 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if (krediet < 1)
            {
                krediet = krediet + 10;
            }

            repaint();
        }
    }


    void slots(Graphics g)
    {
        afbeelding1 = getImage(pad, ""+ afbeeldingen[nummer1]);
        afbeelding2 = getImage(pad, ""+ afbeeldingen[nummer2]);
        afbeelding3 = getImage(pad, ""+ afbeeldingen[nummer3]);


        g.drawImage(afbeelding1, 20, 40, 40, 80, this);
        g.drawImage(afbeelding2, 60, 40, 40, 80, this);
        g.drawImage(afbeelding3, 100, 40, 40, 80, this);

        if (nummer1 == nummer2 && begin == true)
        {
            krediet = krediet + 4;
            winst = true;
        }
        if (nummer2 == nummer3 && begin == true)
        {
            krediet = krediet + 4;
            winst = true;
        }
        if (nummer1 == nummer2 && nummer1 == nummer3 && jackpot == true)
        {
            krediet = krediet + 20;
            jackpot = true;
        }
        if (krediet < 1)
        {
            koop.setEnabled(true);
        }
        else
        {
            koop.setEnabled(false);
        }
    }
}