package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Opdracht3En4 extends Applet {
    TextField tekstvak, tekstvak2;
    Label label;
    String s, d, tekst, tekst2;
    int maand, jaartal;



    public void init() {
        tekstvak = new TextField("", 15);
        label = new Label("Type een maand nummer en druk op enter");
        tekstvak.addActionListener(new TekstvakListener());
        tekst = "";
        add (label);
        add (tekstvak);
        tekstvak2 = new TextField("", 15);
        tekstvak2.addActionListener(new TekstvakListener());
        label = new Label("Jaar nummer");
        tekst = "";
        add (label);
        add (tekstvak2);
    }


    public void paint(Graphics g) {
        g.drawString(tekst,20,80);
        g.drawString(tekst2,20,100);

    }
    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            maand = Integer.parseInt(s);
            switch (maand) {
                case 1:
                    tekst = "Januari    31 Dagen";
                    break;
                case 2:
                    tekst = "Februari   28/29 Dagen";
                    break;
                case 3:
                    tekst = "Maart      31 Dagen";
                    break;
                case 4:
                    tekst = "April      30 Dagen";
                    break;
                case 5:
                    tekst = "Mei        31 Dagen";
                    break;
                case 6:
                    tekst = "Juni       30 Dagen";
                    break;
                case 7:
                    tekst = "Juli       31 Dagen";
                    break;
                case 8:
                    tekst = "Augustus   31 Dagen";
                    break;
                case 9:
                    tekst = "September  30 Dagen";
                    break;
                case 10:
                    tekst = "Oktober    31 Dagen";
                    break;
                case 11:
                    tekst = "November   30 Dagen";
                    break;
                case 12:
                    tekst = "December   31 Dagen";
                    break;
                default:
                    tekst = "Alleen nummers tot en met 12 gelden ..!";
                    break;
            }
            repaint();
            d = tekstvak2.getText();
            jaartal = Integer.parseInt( d );
            if ( (jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                    jaartal % 400 == 0 ) {
                tekst2 = ""+ jaartal + " is een schrikkeljaar";
            }
            else {
                tekst2 = ""+ jaartal + " is geen schrikkeljaar";
            }
            repaint();
        }
    }

}
