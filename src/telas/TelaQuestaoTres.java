package telas;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;
import javax.swing.JOptionPane;

public class TelaQuestaoTres extends javax.swing.JFrame {

    AudioClip somFundo;

    public TelaQuestaoTres(AudioClip somFundo) {
        initComponents();
        this.somFundo = somFundo;

    }

    public TelaQuestaoTres() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chkTatu = new javax.swing.JCheckBox();
        chkPato = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        btnResponder = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        chkTucano = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Brincando com o Tico e Teco");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chkTatu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkTatuActionPerformed(evt);
            }
        });
        getContentPane().add(chkTatu, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, -1, -1));
        getContentPane().add(chkPato, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 20, 20));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setText("3) Marque as imagens que os nomes iniciem com som de \"T\": ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 490, 30));

        btnResponder.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        btnResponder.setForeground(new java.awt.Color(0, 0, 255));
        btnResponder.setText("Responder");
        btnResponder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResponderActionPerformed(evt);
            }
        });
        getContentPane().add(btnResponder, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 120, 40));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 0));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/tucano.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 210, 160));
        getContentPane().add(chkTucano, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 20, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/pato.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 150, 140));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/tatu.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 120, 100));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/fundop3.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 650, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnResponderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResponderActionPerformed
        ClassLoader classLoader = this.getClass().getClassLoader();
        URL url = classLoader.getResource("soms/somClick.wav");
        AudioClip somClick = Applet.newAudioClip(url);
        somClick.play();
        if (chkTucano.isSelected() && chkTatu.isSelected()) {
            JOptionPane.showMessageDialog(null, "<html><b>PARÁBENS, VOCÊ ACERTOU!</b></html>", "RESPOSTA CORRETA!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "A resposta correta é:\nTucano\nTatu", "RESPOSTA ERRADA!", JOptionPane.ERROR_MESSAGE);
        }
        TelaQuestaoQuatro telaQuestaoQuatro = new TelaQuestaoQuatro(somFundo);
        telaQuestaoQuatro.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnResponderActionPerformed

    private void chkTatuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkTatuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkTatuActionPerformed

    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaQuestaoTres().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnResponder;
    private javax.swing.JCheckBox chkPato;
    private javax.swing.JCheckBox chkTatu;
    private javax.swing.JCheckBox chkTucano;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
