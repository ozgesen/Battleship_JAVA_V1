/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formlar;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import formlar.OyunBoard;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.Objects;
import java.util.Random;
import java.util.TimerTask;
import javax.swing.JOptionPane;
import java.util.Timer;

/**
 *
 * @author asus
 */
public class oyunyuz extends javax.swing.JFrame {

    PlayGame play;
    String kulAdi;
    String ip;
    SecimButton btn;
    SeninLabel label;
    ArrayList<GemiList> benimgemiler;
    ArrayList<GemiList> onungemiler;
    ArrayList<Integer> Gemiidlist2;
    ArrayList<SeninLabel> tumlabeller;
    boolean sirakimde;
    boolean sonuc;
    int value;

    /**
     * Creates new form oyunyuz
     *
     * @param benimgemiler
     * @param kulAdi
     * @param ip
     */
    public oyunyuz(ArrayList<GemiList> benimgemiler, String kulAdi, String ip) {

        this.setLocation(480, 100);
        initComponents();

        this.benimgemiler = benimgemiler;
        this.kulAdi = kulAdi;
        this.ip = ip;

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(1200, 750);
        String ss = "\t Y:  1\t \t \t\t \t \t \t \t \t \t 2\t \t \t \t \t \t  \t \t \t \t"
                + "3\t \t \t \t \t \t \t \t \t\t \t \t \t4\t\t \t \t \t \t \t \t \t \t \t \t\t5"
                + " \t \t \t \t \t \t \t \t \t \t \t \t6\t \t \t \t \t \t \t \t \t \t \t \t7"
                + "\t \t \t \t \t\t \t \t \t \t \t8\t \t \t "
                + "\t \t \t \t \t \t \t \t 9\t \t \t \t \t \t \t \t \t \t \t10";

        lbletiket.setText(ss);
        lbletiket2.setText(ss);
        lblseninad.setText(kulAdi);
        lblonunad.setText("Computer");
        lblseninscore.setText("0");
        lblonunscore.setText("0");
        Gemiidlist2 = new ArrayList<>();
        onungemiler = new ArrayList<>();
        tumlabeller = new ArrayList<>();
        sirakimde = true;
        sonuc = true;

        karsigemileridiz();
        play = new PlayGame(benimgemiler, onungemiler, lblonunscore, lblseninscore, kulAdi);
        for (int x = 0; x < 10; x++) {  //buton dizilimi için matris yapsı oluşturulup iç içe döngü yapıldı
            for (int y = 0; y < 10; y++) {
                {
                    btn = new SecimButton(x, y);
                    label = new SeninLabel(x, y);
                    tumlabeller.add(label);
                    koordkoy(label);
                    jPanel2.add(btn);
                    seninpanel.add(label);

                    btn.addMouseListener(new MouseAdapter() {  //mause tıklama eventi butonlara eklendi

                        @Override
                        public void mouseClicked(MouseEvent e) {

                            if (sirakimde) {
                                System.out.println("SIRABENDE");

                                SecimButton test;
                                test = (SecimButton) e.getComponent();
                                if (test.getBackground() == Color.CYAN) {
                                    sirakimde = play.oyuncuOyna(test);
                                    playGame();
                                    play.scoreguncel();

                                }
                            }
                        }
                    });

                }

            }
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        seninpanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblseninscore = new java.awt.Label();
        lblonunad = new java.awt.Label();
        lblseninad = new java.awt.Label();
        lblonunscore = new java.awt.Label();
        lblboslukdikey10 = new java.awt.Label();
        lblboslukdikey9 = new java.awt.Label();
        lblboslukdikey8 = new java.awt.Label();
        lblboslukdikey7 = new java.awt.Label();
        lblboslukdikey = new java.awt.Label();
        lblboslukdikey1 = new java.awt.Label();
        lblboslukdikey3 = new java.awt.Label();
        lblboslukdikey4 = new java.awt.Label();
        lblboslukdikey5 = new java.awt.Label();
        lblboslukdikey6 = new java.awt.Label();
        lblboslukdikey2 = new java.awt.Label();
        lblboslukdikey11 = new java.awt.Label();
        lblboslukdikey12 = new java.awt.Label();
        lblboslukdikey13 = new java.awt.Label();
        lblboslukdikey14 = new java.awt.Label();
        lblboslukdikey15 = new java.awt.Label();
        lblboslukdikey16 = new java.awt.Label();
        lblboslukdikey17 = new java.awt.Label();
        lblboslukdikey18 = new java.awt.Label();
        lblboslukdikey19 = new java.awt.Label();
        lblboslukdikey20 = new java.awt.Label();
        lblboslukdikey21 = new java.awt.Label();
        lbletiket = new java.awt.Label();
        lbletiket2 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Oyuncu 1 :");

        jLabel2.setText(":  Oyuncu 2");

        seninpanel.setBackground(new java.awt.Color(0, 153, 153));
        seninpanel.setLayout(new java.awt.GridLayout(10, 10));

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setLayout(new java.awt.GridLayout(10, 10));

        jLabel3.setText("Score :");

        jLabel4.setText(": Score");

        lblseninscore.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblseninscore.setText("label1");

        lblonunad.setAlignment(java.awt.Label.RIGHT);
        lblonunad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblonunad.setText("label1");

        lblseninad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblseninad.setText("label1");

        lblonunscore.setAlignment(java.awt.Label.RIGHT);
        lblonunscore.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblonunscore.setText("label1");

        lblboslukdikey10.setAlignment(java.awt.Label.RIGHT);
        lblboslukdikey10.setText("X:");

        lblboslukdikey9.setAlignment(java.awt.Label.RIGHT);
        lblboslukdikey9.setText("7");

        lblboslukdikey8.setAlignment(java.awt.Label.RIGHT);
        lblboslukdikey8.setText("9");

        lblboslukdikey7.setAlignment(java.awt.Label.RIGHT);
        lblboslukdikey7.setText("10");

        lblboslukdikey.setAlignment(java.awt.Label.RIGHT);
        lblboslukdikey.setText("2");

        lblboslukdikey1.setAlignment(java.awt.Label.RIGHT);
        lblboslukdikey1.setText("1");

        lblboslukdikey3.setAlignment(java.awt.Label.RIGHT);
        lblboslukdikey3.setText("4");

        lblboslukdikey4.setAlignment(java.awt.Label.RIGHT);
        lblboslukdikey4.setText("6");

        lblboslukdikey5.setAlignment(java.awt.Label.RIGHT);
        lblboslukdikey5.setText("5");

        lblboslukdikey6.setAlignment(java.awt.Label.RIGHT);
        lblboslukdikey6.setText("8");

        lblboslukdikey2.setAlignment(java.awt.Label.RIGHT);
        lblboslukdikey2.setText("3");

        lblboslukdikey11.setAlignment(java.awt.Label.RIGHT);
        lblboslukdikey11.setText("5");

        lblboslukdikey12.setAlignment(java.awt.Label.RIGHT);
        lblboslukdikey12.setText("6");

        lblboslukdikey13.setAlignment(java.awt.Label.RIGHT);
        lblboslukdikey13.setText("3");

        lblboslukdikey14.setAlignment(java.awt.Label.RIGHT);
        lblboslukdikey14.setText("8");

        lblboslukdikey15.setAlignment(java.awt.Label.RIGHT);
        lblboslukdikey15.setText("X:");

        lblboslukdikey16.setAlignment(java.awt.Label.RIGHT);
        lblboslukdikey16.setText("1");

        lblboslukdikey17.setAlignment(java.awt.Label.RIGHT);
        lblboslukdikey17.setText("4");

        lblboslukdikey18.setAlignment(java.awt.Label.RIGHT);
        lblboslukdikey18.setText("10");

        lblboslukdikey19.setAlignment(java.awt.Label.RIGHT);
        lblboslukdikey19.setText("2");

        lblboslukdikey20.setAlignment(java.awt.Label.RIGHT);
        lblboslukdikey20.setText("7");

        lblboslukdikey21.setAlignment(java.awt.Label.RIGHT);
        lblboslukdikey21.setText("9");

        lbletiket.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbletiket.setText("label1");

        lbletiket2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbletiket2.setText("label1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblseninad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblseninscore, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblonunscore, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblonunad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(seninpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbletiket2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblboslukdikey1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblboslukdikey, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblboslukdikey2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblboslukdikey3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblboslukdikey5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblboslukdikey4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblboslukdikey9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblboslukdikey6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblboslukdikey8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblboslukdikey7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblboslukdikey10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbletiket, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblboslukdikey16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblboslukdikey19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblboslukdikey13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblboslukdikey17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblboslukdikey11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblboslukdikey12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblboslukdikey20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblboslukdikey14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblboslukdikey21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblboslukdikey18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblboslukdikey15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2))
                    .addComponent(lblseninad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblonunad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblseninscore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblonunscore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblboslukdikey15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblboslukdikey16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(lblboslukdikey19, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(lblboslukdikey13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(lblboslukdikey17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(lblboslukdikey11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(lblboslukdikey12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(lblboslukdikey20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(lblboslukdikey14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(lblboslukdikey21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(lblboslukdikey18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblboslukdikey10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblboslukdikey1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(lblboslukdikey, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(lblboslukdikey2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(lblboslukdikey3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(lblboslukdikey5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(lblboslukdikey4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(lblboslukdikey9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(lblboslukdikey6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(lblboslukdikey8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(lblboslukdikey7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbletiket2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(seninpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lbletiket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(543, Short.MAX_VALUE))
        );

        lblonunscore.getAccessibleContext().setAccessibleName("300");

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private java.awt.Label lblboslukdikey;
    private java.awt.Label lblboslukdikey1;
    private java.awt.Label lblboslukdikey10;
    private java.awt.Label lblboslukdikey11;
    private java.awt.Label lblboslukdikey12;
    private java.awt.Label lblboslukdikey13;
    private java.awt.Label lblboslukdikey14;
    private java.awt.Label lblboslukdikey15;
    private java.awt.Label lblboslukdikey16;
    private java.awt.Label lblboslukdikey17;
    private java.awt.Label lblboslukdikey18;
    private java.awt.Label lblboslukdikey19;
    private java.awt.Label lblboslukdikey2;
    private java.awt.Label lblboslukdikey20;
    private java.awt.Label lblboslukdikey21;
    private java.awt.Label lblboslukdikey3;
    private java.awt.Label lblboslukdikey4;
    private java.awt.Label lblboslukdikey5;
    private java.awt.Label lblboslukdikey6;
    private java.awt.Label lblboslukdikey7;
    private java.awt.Label lblboslukdikey8;
    private java.awt.Label lblboslukdikey9;
    private java.awt.Label lbletiket;
    private java.awt.Label lbletiket2;
    private java.awt.Label lblonunad;
    private java.awt.Label lblonunscore;
    private java.awt.Label lblseninad;
    private java.awt.Label lblseninscore;
    private javax.swing.JPanel seninpanel;
    // End of variables declaration//GEN-END:variables

    private void koordkoy(SeninLabel label) {

        Iterator<GemiList> iter = benimgemiler.iterator();
        while (iter.hasNext()) {

            GemiList gemi = iter.next();

            if (gemi.a == label.idx && gemi.b == label.idy) {
                label.setBackground(Color.orange);
            }

        }
    }

    private void karsigemileridiz() {

        Integer sayac = 5;
        boolean flag = true;

        while (flag) {

            Random generator = new Random();
            Integer Cx = generator.nextInt(10);
            Integer Cy = generator.nextInt(10);
            Integer Cyon = generator.nextInt(2);
            boolean boolCyon = true;

            if (Cyon == 0) {
                boolCyon = true;
            } else {
                boolCyon = false;
            }

            Integer boyuticin = generator.nextInt(5);

            switch (boyuticin) {
                case 0:
                    sonuc = gemidiz(0, 5, boolCyon, Cx, Cy);
                    break;
                case 1:
                    sonuc = gemidiz(1, 4, boolCyon, Cx, Cy);
                    break;
                case 2:
                    sonuc = gemidiz(2, 3, boolCyon, Cx, Cy);
                    break;
                case 3:
                    sonuc = gemidiz(3, 3, boolCyon, Cx, Cy);
                    break;
                case 4:
                    sonuc = gemidiz(4, 2, boolCyon, Cx, Cy);
                    break;
            }
            sayac--;

            if (sonuc == false) {
                sayac++;
            }
            if (sayac.compareTo(0) == 0) {
                flag = false;
            }
            System.out.println(sayac);
        }
    }

    public boolean gemidiz(Integer Gemiid, Integer boyut, boolean eksen, Integer x, Integer y) {
        GemiList gemi;
        int size = boyut;
        int size2 = boyut;

        if (GemiVarMi(Gemiid)) {
            return false;
        }
        if (koordinatsina(boyut, eksen, x, y)) {
            return false;
        }

        if (eksen) {
            if (y + size2 <= 10) {
                for (int i = size; i > 0; i--) {
                    gemi = new GemiList();
                    gemi.a = x;
                    gemi.b = y;
                    gemi.id = Gemiid;
                    y++;
                    onungemiler.add(gemi);

                }
                Gemiidlist2.add(Gemiid);

            } else {

                return false;
            }

        } else {

            if (x + size2 <= 10) {
                for (int i = size; i > 0; i--) {
                    gemi = new GemiList();
                    gemi.a = x;
                    gemi.b = y;
                    x++;
                    onungemiler.add(gemi);

                }
                Gemiidlist2.add(Gemiid);
            } else {
                return false;
            }

        }

        return true;
    }

    private boolean GemiVarMi(Integer Gemiid) {
        Iterator<Integer> iter2 = Gemiidlist2.iterator();

        while (iter2.hasNext()) {

            Integer currentIter = iter2.next();

            if (Objects.equals(currentIter, Gemiid)) {
                return true;
            }

        }
        return false;

    }

    private boolean koordinatsina(Integer boyut, boolean yon, Integer x, Integer y) {
        Integer i;
        Integer sabit;

        if (yon) {
            sabit = x;
            int yi = 0;
            for (i = 0; i < boyut; i++) {
                yi = i + y;
                boolean t = checkkoord(sabit, yi);
                if (t) {
                    return true;
                }
            }

        } else {
            sabit = y;
            int xi = 0;
            for (i = 0; i < boyut; i++) {
                xi = i + x;
                boolean t = checkkoord(xi, sabit);
                if (t) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean checkkoord(int x, int y) {
        Iterator<GemiList> iter2 = onungemiler.iterator();
        while (iter2.hasNext()) {

            GemiList currentgemi = iter2.next();
            if (currentgemi.a == x && currentgemi.b == y) {
                return true;  //bir eşitlik var ise daha önce gemi yerleştirdiğimiz koordinatladan birine gemi koymaya çalışıyoruz demek
            }

        }

        return false;
    }

    private void playGame() {

        if (sirakimde != true) {
//****Alttaki yorumlanmış satır oyuncuyu bekleterek karşılıklı oynanma ambiansıznı vermek için açılabilir
//            try {
//                Thread.sleep(1000);                 //1000 milliseconds is one second.
//            } catch (InterruptedException ex) {
//                Thread.currentThread().interrupt();
//            }
            boolean bittimi = play.ComputerOyna(tumlabeller);

            if (bittimi == false) {
                JOptionPane.showMessageDialog(null, "Computer", "InfoBox: " + "Kazanan", JOptionPane.INFORMATION_MESSAGE);
            }
            sirakimde = true;

        }
    }

}
