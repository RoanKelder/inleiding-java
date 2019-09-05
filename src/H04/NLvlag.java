package H04;

import java.awt.*;
import java.applet.Applet;

public class NLvlag extends Applet {
    @Override
    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        g.drawRect(40,60,10,100);
        g.drawRect(50,60,50,15);
        g.drawRect(50,75,50,15);
        g.drawRect(50,90,50,15);
        g.setColor(Color.red);
        g.fillRect(50,60,50,15);
        g.setColor(Color.blue);
        g.fillRect(50,90,50,15);
    }
}
