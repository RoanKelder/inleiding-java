package H10;

import javax.swing.*;
import javax.xml.soap.Text;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht2 extends Applet {

    TextField Tekstvak;
    String s;
    Label label;
    int HoogsteGetal;
    int LaagsteGetal;


    @Override
    public void init() {
        label = new Label("typ hier uw getal");
        add(label);

        Tekstvak = new TextField("", 20);
        Tekstvak.addActionListener(new TekstvakListener());
        add(Tekstvak);


    }

    @Override
    public void paint(Graphics g) {
        g.drawString("" + HoogsteGetal, 50, 45);
        g.drawString("" + HoogsteGetal, 50,65);

    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = Tekstvak.getText();
            int Getal = Integer.parseInt(s);
            if (Getal > HoogsteGetal) {

                HoogsteGetal = Getal;
            } else if (Getal < HoogsteGetal) {
                LaagsteGetal = Getal;
                repaint();
            }


        }
    }
}