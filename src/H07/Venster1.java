package H07;

import java.awt.*;
import java.applet.*;


public class Venster1 extends Applet{


    public void init() {
        setBackground(Color.red);
        Dimension dim = new Dimension(400, 300);
        this.setSize(dim);
    }

    public void paint(Graphics g) {
        g.drawString("Welkom",200,200);

    }
}