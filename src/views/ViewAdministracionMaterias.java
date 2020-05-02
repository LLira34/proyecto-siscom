package views;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import utils.UtileriasStyle;

/**
 * Descripción: 
 * En ésta funcionalidad el docente podrá registrar a una nueva materia.
 * @author Paola Guadalupe Gutierrez Santana
 * GSI1333
 */
public class ViewAdministracionMaterias extends javax.swing.JFrame {
    //encadezado de la tabla
    private String[] encabezadoColumnas = {"Nombre", "Horas Teóricas", "Horas Prácticas", "Duración", "Eliminar"};
    //definiendo el modelo de la tabla 
    private DefaultTableModel modelo = new DefaultTableModel(null, encabezadoColumnas);

    /**
     * Creates new form viewAdministraciónDeMaterias
     */
    public ViewAdministracionMaterias() {
        initComponents();
        tableMateria.setModel(modelo);
        UtileriasStyle.centrarVentana(this); //centrar la ventana
        //estilos a los paneles 
        UtileriasStyle.initStyle(panelDatos1.getComponents()); 
        UtileriasStyle.initStyle(panelDatos2.getComponents());
        UtileriasStyle.initStyle(panelTabla.getComponents());
        UtileriasStyle.initStyle(panelBotones.getComponents());
        //estilo al label que esta directamente en el jframe 
        UtileriasStyle.initStyle(this.getContentPane().getComponents());
        this.initComboHrsTotales();
        this.initComboGrado();
        this.initComboHrsSemana();
    }
    
    /**
     * Método que inicializa un combo con valores enteros
     */
    private void initComboHrsTotales() {
        comboHrsTotales.removeAllItems(); //Elimina todo del combo

        for (int i = 0; i <= 40; i++) { //Agrega elemento
            comboHrsTotales.addItem(Integer.toString(i));
        }
    }
    
    private void initComboGrado() {
        comboGrado.removeAllItems(); //Elimina todo del combo

        for (int i = 0; i <= 40; i++) { //Agrega elemento
            comboGrado.addItem(Integer.toString(i));
        }
    }
    
    private void initComboHrsSemana() {
        comboHrsSemana.removeAllItems(); //Elimina todo del combo

        for (int i = 0; i <= 40; i++) { //Agrega elemento
            comboHrsSemana.addItem(Integer.toString(i));
        }
    }    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jComboBox8 = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        lblTitulo = new javax.swing.JLabel();
        panelDatos1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtNomMateria = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        comboNivel = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtCompetencias = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        comboHrsTotales = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        chkActivo = new javax.swing.JCheckBox();
        panelDatos2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        comboGrado = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtObjetivo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        comboHrsSemana = new javax.swing.JComboBox<>();
        panelTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMateria = new javax.swing.JTable();
        panelBotones = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnUnidades = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jPanel3.setLayout(new java.awt.GridLayout(6, 2));

