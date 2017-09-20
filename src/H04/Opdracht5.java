package H04;

import java.awt.*;
import java.applet.*;
import java.util.Random;

public class Opdracht5 extends Applet {


    public void init() {
        setBackground(Color.blue);

    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.fillArc(20, 20, 150, 100, 90, 45);
        g.fillArc(20, 20, 150, 100, 135, 90);
        g.fillArc(20, 20, 150, 100, 180, 135);
        g.fillArc(20, 20, 150, 100, 225, 180);
        g.fillArc(20, 20, 150, 100, 270, 225);
        g.setColor(Color.green);
        g.drawString("GELE ELLIPS BLAUWE ACHTERGROND", 20, 170);

    }
}