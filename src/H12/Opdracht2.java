package H12;

import java.applet.Applet;
import java.awt.*;


public class Opdracht2 extends Applet{

    Button[] button;

    @Override
    public void init() {

        button = new Button[25];
        for (int i = 0; i < button.length; i++) {
            button[i] = new Button("" + i);
            add(button[i]);
        }
    }

}