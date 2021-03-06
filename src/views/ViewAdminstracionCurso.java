/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import utils.UtileriasStyle;

/**
 *
 * @Martha Guadalupe Rangel Alvarado GRUPO GSI1333
 */
public class ViewAdminstracionCurso extends javax.swing.JFrame {

    /**
     * Pantalla para la administración d elos catálogos
     */
    public ViewAdminstracionCurso() {
        initComponents();
        //Es para mandar centrar la pantalla al momento de correr el proyecto
        UtileriasStyle.centrarVentana(this);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        LstCursoAp = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));

        LblTitulo.setFont(new java.awt.Font("Arial Unicode MS", 2, 24)); // NOI18N
        LblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTitulo.setText("Administración de Curso Desarrollo de aplicacione ");

        LstCursoAp.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Desarrollo de aplicaciones", "Planeación", "Seguimiento", "Actividades", "Contenido temático", "Calificaciones", "Participantes", "Grupos", "Profesores", "Calificaciones" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        LstCursoAp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LstCursoApMouseClicked(evt);
            }
        });
        LstCursoAp.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                LstCursoApValueChanged(evt);
            }
        });
        LstCursoAp.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                LstCursoApPropertyChange(evt);
            }
        });
        LstCursoAp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                LstCursoApKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(LstCursoAp);
        LstCursoAp.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblTitulo))
                .addContainerGap(195, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblTitulo)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 119, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LstCursoApValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_LstCursoApValueChanged

    }//GEN-LAST:event_LstCursoApValueChanged

    private void LstCursoApMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LstCursoApMouseClicked
        int index = LstCursoAp.getSelectedIndex();
        if (index == 1) {
            new ViewPlaneacionCurso().setVisible(true);
        
        } else if (index == 4) {
            new ViewUnidadesTematicas().setVisible(true);

        } else if (index == 6) {
            new ().setVisible(true);

        } else if (index == 7) {
            new ViewGrupo().setVisible(true);
        } else if (index == 8) {
            new ViewAdministracionParticipanteDocente().setVisible(true);

        }
    }//GEN-LAST:event_LstCursoApMouseClicked

    private void LstCursoApPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_LstCursoApPropertyChange

    }//GEN-LAST:event_LstCursoApPropertyChange

    private void LstCursoApKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LstCursoApKeyTyped

    }//GEN-LAST:event_LstCursoApKeyTyped

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
            java.util.logging.Logger.getLogger(ViewAdminstracionCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAdminstracionCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAdminstracionCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAdminstracionCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
            @Override
            public void run() {
                try {
                    //Dentro de estas lineas de comando se le da formato al diseno 
                    UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
                    new ViewAdminstracionCurso().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ViewPrincipalDocente.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(ViewPrincipalDocente.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(ViewPrincipalDocente.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(ViewPrincipalDocente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblTitulo;
    private javax.swing.JList LstCursoAp;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
