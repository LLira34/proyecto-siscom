/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import dao.impl.GenericDAOImplHibernate;
import dao.impl.ParticipanteDAOImplHibernate;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Participante;
import test.TestParticipante;
import utils.SiscomException;

/**
 *
 * @author gbarron
 */
public class ViewRegistro extends javax.swing.JFrame {

    /**
     * Creates new form ViewRegistro
     */
    public ViewRegistro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtContrasena = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtCorreoElectronico = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cboCiudad = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cboNivel = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cboTipoUsuario = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 170, -1));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 170, -1));

        txtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosActionPerformed(evt);
            }
        });
        getContentPane().add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 170, -1));
        getContentPane().add(txtCorreoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 170, -1));

        jLabel1.setText("Ciudad");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 80, -1));

        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));

        jLabel3.setText("Apellidos");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, -1));

        jLabel4.setText("Correo Electrónico");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        jLabel5.setText("Contraseña");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));

        cboCiudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dolores Hidalgo", "San Miguel de Allende", "San Felipe", "San Luis de la Paz", "Guanajuato", "Otra" }));
        getContentPane().add(cboCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 170, -1));

        jLabel6.setText("Nivel");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 80, -1));

        cboNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Media Superior", "Superior" }));
        getContentPane().add(cboNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 170, -1));

        jLabel7.setText("Tipo de usuario");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 80, -1));

        cboTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estudiante", "Docente" }));
        getContentPane().add(cboTipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 170, -1));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 370, 90, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
                GenericDAOImplHibernate<Participante, Integer> dao;
        dao = new ParticipanteDAOImplHibernate();

        Participante part = new Participante();
        //part.setId(3);
        part.setNombre(txtNombre.getText());
        part.setApellidos(txtApellidos.getText());
        part.setEmail(txtCorreoElectronico.getText());
        part.setCiudad((String) cboCiudad.getSelectedItem());
        part.setEstado(true);
        part.setNivel(11);
        part.setPassword(txtContrasena.getText());
        part.setRol((String) cboTipoUsuario.getSelectedItem());
        try {
            dao.saveOrUpdate(part);
        } catch (SiscomException ex) {
            Logger.getLogger(TestParticipante.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnAgregarActionPerformed

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
            java.util.logging.Logger.getLogger(ViewRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JComboBox<String> cboCiudad;
    private javax.swing.JComboBox<String> cboNivel;
    private javax.swing.JComboBox<String> cboTipoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtContrasena;
    private javax.swing.JTextField txtCorreoElectronico;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
