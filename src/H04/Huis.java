package H04;

import java.awt.*;
import java.applet.Applet;



public class Huis extends Applet {

    @Override
    public void init() {
    }

    @Override
    public void paint(Graphics g) {
        setBackground(Color.green);
        g.setColor(Color.black);
        g.drawRect(40,100,200,200);
        g.drawRect(175,250,35,50);
        g.drawLine(40, 100,140,0);
        g.drawLine(240,100,140,0);
        g.drawRect(60,200,50,70);
    }
}
