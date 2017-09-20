package H06;

import java.awt.*;
import java.applet.*;


public class Opdracht3 extends Applet {
    int cijfera;
    int cijferb;
    int uitkomst;

    public void init() {
        cijfera = 2;
        cijferb = 2100000000;
        uitkomst = cijfera * cijferb;
    }
    public void paint(Graphics g) {
        g.drawString("De uitkomst =   " + uitkomst, 20, 20);

    }
}