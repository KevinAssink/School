package H06;

import java.awt.*;
import java.applet.*;


public class TijdenEnDagen extends Applet {
    int uur, dag, jaar, uitkomst;


    public void init() {
        uitkomst = (60);
        uur = uitkomst * 60;
        dag = uitkomst * 60 * 24;
        jaar = uitkomst * 60 * 24 * 365 ;

    }

    public void paint(Graphics g) {
        g.setColor( new Color(0, 19, 255));
        g.drawString("In 1 uur zit:    " + uur, 10,20);
        g.drawString("In 1 dag zit:    " + dag,10,40);
        g.drawString("In 1 jaar zit:   " + jaar, 10, 60);
        g.setColor( new Color(255, 0, 29));
        g.drawString("seconden", 150, 20);
        g.drawString("seconden",150, 40);
        g.drawString("seconden", 150, 60);


    }
}