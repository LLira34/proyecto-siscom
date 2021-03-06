/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import utils.UtileriasStyle;

/**
 * Descripcion: Formulario donde se puede cambiar una contraseña
 *
 * @author Daniel Aguilar dhaniel212@gmail.com GSI-1333
 */
public class ViewPassword extends javax.swing.JFrame {

    /**
     * Creates new form ViewPassword
     */
    public ViewPassword() {
        initComponents();
        //Linea de codigo que entra a las utilerias de estilos, manda llamar el metodo centrarVentana
        UtileriasStyle.centrarVentana(this);
        //Despe el paquete de utilerias de estilos aplica un nuevo estilo al panel deseado
        UtileriasStyle.initStyle(PanelContenido.getComponents());
        UtileriasStyle.initStyle(PanelCajas.getComponents());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo1 = new javax.swing.JLabel();
        PanelContenido = new javax.swing.JPanel();
        PanelCajas = new javax.swing.JPanel();
        lblNewPass = new javax.swing.JLabel();
        txtPass1 = new javax.swing.JPasswordField();
        lblNewPass2 = new javax.swing.JLabel();
        txtPass2 = new javax.swing.JPasswordField();
        btnCambiar = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 600));

        lblTitulo1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo1.setText("Cambiar Contraseña");
        getContentPane().add(lblTitulo1, java.awt.BorderLayout.PAGE_START);

        PanelContenido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelCajas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PanelCajas.setLayout(new java.awt.GridLayout(2, 2));

        lblNewPass.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblNewPass.setText("Nueva Contraseña");
        PanelCajas.add(lblNewPass);

        txtPass1.setText("jPasswordField1");
        txtPass1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPass1KeyTyped(evt);
            }
        });
        PanelCajas.add(txtPass1);

        lblNewPass2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblNewPass2.setText("Reescribir Contraseña");
        PanelCajas.add(lblNewPass2);

        txtPass2.setText("jPasswordField2");
        txtPass2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPass2KeyTyped(evt);
            }
        });
        PanelCajas.add(txtPass2);

        PanelContenido.add(PanelCajas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 560, 120));

        btnCambiar.setText("Cambiar");
        btnCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarActionPerformed(evt);
            }
        });
        PanelContenido.add(btnCambiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 310, 60));

        getContentPane().add(PanelContenido, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPass1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPass1KeyTyped
        // TODO add your handling code here:
        //Verfifica la longitud en las cajas de texto
        if (txtPass1.getText().length() > 7 && txtPass1.getText().length() < 16) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPass1KeyTyped

    private void txtPass2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPass2KeyTyped
        //Verfifica la longitud en las cajas de texto
        if (txtPass2.getText().length() > 7 && txtPass2.getText().length() < 16) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPass2KeyTyped

    private void btnCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarActionPerformed
        // TODO add your handling code here:

        String message = "";
        if (txtPass1.getText().trim().isEmpty() || txtPass2.getText().trim().isEmpty()) {
            message = "La contaseña de contener un valores en ambos campos.\n";
        }
        if (!message.isEmpty()) {
            JOptionPane.showMessageDialog(this, message, "Entrada al Sistema",
                    JOptionPane.ERROR_MESSAGE);
        }

        String pas1 = "", pas2 = "";
        pas1 = txtPass1.getText().trim();
        pas2 = txtPass2.getText();
        if (pas1.matches("[A-Za-z][0-9]{10}")) {
            char clave;
            byte contL = 0, contNum = 0;
            for (byte i = 0; i < pas1.length(); i++) {
                clave = pas1.charAt(i);
                pas2 = String.valueOf(clave);
                if (pas2.matches("[a-zA-Z]")) {
                    contL++;
                } else if (pas2.matches("[0-9]")) {
                    contNum++;
                }
            }
        }
        this.setVisible(false);
        new ViewRecuperar().setVisible(true);
    }//GEN-LAST:event_btnCambiarActionPerformed

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
            java.util.logging.Logger.getLogger(ViewPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new ViewPassword().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelCajas;
    private javax.swing.JPanel PanelContenido;
    private javax.swing.JToggleButton btnCambiar;
    private javax.swing.JLabel lblNewPass;
    private javax.swing.JLabel lblNewPass2;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JPasswordField txtPass1;
    private javax.swing.JPasswordField txtPass2;
    // End of variables declaration//GEN-END:variables
}
