package H10;

import javax.xml.soap.Text;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdr1 extends Applet {

    TextField Tekstvak;
    Label Label;
    String s;
    int Hoogstegetal;


    @Override
    public void init() {
        Tekstvak = new TextField("", 20);
        Tekstvak.addActionListener(new TekstvakActionListener());
        add(Tekstvak);

        Label = new Label("Voer een getal in");
        add(Label);
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("" + Hoogstegetal, 50, 40);


    }

    class TekstvakActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            s = Tekstvak.getText();
            int Getal = Integer.parseInt(s);
            if (Getal > Hoogstegetal) {
                Hoogstegetal = Getal;
                repaint();
            }

        }
    }
}
