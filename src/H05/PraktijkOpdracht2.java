package H05;

import java.awt.*;
import java.applet.Applet;

public class PraktijkOpdracht2 extends Applet {
    @Override
    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        g.drawLine(20, 20, 120, 20);
        g.drawRect(20, 40, 100, 50);
        g.drawRoundRect(20, 110, 100, 50, 10, 10);
        g.setColor(Color.green);
        g.fillRect(140, 40, 100, 50);
        g.setColor(Color.black);
        g.drawArc(140, 40, 100, 50, 45, 360);
        g.setColor(Color.green);
        g.fillArc(140, 110, 100, 50, 45, 360);
        g.setColor(Color.black);
        g.drawArc(260, 40, 100, 50, 90, 360);
        g.setColor(Color.green);
        g.fillArc(260, 40, 100, 50, 0, 45);
        g.setColor(Color.black);
        g.drawArc(280, 110, 50, 50, 45, 360);


    }
}
