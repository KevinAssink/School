package H04;

import java.awt.*;
import java.applet.*;
import java.util.Random;

public class Opdracht1En2En3 extends Applet {


    public void init() {
        setBackground(Color.cyan);

    }
    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawString("HACKERMANN",50, 300);
        //dak
        g.setColor( new Color (101, 49, 7));
        int[] xPoints = {50, 120, 200};
        int[] yPoints = {120, 20, 120};
        g.drawPolygon(xPoints, yPoints,  3);
        g.fillPolygon(xPoints, yPoints,  3);
        //rand van huis
        g.setColor( new Color (101, 49, 7));
        g.fillRect(50, 120, 150, 150);

        //deur
        g.setColor(Color.yellow);
        g.fillRect(140, 195, 50, 75);

        //raam
        g.setColor(Color.black);
        g.fillRect(70, 130, 55, 55);

        //Omgeving huis
        g.setColor(Color.black);
        g.drawLine(0, 270, 400, 270);
        g.drawLine(270, 270, 270, 100);

        //vlag
        g.setColor(Color.black);
        g.fillRect(260, 70, 10, 200);
        g.setColor(Color.blue);
        g.fillRect(270, 70, 100,75);
        g.setColor(Color.white);
        g.fillRect(270,70, 100,50);
        g.setColor(Color.red);
        g.fillRect(270,70,100,25);
    }

}