package H06;

import java.awt.*;
import java.applet.*;


public class PraktijdOpdrachtH6 extends Applet {
    double cijfer1, cijfer2, cijfer3,cijfer4,cijfer5, uitkomst, cijfer7, cijfer6;



    public void init() {
        //cijfers behaald
        cijfer1 = 5.9;
        cijfer2 = 6.3;
        cijfer3 = 6.9;
        //cijfersdelen
        cijfer4 = cijfer1 + cijfer2 + cijfer3;
        uitkomst = cijfer4 / 3;
        //cijfer x 10
        cijfer5 = uitkomst * 10;
        //terug naar int
        cijfer6 = (int) cijfer5;
        //eindgetal
        cijfer7 = cijfer6 / 10;
    }

    public void paint(Graphics g) {
        g.drawString("gemiddeld:" + uitkomst,20,40);
        g.drawString("cijfer x 10: " + cijfer5, 20,60);
        g.drawString("terug naar int:  "+ cijfer6, 20,80);
        g.drawString("eind getal:  "+ cijfer7, 20,100);
    }
}