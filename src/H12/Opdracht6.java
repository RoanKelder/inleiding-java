package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht6 extends Applet {
    TextField tekstvak;
    Button okknop;
    Label label;
    String s, tekst;
    int[] getallen = {5, 5, 10, 23, 11, 11, 24, 34};

    @Override
    public void init() {
        setSize(500, 500);
        okknop = new Button("OK");
        okknop.addActionListener(new okknopActionListener());
        tekstvak = new TextField("", 20);
        label = new Label("Voer een cijfer in");
        tekst = "";
        add(okknop);
        add(tekstvak);
        add(label);

    }

    @Override
    public void paint(Graphics g) {
        g.drawString(tekst, 20, 40);
    }

    class okknopActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            tekst = "Het getal is niet gevonden.";
            s = tekstvak.getText();
            int cijfers = Integer.parseInt(s);
            for (int i = 0; i < getallen.length; i++) {
                int getal = getallen[i];
                if (cijfers == getal) {
                    tekst = "Het getal is " + getal + " en de index is " + i;
                }
                if (getal <= 5 ){
                    tekst = "Het getal is " + getal + " en de index is " + i +" en het getal komt 2 keer voor";

                }
                if (getal == 11){
                    tekst = "Het getal is " + getal + " en de index is " + i +" en het getal komt 2 keer voor";
                }


            }
            repaint();

        }
    }
}
