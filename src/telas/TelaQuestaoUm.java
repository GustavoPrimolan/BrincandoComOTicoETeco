package telas;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;
import javax.swing.JOptionPane;

public class TelaQuestaoUm extends javax.swing.JFrame {

    AudioClip somFundo;

    public TelaQuestaoUm(AudioClip somFundo) {
        initComponents();
        this.somFundo = somFundo;

    }

    public TelaQuestaoUm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtGalo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnResponder = new javax.swing.JButton();
        txtVaca = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPapagaio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Brincando com o Tico e Teco");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setText("1) Dê nome as figuras: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 190, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/papagaio.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 190, 180));
        getContentPane().add(txtGalo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 160, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/vaca.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 170, 210));

        btnResponder.setText("Responder");
        btnResponder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResponderActionPerformed(evt);
            }
        });
        getContentPane().add(btnResponder, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 120, 60));
        getContentPane().add(txtVaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 170, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/galo.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 170, 210));
        getContentPane().add(txtPapagaio, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 170, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/fundop1.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnResponderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResponderActionPerformed
        ClassLoader classLoader = this.getClass().getClassLoader();
        URL url = classLoader.getResource("soms/somClick.wav");
        AudioClip somClick = Applet.newAudioClip(url);
        somClick.play();
        String respostaErrada = "";
        if (txtGalo.getText().toUpperCase().equals("GALO")
                && txtVaca.getText().toUpperCase().equals("VACA")
                && txtPapagaio.getText().toUpperCase().equals("PAPAGAIO")) {
            JOptionPane.showMessageDialog(null, "<html><b>PARÁBENS, VOCÊ ACERTOU!</b></html>", "RESPOSTA CORRETA!", JOptionPane.INFORMATION_MESSAGE);

        } else {
            respostaErrada += "A respostas corretas eram:";
            if (!txtGalo.getText().toUpperCase().equals("GALO")) {
                respostaErrada += "\nGalo";
            }
            if (!txtGalo.getText().toUpperCase().equals("VACA")) {
                respostaErrada += "\nVaca";
            }
            if (!txtGalo.getText().toUpperCase().equals("Papagaio")) {
                respostaErrada += "\nPapagaio";
            }
            JOptionPane.showMessageDialog(null, respostaErrada, "RESPOSTA ERRADA!", JOptionPane.ERROR_MESSAGE);
        }

        TelaQuestaoDois telaQuestaoDois = new TelaQuestaoDois(somFundo);
        telaQuestaoDois.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnResponderActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaQuestaoUm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnResponder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtGalo;
    private javax.swing.JTextField txtPapagaio;
    private javax.swing.JTextField txtVaca;
    // End of variables declaration//GEN-END:variables

}
