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
import javax.swing.table.DefaultTableModel;
import utils.UtileriasStyle;

/**
 *
 * @author Daniel Aguilar
 */
public class ViewEntidades extends javax.swing.JFrame {
    private String[] titulosTabla={"Nombre", "Alias","Estado"};
    private DefaultTableModel modelo = new DefaultTableModel(null, titulosTabla);

    /**
     * Creates new form ViewEntidades
     */
    public ViewEntidades() {
        initComponents();
        TablaEntidades.setModel(modelo);
        UtileriasStyle.centrarVentana(this);
        UtileriasStyle.initStyle(panelEntidades.getComponents());
        UtileriasStyle.initStyle(panelCajas.getComponents());
        UtileriasStyle.initStyle(panelBoton.getComponents());
        UtileriasStyle.initStyle(panelTabla.getComponents());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo2 = new javax.swing.JLabel();
        panelEntidades = new javax.swing.JPanel();
        panelCajas = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblAlias = new javax.swing.JLabel();
        txtAlias = new javax.swing.JTextField();
        lblActivo = new javax.swing.JLabel();
        chkActivo = new javax.swing.JCheckBox();
        panelBoton = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JToggleButton();
        btnRegresar = new javax.swing.JToggleButton();
        btnModificar = new javax.swing.JToggleButton();
        panelTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaEntidades = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 600));

        lblTitulo2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTitulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo2.setText("Administración de Entidades");
        getContentPane().add(lblTitulo2, java.awt.BorderLayout.PAGE_START);

        panelCajas.setLayout(new java.awt.GridLayout(3, 3));

        lblNombre.setText("Nombre");
        panelCajas.add(lblNombre);

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        panelCajas.add(txtNombre);

        lblAlias.setText("Alias");
        panelCajas.add(lblAlias);

        txtAlias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAliasKeyTyped(evt);
            }
        });
        panelCajas.add(txtAlias);

        lblActivo.setText("Activo");
        panelCajas.add(lblActivo);
        panelCajas.add(chkActivo);

        panelBoton.setLayout(new java.awt.GridLayout(2, 2));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        panelBoton.add(btnAgregar);

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        panelBoton.add(btnRegresar);

        btnModificar.setText("Modificar");
        panelBoton.add(btnModificar);

        panelTabla.setLayout(new java.awt.CardLayout());

        TablaEntidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaEntidades);

        panelTabla.add(jScrollPane1, "card2");

        javax.swing.GroupLayout panelEntidadesLayout = new javax.swing.GroupLayout(panelEntidades);
        panelEntidades.setLayout(panelEntidadesLayout);
        panelEntidadesLayout.setHorizontalGroup(
            panelEntidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEntidadesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEntidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelEntidadesLayout.createSequentialGroup()
                        .addComponent(panelCajas, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(panelBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelEntidadesLayout.setVerticalGroup(
            panelEntidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEntidadesLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(panelEntidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelCajas, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(panelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(172, Short.MAX_VALUE))
        );

        getContentPane().add(panelEntidades, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
         String message = ""; 
         char car = evt.getKeyChar();
         if(!Character.isAlphabetic(car)){
             evt.consume();
             message = "El campo Nombre sólo acepta letras.\n";
             JOptionPane.showMessageDialog(this, message,"Entrada al Sistema",
                    JOptionPane.ERROR_MESSAGE);
         }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtAliasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAliasKeyTyped
        // TODO add your handling code here:
        String message = ""; 
         char car = evt.getKeyChar();
         if(!Character.isAlphabetic(car)){
             evt.consume();
             message = "El campo Alias sólo acepta letras.\n";
             JOptionPane.showMessageDialog(this, message,"Entrada al Sistema",
                    JOptionPane.ERROR_MESSAGE);
         }
    }//GEN-LAST:event_txtAliasKeyTyped

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String message = "";
        
        Object[] dato = {txtNombre.getText(), txtAlias.getText(), chkActivo.isSelected()};
        this.modelo.addRow(dato);
        
        if(txtNombre.getText().trim().isEmpty()){
            message = "El Nombre debe tener contenido.\n";
        }
        if(txtAlias.getText().trim().isEmpty()){
            message= "El campo Alias debe tener contenido.\n";
        }
        if(!chkActivo.isSelected()){
            message="Verifique si la entidad es 'Activa ó No'";
        }
        if(!message.isEmpty()){
            JOptionPane.showMessageDialog(this, message,"Entrada al Sistema",
                    JOptionPane.ERROR_MESSAGE);            
        }  
        
       
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
         this.setVisible(false);
        new ViewAdministrarCiudades().setVisble(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(ViewEntidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewEntidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewEntidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewEntidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    //Se importa UIManager
                    UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
                    new ViewEntidades().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ViewPassword.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(ViewPassword.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(ViewPassword.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(ViewPassword.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaEntidades;
    private javax.swing.JToggleButton btnAgregar;
    private javax.swing.JToggleButton btnModificar;
    private javax.swing.JToggleButton btnRegresar;
    private javax.swing.JCheckBox chkActivo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblActivo;
    private javax.swing.JLabel lblAlias;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTitulo2;
    private javax.swing.JPanel panelBoton;
    private javax.swing.JPanel panelCajas;
    private javax.swing.JPanel panelEntidades;
    private javax.swing.JPanel panelTabla;
    private javax.swing.JTextField txtAlias;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
