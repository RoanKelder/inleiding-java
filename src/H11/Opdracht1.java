package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {
    @Override
    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        int teller = 0;
        int x = 0;
        while (teller < 11) {
            x += 10;

            g.drawLine(x, 100,x,200);
            teller ++;
        }
    }
}
