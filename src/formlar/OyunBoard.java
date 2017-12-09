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
import java.util.Iterator;
import java.util.Objects;
import javax.swing.JButton;
import javax.swing.JFrame;


/**
 *
 * @author asus
 */
public class OyunBoard extends javax.swing.JFrame {
    String kulAdi;
    String ip;
    oyunyuz startoyun;
    TwoPanel startoyun2;
    TwoPanel2 startoyun3;
    ArrayList<GemiList> blok ;  //gemilerin koordinatlarının tutulduğu liste
    ArrayList<SecimButton> buttonblok ;  //tıklanan butonların tutulduğu liste
    ArrayList<Integer> Gemiidlist;
    String[][] tikbuton = new String [10][10];
    SecimButton btn;  //uton değişkeni
    int gemiSize;   //seçilen geminin boyutunu tutan değişken
    boolean yon, tikgemi;  //yön geminin yerleşme ekseni ,tikgemi gemi seçilmiş mi kontrol edilen değişken
    int Gemiid; //seçilen geminin idsi
    private static final int N = 10;  // oyun tahtası boyutu
    int oyuncesit;
    
    public OyunBoard(String kulAdi, String ip,int oyuncesit) {   
        
        this.kulAdi =kulAdi;
        this.ip =ip;
   
        this.setLocationRelativeTo(null);
        this.setTitle("Gemi Yerleşimi"); 
        initComponents(); 
        this.setLocation(630, 200);
        lblboslukyatay.setText("\t Y:  1\t \t \t \t  \t \t \t \t \t \t \t \t \t \t2\t \t \t \t \t \t \t \t \t \t \t \t \t \t \t"
                + "3\t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t\t4\t\t \t \t \t \t \t \t \t \t \t \t \t \t \t\t5"
                + " \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t\t6\t \t \t \t \t \t \t \t \t \t \t \t \t \t \t\t \t7\t \t \t \t \t\t \t \t \t \t \t \t \t \t \t \t8\t \t \t "
                + "\t \t \t \t \t \t \t \t \t \t \t \t \t9\t \t \t \t \t \t \t \t \t \t \t \t10");
  
        lblnick.setText(kulAdi);
        blok =new ArrayList<>() ;  //konulan gemilerin id ve boylarına göre koordinatlarının tutulduğu yer
        buttonblok =new ArrayList<>();  //buton için liste oluşturuldu
        Gemiidlist =new ArrayList<>(); //hangi gemilerin yerleştrildiklerini tutan array
        gemiSize=0;  //gemi boyutu sıfırlandı
        yon =true;  //yön yatay eksene set edildi
        tikgemi=false;  //gemi seçim değerini sıfırladık
        this.oyuncesit=oyuncesit;
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
      
        this.setResizable(false);
        this.setSize(950, 630);
        final  int i=0;
        
           for (int x = 0; x < N; x++) {  //buton dizilimi için matris yapsı oluşturulup iç içe döngü yapıldı
        for (int y = 0; y < N ; y++) {
            {    btn =new SecimButton(x,y);
                            board.add(btn);
                            buttonblok.add(btn);
            }
          
                      btn.addMouseListener(new MouseAdapter() {  //mause tıklama eventi butonlara eklendi
                
                    @Override
                    public void mouseClicked(MouseEvent e) {
                      
                        System.out.println("butona");
                      
                           SecimButton test ;
                        test = (SecimButton) e.getComponent();
                        lblkoord.setText("X : " +(test.getIdx()+1)+"  "+"Y : "+(test.getIdy()+1));
                        boolean sonuc = gemidiz( Gemiid,gemiSize,yon,test.getIdx(),test.getIdy());
                       if(sonuc)  //tıklanan gemi diziye konmak üzere gemidiz fonksiyonuna gönderildi
                       {
                        gemiboyagreen( test,gemiSize,yon);  //geminin rengini boya fonksiyonu
                        tikgemi=false;
                       }

                    }
                });
        }}}
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnUcakGemisi = new javax.swing.JButton();
        txtKullanici = new javax.swing.JLabel();
        btnOyna = new javax.swing.JButton();
        btnMayinGemisi = new javax.swing.JButton();
        btnFirkateyn = new javax.swing.JButton();
        btnDenizAlti = new javax.swing.JButton();
        btnKruvazor = new javax.swing.JButton();
        board = new javax.swing.JPanel();
        btnDondur = new javax.swing.JButton();
        btnYeni = new javax.swing.JButton();
        lblyon = new java.awt.Label();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        lblgemi = new java.awt.Label();
        lblkoord = new java.awt.Label();
        label3 = new java.awt.Label();
        lbluyari = new java.awt.Label();
        lblnick = new java.awt.Label();
        lblboslukyatay = new java.awt.Label();
        lblboslukdikey = new java.awt.Label();
        lblboslukdikey1 = new java.awt.Label();
        lblboslukdikey2 = new java.awt.Label();
        lblboslukdikey3 = new java.awt.Label();
        lblboslukdikey4 = new java.awt.Label();
        lblboslukdikey5 = new java.awt.Label();
        lblboslukdikey6 = new java.awt.Label();
        lblboslukdikey7 = new java.awt.Label();
        lblboslukdikey8 = new java.awt.Label();
        lblboslukdikey9 = new java.awt.Label();
        lblboslukdikey10 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnUcakGemisi.setBackground(java.awt.Color.lightGray);
        btnUcakGemisi.setText("Ucak Gemisi");
        btnUcakGemisi.setName("btnUcakGemisi"); // NOI18N
        btnUcakGemisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUcakGemisiActionPerformed(evt);
            }
        });

        txtKullanici.setText("Kullanıcı Adı");
        txtKullanici.setName("txtKul"); // NOI18N

        btnOyna.setBackground(new java.awt.Color(0, 153, 204));
        btnOyna.setText("Oyna");
        btnOyna.setName("bynOyna"); // NOI18N
        btnOyna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOynaActionPerformed(evt);
            }
        });

        btnMayinGemisi.setBackground(java.awt.Color.lightGray);
        btnMayinGemisi.setText("MayGemisi");
        btnMayinGemisi.setToolTipText("");
        btnMayinGemisi.setName("btnMayinGemisi"); // NOI18N
        btnMayinGemisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMayinGemisiActionPerformed(evt);
            }
        });

        btnFirkateyn.setBackground(java.awt.Color.lightGray);
        btnFirkateyn.setText("Fırkateyn");
        btnFirkateyn.setName("btnFirkateyn"); // NOI18N
        btnFirkateyn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirkateynActionPerformed(evt);
            }
        });

        btnDenizAlti.setBackground(java.awt.Color.lightGray);
        btnDenizAlti.setText("Denizaltı");
        btnDenizAlti.setName("btnDenizAlti"); // NOI18N
        btnDenizAlti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDenizAltiActionPerformed(evt);
            }
        });

        btnKruvazor.setBackground(java.awt.Color.lightGray);
        btnKruvazor.setText("Kruvazor");
        btnKruvazor.setName("btnKruvazor"); // NOI18N
        btnKruvazor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKruvazorActionPerformed(evt);
            }
        });

        board.setBackground(new java.awt.Color(0, 102, 102));
        board.setName("board"); // NOI18N
        board.setLayout(new java.awt.GridLayout(10, 10));

        btnDondur.setText("Döndür");
        btnDondur.setName("btnDondur"); // NOI18N
        btnDondur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDondurActionPerformed(evt);
            }
        });

        btnYeni.setText("Yeni");
        btnYeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYeniActionPerformed(evt);
            }
        });

        lblyon.setText("Yatay");

        label1.setText("Konum : ");

        label2.setText("Seçili gemi : ");

        lblgemi.setText("Yok");

        label3.setText("Seçili Koordinat :");

        lbluyari.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        lblnick.setFont(new java.awt.Font("Microsoft JhengHei", 3, 12)); // NOI18N
        lblnick.setText("KulAdi");

        lblboslukdikey.setAlignment(java.awt.Label.RIGHT);
        lblboslukdikey.setText("2");

        lblboslukdikey1.setAlignment(java.awt.Label.RIGHT);
        lblboslukdikey1.setText("1");

        lblboslukdikey2.setAlignment(java.awt.Label.RIGHT);
        lblboslukdikey2.setText("3");

        lblboslukdikey3.setAlignment(java.awt.Label.RIGHT);
        lblboslukdikey3.setText("4");

        lblboslukdikey4.setAlignment(java.awt.Label.RIGHT);
        lblboslukdikey4.setText("6");

        lblboslukdikey5.setAlignment(java.awt.Label.RIGHT);
        lblboslukdikey5.setText("5");

        lblboslukdikey6.setAlignment(java.awt.Label.RIGHT);
        lblboslukdikey6.setText("8");

        lblboslukdikey7.setAlignment(java.awt.Label.RIGHT);
        lblboslukdikey7.setText("10");

        lblboslukdikey8.setAlignment(java.awt.Label.RIGHT);
        lblboslukdikey8.setText("9");

        lblboslukdikey9.setAlignment(java.awt.Label.RIGHT);
        lblboslukdikey9.setText("7");

        lblboslukdikey10.setAlignment(java.awt.Label.RIGHT);
        lblboslukdikey10.setText("X:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblboslukyatay, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUcakGemisi, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnKruvazor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDenizAlti, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFirkateyn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMayinGemisi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtKullanici))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblnick, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblyon, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblgemi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnYeni, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDondur, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(btnOyna, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbluyari, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblkoord, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(board, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                .addContainerGap(180, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtKullanici, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblnick, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblyon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblgemi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(btnUcakGemisi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnKruvazor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(btnDenizAlti, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnFirkateyn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnMayinGemisi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnYeni, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDondur, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOyna, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(lblboslukyatay, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(board, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
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
                                .addComponent(lblboslukdikey7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblkoord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbluyari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUcakGemisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUcakGemisiActionPerformed
       System.out.println("ucak gemisi");
       gemiSize =5;
       Gemiid=1;
       tikgemi =true;
       lblgemi.setText("Uçak gemisi");
       lbluyari.setText("");
    }//GEN-LAST:event_btnUcakGemisiActionPerformed

    private void btnKruvazorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKruvazorActionPerformed
        System.out.println("kruvazor");
        gemiSize =4;
          Gemiid=2;
       tikgemi =true;
        lblgemi.setText("Kruvazör");
        lbluyari.setText("");
    }//GEN-LAST:event_btnKruvazorActionPerformed

    private void btnDenizAltiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDenizAltiActionPerformed
               
        System.out.println("DenizAltı");
        gemiSize =3;
        Gemiid=3;
       tikgemi =true;
        lblgemi.setText("Deniz Altı");
        lbluyari.setText("");
    }//GEN-LAST:event_btnDenizAltiActionPerformed

    private void btnFirkateynActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirkateynActionPerformed
          System.out.println("fırkateyn");
       gemiSize =3;
       Gemiid=4;
       tikgemi =true;
       lblgemi.setText("Fırkatey");
       lbluyari.setText("");
    }//GEN-LAST:event_btnFirkateynActionPerformed

    private void btnMayinGemisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMayinGemisiActionPerformed
         System.out.println("mayıngemisi");
        gemiSize =2;
        Gemiid=5;
        tikgemi =true;
        lblgemi.setText("Mayın Gemisi");
        lbluyari.setText("");
    }//GEN-LAST:event_btnMayinGemisiActionPerformed

    private void btnDondurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDondurActionPerformed
                  
      if(yon)
      {
        yon=false;
        lblyon.setText("Dikey");
      }
      else
      {
         yon=true;
         lblyon.setText("Yatay");
      }
    }//GEN-LAST:event_btnDondurActionPerformed

    private void btnYeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYeniActionPerformed
    blok.clear();  //gemilerin koordinatlarının tutulduğu liste
    Gemiidlist.clear();
    gemiSize=0;  //gemi boyutu sıfırlandı
    yon =true;  //yön yatay eksene set edildi
    tikgemi=false;
    
    Iterator<SecimButton> iterator =buttonblok.iterator();
    while(iterator.hasNext())
    {
        SecimButton btn = iterator.next();
        btn.setBackground(Color.CYAN);
    }

    btnDenizAlti.setBackground(Color.LIGHT_GRAY);
    btnDenizAlti.setEnabled(true);
    btnFirkateyn.setBackground(Color.LIGHT_GRAY);
    btnFirkateyn.setEnabled(true);
    btnKruvazor.setBackground(Color.LIGHT_GRAY);
    btnKruvazor.setEnabled(true);
    btnMayinGemisi.setBackground(Color.LIGHT_GRAY);
    btnMayinGemisi.setEnabled(true);
    btnUcakGemisi.setBackground(Color.LIGHT_GRAY);
    btnUcakGemisi.setEnabled(true);
    
    }//GEN-LAST:event_btnYeniActionPerformed

    private void btnOynaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOynaActionPerformed
   
        if(17==Gemiidlist.size()) //17 sayısı koyulması gereken fix koordinat noktası sayısı
        {
           if(this.oyuncesit ==2)
           { startoyun2 =new TwoPanel(blok,kulAdi,ip);
             startoyun2.setVisible(true);
             this.hide();}
             else  if(this.oyuncesit ==3 )
             {startoyun3 =new TwoPanel2(blok,kulAdi,ip);
             startoyun3.setVisible(true);
             this.hide();
             }
             else{
             startoyun =new oyunyuz(blok,kulAdi,ip);
             startoyun.setVisible(true);
             this.hide();  
                     
             }
        }
        else
        {  lbluyari.setText("Bütün gemileri yerleştirmelisiniz");}

    }//GEN-LAST:event_btnOynaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel board;
    private javax.swing.JButton btnDenizAlti;
    private javax.swing.JButton btnDondur;
    private javax.swing.JButton btnFirkateyn;
    private javax.swing.JButton btnKruvazor;
    private javax.swing.JButton btnMayinGemisi;
    private javax.swing.JButton btnOyna;
    private javax.swing.JButton btnUcakGemisi;
    private javax.swing.JButton btnYeni;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label lblboslukdikey;
    private java.awt.Label lblboslukdikey1;
    private java.awt.Label lblboslukdikey10;
    private java.awt.Label lblboslukdikey2;
    private java.awt.Label lblboslukdikey3;
    private java.awt.Label lblboslukdikey4;
    private java.awt.Label lblboslukdikey5;
    private java.awt.Label lblboslukdikey6;
    private java.awt.Label lblboslukdikey7;
    private java.awt.Label lblboslukdikey8;
    private java.awt.Label lblboslukdikey9;
    private java.awt.Label lblboslukyatay;
    private java.awt.Label lblgemi;
    private java.awt.Label lblkoord;
    private java.awt.Label lblnick;
    private java.awt.Label lbluyari;
    private java.awt.Label lblyon;
    private javax.swing.JLabel txtKullanici;
    // End of variables declaration//GEN-END:variables

  public boolean gemidiz(int Gemiid,int boyut,boolean eksen,int x, int y)
  {
     GemiList gemi;
     int size =boyut;
     int size2 =boyut;
     
     
      if(GemiVarMi(Gemiid)) return false;
      if(koordinatsina(boyut ,eksen ,x,y)) return false;
     
     if(tikgemi)
            { if(eksen && bulbenigemi(x,y)!= null )
                
                    {
                        if(y+size2<= 10)
                        {
                            for(int i=size ;i>0; i--)
                            {
                              gemi =new GemiList();
                              gemi.id=Gemiid;
                              gemi.a=x;
                              gemi.b =y;
                              y++;
                              blok.add(gemi);
                              Gemiidlist.add(Gemiid);
                            
                            }
                                   butonukapa(Gemiid) ;
                                   lblgemi.setText("Yok");
                        }
                            
                        
                        else{
                            lbluyari.setText("Panelin alanı dışına gemi yerleştirilemez");
                            return false;
                        }
                      

                    }
            else
                    {

                        if(x+size2<= 10)
                        {
                            for(int i=size ;i>0; i--)
                            {
                              gemi =new GemiList();
                              gemi.id=Gemiid;
                              gemi.a=x;
                              gemi.b =y;
                              x++;
                               blok.add(gemi);
                               Gemiidlist.add(Gemiid);
                            }
                               butonukapa(Gemiid) ;
                               lblgemi.setText("Yok");
                        }
                        else{return false;}


                    }   
            }
     else {
         
         lbluyari.setText("Bir gemi seçiniz ");
         return false;}

     return true;
  }
    private boolean GemiVarMi(Integer Gemiid) 
{
      Iterator<Integer> iter =Gemiidlist.iterator();
         
      while(iter.hasNext())
      {
          
          Integer currentIter =  iter.next();
          
       if( Objects.equals(currentIter, Gemiid)){
           return true;
       }
       
      }
      return false;

}
    private void gemiboyagreen(SecimButton test, int boyut, boolean eksen) {
      SecimButton gemi;
      int size =boyut;
      int xeksen=test.idx;
      int yeksen=test.idy;
         System.out.println(boyut);
  
            if(eksen)
                    {
              
                    for(int i=size ;i>0; i--)
                    {
                        SecimButton currentButton = bulbeni(xeksen, yeksen);
                        currentButton.setBackground(Color.GREEN);
                        yeksen++;

                    }
                           
            }
            else
            {
                    for(int i=size ;i>0; i--)
                    {
                        SecimButton currentButton = bulbeni(xeksen, yeksen);
                        currentButton.setBackground(Color.GREEN);
                         xeksen++;
                    }

            }  
        lbluyari.setText("");
    
    }


    private void butonukapa(Integer gemiid) {
      
          
       switch (gemiid) {
            case 1:
                    btnUcakGemisi.setBackground(Color.red);
                    btnUcakGemisi.setEnabled(false);
                     break;
            case 2:  
                    btnKruvazor.setBackground(Color.red);
                    btnKruvazor.setEnabled(false);
                     break;
            case 3:  
                    btnDenizAlti.setBackground(Color.red);
                    btnDenizAlti.setEnabled(false);
                     break;
            case 4:  
                    btnFirkateyn.setBackground(Color.red);
                    btnFirkateyn.setEnabled(false);
                     break;
            case 5:  
                    btnMayinGemisi.setBackground(Color.red);
                    btnMayinGemisi.setEnabled(false);
                     break;
           
            default: 
                     break;
        }
      
      }
      
    private boolean koordinatsina(Integer boyut, boolean yon, Integer x,Integer y) 
      {      GemiList uye ;
             Integer i;
             Integer sabit ;
           
            if(yon)
            {
                sabit =x;
                int yi=0;
                for(i=0 ;i<boyut ;i++){
                      yi=i+y;
                     boolean t= checkkoord(sabit ,yi );
                     if(t)return true;
                }
                     
               
            }
            else
            {       
                  sabit =y;
                  int xi=0;
                 for(i=0 ;i<boyut ;i++){
                    xi=i+x;
                     boolean t= checkkoord( xi,sabit );
                     if(t)return true;
                }
            }
            
 
            return false;
      }
    public boolean checkkoord(int x ,int y )
    {
                 Iterator<GemiList> iter =blok.iterator();
            while(iter.hasNext())
             {
          
                GemiList currentblok=  iter.next();


                if( currentblok.a==x && currentblok.b == y ){
                    lbluyari.setText("Kesişen gemiler var");
                    return true;  //bir eşitlik var ise daha önce gemi yerleştirdiğimiz koordinatladan birine gemi koymaya çalışıyoruz demek
                }

              }
             
          return false;
    }
      
    public SecimButton bulbeni(int n,int m)
    {
        Iterator<SecimButton> iter =buttonblok.iterator();
      while(iter.hasNext())
      {
          
          SecimButton currentButton =  iter.next();
          
       if( currentButton.idx ==n && currentButton.idy == m ){
           return currentButton;
       }
       
      }
      return null;
    }

    public SecimButton bulbenigemi(int n,int m)
    {
        Iterator<SecimButton> iter =buttonblok.iterator();
      while(iter.hasNext())
      {
          
          SecimButton currentButton =  iter.next();
          
       if( currentButton.idx ==n && currentButton.idy == m ){
           return currentButton;
       }
       
      }
      return null;
    }
    

}






