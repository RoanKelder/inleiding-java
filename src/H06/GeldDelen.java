package H06;


import java.awt.*;
import java.applet.*;


public class GeldDelen extends Applet {
    int a;
    int b;
    int c;
    int uitkomst;

    public void init() {
        a = 100;
        b = 13;
        c = 4;
        uitkomst = (a + b) / c;
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
        g.drawString("100+13 / 4 =28",20,40);
        g.drawString("Ik krijg 28", 20,60);
        g.drawString("Ali krijgt 28",20,80);
        g.drawString("Jeanatte krijgt 28",20,100);
        g.drawString("Jan krijgt 28",20,120);
    }
}