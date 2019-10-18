package H13;

import java.applet.Applet;
import java.awt.*;

public class praktijkopdracht2 extends Applet {

    @Override
    public void paint(Graphics g) {
        int x = 50;
        int y = 100;
        for (int i = 0; i < 2 ; i++) {

            x = 50;
            y +=150;
            for (int j = 0; j < 5 ; j++) {
                tekenstam(g, x, y, 25, 75);
                x += 50;

            }

        }



    }
    void tekenstam(Graphics g, int x, int y, int width, int height) {
        g.setColor(Color.black);
        g.fillRect(x, y + height, width,height);

        g.setColor(Color.green);
        g.fillOval(x - width, y, width *3, height);
    }
}
