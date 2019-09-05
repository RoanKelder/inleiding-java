package H04;

import java.awt.*;
import java.applet.Applet;

public class Stoplicht extends Applet {
    @Override
    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        g.drawRect(30,50,45,100);
        g.setColor(Color.red);
        g.fillArc(45, 60, 20,20,45,360);
        g.setColor(Color.orange);
        g.fillArc(45, 90, 20,20,45,360);
        g.setColor(Color.green);
        g.fillArc(45, 120, 20,20,45,360);


    }
}
