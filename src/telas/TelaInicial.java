package telas;

import java.applet.Applet;
import java.applet.AudioClip;

import java.net.URL;
import javax.swing.ImageIcon;

public class TelaInicial extends javax.swing.JFrame {

    private TelaCreditos creditos = new TelaCreditos();
    private ImageIcon banner;
    private ImageIcon bannerDois;
    ClassLoader classLoader = this.getClass().getClassLoader();
    //URL urlFundo = getClass().getResource("../soms/somFundo.wav");
    URL urlFundo = classLoader.getResource("soms/somFundo.wav");
    AudioClip somFundo = Applet.newAudioClip(urlFundo);

    public TelaInicial() {
        initComponents();
        somFundo.loop();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnIniciar = new javax.swing.JButton();
        btnCreditos = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        lblBanner = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Brincando com o Tico e Teco");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnIniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/iniciar.PNG"))); // NOI18N
        btnIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIniciarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIniciarMouseExited(evt);
            }
        });
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 110, 40));

        btnCreditos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/creditos.png"))); // NOI18N
        btnCreditos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCreditosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCreditosMouseExited(evt);
            }
        });
        btnCreditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreditosActionPerformed(evt);
            }
        });
        getContentPane().add(btnCreditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 110, 40));

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/sair.png"))); // NOI18N
        btnSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSairMouseExited(evt);
            }
        });
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 110, 40));

        lblBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/banner.png"))); // NOI18N
        lblBanner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBannerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBannerMouseExited(evt);
            }
        });
        getContentPane().add(lblBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 320, 220));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/fundo.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 370, 500));

        setSize(new java.awt.Dimension(339, 509));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        //URL url = getClass().getResource("../soms/somClick.wav");
        URL url = classLoader.getResource("soms/somClick.wav");
        AudioClip somClick = Applet.newAudioClip(url);
        somClick.play();
        TelaQuestaoUm iniciar = new TelaQuestaoUm(somFundo);
        iniciar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnCreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreditosActionPerformed
        //URL url = getClass().getResource("../soms/somClick.wav");
        URL url = classLoader.getResource("soms/somClick.wav");
        AudioClip somClick = Applet.newAudioClip(url);
        somClick.play();
        creditos.setVisible(true);
    }//GEN-LAST:event_btnCreditosActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        //URL url = getClass().getResource("../soms/somClick.wav");
        URL url = classLoader.getResource("soms/somClick.wav");
        AudioClip somClick = Applet.newAudioClip(url);
        somClick.play();
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseEntered
        //ImageIcon sairMouseEntered = new ImageIcon(getClass().getResource("../imgs/sairMouseEntered.png"));
        ImageIcon sairMouseEntered = new ImageIcon(classLoader.getResource("imgs/sairMouseEntered.png"));
        btnSair.setIcon(sairMouseEntered);
    }//GEN-LAST:event_btnSairMouseEntered

    private void btnSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseExited
        ImageIcon sair = new ImageIcon(classLoader.getResource("imgs/sair.png"));
        btnSair.setIcon(sair);
    }//GEN-LAST:event_btnSairMouseExited

    private void btnCreditosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreditosMouseEntered
        ImageIcon creditosMouseEntered = new ImageIcon(classLoader.getResource("imgs/creditosMouseEntered.png"));
        btnCreditos.setIcon(creditosMouseEntered);
    }//GEN-LAST:event_btnCreditosMouseEntered

    private void btnCreditosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreditosMouseExited
        ImageIcon creditos = new ImageIcon(classLoader.getResource("imgs/creditos.png"));
        btnCreditos.setIcon(creditos);
    }//GEN-LAST:event_btnCreditosMouseExited

    private void btnIniciarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarMouseEntered
        ImageIcon iniciarMouseEntered = new ImageIcon(classLoader.getResource("imgs/iniciarMouseEntered.PNG"));
        btnIniciar.setIcon(iniciarMouseEntered);
    }//GEN-LAST:event_btnIniciarMouseEntered

    private void btnIniciarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarMouseExited
        ImageIcon iniciar = new ImageIcon(classLoader.getResource("imgs/iniciar.PNG"));
        btnIniciar.setIcon(iniciar);
    }//GEN-LAST:event_btnIniciarMouseExited

    private void lblBannerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBannerMouseEntered
        bannerDois = new ImageIcon(classLoader.getResource("imgs/banner2.png"));
        lblBanner.setIcon(bannerDois);

    }//GEN-LAST:event_lblBannerMouseEntered

    private void lblBannerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBannerMouseExited
        banner = new ImageIcon(classLoader.getResource("imgs/banner.png"));
        lblBanner.setIcon(banner);
    }//GEN-LAST:event_lblBannerMouseExited

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreditos;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblBanner;
    // End of variables declaration//GEN-END:variables
}
