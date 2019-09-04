package H03;

import java.awt.*;
import java.applet.*;

public class Vormen extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawLine(50,400,270,200);
        g.drawLine(50,200,270,400);
        g.drawLine(270,120,50,400);
    }
}
