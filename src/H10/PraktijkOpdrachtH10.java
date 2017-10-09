package H10;

import java.applet.Applet;
import java.awt.event.*;
import java.awt.*;

public class PraktijkOpdrachtH10 extends Applet {
    TextField tekstvak;
    Button knop;
    String resultaat;


    public void init() {
        tekstvak = new TextField(10);
        add(tekstvak);
        knop = new Button("Ok");
        knop.addActionListener(new knopListener());
        add(knop);
        resultaat = "";
    }

    public void paint(Graphics g) {
        g.drawString("Cijfer is:  " + resultaat, 160, 50);
        this.setSize(450,100);
    }

    class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            String s = tekstvak.getText();
            int invoer = Integer.parseInt(s);

            if (invoer == 1 || invoer == 2 || invoer == 3) {
                resultaat = "Slecht";
            } else if (invoer == 4) {
                resultaat = "Onvoldoende";
            } else if (invoer == 5) {
                resultaat = "Matig";
            } else if (invoer == 6 || invoer == 7) {
                resultaat = "Voldoende";
            } else if (invoer == 8 || invoer == 9 || invoer == 10) {
                resultaat = "Goed";
            }
            else
                resultaat = "Ongeldig";
            repaint();
        }
    }
}

