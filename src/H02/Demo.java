package H02;

import java.applet.Applet;
import java.awt.*;

public class Demo extends Applet {


    @Override
    public void paint(Graphics g) {
        setBackground(Color.yellow);
        g.setColor(Color.blue);
        g.drawString("Roan", 40, 40);
        g.setColor(Color.red);
        g.drawString("Kelder",40,50);

    }
}