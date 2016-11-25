package H12;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;



public class Praktijk extends Applet {

    int[] nummer;
    String[] name;
    Button button;
    TextField[] textFields;
    int teller=0;
    boolean verander;

    @Override
    public void init() {
        textFields = new TextField[2];
        nummer = new int[10];
        name = new String[10];
        button = new Button("OK");
        KnopListener kl = new KnopListener();
        button.addActionListener(kl);

        for (int i = 0; i <textFields.length ; i++) {
            textFields[i] = new TextField("",15);
            textFields[i].addActionListener(kl);
            add(textFields[i]);
        }
        add(button);

    }

    class KnopListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {

            if (teller <10){

                name[teller] = textFields[0].getText();
                nummer[teller] = Integer.parseInt(textFields[1].getText());

                teller++;

            } else {
                verander = true;
                repaint();
            }
            textFields[0].setText("");
            textFields[1].setText("");
        }
    }

    @Override
    public void paint(Graphics g) {
        if (verander == true){
            int x=50;
            int y=50;
            for (int i = 0; i <nummer.length ; i++) {
                g.drawString(name[i]+"   "+nummer[i],x,y);
                y+=25;
            }
        }
    }
}