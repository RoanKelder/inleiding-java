package H10;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdr4 extends Applet {

    TextField Tekstvak;
    Label Label;
    String s, tekst;
    int maand;
    int dag;


    @Override
    public void init() {
        Tekstvak = new TextField("", 20);
        Label = new Label("Typ een maand");
        Tekstvak.addActionListener(new TekstvakActionListener());
        tekst = "";
        add(Label);
        add(Tekstvak);


    }

    @Override
    public void paint(Graphics g) {
        g.drawString("" + tekst, 50, 50);

    }

    class TekstvakActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            s = Tekstvak.getText();
            maand = Integer.parseInt(s);
            switch (maand) {
                case 1:
                    tekst = "Januari heeft 31 dagen";
                    break;
                case 2:
                    tekst = "Feberuari heeft 28/29 dagen";
                    break;
                case 3:
                    tekst ="Maart heeft 31 dagen";
                    break;
                case 4:
                    tekst ="April heeft 30 dagen";
                    break;
                case 5:
                    tekst ="Mei heeft 31 dagen";
                    break;
                case 6:
                    tekst ="Juni heeft 30 dagen";
                    break;
                case 7:
                    tekst ="Juli heeft 31 dagen";
                    break;
                case 8:
                    tekst ="Augustus haaft 31 dagen";
                    break;
                case 9:
                    tekst ="September heeft 30 dagen";
                    break;
                case 10:
                    tekst ="Oktober heeft 31 dagen";
                    break;
                case 11:
                    tekst ="November heeft 30 dagen";
                    break;
                case 12:
                    tekst ="December haaft 31 dagen";
                    break;





            }
            repaint();
        }
    }
}

