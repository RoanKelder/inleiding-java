package H08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InclusiefBTW extends Applet {
    Button OKKnop;
    TextField TekstVak;
    Label label;
    String s;
    double Getal;
    double BtwBedrag = 1.21;


    @Override
    public void init() {
        OKKnop = new Button("OK");
        OKKnop.addActionListener(new OKKnopListener());
        add(OKKnop);

        TekstVak = new TextField("", 30);
        add(TekstVak);

        label = new Label("typ iets in en het word berekend met BTW");
        add(label);

    }

    @Override
    public void paint(Graphics g) {
        g.drawString(""+ (Getal * BtwBedrag), 50,75);
    }

    class OKKnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            s = TekstVak.getText();
            Getal = Double.parseDouble(s);
            repaint();
        }
    }

}