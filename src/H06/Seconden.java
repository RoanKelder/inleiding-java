package H06;

import java.applet.Applet;
import java.awt.*;

public class Seconden extends Applet {

    int a,b,c,d,e,f;

    int uitkomst1, uitkomst2, uitkomst3;


    @Override
    public void init() {

         a = 60;
         b = 24;
         c = 7;
         d = 52;
         e = 3600;
         f = 86400;
        uitkomst1 = (a*a);
        uitkomst2 = (a*a) * b;
        uitkomst3 = (f*d);



    }
 
    @Override
    public void paint(Graphics g) {
        g.drawString("zoveel seconden zitten er in 1 uur 60x60 = "+ uitkomst1,20,20);
        g.drawString("zoveel seconden zitten er in 1 dag 3600x24 = "+uitkomst2,20,40);
        g.drawString("zoveel seconden zitten er in 1 jaar 86400x52 = "+uitkomst3,20,60);



    }
}
