package h05;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Dennis on 15-9-2016.
 */
    public class H5Opdracht2 extends Applet {
        private int[] lengteRij = {80,100,40};
        private double maximum = lengteRij[0];
        private double minimum = lengteRij[0];
        private Color kleur;
        private Staafdiagram staafdiagram;

        public void paint(Graphics g) {
            staafdiagram = new Staafdiagram(lengteRij,30);
            staafdiagram.drukaf(g,70,200);
            g.setColor(Color.black);
            g.drawString("Valerie     Jeroen     Hans", 40, 210);
        }

        public void init() {
            for (int i = 1; i<lengteRij.length; i++) {
                if(lengteRij[i]> maximum)
                    maximum = lengteRij[i];
                kleur = Color.black;
            }
            for(int i =1; i<lengteRij.length;i++) {
                if(lengteRij[i]<minimum)
                    minimum = lengteRij[i];
                kleur = Color.black;
            }
        }
        class Staafdiagram {
            private int[] lengteRij;
            private int witruimte;

            public Staafdiagram( int[] lengteRij, int witruimte) {
                this.lengteRij=lengteRij;
                this.witruimte=witruimte;
            }

            public void drukaf(Graphics g, int x, int y) {
                int xPos = x, yPos = y;

                for (int i = 0; i<lengteRij.length; i++) {
                    g.setColor(Color.red);
                    g.fillRect(xPos,yPos-20-lengteRij[i],10,lengteRij[i]);
                    xPos += witruimte;
                }
                xPos=x;
                for(int i=0; i< lengteRij.length;i++) {
                    String getalStr = ""+ lengteRij[i];
                    g.drawString(getalStr, xPos, yPos);
                    xPos += witruimte;
                }
            }
            public void printMaxMin() {


            }
        }
    }
