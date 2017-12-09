/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formlar;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.net.InetAddress;
import java.net.NetworkInterface;
/**
 *
 * @author asus
 */
public class AnaSayfa extends javax.swing.JFrame {
    
    public OyunBoard GemiYerlesim;
    public Boolean secim;
    public String KulAdi;
    public String ip;
    public boolean oyuntur;
    public int oyuncesit;
    public AnaSayfa() {
        this.setLocation(700, 400);
        initComponents();
        this.setTitle("Amiral Battı");
     
      this.setLocation(700, 400);
      lblkarsiip.setVisible(false);
      txtip.setVisible(false);
      oyuntur =true;
      rbbilkar.setSelected(true);
      chsunucu.setVisible(false); 
     oyuncesit =0;
      try{
      InetAddress  ss =InetAddress.getLocalHost();
       ipadresin.setText(ss.getHostAddress());}
      catch(Exception e){}
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        txtnick = new javax.swing.JTextField();
        btnoyunabasla = new javax.swing.JButton();
        lblkarsiip = new javax.swing.JLabel();
        txtip = new javax.swing.JTextField();
        rbbilkar = new javax.swing.JRadioButton();
        rbikikar = new javax.swing.JRadioButton();
        ipadresin = new java.awt.Label();
        label2 = new java.awt.Label();
        chsunucu = new javax.swing.JCheckBox();

        jMenuItem1.setText("jMenuItem1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jRadioButton3.setText("jRadioButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);

        jLabel1.setText("Kullanıcı Adı :");

        txtnick.setText("admin");
        txtnick.setName("KulAdi"); // NOI18N

        btnoyunabasla.setText("Oyuna Başla");
        btnoyunabasla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnoyunabaslaActionPerformed(evt);
            }
        });

        lblkarsiip.setText("İkinci Oyuncu ip :");

        txtip.setText("192.168.");

        rbbilkar.setText("Bilgisayara Karşı");
        rbbilkar.setHideActionText(true);
        rbbilkar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbbilkarActionPerformed(evt);
            }
        });

        rbikikar.setText("İki kişi");
        rbikikar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbikikarActionPerformed(evt);
            }
        });

        ipadresin.setText("label1");

        label2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        label2.setText("ip adresin : ");

        chsunucu.setText("Sunucu Benim");
        chsunucu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chsunucuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnoyunabasla)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbbilkar)
                                    .addComponent(rbikikar))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(lblkarsiip)))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtip, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtnick, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chsunucu)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ipadresin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtnick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbbilkar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbikikar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblkarsiip)
                                .addComponent(txtip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chsunucu)
                        .addGap(38, 38, 38)
                        .addComponent(btnoyunabasla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ipadresin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbbilkarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbbilkarActionPerformed
       oyuntur =true;
      lblkarsiip.setVisible(false);
      txtip.setVisible(false);
      rbbilkar.setSelected(true);
      rbikikar.setSelected(false);
          chsunucu.setVisible(false); 
    }//GEN-LAST:event_rbbilkarActionPerformed

    private void rbikikarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbikikarActionPerformed
      oyuntur=false;
      lblkarsiip.setVisible(true);
      txtip.setVisible(true);
          
      rbbilkar.setSelected(false);
      rbikikar.setSelected(true);     
      chsunucu.setVisible(true);
    }//GEN-LAST:event_rbikikarActionPerformed

    private void btnoyunabaslaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnoyunabaslaActionPerformed
       if(rbikikar.isSelected() )
       {
            
          if(chsunucu.isSelected())
          { oyuncesit =2;}
          else{ oyuncesit =3;}     
       } 
       else
       {
           oyuncesit =1;

       }
       GemiYerlesim =new OyunBoard(txtnick.getText(),txtip.getText(),oyuncesit);
       GemiYerlesim.setVisible(true);
         this.hide();
    }//GEN-LAST:event_btnoyunabaslaActionPerformed

    private void chsunucuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chsunucuActionPerformed
        if(chsunucu.isSelected())
        { 
            txtip.setEnabled(false);   
        }
        else
             txtip.setEnabled(true);    
    
    }//GEN-LAST:event_chsunucuActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnoyunabasla;
    private javax.swing.JCheckBox chsunucu;
    private java.awt.Label ipadresin;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JRadioButton jRadioButton3;
    private java.awt.Label label2;
    private javax.swing.JLabel lblkarsiip;
    private javax.swing.JRadioButton rbbilkar;
    private javax.swing.JRadioButton rbikikar;
    private javax.swing.JTextField txtip;
    private javax.swing.JTextField txtnick;
    // End of variables declaration//GEN-END:variables
}
