package H13;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;

/**
 * Created by Dennis on 24-11-2016.
 */

public class Opdracht1 extends Applet
{
    String text="";
    Color[] colors={Color.blue, Color.red, Color.green, Color.yellow, Color.white};
    String[] kleur={"blue", "red", "green", "yellow", "white"};
    Button[] button = new Button[5];

    public void init()
    {
        for(int teller=0; teller <5; teller++)
        {
            button[teller]= new Button(""+kleur[teller]);
            add(button[teller]);
            button[teller].addActionListener(new Actionlistener());
            button[teller].setBackground(colors[teller]);
        }
    }
    class Actionlistener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            Button knop = (Button) e.getSource();
            setBackground(knop.getBackground());
            text = knop.getLabel();
        }
    }
    public void paint(Graphics g)
    {
        g.drawString(text, getWidth()/2-10, getHeight()/2);

    }

}
