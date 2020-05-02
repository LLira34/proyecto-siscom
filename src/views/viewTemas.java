/**
 * @Formulario Registro de Temas
 * @author Ulises García Ponce
 * @--ulisesgarcia060@gmail.com
 * @En este formulario se tomara el registro de cada materia y su calificación
 */
package views;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import utils.UtileriasStyle;

public class viewTemas extends javax.swing.JFrame {

    //Encabezado de las columnas 
    private String[] encabezadoColumnas = {"Nombre", "Eliminar"};
    private DefaultTableModel modelo = new DefaultTableModel(null, encabezadoColumnas); //definel las columnas

    /**
     * Creates new form viewTemas
     */
    public viewTemas() {
        initComponents();
        tableRegistro.setModel(modelo);
        //Utilerias para centrar la ventana en cualquier resolucion
        UtileriasStyle.centrarVentana(this);
        UtileriasStyle.initStyle(panelTemas.getComponents());//Dar formato al panel
        tableRegistro.setModel(modelo);
        //fin de centrar pantalla
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panelTemas = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableRegistro = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        chkMateria = new javax.swing.JComboBox<>();
        chkUniTematica = new javax.swing.JComboBox<>();
        txtNombreTema = new javax.swing.JTextField();
        txtSaber = new javax.swing.JTextField();
        txtSaberHacer = new javax.swing.JTextField();
        txtSer = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        jLabel2.setBackground(new java.awt.Color(0, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Registro de Temas");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jLabel2.setOpaque(true);

        tableRegistro.setBackground(new java.awt.Color(204, 255, 255));
        tableRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Nombre", "Eliminar"
            }
        ));
        jScrollPane2.setViewportView(tableRegistro);

        btnAgregar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(0, 0, 102));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnAgregar.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(0, 0, 102));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnMod.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarMouseClicked(evt);
            }
        });

        btnRegresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(0, 0, 102));
        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btAtras.png"))); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegresarMouseClicked(evt);
            }
        });

        jPanel1.setLayout(new java.awt.GridLayout(0, 1));

        jLabel1.setBackground(new java.awt.Color(0, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Materia");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jLabel1.setMaximumSize(new java.awt.Dimension(80, 23));
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(100, 100));
        jLabel1.setRequestFocusEnabled(false);
        jPanel1.add(jLabel1);

        jLabel3.setBackground(new java.awt.Color(0, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Unidad Temática");
        jLabel3.setToolTipText("");
        jLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3);

        jLabel4.setBackground(new java.awt.Color(0, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Nombre Tema");
        jLabel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4);

        jLabel5.setBackground(new java.awt.Color(0, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("Saber");
        jLabel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jLabel5.setOpaque(true);
        jPanel1.add(jLabel5);

        jLabel6.setBackground(new java.awt.Color(0, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("Saber Hacer");
        jLabel6.setToolTipText("");
        jLabel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6);

        jLabel7.setBackground(new java.awt.Color(0, 255, 255));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setText("Ser");
        jLabel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jLabel7.setOpaque(true);
        jPanel1.add(jLabel7);

        jPanel2.setLayout(new java.awt.GridLayout(0, 1));

        chkMateria.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        chkMateria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Desarrollo de Aplicaciones I" }));
        chkMateria.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        chkMateria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(chkMateria);

        chkUniTematica.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        chkUniTematica.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Unida Conceptos Básicos" }));
        chkUniTematica.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(chkUniTematica);
        jPanel2.add(txtNombreTema);
        jPanel2.add(txtSaber);
        jPanel2.add(txtSaberHacer);
        jPanel2.add(txtSer);

        javax.swing.GroupLayout panelTemasLayout = new javax.swing.GroupLayout(panelTemas);
        panelTemas.setLayout(panelTemasLayout);
        panelTemasLayout.setHorizontalGroup(
            panelTemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTemasLayout.createSequentialGroup()
                .addGroup(panelTemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelTemasLayout.createSequentialGroup()
                        .addGroup(panelTemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelTemasLayout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(panelTemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        panelTemasLayout.setVerticalGroup(
            panelTemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTemasLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(panelTemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTemasLayout.createSequentialGroup()
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(198, 198, 198)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTemas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTemas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        // Codigo para las validacion de campos vacios no podra ingresar datos si no llena los campos

        String message = "";

        if (txtNombreTema.getText().trim().isEmpty()) {
            message = "Debe ingresar una materia\n";
        }

        if (txtSaber.getText().trim().isEmpty()) {
            message = "Debe ingresar datos en el Ser\n";
        }

        if (txtSaberHacer.getText().trim().isEmpty()) {
            message = "Debe ingresar datos en el SaberSer\n";
        }
        if (txtSer.getText().trim().isEmpty()) {
            message = "Debe ingresar datos \n";
        }
        if (!message.isEmpty()) {
            JOptionPane.showMessageDialog(this, message, "Ingreso de datos",
                    JOptionPane.ERROR_MESSAGE);
        }

        Object[] dato = {"1", txtNombreTema.getText(), txtSaber.getText(), txtSaberHacer.getText(), txtSer.getText()};
        this.modelo.addRow(dato);
        txtNombreTema.setText("");
        txtSaber.setText("");
        txtSaberHacer.setText("");
        txtSer.setText("");


    }//GEN-LAST:event_btnAgregarMouseClicked

    private void btnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_btnModificarMouseClicked

    private void btnRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseClicked
        // Boton de regresar 
        this.setVisible(false);
        ViewUnidadesTematicas ut = new ViewUnidadesTematicas();
        ut.setVisible(true);
    }//GEN-LAST:event_btnRegresarMouseClicked

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
            java.util.logging.Logger.getLogger(viewTemas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewTemas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewTemas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewTemas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            //dar el diseño al jframe 
            //y sus componentes
            public void run() {

                try {

                    UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
                    new viewTemas().setVisible(true);

                    //Fin del estilo
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(viewTemas.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(viewTemas.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(viewTemas.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(viewTemas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> chkMateria;
    private javax.swing.JComboBox<String> chkUniTematica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel panelTemas;
    private javax.swing.JTable tableRegistro;
    private javax.swing.JTextField txtNombreTema;
    private javax.swing.JTextField txtSaber;
    private javax.swing.JTextField txtSaberHacer;
    private javax.swing.JTextField txtSer;
    // End of variables declaration//GEN-END:variables

}
