package H06;

import java.applet.Applet;
import java.awt.*;

public class PositiefMaarTochNegatief extends Applet {


    int a;
    int uitkomst1;


    @Override
    public void init() {
        a = 2147483647;
        uitkomst1 = (a+a);


    }

    @Override
    public void paint(Graphics g) {
        g.drawString("negatief    "+uitkomst1,20,20);


    }
}
