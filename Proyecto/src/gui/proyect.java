/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.KeyStroke;



/**
 *
 * @author Stucky
 */


public class proyect extends javax.swing.JFrame {

    /**
     * Creates new form proyect
     */
    

  
    public proyect() {
        initComponents();
        this.setLocationRelativeTo(null);
        //ImageIcon fot = new ImageIcon("/home/naistu/NetBeansProjects/Proyecto/src/imagenes/fondo1.png");
        //Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Titulo.getWidth(), Titulo.getHeight(), Image.SCALE_DEFAULT));
        //Titulo.setIcon(icono);
        //this.repaint();
       
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        btnplantilla = new javax.swing.JButton();
        btnfix = new javax.swing.JButton();
        btntabla = new javax.swing.JButton();
        btnnoti = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        Latras = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("fondo"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnplantilla.setBackground(java.awt.Color.black);
        btnplantilla.setFont(new java.awt.Font("Ubuntu Light", 0, 15)); // NOI18N
        btnplantilla.setForeground(java.awt.Color.white);
        btnplantilla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/plantillas.png"))); // NOI18N
        btnplantilla.setText("Plantillas");
        btnplantilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnplantillaActionPerformed(evt);
            }
        });
        getContentPane().add(btnplantilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 199, 126, -1));

        btnfix.setBackground(java.awt.Color.black);
        btnfix.setFont(new java.awt.Font("Ubuntu Light", 0, 15)); // NOI18N
        btnfix.setForeground(java.awt.Color.white);
        btnfix.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fixture.png"))); // NOI18N
        btnfix.setText("Fixt(NO)");
        btnfix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfixActionPerformed(evt);
            }
        });
        getContentPane().add(btnfix, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 253, 126, -1));

        btntabla.setBackground(java.awt.Color.black);
        btntabla.setFont(new java.awt.Font("Ubuntu Light", 0, 15)); // NOI18N
        btntabla.setForeground(java.awt.Color.white);
        btntabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tablas.png"))); // NOI18N
        btntabla.setText("Tablas    ");
        btntabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntablaActionPerformed(evt);
            }
        });
        getContentPane().add(btntabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 307, 126, -1));

        btnnoti.setBackground(java.awt.Color.black);
        btnnoti.setFont(new java.awt.Font("Ubuntu Light", 0, 15)); // NOI18N
        btnnoti.setForeground(java.awt.Color.white);
        btnnoti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/noticias.png"))); // NOI18N
        btnnoti.setText("Noticias  ");
        btnnoti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnotiActionPerformed(evt);
            }
        });
        getContentPane().add(btnnoti, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 361, 126, -1));

        Titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo1.png"))); // NOI18N
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 200, 160));

        Latras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mini.png"))); // NOI18N
        getContentPane().add(Latras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnplantillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnplantillaActionPerformed
                Plantilla nuevo= new Plantilla();
                this.setVisible(false);
                nuevo.setVisible(true);

    }//GEN-LAST:event_btnplantillaActionPerformed

    private void btnfixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfixActionPerformed
                Fixture nuevo= new Fixture();
                this.setVisible(false);
                nuevo.setVisible(true);
    }//GEN-LAST:event_btnfixActionPerformed

    private void btntablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntablaActionPerformed
                Tablas nuevo= new Tablas();
                this.setVisible(false);
                nuevo.setVisible(true);
    }//GEN-LAST:event_btntablaActionPerformed

    private void btnnotiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnotiActionPerformed
                Noticias nuevo= new Noticias();
                this.setVisible(false);
                nuevo.setVisible(true);
    }//GEN-LAST:event_btnnotiActionPerformed
      //ImageIcon icono = new javax.swing.ImageIcon(getClass().getResource("/imagenes/ima.png"));
      //Image imagen = icono.getImage();
      //ImageIcon iconoEscalado = new ImageIcon (imagen.getScaledInstance(100,100,Image.SCALE_SMOOTH));
      //jLabel1.setIcon(iconoEscalado);

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
            java.util.logging.Logger.getLogger(proyect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(proyect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(proyect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(proyect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new proyect().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Latras;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btnfix;
    private javax.swing.JButton btnnoti;
    private javax.swing.JButton btnplantilla;
    private javax.swing.JButton btntabla;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
