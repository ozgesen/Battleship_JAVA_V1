/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formlar;

import formlar.SecimButton;
import java.awt.Color;
import java.awt.Label;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class PlayGame {

    Integer ScoreOyuncu;
    Integer ScoreComputer;
    ArrayList<SecimButton> benimtest;
    // ArrayList<GemiList> onuntest;
    ArrayList<GemiList> benimgemiler;
    ArrayList<GemiList> onungemiler;
    ArrayList<GemiList> onuntumlabellar;
    ArrayList<GemiList> comvurdugemiler;
    SeninLabel label;
    GemiList vurdugemi;
    int oncesivurduMu;
    int denemesayisi;
    Label oyuncu;
    Label computer;
    Integer blacksayac;
    String nick;

    public PlayGame(ArrayList<GemiList> benimgemiler, ArrayList<GemiList> onungemiler, Label computer, Label oyuncu, String nick) {
        ScoreOyuncu = 0;
        ScoreComputer = 0;
        benimtest = new ArrayList<>();
        //   onuntest = new ArrayList<>();
        this.benimgemiler = benimgemiler;
        this.onungemiler = onungemiler;
        this.comvurdugemiler = new ArrayList<>();
        onuntumlabellar = new ArrayList<>();
        GemiList vurdugemi;
        boolean oncesivurduMu = false;
        denemesayisi = 0;
        this.oyuncu = oyuncu;
        this.computer = computer;
        blacksayac = 0;
        this.nick = nick;
    }

    public boolean oyuncuOyna(SecimButton btn) {

        Iterator<GemiList> iter = onungemiler.iterator();
        benimtest.add(btn);
        while (iter.hasNext()) {

            GemiList currentgemi = iter.next();

            if (currentgemi.a == btn.idx && currentgemi.b == btn.idy) {

                btn.setBackground(Color.BLACK);
                blacksayac++;
                oyunbitimi();
                btn.setEnabled(false);
                ScoreOyuncu += 100;

                return true; //bir gemi VURDUM
            }

        }
        btn.setBackground(Color.YELLOW);
        btn.setEnabled(false);

        return false;
    }

    public boolean ComputerOyna(ArrayList<SeninLabel> tumlabeller) {
        boolean durum = true;
        while (durum) {

            GemiList secilenlabel;
            secilenlabel = labelinisec();

            durum = labelvurdumu(secilenlabel);
            labeliboya(secilenlabel, tumlabeller, durum);
            onuntumlabellar.add(secilenlabel);
            this.scoreguncel();
            boolean bittimi = oyunbitimi();
            if (bittimi == true) {
                return false;
            }

        }
        return true;
    }

    private GemiList labelinisec() {
        GemiList uygungemi = new GemiList();
        boolean uygunluk = false;
        int labelx;
        int labely;

        if (oncesivurduMu > 5) {
            return randomgemi();
        } else if (oncesivurduMu < 5 && denemesayisi >= 2 && oncesivurduMu > 2) {

            GemiList test = onungemiler.get(comvurdugemiler.size() - 1);
            GemiList test2 = onungemiler.get(comvurdugemiler.size() - 2);
            if (test.a == test2.a) {
                labelx = test.a;
                labely = test.b + 1;
                uygunluk = checkbosmu(labelx, labely);
                if (uygunluk == true) {
                    uygungemi.a = labelx;
                    uygungemi.b = labely;
                    return uygungemi;

                }

                labelx = test.a;
                labely = test.b - 1;
                uygunluk = checkbosmu(labelx, labely);
                if (uygunluk == true) {
                    uygungemi.a = labelx;
                    uygungemi.b = labely;
                    return uygungemi;

                } else {
                    return randomgemi();
                }

            } else if (test.b == test2.b) {
                labelx = test.a + 1;
                labely = test.b;
                uygunluk = checkbosmu(labelx, labely);
                if (uygunluk == true) {
                    uygungemi.a = labelx;
                    uygungemi.b = labely;
                    return uygungemi;
                }
                labelx = test.a - 1;
                labely = test.b;
                uygunluk = checkbosmu(labelx, labely);
                if (uygunluk == true) {
                    uygungemi.a = labelx;
                    uygungemi.b = labely;
                    return uygungemi;
                } else {
                    return randomgemi();

                }

            } else {
                return randomgemi();

            }

        } else if (oncesivurduMu < 5 && denemesayisi == 1 && oncesivurduMu > 0) {
            uygunluk = false;
            int Cx = vurdugemi.a + 1;
            int Cy = vurdugemi.b;

            uygunluk = checkbosmu(Cx, Cy);
            if (uygunluk == true) {
                uygungemi.a = Cx;
                uygungemi.b = Cy;
                return uygungemi;

            }

            Cx = vurdugemi.a - 1;
            Cy = vurdugemi.b;

            uygunluk = checkbosmu(Cx, Cy);
            if (uygunluk == true) {
                uygungemi.a = Cx;
                uygungemi.b = Cy;
                return uygungemi;

            }
            Cx = vurdugemi.a;
            Cy = vurdugemi.b + 1;

            uygunluk = checkbosmu(Cx, Cy);
            if (uygunluk == true) {
                uygungemi.a = Cx;
                uygungemi.b = Cy;
                return uygungemi;

            }
            Cx = vurdugemi.a;
            Cy = vurdugemi.b - 1;

            uygunluk = checkbosmu(Cx, Cy);
            if (uygunluk == true) {
                uygungemi.a = Cx;
                uygungemi.b = Cy;
                return uygungemi;

            } else {
                oncesivurduMu = 0;
                return randomgemi();
            }
        }

        oncesivurduMu = 0;
        return randomgemi();

    }

    public GemiList randomgemi() {
        while (true) {
            GemiList uygungemi = new GemiList();
            Random generator = new Random();
            int Cx = generator.nextInt(10);
            int Cy = generator.nextInt(10);
            boolean uygunluk = false;
            uygunluk = checkbosmu(Cx, Cy);
            if (uygunluk == true) {
                uygungemi.a = Cx;
                uygungemi.b = Cy;
                return uygungemi;

            }

        }

    }

    private boolean checkbosmu(int labelx, int labely) {

        if (onuntumlabellar.size() > 0) {
            Iterator<GemiList> iter = onuntumlabellar.iterator();

            while (iter.hasNext()) {

                GemiList currentgemi = iter.next();

                if (currentgemi.a == labelx && currentgemi.b == labely) {

                    return false;
                }

            }

        }
        return true;
    }

    private boolean labeliboya(GemiList secilenlabel, ArrayList<SeninLabel> tumlabeller, boolean durum) {
        Iterator<SeninLabel> iter = tumlabeller.iterator();

        while (iter.hasNext()) {

            SeninLabel label = iter.next();

            if (label.idx == secilenlabel.a && label.idy == secilenlabel.b) {
                if (durum == true) {
                    label.setBackground(Color.BLACK);
                } else {
                    label.setBackground(Color.YELLOW);
                }
                return true;
            }

        }
        return false;
    }

    private boolean labelvurdumu(GemiList secilenlabel) {
        Iterator<GemiList> iter = benimgemiler.iterator();

        while (iter.hasNext()) {

            GemiList gemi = iter.next();

            if (gemi.a == secilenlabel.a && gemi.b == secilenlabel.b) {

                ScoreComputer = ScoreComputer + 100;
                oncesivurduMu++;
                vurdugemi = secilenlabel;
                comvurdugemiler.add(secilenlabel);

                return true;
            }

        }
        denemesayisi++;
        oncesivurduMu--;
        return false;
    }

    public void scoreguncel() {
        computer.setText(this.ScoreComputer.toString());
        oyuncu.setText(this.ScoreOyuncu.toString());

    }

    public boolean oyunbitimi() {
        if (comvurdugemiler.size() == 17) {
            return true;
        }
        if (blacksayac >= 17) {
            JOptionPane.showMessageDialog(null, nick, "InfoBox: " + "Kazanan", JOptionPane.INFORMATION_MESSAGE);
        }

        return false;
    }

}
