package H04;
import java.awt.*;
import java.applet.Applet;

public class Circel extends Applet {
    @Override
    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.fillArc(20, 20, 100, 50, 90, 360);


    }
}
