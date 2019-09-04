package H03;

import java.awt.*;
import java.applet.Applet;



public class Huis extends Applet {

    @Override
    public void init() {
    }

    @Override
    public void paint(Graphics g) {
        setBackground(Color.GREEN);
        g.setColor(Color.black);
        g.drawRect(40,100,200,200);
        g.drawRect(200,250,20,50);
        g.drawLine(40, 100,150,0);
        g.drawLine(240,100,150,0);
        g.drawRect(60,200,50,70);
    }
}
