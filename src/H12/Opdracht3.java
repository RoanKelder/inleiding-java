package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Opdracht3 extends Applet {

    TextField[] tekstvakken;
    Button okknop;
    Label label;



    @Override
    public void init() {
        tekstvakken = new TextField[5];
        label = new Label("Voer een cijfer in");
        add(label);
        for (int i = 0; i < tekstvakken.length ; i++) {
            TextField t = new TextField(10);
            tekstvakken[i] = t;
            add(t);

        }

        okknop = new Button("OK");
        add(okknop);
        okknop.addActionListener(new Okknoplistener());
    }

    @Override
    public void paint(Graphics g) {

    }

    class Okknoplistener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int[] getallen = new int[tekstvakken.length];
            for (int i = 0; i < tekstvakken.length ; i++) {
                String s = tekstvakken[i].getText();
                int input = Integer.parseInt(s);
                getallen[i] = input;
            }
            Arrays.sort(getallen);
            for (int i = 0; i < getallen.length; i++) {
                tekstvakken[i].setText(String.valueOf(getallen[i]));
            }
        }
    }



}
