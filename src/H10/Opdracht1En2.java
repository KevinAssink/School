package H10;


import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht1En2 extends Applet{
    TextField tekst1, tekst2;
    Label label;
    int hoogstegetal, laagstegetal;
    int getal;
    String tekstje;

    public void init() {
        tekst1 = new TextField("",10);
        tekst1Listener t1l = new tekst1Listener();
        tekst1.addActionListener( t1l );
        add (tekst1);
    }

    public void paint (Graphics g){
        g.drawString("Hoogste getal =  " + hoogstegetal,20,60);
        g.drawString("Laagste getal =  "+ laagstegetal,20,80);

    }

    class tekst1Listener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            getal = Integer.parseInt(tekst1.getText());
            if (getal > hoogstegetal) {
                hoogstegetal = getal;
                repaint();
            }
            else if (getal < hoogstegetal) {
                laagstegetal = getal;
                repaint();
            }

        }
    }
}
