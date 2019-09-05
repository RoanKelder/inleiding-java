package H04;


import java.awt.*;
import java.applet.*;


public class Vormen extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setColor(Color.green);
        g.drawLine(200,120,350,400);
        g.drawLine(50,400,350,400);
        g.drawLine(200,120,50,400);
    }
}