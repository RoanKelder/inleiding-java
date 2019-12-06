package Challange;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {

    @Override
    public void paint(Graphics g) {
        g.drawRect(10,10,100,170);
        g.drawRect(10,10,60,70);
        g.fillRect(70,10,10,150);
        g.fillRect(70,50,40,10);
        g.fillRect(10,110,100,10);
        g.fillRect(10,150,100,10);
        g.fillRect(10,70,70,10);
        g.fillRect(30,70,10,40);
        g.fillRect(80,110,30,40);
        g.setColor(Color.red);
        g.fillRect(10,10,60,60);
        g.setColor(Color.blue);
        g.fillRect(10,160,100,20);
        g.setColor(Color.yellow);
        g.fillRect(10,80,20,30);

    }
}
