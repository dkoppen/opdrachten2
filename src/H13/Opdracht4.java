package H13;

        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
        import java.applet.*;
/**
 * Created by Dennis on 25-11-2016.
 */


public class Opdracht4 extends Applet
{
    int soort;
    public void init()
    {
        setSize(600,600);
        soort=1;
        Button knop1 = new Button("baksteen");
        Button knop2 = new Button("beton");
        Listen1 l1 = new Listen1();
        Listen2 l2 = new Listen2();
        knop1.addActionListener(l1);
        knop2.addActionListener(l2);
        add(knop1);
        add(knop2);
    }

    public void paint(Graphics g)
    {
        if(soort==0)
        {
            for(int teller=0; teller <10; teller++)
            {
                for(int teller1=0; teller1<10; teller1++)
                {
                    steen(g, teller*22+10*(teller1%2),(teller1+5)*12);
                }
            }
        }
        else if(soort==1)
        {
            for(int teller=0; teller <10; teller++)
            {
                for(int teller1=0; teller1<10; teller1++)
                {
                    beton(g, teller*42+20*(teller1%2),(teller1+5)*22);
                }
            }
        }
    }
    public class Listen1 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            soort=0;
            repaint();
        }

    }
    public class Listen2 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            soort=1;
            repaint();
        }
    }
    void steen (Graphics g, int x1, int y1)
    {
        g.setColor(Color.red);
        g.fillRect(x1, y1, 20,10);
    }
    void beton (Graphics g, int x1, int y1)
    {
        g.setColor(Color.gray);
        g.fillRect(x1, y1, 40,20);
    }
}
