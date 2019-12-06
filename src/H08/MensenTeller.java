package H08;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MensenTeller extends Applet {
    Button VrouwenKnop;
    Button MannenKnop;
    Button JongensKnop;
    Button MeisjesKnop;
    int TellerJongens = 0;
    int TellerMannen = 0;
    int TellerMeisjes = 0;
    int Tellervrouwen = 0;
    int Tellertotaal = 0;


    public void init() {

        VrouwenKnop = new Button("Vrouwen");
        MannenKnop = new Button("Mannen");
        JongensKnop = new Button("Jongens");
        MeisjesKnop = new Button("Meisjes");
        add(VrouwenKnop);
        add(MannenKnop);
        add(JongensKnop);
        add(MeisjesKnop);
        JongensKnop.addActionListener(new JongensActionListener());
        MeisjesKnop.addActionListener(new MeisjesActionListener());
        MannenKnop.addActionListener(new MannenActionListener());
        VrouwenKnop.addActionListener(new VrouwenActionListener());


    }

    @Override
    public void paint(Graphics g) {
        g.drawString("Aantal Mannen:" + TellerMannen, 50, 100);
        g.drawString("Aantal Vrouwen:" + Tellervrouwen, 50, 50);
        g.drawString("Aantal Jongens:" + TellerJongens, 50, 150);
        g.drawString("Aantal Meisjes:" + TellerMeisjes, 50, 200);
        g.drawString("Aantal totaal:" + Tellertotaal + (TellerMeisjes +TellerJongens +TellerMannen +Tellervrouwen), 50, 250);


    }

    class JongensActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TellerJongens++;
            repaint();

        }

    }

    class MeisjesActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TellerMeisjes++;
            repaint();

        }

    }

    class MannenActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TellerMannen++;
            repaint();

        }

    }

    class VrouwenActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Tellervrouwen++;
            repaint();

        }

    }


}