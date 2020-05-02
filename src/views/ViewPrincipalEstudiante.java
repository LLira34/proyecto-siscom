
package views;
//Estamos importando las librerias necesarias

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import utils.UtileriasStyle;

/**
 *
 * @author Eduardo Romero Haro Pantalla Realizada: Pantalla principal de
 * Estudiante Grupo GSI1313 Fecha de eleboracion: 17 de Julio de 2017
 */
public class ViewPrincipalEstudiante extends javax.swing.JFrame {

   
    public ViewPrincipalEstudiante() {
        initComponents();
        //Es para mandar centrar la pantalla al momento de correr el proyecto
        UtileriasStyle.centrarVentana(this);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        lblBienvenido = new javax.swing.JLabel();
        mnuPrincipal = new javax.swing.JMenuBar();
        mnuMisCursos = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnu4 = new javax.swing.JMenu();
        mnu2 = new javax.swing.JMenu();
        mnu3 = new javax.swing.JMenu();
        mnu1 = new javax.swing.JMenu();
        mnuRegistroCursos = new javax.swing.JMenu();
        mnuCambiarContrasena = new javax.swing.JMenu();
        mnuSalir = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        lblBienvenido.setFont(new java.awt.Font("Blackadder ITC", 2, 36)); // NOI18N
        lblBienvenido.setText("Bienvenido");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(328, Short.MAX_VALUE)
                .addComponent(lblBienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(321, 321, 321))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblBienvenido)
                .addContainerGap(533, Short.MAX_VALUE))
        );

        mnuPrincipal.setPreferredSize(new java.awt.Dimension(306, 36));

        mnuMisCursos.setBackground(java.awt.Color.cyan);
        mnuMisCursos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 255, 0), null, null));
        mnuMisCursos.setText("Mis Cursos");
        mnuMisCursos.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        mnuMisCursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuMisCursosMouseClicked(evt);
            }
        });
        mnuMisCursos.add(jSeparator1);

        mnu4.setText("Base de Datos");
        mnuMisCursos.add(mnu4);

        mnu2.setText("Programacion");
        mnuMisCursos.add(mnu2);

        mnu3.setText("Sociocultural");
        mnuMisCursos.add(mnu3);

        mnu1.setText("Ingles");
        mnuMisCursos.add(mnu1);

        mnuPrincipal.add(mnuMisCursos);

        mnuRegistroCursos.setBackground(java.awt.Color.cyan);
        mnuRegistroCursos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 255, 0), null, null));
        mnuRegistroCursos.setText("Registro Cursos");
        mnuRegistroCursos.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        mnuRegistroCursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuRegistroCursosMouseClicked(evt);
            }
        });
        mnuPrincipal.add(mnuRegistroCursos);

        mnuCambiarContrasena.setBackground(java.awt.Color.cyan);
        mnuCambiarContrasena.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 255, 0), null, null));
        mnuCambiarContrasena.setText("Perfil");
        mnuCambiarContrasena.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        mnuPrincipal.add(mnuCambiarContrasena);

        mnuSalir.setBackground(java.awt.Color.cyan);
        mnuSalir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 255, 0), null, null));
        mnuSalir.setText("Salir");
        mnuSalir.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        mnuSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuSalirMouseClicked(evt);
            }
        });
        mnuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalirActionPerformed(evt);
            }
        });
        mnuPrincipal.add(mnuSalir);

        setJMenuBar(mnuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirActionPerformed
      
    }//GEN-LAST:event_mnuSalirActionPerformed

    private void mnuSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuSalirMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_mnuSalirMouseClicked

    private void mnuMisCursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuMisCursosMouseClicked
       this.setVisible(false);
       ViewDeCursoGeneral vc = new ViewDeCursoGeneral();
       vc.setVisible(true);
    }//GEN-LAST:event_mnuMisCursosMouseClicked

    private void mnuRegistroCursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuRegistroCursosMouseClicked
       this.setVisible(false);
       RegistroCurso rc = new RegistroCurso();
       rc.setVisible(true);
    }//GEN-LAST:event_mnuRegistroCursosMouseClicked

    
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
            java.util.logging.Logger.getLogger(ViewPrincipalEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipalEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipalEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipalEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    //Dentro de estas lineas de comando se le da formato al diseno 
                    UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
                    new ViewPrincipalEstudiante().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ViewPrincipalEstudiante.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(ViewPrincipalEstudiante.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(ViewPrincipalEstudiante.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(ViewPrincipalEstudiante.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JMenu mnu1;
    private javax.swing.JMenu mnu2;
    private javax.swing.JMenu mnu3;
    private javax.swing.JMenu mnu4;
    private javax.swing.JMenu mnuCambiarContrasena;
    private javax.swing.JMenu mnuMisCursos;
    private javax.swing.JMenuBar mnuPrincipal;
    private javax.swing.JMenu mnuRegistroCursos;
    private javax.swing.JMenu mnuSalir;
    // End of variables declaration//GEN-END:variables
}
