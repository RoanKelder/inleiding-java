package H13;

import java.applet.Applet;
import java.awt.*;

public class praktijkopdracht1 extends Applet {

    @Override
    public void paint(Graphics g) {

        tekenBoomStam(g,35,70,50,20);
        tekenBlaaderen(g,20,20,50,50);


    }

    void tekenBoomStam(Graphics g,int x, int y, int height, int width) {
        g.fillRect(x, y, width, height);

    }
    void tekenBlaaderen(Graphics g, int x2, int y2, int height2, int width2){
        g.setColor(Color.green);
        g.fillOval(x2,y2,width2,height2);
    }
}
