
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author User
 */
public class Tikettravel extends javax.swing.JFrame {
    int vip,eko,harga,jumlahtiket,totalharga,pembayaran,kembalian;

    /**
     * Creates new form tiketbis
     */
    public Tikettravel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_nama = new javax.swing.JTextField();
        txt_total = new javax.swing.JTextField();
        txt_jumlah = new javax.swing.JTextField();
        txt_bayar = new javax.swing.JTextField();
        txt_kembalian = new javax.swing.JTextField();
        btn_input = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_area = new javax.swing.JTextArea();
        btn_cetak = new javax.swing.JButton();
        btn_keluar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        rb_eko = new javax.swing.JRadioButton();
        tujuan = new javax.swing.JComboBox<>();
        txt_harga = new javax.swing.JTextField();
        rb_vip = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_asal = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UNDIP Travel");

        jPanel2.setBackground(new java.awt.Color(0, 54, 77));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("UNDIP Travel");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 120, 30));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Data Pembelian", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 10))); // NOI18N

        jLabel5.setText("Nama Pembeli");

        jLabel6.setText("Jumlah Tiket");

        jLabel7.setText("Total Harga");

        jLabel8.setText("Pembayaran");

        jLabel9.setText("Kembalian");

        txt_total.setEditable(false);

        txt_jumlah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_jumlahKeyReleased(evt);
            }
        });

        txt_bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_bayarActionPerformed(evt);
            }
        });
        txt_bayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_bayarKeyReleased(evt);
            }
        });

        txt_kembalian.setEditable(false);

        btn_input.setText("Input Data");
        btn_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inputActionPerformed(evt);
            }
        });

        btn_clear.setText("Clear Data");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_kembalian, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(txt_bayar)
                            .addComponent(txt_total)
                            .addComponent(txt_jumlah)
                            .addComponent(txt_nama)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_input)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                        .addComponent(btn_clear)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_bayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_input, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 290, 300));

        txt_area.setColumns(20);
        txt_area.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_area.setRows(5);
        txt_area.setText("Nama Pembeli\t:\nTujuan\t:\nJumlah Tiket\t:\nTotal Harga\t:\nPembayaran\t:\nKembali\t:");
        jScrollPane1.setViewportView(txt_area);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 240, 140));

        btn_cetak.setText("Cetak Tiket");
        btn_cetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cetakActionPerformed(evt);
            }
        });
        jPanel2.add(btn_cetak, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 120, 20));

        btn_keluar.setText("Keluar");
        btn_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_keluarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 120, 20));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pilih Tujuan", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 10))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        rb_eko.setBackground(new java.awt.Color(0, 0, 0));
        rb_eko.setForeground(new java.awt.Color(0, 204, 204));
        rb_eko.setText("Ekonomi");
        rb_eko.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_ekoActionPerformed(evt);
            }
        });

        tujuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "MAGELANG", "JOGJA", "SOLO", "MADIUN" }));
        tujuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tujuanActionPerformed(evt);
            }
        });

        rb_vip.setBackground(new java.awt.Color(0, 0, 0));
        rb_vip.setForeground(new java.awt.Color(204, 255, 0));
        rb_vip.setText("VIP");
        rb_vip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_vipActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tujuan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_harga, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(rb_eko)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rb_vip)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(tujuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_eko, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rb_vip, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel1.setText("Tujuan");

        jLabel3.setText("Kelas");

        jLabel4.setText("Harga");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 290, 120));
        jPanel2.add(txt_asal, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 110, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tujuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tujuanActionPerformed
        // TODO add your handling code here:
       Object selectedTujuan = tujuan.getSelectedItem();

if (selectedTujuan == null) {
    buttonGroup1.clearSelection();
    txt_harga.setText("");
} else {
    String tujuanString = selectedTujuan.toString();
    txt_asal.setText(tujuanString);
    
    switch (tujuanString) {
        case "MAGELANG":
            vip = 50000;
            eko = 30000;
            break;
        case "SOLO":
            vip = 70000;
            eko = 50000;
            break;
        case "JOGJA":
            vip = 80000;
            eko = 60000;
            break;
        case "MADIUN":
            vip = 90000;
            eko = 70000;
            break;
        default:
            buttonGroup1.clearSelection();
            txt_harga.setText("");
            break;
    }
}
    }//GEN-LAST:event_tujuanActionPerformed

    private void rb_vipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_vipActionPerformed
        // TODO add your handling code here:
        if (rb_vip.isSelected())
        {
            txt_harga.setText(String.valueOf(vip));
        }
        if (rb_vip.isSelected())
        {
            rb_eko.setSelected(false);
        }
    }//GEN-LAST:event_rb_vipActionPerformed

    private void rb_ekoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_ekoActionPerformed
        // TODO add your handling code here:
        if (rb_eko.isSelected())
        {
            txt_harga.setText(String.valueOf(eko));
        }
        if (rb_eko.isSelected())
        {
            rb_vip.setSelected(false);
        }
    }//GEN-LAST:event_rb_ekoActionPerformed

    private void txt_bayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_bayarActionPerformed
        // TODO add your handling code here:
        pembayaran=Integer.parseInt(txt_bayar.getText());
        totalharga=Integer.parseInt(txt_total.getText());
        kembalian=pembayaran-totalharga;
        txt_kembalian.setText(String.valueOf(kembalian));
    }//GEN-LAST:event_txt_bayarActionPerformed

    private void txt_jumlahKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_jumlahKeyReleased
        // TODO add your handling code here:
        jumlahtiket = Integer.parseInt(txt_jumlah.getText());
    harga = Integer.parseInt(txt_harga.getText());
    totalharga = jumlahtiket * harga;

    if (jumlahtiket > 3) {
        for (int i = 3; i < jumlahtiket; i++) {
            totalharga -= 10000;
        }
    }
    
    txt_total.setText(String.valueOf(totalharga));
    }//GEN-LAST:event_txt_jumlahKeyReleased

    private void txt_bayarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_bayarKeyReleased
        // TODO add your handling code here:
        int p,q,r;
        p=Integer.parseInt(txt_bayar.getText());
        q=Integer.parseInt(txt_total.getText());
        r=p-q;
        txt_kembalian.setText(""+r);
    }//GEN-LAST:event_txt_bayarKeyReleased

    private void btn_cetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cetakActionPerformed
        // TODO add your handling code here:
        buttonGroup1.clearSelection();
        txt_harga.setText("");
        tujuan.setSelectedItem("Pilih");
        txt_asal.setText("");
        txt_nama.setText("");
        txt_total.setText("");
        txt_jumlah.setText("");
        txt_bayar.setText("");
        txt_kembalian.setText("");
        txt_area.setText("Nama Pembeli  :\n" +
"Tujuan :\n" +
"Jumlah Tiket   :\n" +
"Total Harga    :\n" +
"Pembayaran :\n" +
"Kembalian  :");
        rb_vip.setSelected(false);
        rb_eko.setSelected(false);
    }//GEN-LAST:event_btn_cetakActionPerformed

    private void btn_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_keluarActionPerformed
        // TODO add your handling code here:
        int answer=JOptionPane.showConfirmDialog(null, "Yakin Ga Jadi Mudik?", "Ga Jadi Mudik?", JOptionPane.OK_OPTION);
        if(answer==JOptionPane.OK_OPTION)
        {
            dispose();
        }
    }//GEN-LAST:event_btn_keluarActionPerformed

    private void btn_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inputActionPerformed
        // TODO add your handling code here:
        txt_area.setText("Nama Pembeli  :"+txt_nama.getText()+"\n"+
"Tujuan :"+txt_asal.getText()+"\n"+
"Jumlah Tiket   :"+txt_jumlah.getText()+"\n"+
"Total Harga    :"+txt_total.getText()+"\n"+
"Pembayaran :"+txt_bayar.getText()+"\n"+
"Kembali    :"+txt_kembalian.getText()+"\n");
    }//GEN-LAST:event_btn_inputActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        // TODO add your handling code here:
        buttonGroup1.clearSelection();
        txt_harga.setText("");
        tujuan.setSelectedItem("Pilih");
        txt_asal.setText("");
        txt_nama.setText("");
        txt_total.setText("");
        txt_jumlah.setText("");
        txt_bayar.setText("");
        txt_kembalian.setText("");
        txt_area.setText("Nama Pembeli  :\n" +
"Tujuan :\n" +
"Jumlah Tiket   :\n" +
"Total Harga    :\n" +
"Pembayaran :\n" +
"Kembali    :");
        rb_vip.setSelected(false);
        rb_eko.setSelected(false);
    }//GEN-LAST:event_btn_clearActionPerformed

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
            java.util.logging.Logger.getLogger(Tikettravel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tikettravel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tikettravel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tikettravel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Tikettravel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cetak;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_input;
    private javax.swing.JButton btn_keluar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JRadioButton rb_eko;
    private javax.swing.JRadioButton rb_vip;
    private javax.swing.JComboBox<String> tujuan;
    private javax.swing.JTextArea txt_area;
    private javax.swing.JTextField txt_asal;
    private javax.swing.JTextField txt_bayar;
    private javax.swing.JTextField txt_harga;
    private javax.swing.JTextField txt_jumlah;
    private javax.swing.JTextField txt_kembalian;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables

