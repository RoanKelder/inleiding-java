package H05;

import java.awt.*;
import java.applet.Applet;

public class StaafDia2 extends Applet {

    int gewichtValerie;
    int gewichtHans;
    int gewichtJeroen;
    int hoogteXas;

    @Override
    public void init() {

        setSize(400,400);
        gewichtValerie = 40;
        hoogteXas = 350;
        gewichtHans = 80;
        gewichtJeroen = 100;
    }

    @Override
    public void paint(Graphics g) {
        g.drawLine(50,50,50,hoogteXas);
        g.drawLine(50,hoogteXas,hoogteXas,hoogteXas);
        g.setColor(Color.green);
        g.fillRect(51,hoogteXas-gewichtValerie,80,gewichtValerie);
        g.setColor(Color.black);
        g.fillRect(132,hoogteXas-gewichtHans,80,gewichtHans);
        g.setColor(Color.red);
        g.fillRect(213,hoogteXas-gewichtJeroen,80,gewichtJeroen);
        g.setColor(Color.black);
        g.drawString("40",30,hoogteXas-gewichtValerie);
        g.drawString("80",30,hoogteXas-gewichtHans);
        g.drawString("100",30,hoogteXas-gewichtJeroen);


    }
}
