package H04;

import java.awt.*;
import java.applet.Applet;


public class StaafDia extends Applet {

    @Override
    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        g.drawLine(20,120,190,120);
        g.drawLine(20,120,20,20);
        g.drawString("40",0,80);
        g.drawString("80",0,40);
        g.drawString("100",0,20);


        g.drawRect(30,80,50,40);
        g.setColor(Color.green);
        g.fillRect(30,80,50,40);
        g.setColor(Color.black);
        g.drawRect(170,20,50,100);
        g.setColor(Color.red);
        g.fillRect(170,20,50,100);
        g.setColor(Color.black);
        g.drawRect(100,40,50,80);
        g.setColor(Color.blue);
        g.fillRect(100,40,50,80);
        g.setColor(Color.black);
        g.drawString("Valerie", 30, 140);
        g.drawString("Jeroen", 100, 140);
        g.drawString("Hans",170, 140);





    }
}
