package Challange;

import javax.management.MBeanServer;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.zip.DataFormatException;

public class Menukaart extends Applet {
    Button bier, wijn, fris, koffie, binngedist, buitgedist, nieuw;

    double BierPrijs = 2.50;
    double WijnPrijs = 2.75;
    double FrisPrijs = 2.25;
    double KoffiePrijs = 2.00;
    double BinngedistPrijs = 3.00;
    double BuitgedistPrijs = 3.75;
    double Bestellingtotaal = 0;
    double Dagtotaal = 0;
    String s;

    @Override
    public void init() {
        bier = new Button("Bier");
        wijn = new Button("Wijn");
        fris = new Button("Fris");
        koffie = new Button("Koffie");
        binngedist = new Button("Binnen. gedist.");
        buitgedist = new Button("Buiten. gedist.");
        nieuw = new Button("Nieuwe bestelling");
        add(bier);
        add(wijn);
        add(fris);
        add(koffie);
        add(binngedist);
        add(buitgedist);
        add(nieuw);
        bier.addActionListener(new bierActionListener());
        wijn.addActionListener(new wijnActionListener());
        fris.addActionListener(new frisActionListener());
        koffie.addActionListener(new koffieActionListener());
        binngedist.addActionListener(new binnenActionListener());
        buitgedist.addActionListener(new buitenActionListener());
        nieuw.addActionListener(new nieuwActionListener());


    }

    @Override
    public void paint(Graphics g) {
        g.drawString("Bestelling totaal: " + Bestellingtotaal, 70, 100);
        g.drawString("Dag totaal: " + Dagtotaal, 70, 120);

    }

    class bierActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double prijs = Bestellingtotaal + BierPrijs;
            double dagprijs = Dagtotaal + BierPrijs;
            Bestellingtotaal = prijs;
            Dagtotaal = dagprijs;
            repaint();


        }
    }

    class wijnActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double prijs = Bestellingtotaal + BierPrijs;
            double dagprijs = Dagtotaal + BierPrijs;
            Bestellingtotaal = prijs;
            Dagtotaal = dagprijs;
            repaint();

        }
    }

    class frisActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double prijs = Bestellingtotaal + FrisPrijs;
            double dagprijs = Dagtotaal + FrisPrijs;
            Bestellingtotaal = prijs;
            Dagtotaal = dagprijs;
            repaint();

        }
    }

    class koffieActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double prijs = Bestellingtotaal + KoffiePrijs;
            double dagprijs = Dagtotaal + KoffiePrijs;
            Bestellingtotaal = prijs;
            Dagtotaal = dagprijs;
            repaint();

        }
    }

    class binnenActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double prijs = Bestellingtotaal + BinngedistPrijs;
            double dagprijs = Dagtotaal + BinngedistPrijs;
            Bestellingtotaal = prijs;
            Dagtotaal = dagprijs;
            repaint();

        }
    }

    class buitenActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double prijs = Bestellingtotaal + BuitgedistPrijs;
            double dagprijs = Dagtotaal + BuitgedistPrijs;
            Bestellingtotaal = prijs;
            Dagtotaal = dagprijs;
            repaint();

        }
    }

    class nieuwActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Bestellingtotaal = 0;


            repaint();


        }
    }

}
