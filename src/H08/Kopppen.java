package H08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Kopppen extends Applet {
    Button OKKnop;
    Button BackKnop;
    String schermtekst;
    TextField tekstvak;
    Label label;
    String s;

    public void init() {
        schermtekst = "Doet deze knop wel iets?";
        OKKnop = new Button("OK");
        BackKnop = new Button("back");
        label = new Label("Type iets in het  tekstvakje");
        tekstvak = new TextField("klik op mij",30);
        add(tekstvak);
        add(OKKnop);
        add(BackKnop);
        add(label);
        OKKnop.addActionListener(new OKKnopActionListener());
        BackKnop.addActionListener(new BackKnopActionListiner());

    }

    @Override
    public void paint(Graphics g) {

    }

    class OKKnopActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            label.setText(s);
            repaint();
        }

    }

    class BackKnopActionListiner implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText(" ");
            label.setText(" ");
            repaint();
        }
    }
}