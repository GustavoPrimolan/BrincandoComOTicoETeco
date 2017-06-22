package telas;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;

import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;

public class TelaFinal extends javax.swing.JFrame {

    private TelaCreditos creditos = new TelaCreditos();
    private ImageIcon banner;
    private ImageIcon bannerDois;
        URL urlFundo = getClass().getResource("../soms/somFundo.wav");
        AudioClip somFundo = Applet.newAudioClip(urlFundo);
    public TelaFinal() {
        initComponents();

        somFundo.loop();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jLabel2 = new javax.swing.JLabel();
        lblBanner = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Brincando com o Tico e Teco");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/final.PNG"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 460, 230));

        lblBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/banner.png"))); // NOI18N
        lblBanner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBannerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBannerMouseExited(evt);
            }
        });
        getContentPane().add(lblBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 320, 220));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/fundo.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 460, 480));

        setSize(new java.awt.Dimension(458, 490));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void lblBannerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBannerMouseEntered
        bannerDois = new ImageIcon(getClass().getResource("../imgs/banner2.png"));
        lblBanner.setIcon(bannerDois);

    }//GEN-LAST:event_lblBannerMouseEntered

    private void lblBannerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBannerMouseExited
        banner = new ImageIcon(getClass().getResource("../imgs/banner.png"));
        lblBanner.setIcon(banner);
    }//GEN-LAST:event_lblBannerMouseExited

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
            java.util.logging.Logger.getLogger(TelaFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFinal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblBanner;
    // End of variables declaration//GEN-END:variables
}
