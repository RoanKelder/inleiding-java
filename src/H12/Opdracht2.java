package H12;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {
    Button[] knoppen;
    int knopnaam = 1;

    @Override
    public void init() {
        knoppen = new Button[25];
        for (int i = 0; i < knoppen.length ; i++) {
            knoppen[i]= new Button(""+ knopnaam);
            add(knoppen[i]);
            knopnaam++;


        }
    }
}
