package telas;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;
import javax.swing.JOptionPane;

public class TelaQuestaoQuatro extends javax.swing.JFrame {

    AudioClip somFundo;

    public TelaQuestaoQuatro(AudioClip somFundo) {
        initComponents();
        this.somFundo = somFundo;
    }

    public TelaQuestaoQuatro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtAranha = new javax.swing.JTextField();
        btnResponder = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtPato = new javax.swing.JTextField();
        txtTapete = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTatu = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Brincando com o Tico e Teco");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setText("4) Complete observando os desenhos:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 310, 30));

        txtAranha.setText("Ara");
        txtAranha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAranhaActionPerformed(evt);
            }
        });
        getContentPane().add(txtAranha, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 100, -1));

        btnResponder.setText("Responder");
        btnResponder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResponderActionPerformed(evt);
            }
        });
        getContentPane().add(btnResponder, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 120, 40));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/tapete.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 150, 130));

        txtPato.setText("Pa");
        txtPato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatoActionPerformed(evt);
            }
        });
        getContentPane().add(txtPato, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 40, -1));

        txtTapete.setText("Ta");
        getContentPane().add(txtTapete, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 90, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 0));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/tatu.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 130, 100));

        txtTatu.setText("Ta");
        getContentPane().add(txtTatu, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 40, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 153));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/aranha.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 210, 160));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/pato.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 170, 130));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/fundop5.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnResponderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResponderActionPerformed
        ClassLoader classLoader = this.getClass().getClassLoader();
        URL url = classLoader.getResource("soms/somClick.wav");
        AudioClip somClick = Applet.newAudioClip(url);
        somClick.play();
        if (txtPato.getText().equals("Pato")
                && txtTatu.getText().equals("Tatu")
                && txtAranha.getText().equals("Aranha")
                && txtTapete.getText().equals("Tapete")) {
            JOptionPane.showMessageDialog(null, "<html><b>PARÁBENS, VOCÊ ACERTOU!</b></html>", "RESPOSTA CORRETA!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "A resposta correta é:\nPato\nTatu\nAranha\nTapete", "RESPOSTA ERRADA!", JOptionPane.ERROR_MESSAGE);
        }
        TelaQuestaoCinco telaQuestaoCinco = new TelaQuestaoCinco(somFundo);
        telaQuestaoCinco.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnResponderActionPerformed

    private void txtPatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatoActionPerformed

    private void txtAranhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAranhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAranhaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaQuestaoQuatro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaQuestaoQuatro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaQuestaoQuatro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaQuestaoQuatro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaQuestaoQuatro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnResponder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtAranha;
    private javax.swing.JTextField txtPato;
    private javax.swing.JTextField txtTapete;
    private javax.swing.JTextField txtTatu;
    // End of variables declaration//GEN-END:variables
}