        jLabel18.setText("Nombre Materia:");
        jPanel3.add(jLabel18);

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField8);

        jLabel19.setText("Nivel:");
        jPanel3.add(jLabel19);

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Media Superior", "Superior" }));
        jPanel3.add(jComboBox7);

        jLabel20.setText("Descripción:");
        jPanel3.add(jLabel20);
        jPanel3.add(jTextField9);

        jLabel21.setText("Competencias:");
        jPanel3.add(jLabel21);
        jPanel3.add(jTextField10);

        jLabel22.setText("Horas Totales:");
        jPanel3.add(jLabel22);

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        jPanel3.add(jComboBox8);

        jLabel23.setText("Activo:");
        jPanel3.add(jLabel23);
        jPanel3.add(jCheckBox2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Registro de Nueva Materia");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 50));

        panelDatos1.setLayout(new java.awt.GridLayout(6, 2));

        jLabel12.setText("Nombre Materia:");
        jLabel12.setMaximumSize(new java.awt.Dimension(80, 10));
        jLabel12.setMinimumSize(new java.awt.Dimension(80, 10));
        jLabel12.setPreferredSize(new java.awt.Dimension(80, 10));
        panelDatos1.add(jLabel12);

        txtNomMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomMateriaActionPerformed(evt);
            }
        });
        panelDatos1.add(txtNomMateria);

        jLabel13.setText("Nivel:");
        panelDatos1.add(jLabel13);

        comboNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Media Superior", "Superior" }));
        panelDatos1.add(comboNivel);

        jLabel14.setText("Descripción:");
        panelDatos1.add(jLabel14);
        panelDatos1.add(txtDescripcion);

        jLabel15.setText("Competencias:");
        panelDatos1.add(jLabel15);
        panelDatos1.add(txtCompetencias);

        jLabel16.setText("Horas Totales:");
        panelDatos1.add(jLabel16);

        comboHrsTotales.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        panelDatos1.add(comboHrsTotales);

        jLabel17.setText("Activo:");
        panelDatos1.add(jLabel17);
        panelDatos1.add(chkActivo);

        getContentPane().add(panelDatos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 360, 280));

        panelDatos2.setLayout(new java.awt.GridLayout(3, 2));

        jLabel3.setText("Grado:");
        panelDatos2.add(jLabel3);

        comboGrado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        panelDatos2.add(comboGrado);

        jLabel4.setText("Objetivo:");
        panelDatos2.add(jLabel4);
        panelDatos2.add(txtObjetivo);

        jLabel5.setText("Horas Semana:");
        panelDatos2.add(jLabel5);

        comboHrsSemana.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        panelDatos2.add(comboHrsSemana);

        getContentPane().add(panelDatos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 360, 130));

        tableMateria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableMateria);

        javax.swing.GroupLayout panelTablaLayout = new javax.swing.GroupLayout(panelTabla);
        panelTabla.setLayout(panelTablaLayout);
        panelTablaLayout.setHorizontalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTablaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 753, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelTablaLayout.setVerticalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );

        getContentPane().add(panelTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 770, 120));

        panelBotones.setLayout(new java.awt.GridLayout(1, 3));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/save.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        panelBotones.add(btnAgregar);

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/update.png"))); // NOI18N
        btnModificar.setText("Modificar");
        panelBotones.add(btnModificar);

        btnUnidades.setText("Unidades");
        btnUnidades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUnidadesMouseClicked(evt);
            }
        });
        panelBotones.add(btnUnidades);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/backward.gif"))); // NOI18N
        jButton1.setText("Regresar");
        panelBotones.add(jButton1);

        getContentPane().add(panelBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 380, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomMateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomMateriaActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        //validar nulos
        String message = "";
        
        if(txtNomMateria.getText().trim().isEmpty()){
            message = "Escribe un Nombre Materia.\n";
        }
        
        if(txtDescripcion.getText().trim().isEmpty()){
            message = "Escribe una Descripción.\n";
        }
        
        if(txtCompetencias.getText().trim().isEmpty()){
            message = "Escribe las Competencias.\n";
        }
        
        if(txtObjetivo.getText().trim().isEmpty()){
            message = "Escribe un Objetivo.\n";
        }
        
        if(!message.isEmpty())
            JOptionPane.showMessageDialog(this, message, "Administración de Materias", JOptionPane.ERROR_MESSAGE);
             
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnUnidadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUnidadesMouseClicked
        this.setVisible(false);
        new ViewUnidadesTematicas().setVisible(true);
    }//GEN-LAST:event_btnUnidadesMouseClicked

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
            java.util.logging.Logger.getLogger(ViewAdministracionMaterias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAdministracionMaterias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAdministracionMaterias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAdministracionMaterias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
        //poner estilo a la forma
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewAdministracionMaterias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnUnidades;
    private javax.swing.JCheckBox chkActivo;
    private javax.swing.JComboBox<String> comboGrado;
    private javax.swing.JComboBox<String> comboHrsSemana;
    private javax.swing.JComboBox<String> comboHrsTotales;
    private javax.swing.JComboBox<String> comboNivel;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelDatos1;
    private javax.swing.JPanel panelDatos2;
    private javax.swing.JPanel panelTabla;
    private javax.swing.JTable tableMateria;
    private javax.swing.JTextField txtCompetencias;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtNomMateria;
    private javax.swing.JTextField txtObjetivo;
    // End of variables declaration//GEN-END:variables
}
