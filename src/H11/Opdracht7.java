package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht7 extends Applet {

        @Override
        public void init() {
            setSize(1920,1080);

        }

        @Override
        public void paint(Graphics g) {
            int x = 275;
            int y = 275;
            int width = 20;
            int height = 20;
            for (int i = 0; i <51 ; i++) {
                g.drawOval(x,y,width,height);
                x -= 5;
                y -= 5;
                width += 10;
                height += 10;

            }

        }
    }


