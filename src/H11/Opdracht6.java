package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht6 extends Applet {
    @Override
    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        int x = 50;
        int y = 50;
        int width = 20;
        int height = 20;
        for (int i = 0; i <6 ; i++) {
            g.drawOval(x,y,width,height);
            x -= 5;
            y -= 5;
            width += 10;
            height += 10;

        }

    }
}
