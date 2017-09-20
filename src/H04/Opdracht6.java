package H04;

import java.awt.*;
import java.applet.*;
import java.util.Random;

public class Opdracht6 extends Applet {


    public void init() {
        setBackground(Color.white);

    }

    public void paint(Graphics g) {
        g.fillRect(55, 100, 30, 250);
        g.fillRoundRect(30, 20, 80, 150, 20, 20);
        g.setColor(Color.red);
        g.fillRoundRect(55,30,30,30,30,30);
        g.setColor(Color.yellow);
        g.fillRoundRect(55,70,30,30,30,30);
        g.setColor(Color.green);
        g.fillRoundRect(55,110,30,30,30,30);
    }
}