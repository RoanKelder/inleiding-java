package H13;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet  {


    @Override
    public void paint(Graphics g) {
        g.setColor(Color.red);

        tekenMuur(g, 50, 50, 120, 60);
        tekenMuur(g, 171, 50, 120, 60);
        tekenMuur(g, 292, 50, 120, 60);
        tekenMuur(g, 413, 50, 120, 60);
        tekenMuur(g, 0, 111, 120, 60);
        tekenMuur(g, 121, 111, 120, 60);
        tekenMuur(g, 242, 111, 120, 60);
        tekenMuur(g, 363, 111, 120, 60);
        tekenMuur(g, 484, 111, 120, 60);
        tekenMuur(g, 50, 172, 120, 60);
        tekenMuur(g, 171, 172, 120, 60);
        tekenMuur(g, 292, 172, 120, 60);
        tekenMuur(g, 413, 172, 120, 60);
        tekenMuur(g, 0, 233, 120, 60);
        tekenMuur(g, 121, 233, 120, 60);
        tekenMuur(g, 242, 233, 120, 60);
        tekenMuur(g, 363, 233, 120, 60);
        tekenMuur(g, 484, 233, 120, 60);
        tekenMuur(g, 50, 294, 120, 60);
        tekenMuur(g, 171, 294, 120, 60);
        tekenMuur(g, 292, 294, 120, 60);
        tekenMuur(g, 413, 294, 120, 60);

    }

    void tekenMuur(Graphics g,int x1,int x2,int width,int hight){
        g.fillRect(x1, x2, width, hight);
    }
}
