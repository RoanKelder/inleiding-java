package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdr extends Applet {
    TextField Tekstvak;
    String s, Tekst;
    Label Label;
    int slecht, onvoldoende, matig, voldooende, goed, getal;


    @Override
    public void init() {
        Tekstvak = new TextField("", 20);
        Label = new Label("Voer je cijfer in");
        Tekstvak.addActionListener(new TekstvakActionListener());
        Tekst = "";
        add(Label);
        add(Tekstvak);
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("" + Tekst, 70, 60);
    }

    class TekstvakActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            s = Tekstvak.getText();
            getal = Integer.parseInt(s);
            switch (getal) {
                case 1:
                    Tekst = "slecht";
                    break;
                case 2:
                    Tekst = "slecht";
                    break;
                case 3:
                    Tekst = "slecht";
                    break;
                case 4:
                    Tekst = "onvoldoende";
                    break;
                case 5:
                    Tekst = "matig";
                    break;
                case 6:
                    Tekst = "voldoende";
                    break;
                case 7:
                    Tekst = "voldoende";
                    break;
                case 8:
                    Tekst = "goed";
                    break;
                case 9:
                    Tekst = "goed";
                    break;
                case 10:
                    Tekst = "goed";
                    break;
            }
            repaint();
        }
    }
}
