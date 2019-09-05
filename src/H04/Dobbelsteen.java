package H04;

import java.awt.*;
import java.applet.Applet;

public class Dobbelsteen extends Applet {
    @Override
    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        g.drawRoundRect(40,40,150,150,50,50);
        g.fillArc(60,60,40,40,45,360);
        g.fillArc(130,130,40,40,45,360);
        g.fillArc(60,130,40,40,45,360);
        g.fillArc(130,60,40,40,45,360);
    }
}
