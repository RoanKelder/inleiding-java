package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht3 extends Applet {
    int a = 0;
    int b = 1;
    int c = a + b;
    int x;


    @Override
    public void init() {
        setSize(600,500);
        x = 50;

    }

    @Override
    public void paint(Graphics g) {
        g.drawString("" + c, x, 20);
        {
            for (int i = 0; i < 9; i++) {
                a = b;
                b = c;
                c = a + b;
                x += 50;
                g.drawString("" + c, x, 20);
            }

        }
    }
}