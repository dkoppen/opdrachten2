package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;


public class Sorteren extends Applet {

    TextField[] textfields;
    int[] getallen;
    Button knop;


    @Override
    public void init() {

        textfields = new TextField[5];
        getallen = new int[5];
        knop = new Button("Klik");
//        textfields[0] = new TextField("", 7);
//        add(textfields[0]);
//        textfields[1] = new TextField("", 7);
//        add(textfields[1]);
//        textfields[2] = new TextField("", 7);
//        add(textfields[2]);
//        textfields[3] = new TextField("", 7);
//        add(textfields[3]);
//        textfields[4] = new TextField("", 7);
//        add(textfields[4]);

        for (int i = 0; i < textfields.length; i++) {
            textfields[i] = new TextField("", 7);
            add(textfields[i]);
        }
        knop.addActionListener(new Knoplistener());
        add(knop);

    }

    class Knoplistener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {


            for (int j = 0; j < getallen.length; j++) {
                getallen[j] = Integer.parseInt(textfields[j].getText());
            }

            Arrays.sort(getallen);

            for (int i = 0; i < textfields.length ; i++) {
                textfields[i].setText("" + getallen[i]);
            }

        }
    }




}
