package H04;

import java.awt.*;
import java.applet.*;
import java.util.Random;

public class PraktijkOpdrachtH4 extends Applet {


    public void init() {
        setBackground(Color.white);

    }

    public void paint(Graphics g) {
        g.drawLine(10, 10, 150, 10);
        g.drawString("Lijn", 10, 30);

        g.drawRect(10, 50, 150, 75);
        g.drawString("Rechthoek", 10, 145);

        g.drawRoundRect(10, 165, 150, 75, 30, 30);
        g.drawString("Afgeronde rechthoek", 10, 260);

        g.setColor(Color.magenta);
        g.fillRect(180, 50, 150, 75);
        g.setColor(Color.black);
        g.drawOval(180, 50, 150, 75);
        g.drawString("Gevulde rechthoek met ovaal", 180, 145);

        g.setColor(Color.magenta);
        g.fillOval(180, 165, 150, 75);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal", 180, 260);

        g.drawOval(350, 50, 150, 75);
        g.setColor(Color.magenta);
        g.fillArc(350, 50, 150, 75, 0, 45);
        g.setColor(Color.black);
        g.drawString("Taartpunt met ovaal erin", 370, 145);

        g.drawOval(380, 165, 75,75);
        g.drawString("Cirkel", 370, 260);
    }
}