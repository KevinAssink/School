package H04;

import java.awt.*;
import java.applet.*;
import java.util.Random;

public class Opdracht7 extends Applet {


    public void init() {
        setBackground(Color.white);

    }

    public void paint(Graphics g) {
        //dobbelsteen vorm
        g.setColor(Color.black);
        g.drawRoundRect(40, 40, 200, 200, 15, 15);
        //Balletjes in het midden
        g.fillRoundRect(70, 60, 50, 50, 50, 50);
        g.fillRoundRect(170, 60, 50, 50, 50, 50);
        g.fillRoundRect(70, 165, 50, 50, 50, 50);
        g.fillRoundRect(170, 165, 50, 50, 50, 50);



    }
}