package H12;

import java.awt.*;
import java.applet.*;

public class Opdracht1 extends Applet {
    int [] cijfers;
    int totaal;
    int aantal;

    @Override
    public void init() {
        cijfers = new int[10];
        for (int i = 0; i < cijfers.length ; i++) {
            cijfers[i] = (int) (Math.random() * 10 + 1);
            
        }
        for (int i = 0; i < cijfers.length ; i++) {
            totaal += cijfers[i];
            aantal++;
        }

    }

    @Override
    public void paint(Graphics g) {
        int x = 50;
        for (int i = 0; i < cijfers.length; i++) {
            g.drawString("" + cijfers[i],x ,25);
            x += 20;
            
        }
        g.drawString("gemiddelde is "+ ((double)totaal/aantal),50,50);

    }
}