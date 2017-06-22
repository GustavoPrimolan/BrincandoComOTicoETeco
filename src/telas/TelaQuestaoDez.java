package telas;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;
import javax.swing.JOptionPane;

public class TelaQuestaoDez extends javax.swing.JFrame {

    AudioClip somFundo;

    public TelaQuestaoDez(AudioClip somFundo) {
        initComponents();
        this.somFundo = somFundo;
    }

    public TelaQuestaoDez() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnResponder = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDois = new javax.swing.JTextField();
        txtUm = new javax.swing.JTextField();
        txtTres = new javax.swing.JTextField();
        txtQuatro = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Brincando com o Tico e Teco");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setText("10) Enumere as casas corretamente utilizando os números:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 470, 30));

        btnResponder.setText("Responder");
        btnResponder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResponderActionPerformed(evt);
            }
        });
        getContentPane().add(btnResponder, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, 120, 40));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 0));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/iglu.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 150, 120));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/madeira.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 160, 100));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/tijolo.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 120, 120));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/caverna.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 140, 120));

        txtDois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoisActionPerformed(evt);
            }
        });
        getContentPane().add(txtDois, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 70, 30));

        txtUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUmActionPerformed(evt);
            }
        });
        getContentPane().add(txtUm, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 70, 30));

        txtTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTresActionPerformed(evt);
            }
        });
        getContentPane().add(txtTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 70, 30));

        txtQuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuatroActionPerformed(evt);
            }
        });
        getContentPane().add(txtQuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 70, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("1) Iglu");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 110, 40));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("2) Casa de tijolos");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 290, 40));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 0));
        jLabel10.setText("3) Casa de Madeira");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 300, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        jLabel6.setText("4)Caverna");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 170, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/fundop2.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 460));

        setSize(new java.awt.Dimension(719, 494));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnResponderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResponderActionPerformed
        ClassLoader classLoader = this.getClass().getClassLoader();
        URL url = classLoader.getResource("soms/somClick.wav");
        AudioClip somClick = Applet.newAudioClip(url);
        somClick.play();
        if (txtUm.getText().equals("3") || txtUm.getText().equals("Três") || txtUm.getText().equals("três")
                && txtDois.getText().equals("2") || txtDois.getText().equals("Dois") || txtDois.getText().equals("dois")
                && txtTres.getText().equals("1") || txtTres.getText().equals("Um") || txtTres.getText().equals("um")
                && txtQuatro.getText().equals("4") || txtQuatro.getText().equals("Quatro") || txtQuatro.getText().equals("quatro")) {
            JOptionPane.showMessageDialog(null, "<html><b>PARÁBENS, VOCÊ ACERTOU!</b></html>", "RESPOSTA CORRETA!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "A resposta correta é:\n3\n2\n1\n4", "RESPOSTA ERRADA!", JOptionPane.ERROR_MESSAGE);
        }
        TelaQuestaoOnze telaQuestaoOnze = new TelaQuestaoOnze(somFundo);
        telaQuestaoOnze.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnResponderActionPerformed

    private void txtDoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoisActionPerformed

    private void txtUmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUmActionPerformed

    private void txtTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTresActionPerformed

    private void txtQuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuatroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuatroActionPerformed

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
            java.util.logging.Logger.getLogger(TelaQuestaoDez.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaQuestaoDez.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaQuestaoDez.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaQuestaoDez.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaQuestaoDez().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnResponder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtDois;
    private javax.swing.JTextField txtQuatro;
    private javax.swing.JTextField txtTres;
    private javax.swing.JTextField txtUm;
    // End of variables declaration//GEN-END:variables
}
