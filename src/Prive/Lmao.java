package Prive;

import java.awt.*;
import java.applet.*;
import java.util.Random;

public class Lmao extends Applet {


    public void init() {
        setBackground(Color.white);

    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.drawRect(50,50, 100,100);
        g.drawRect(25,75,100,100);
        g.drawLine(25,75,50,50);
        g.drawLine(125,175,150,150);
        g.drawLine(125,75,150,50);
        g.drawLine(25,175,50,150);
        g.drawRoundRect(50,300,50,50,50,50);
        g.drawRoundRect(250,300,50,50,50,50);
        g.drawLine(70,300,280,300);
        g.drawLine(70, 350,280,350);


    }
}