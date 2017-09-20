package H05;

import java.awt.*;
import java.applet.*;

public class Opdracht1 extends Applet{
    //declaratie.
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init() {
        //initialisatie.
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        breedte = 200;
        hoogte = 100;
    }

    public void paint(Graphics g) {
        //teken rechthoek
        g.drawRect(100, 100, breedte, hoogte);
        //teken afgeronde rechthoek
        g.drawRoundRect(100, 225, breedte, hoogte, 30, 30);
        //teken gevulde rechthoek
        g.setColor(opvulkleur);
        g.fillRect(315, 100, breedte, hoogte);
        //teken ovaal
        g.setColor(lijnkleur);
        g.drawOval(315, 100, breedte, hoogte);
        //teken gevulde ovaal
        g.setColor(opvulkleur);
        g.fillOval(315, 225, breedte, hoogte);
        // en zo voort...
        g.setColor(lijnkleur);
        g.drawLine(100, 75, 315, 75);
        g.drawOval(530, 100, breedte, hoogte);
        g.setColor(opvulkleur);
        g.fillArc(530, 100,breedte, hoogte, 0, 40);
        g.setColor(lijnkleur);
        g.drawOval(580,225, 95,95);
    }
}