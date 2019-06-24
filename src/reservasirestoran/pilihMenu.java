/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservasirestoran;

/**
 *
 * @author addsa
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.MessageFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class pilihMenu extends javax.swing.JFrame {

    /**
     * Creates new form pilihMenu
     */
    private DefaultTableModel dtm = new DefaultTableModel();
    BufferedReader br;
    BufferedWriter bw;
    int totalHarga = 0;
    
    public pilihMenu() {
        initComponents();
        dtm.addColumn("Nama Item");
        dtm.addColumn("Harga");
        Tabel.setModel(dtm);

        setLocationRelativeTo(null);
        membacadataMenu();

    }
    public boolean isCellEditable(int rowIndex, int colIndex) {
        return false;
    }
    
    public void membacadataMenu(){
        File file = new File("src/reservasirestoran/stock.txt");

        try {
            FileReader read = new FileReader(file);
            br = new BufferedReader(read);

            String baris;
            String[] dipisah = null;
            String[] stock = new String[255];
            int i = 0;

            while ((baris = br.readLine()) != null) {
                dipisah = baris.split("\\s+");
                stock[i] = dipisah[2];
                i++;
            }

            stockSS.setText(stock[1]);
            stockSP.setText(stock[2]);
            stockC.setText(stock[3]);
            stockIC.setText(stock[4]);
            stockJ.setText(stock[5]);
            stockB.setText(stock[6]);
            stockP.setText(stock[7]);
            
            br.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    public void menulisdataMenu(){
        File file = new File("src/reservasirestoran/stockFood.txt");

        try {
            FileWriter write = new FileWriter(file);
            bw = new BufferedWriter(write);

            bw.write("NO    NAMA    TOTAL");
            bw.newLine();
            bw.write("001 Steak " + stockSS.getText());
            bw.newLine();
            bw.write("002 Spaghetti " + stockSP.getText());
            bw.newLine();
            bw.write("003 Coffee " + stockC.getText());
            bw.newLine();
            bw.write("004 Icream " + stockIC.getText());
            bw.newLine();
            bw.write("005 Juice " + stockJ.getText());
            bw.newLine();
            bw.write("006 Burger " + stockB.getText());
            bw.newLine();
            bw.write("007 Pizaa " + stockP.getText());
            bw.newLine();
            
            bw.close();

        } catch (Exception e) {
            System.out.println(e);
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        ss = new javax.swing.JLabel();
        Rpss = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        stockSS = new javax.swing.JLabel();
        sp = new javax.swing.JLabel();
        Rpsp = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        stockSP = new javax.swing.JLabel();
        c = new javax.swing.JLabel();
        Rpc = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        stockC = new javax.swing.JLabel();
        ic = new javax.swing.JLabel();
        Rpi = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        stockIC = new javax.swing.JLabel();
        j = new javax.swing.JLabel();
        Rpj = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        stockJ = new javax.swing.JLabel();
        b = new javax.swing.JLabel();
        Rpb = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        stockB = new javax.swing.JLabel();
        p = new javax.swing.JLabel();
        Rpp = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        stockP = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabel = new javax.swing.JTable();
        jlabel22 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jlabel23 = new javax.swing.JLabel();
        pembelian = new javax.swing.JTextField();
        pembayaran = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jlabel43 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        kembalian = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jPanel2.setBackground(new java.awt.Color(255, 153, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setText("MENU MAKANAN DAN MINUMAN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel3.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reservasirestoran/Daging-Sapi-Panggang-pedas.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(14, 14, 130, 70);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reservasirestoran/Spagetti-Bolognese11.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(314, 14, 130, 70);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reservasirestoran/coffee guide2.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(14, 184, 130, 70);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reservasirestoran/icecream.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(164, 184, 130, 70);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reservasirestoran/jus-buah_.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(314, 184, 130, 70);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reservasirestoran/burger1.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(14, 344, 130, 70);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reservasirestoran/pizza.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(314, 344, 130, 70);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(310, 340, 140, 80);

        jButton2.setText("jButton1");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(10, 10, 140, 80);

        jButton3.setText("jButton1");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);
        jButton3.setBounds(310, 10, 140, 80);

        jButton4.setText("jButton1");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4);
        jButton4.setBounds(10, 180, 140, 80);

        jButton5.setText("jButton1");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5);
        jButton5.setBounds(160, 180, 140, 80);

        jButton6.setText("jButton1");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6);
        jButton6.setBounds(310, 180, 140, 80);

        jButton7.setText("jButton1");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7);
        jButton7.setBounds(10, 340, 140, 80);

        ss.setText("STEAK SAPI");
        jPanel3.add(ss);
        ss.setBounds(50, 100, 80, 14);

        Rpss.setText("RP 30.000,-");
        jPanel3.add(Rpss);
        Rpss.setBounds(50, 120, 80, 14);

        jLabel11.setText("Stock :");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(20, 140, 40, 14);

        stockSS.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel3.add(stockSS);
        stockSS.setBounds(70, 140, 50, 30);

        sp.setText("SPAGHETTI");
        jPanel3.add(sp);
        sp.setBounds(360, 100, 80, 14);

        Rpsp.setText("RP 20.000,-");
        jPanel3.add(Rpsp);
        Rpsp.setBounds(360, 120, 70, 14);

        jLabel15.setText("Stok :");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(330, 140, 40, 14);

        stockSP.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel3.add(stockSP);
        stockSP.setBounds(380, 140, 50, 30);

        c.setText("COFFEE");
        jPanel3.add(c);
        c.setBounds(60, 270, 70, 14);

        Rpc.setText("RP 10.000,-");
        jPanel3.add(Rpc);
        Rpc.setBounds(50, 290, 70, 14);

        jLabel19.setText("Stock :");
        jPanel3.add(jLabel19);
        jLabel19.setBounds(30, 310, 40, 14);

        stockC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel3.add(stockC);
        stockC.setBounds(70, 310, 50, 20);

        ic.setText("ICE CREAM");
        jPanel3.add(ic);
        ic.setBounds(210, 270, 70, 14);

        Rpi.setText("RP 15.000,-");
        jPanel3.add(Rpi);
        Rpi.setBounds(210, 290, 58, 14);

        jLabel23.setText("Stock :");
        jPanel3.add(jLabel23);
        jLabel23.setBounds(190, 310, 40, 14);

        stockIC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel3.add(stockIC);
        stockIC.setBounds(240, 310, 40, 20);

        j.setText("JUICE");
        jPanel3.add(j);
        j.setBounds(360, 270, 60, 14);

        Rpj.setText("RP 8.000,-");
        jPanel3.add(Rpj);
        Rpj.setBounds(360, 290, 60, 14);

        jLabel27.setText("Stock :");
        jPanel3.add(jLabel27);
        jLabel27.setBounds(340, 310, 40, 14);

        stockJ.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel3.add(stockJ);
        stockJ.setBounds(390, 310, 50, 20);

        b.setText("BURGER");
        jPanel3.add(b);
        b.setBounds(60, 430, 60, 14);

        Rpb.setText("RP 15.000.-");
        jPanel3.add(Rpb);
        Rpb.setBounds(50, 450, 58, 14);

        jLabel31.setText("Stock :");
        jPanel3.add(jLabel31);
        jLabel31.setBounds(30, 470, 50, 14);

        stockB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel3.add(stockB);
        stockB.setBounds(80, 470, 60, 30);

        p.setText("PIZZA");
        jPanel3.add(p);
        p.setBounds(360, 430, 70, 14);

        Rpp.setText("RP 40.000,-");
        jPanel3.add(Rpp);
        Rpp.setBounds(350, 450, 70, 14);

        jLabel35.setText("Stock :");
        jPanel3.add(jLabel35);
        jLabel35.setBounds(330, 470, 50, 14);

        stockP.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel3.add(stockP);
        stockP.setBounds(390, 470, 60, 30);

        Tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(Tabel);

        jlabel22.setText("Total             :");

        jTextField1.setText(" Rp");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setText(" Rp");

        jlabel23.setText("Pembayaran  :");

        jButton8.setText("SUBMIT");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jlabel43.setText("Kembalian      : ");

        jTextField5.setText(" Rp");

        jButton9.setText("LIHAT STOCK");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("REFRESH");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("RESET");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("CETAK NOTA");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("LOGOUT");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jButton9))
                            .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jButton10)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jlabel23)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jlabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(pembayaran)
                                    .addComponent(pembelian)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jlabel43)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabel22)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pembelian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlabel23))
                    .addComponent(pembayaran))
                .addGap(18, 18, 18)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabel43)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9)
                    .addComponent(jButton10))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        int a = Integer.parseInt(pembelian.getText());
        int b = Integer.parseInt(pembayaran.getText());
        int c = b - a;

        if (c < 0) {
            JOptionPane.showMessageDialog(rootPane, "Uang yang dibayarkan tidak mencukupi");
        } else {
            kembalian.setText("" + c);
            menulisdataMenu();
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        membacadataMenu();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        MessageFormat header = new MessageFormat("Struk Belanja");

        MessageFormat footer = new MessageFormat("Terima kasih telah makan di restoran kami");
        try {
            Tabel.print(JTable.PrintMode.NORMAL, header, footer);
        } catch (java.awt.print.PrinterException e) {
            System.err.format("Cannot print %s%n", e.getMessage());
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //ganti harga belum
        String a = ss.getText();
        String b = Rpss.getText();
        Object[] o = {a, b};

        int c = Integer.parseInt(stockSS.getText());
        c -= 1;
        String d = Integer.toString(c);
        String stockKosong = "-1";
        boolean cek = d.equals(stockKosong);
        if (cek) {
            JOptionPane.showMessageDialog(rootPane, "Stock Steak HABIS ");
        } else {
            stockSS.setText(d);
            dtm.addRow(o);

            totalHarga += 30000;
            pembelian.setText("" + totalHarga);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String a = sp.getText();
        String b = Rpsp.getText();
        Object[] o = {a, b};

        int c = Integer.parseInt(stockSP.getText());
        c -= 1;
        String d = Integer.toString(c);
        String stockKosong = "-1";
        boolean cek = d.equals(stockKosong);
        if (cek) {
            JOptionPane.showMessageDialog(rootPane, "Stock Spaghetti HABIS ");
        } else {
            stockSP.setText(d);
            dtm.addRow(o);

            totalHarga += 20000;
            pembelian.setText("" + totalHarga);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String a = c.getText();
        String b = Rpc.getText();
        Object[] o = {a, b};

        int c = Integer.parseInt(stockC.getText());
        c -= 1;
        String d = Integer.toString(c);
        String stockKosong = "-1";
        boolean cek = d.equals(stockKosong);
        if (cek) {
            JOptionPane.showMessageDialog(rootPane, "Stock Coffe HABIS ");
        } else {
            stockC.setText(d);
            dtm.addRow(o);

            totalHarga += 10000;
            pembelian.setText("" + totalHarga);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String a = ic.getText();
        String b = Rpi.getText();
        Object[] o = {a, b};

        int c = Integer.parseInt(stockIC.getText());
        c -= 1;
        String d = Integer.toString(c);
        String stockKosong = "-1";
        boolean cek = d.equals(stockKosong);
        if (cek) {
            JOptionPane.showMessageDialog(rootPane, "Stock Ice Cream HABIS ");
        } else {
            stockIC.setText(d);
            dtm.addRow(o);

            totalHarga += 15000;
            pembelian.setText("" + totalHarga);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        String a = j.getText();
        String b = Rpj.getText();
        Object[] o = {a, b};

        int c = Integer.parseInt(stockJ.getText());
        c -= 1;
        String d = Integer.toString(c);
        String stockKosong = "-1";
        boolean cek = d.equals(stockKosong);
        if (cek) {
            JOptionPane.showMessageDialog(rootPane, "Stock Juice HABIS ");
        } else {
            stockJ.setText(d);
            dtm.addRow(o);

            totalHarga += 8000;
            pembelian.setText("" + totalHarga);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        String a = b.getText();
        String b = Rpb.getText();
        Object[] o = {a, b};

        int c = Integer.parseInt(stockB.getText());
        c -= 1;
        String d = Integer.toString(c);
        String stockKosong = "-1";
        boolean cek = d.equals(stockKosong);
        if (cek) {
            JOptionPane.showMessageDialog(rootPane, "Stock Burger HABIS ");
        } else {
            stockB.setText(d);
            dtm.addRow(o);

            totalHarga += 15000;
            pembelian.setText("" + totalHarga);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String a = p.getText();
        String b = Rpp.getText();
        Object[] o = {a, b};

        int c = Integer.parseInt(stockP.getText());
        c -= 1;
        String d = Integer.toString(c);
        String stockKosong = "-1";
        boolean cek = d.equals(stockKosong);
        if (cek) {
            JOptionPane.showMessageDialog(rootPane, "Stock Pizza HABIS");
        } else {
            stockP.setText(d);
            dtm.addRow(o);

            totalHarga += 40000;
            pembelian.setText("" + totalHarga);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        dtm.getDataVector().removeAllElements();
        dtm.fireTableDataChanged();

        pembelian.setText("0");
        totalHarga = 0;
        pembayaran.setText("0");
        kembalian.setText("0");
        membacadataMenu();

    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        mainMenu mm = new mainMenu();

        mm.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        Stock stk = new Stock();

        stk.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(pilihMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pilihMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pilihMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pilihMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pilihMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Rpb;
    private javax.swing.JLabel Rpc;
    private javax.swing.JLabel Rpi;
    private javax.swing.JLabel Rpj;
    private javax.swing.JLabel Rpp;
    private javax.swing.JLabel Rpsp;
    private javax.swing.JLabel Rpss;
    private javax.swing.JTable Tabel;
    private javax.swing.JLabel b;
    private javax.swing.JLabel c;
    private javax.swing.JLabel ic;
    private javax.swing.JLabel j;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel jlabel22;
    private javax.swing.JLabel jlabel23;
    private javax.swing.JLabel jlabel43;
    private javax.swing.JTextField kembalian;
    private javax.swing.JLabel p;
    private javax.swing.JTextField pembayaran;
    private javax.swing.JTextField pembelian;
    private javax.swing.JLabel sp;
    private javax.swing.JLabel ss;
    private javax.swing.JLabel stockB;
    private javax.swing.JLabel stockC;
    private javax.swing.JLabel stockIC;
    private javax.swing.JLabel stockJ;
    private javax.swing.JLabel stockP;
    private javax.swing.JLabel stockSP;
    private javax.swing.JLabel stockSS;
    // End of variables declaration//GEN-END:variables
}
