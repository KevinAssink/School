package H06;

import java.awt.*;
import java.applet.*;


public class Opdracht1 extends Applet {
    double geldjan, geldjabir, geldali, geldjeannette,aantalpersonen, uitkomst;


    public void init() {
        uitkomst = (113);
        aantalpersonen = 4;
        geldjan = uitkomst / aantalpersonen;
        geldjabir = uitkomst / aantalpersonen;
        geldali = uitkomst / aantalpersonen;
        geldjeannette = uitkomst / aantalpersonen;

    }

    public void paint(Graphics g) {
        g.drawString("Jabir krijgt: " + geldjabir, 20, 20);
        g.drawString("Jan krijt: " + geldjan, 20, 40);
        g.drawString("Ali krijgt: " + geldali, 20, 60);
        g.drawString("Jeannette krijgt: " + geldjeannette, 20, 80);
    }
}