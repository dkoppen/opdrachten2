package h042;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;
import java.net.*;

@SuppressWarnings("serial")
public class Toets2 extends Applet
{
    String[]images={"fruit_1.jpg","fruit_2.jpg","fruit_3.jpg","fruit_4.jpg","fruit_5.jpg","fruit_6.jpg","fruit_7.jpg","fruit_8.jpg","fruit_9.jpg","fruit_10.jpg","fruit_11.jpg","fruit_12.jpg","fruit_13.jpg","fruit_14.jpg","fruit_15.jpg","fruit_16.jpg","fruit_17.jpg","fruit_18.jpg","fruit_19.jpg","fruit_20.jpg",};
    private Image img1,img2,img3;
    private AudioClip sound1;
    private AudioClip sound2;
    URL pad;
    int credit,number1, number2, number3;
    double numberbase1, numberbase2, numberbase3;
    Button buy;
    Button Play;
    boolean start;
    boolean win;
    boolean bigwin;

    public void init()
    {
        start = false;
        credit = 10;
        pad = getDocumentBase();
        sound1 = getAudioClip(getDocumentBase(), "toets2/lever.wav");
        sound2 = getAudioClip(getDocumentBase(), "toets2/slotwin.wav");
        buy = new Button("Buy Credits");
        Play = new Button("Play");
        Listen1 l1=new Listen1();
        Listen2 l2=new Listen2();
        buy.addActionListener(l2);
        Play.addActionListener(l1);
        add(Play);
        add(buy);
    }
    public void paint(Graphics g)
    {
        slots(g);
        g.drawString(""+credit, 60,120);
        if(bigwin==true)
        {
            g.drawString("JACKPOT! +20 POINTS!", 40, 140);
            bigwin=false;
        }
        if(win==true)
        {
            g.drawString("congratulations! +5 points.", 40, 140);
            win=false;
        }
    }
    class Listen1 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            start=true;
            if (credit >0)
            {
                sound1.play();
                credit--;
                numberbase1 = Math.random();
                number1 = (int)(numberbase1*20);
                numberbase2 = Math.random();
                number2 = (int)(numberbase2*20);
                numberbase3 = Math.random();
                number3 = (int)(numberbase3*20);
                repaint();
            }
        }
    }
    class Listen2 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if (credit<1)
            {
                credit = credit+10;
            }

            repaint();
        }
    }


    void slots(Graphics g)
    {
        img1 = getImage(pad, "toets2/fruitplaatjes/"+ images[number1]);
        img2 = getImage(pad, "toets2/fruitplaatjes/"+ images[number2]);
        img3= getImage(pad, "toets2/fruitplaatjes/"+ images[number3]);
        g.drawImage(img1, 20, 40, 40, 60, this);
        g.drawImage(img2, 60, 40, 40, 60, this);
        g.drawImage(img3, 100, 40, 40, 60, this);
        if (number1==number2&& start==true)
        {
            sound2.play();
            credit=credit+5;
            win=true;
        }
        if (number1==number2 && number1==number3&&start==true)
        {
            sound2.play();
            credit=credit+20;
            bigwin = true;
        }
        if (credit<1)
        {
            buy.setEnabled(true);
        }
        else
        {
            buy.setEnabled(false);
        }
    }
}
