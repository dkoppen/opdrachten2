package H11;


import java.awt.*;
import java.applet.*;

public class Fibonacci extends Applet {
    long[] fibo;
    int teller;

    public void init() {
        fibo = new long[1000];
        fibo[0] = 0;
        fibo[1] = 1;


        for (teller = 2; teller < 1000; teller++) {
            fibo[teller] = fibo[teller - 2] + fibo[teller - 1];
        }
    }

    public void paint(Graphics g) {
        int y = 20;

        for (teller = 0; teller < 1000; teller++) {
            g.drawString("" + fibo[teller], 50, y);
            y += 20;
        }

    }

}


