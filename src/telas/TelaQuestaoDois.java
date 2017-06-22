package telas;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;
import javax.swing.JOptionPane;

public class TelaQuestaoDois extends javax.swing.JFrame {

    AudioClip somFundo;

    public TelaQuestaoDois(AudioClip somFundo) {
        initComponents();
        this.somFundo = somFundo;
    }

    public TelaQuestaoDois() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        btnResponder = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtLa = new javax.swing.JTextField();
        txtGu = new javax.swing.JTextField();
        txtLo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtGo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtGa = new javax.swing.JTextField();
        txtA = new javax.swing.JTextField();
        txtMi = new javax.swing.JTextField();
        txtGoDois = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Brincando com o Tico e Teco");
        setPreferredSize(new java.awt.Dimension(308, 460));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setText("2) Separe as sílabas: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 30));
        getContentPane().add(txtMa, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 40, -1));

        btnResponder.setText("Responder");
        btnResponder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResponderActionPerformed(evt);
            }
        });
        getContentPane().add(btnResponder, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 120, 40));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 102));
        jLabel5.setText("Amigo");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 110, 40));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("Gula");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 80, 30));
        getContentPane().add(txtLa, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 40, -1));
        getContentPane().add(txtGu, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 40, -1));
        getContentPane().add(txtLo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 40, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 0));
        jLabel7.setText("Goma");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 100, 30));
        getContentPane().add(txtGo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 40, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Galo");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 80, 30));
        getContentPane().add(txtGa, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 40, -1));
        getContentPane().add(txtA, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 40, -1));

        txtMi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMiActionPerformed(evt);
            }
        });
        getContentPane().add(txtMi, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 40, -1));
        getContentPane().add(txtGoDois, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 40, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/fundop2.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnResponderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResponderActionPerformed
        ClassLoader classLoader = this.getClass().getClassLoader();
        URL url = classLoader.getResource("soms/somClick.wav");
        AudioClip somClick = Applet.newAudioClip(url);
        somClick.play();
        if (txtGu.getText().toUpperCase().equals("GU")
                && txtLa.getText().toUpperCase().equals("LA")
                && txtGo.getText().toUpperCase().equals("GO")
                && txtMa.getText().toUpperCase().equals("MA")
                && txtGa.getText().toUpperCase().equals("GA")
                && txtLo.getText().toUpperCase().equals("LO")
                && txtA.getText().toUpperCase().equals("A")
                && txtMi.getText().toUpperCase().equals("MI")
                && txtGoDois.getText().toUpperCase().equals("GO")) {
            JOptionPane.showMessageDialog(null, "<html><b>PARÁBENS, VOCÊ ACERTOU!</b></html>", "RESPOSTA CORRETA!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "A resposta correta é:\nGu-La\nGo-Ma\nGa-Lo\nA-Mi-Go", "RESPOSTA ERRADA!", JOptionPane.ERROR_MESSAGE);
        }
        TelaQuestaoTres telaQuestaoTres = new TelaQuestaoTres(somFundo);
        telaQuestaoTres.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnResponderActionPerformed

    private void txtMiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMiActionPerformed

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
            java.util.logging.Logger.getLogger(TelaQuestaoDois.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaQuestaoDois.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaQuestaoDois.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaQuestaoDois.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaQuestaoDois().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnResponder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtGa;
    private javax.swing.JTextField txtGo;
    private javax.swing.JTextField txtGoDois;
    private javax.swing.JTextField txtGu;
    private javax.swing.JTextField txtLa;
    private javax.swing.JTextField txtLo;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtMi;
    // End of variables declaration//GEN-END:variables
}
