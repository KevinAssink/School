package H08;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Opdracht3 extends Applet {
    double totaal;
    TextField tekstvak;
    Button knop;


    public void init() {
        knop = new Button("Ok");
        knopListener kl = new knopListener();
        knop.addActionListener(kl);
        add(knop);

        tekstvak = new TextField("Type hier een getal in");
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString("" + totaal + "   inclusief BTW", 20, 100);
        g.drawString("Type een getal in en kijk hoeveel je moet betalen met 21% btw erbij", 20, 60);


    }


    class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double num1 = Double.parseDouble(tekstvak.getText());
            totaal = round(num1 * 1.21, 2);

            repaint();
        }

    }

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }

}