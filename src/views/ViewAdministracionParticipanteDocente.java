package views;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import utils.UtileriasStyle;

/**
 * Descripcion:Permite administrar los participantes con sus datos, nombre,
 * apellidos, correo y el rol que desempeña Luis Rolando Guerrero Calzada
 * GSI1333
 */
public class ViewAdministracionParticipanteDocente extends javax.swing.JFrame {

    private String[] encabezadoColumna = {"Nombre", "Email", "Ultimo Acceso", "Eliminar"};
    private DefaultTableModel modelo = new DefaultTableModel(null, encabezadoColumna);

    public ViewAdministracionParticipanteDocente() {
        initComponents();
        UtileriasStyle.centrarVentana(this);//llamamos la opcion de Centrar la ventana
        UtileriasStyle.initStyle(panelAdministracion.getComponents());//Aplicamos el estilo a los componentes que se encuentran en el panel
        UtileriasStyle.initStyle(panelCajas.getComponents());//Aplicamos el estilo a los componentes que se encuentran en el panel
        UtileriasStyle.initStyle(panelNombres.getComponents());//Aplicamos el estilo a los componentes que se encuentran en el panel
        UtileriasStyle.initStyle(panelTab.getComponents());//Aplicamos el estilo a los componentes que se encuentran en el panel

        tableParticipantes.setModel(modelo);
    }

    private void validacionNull() {
        String message = "";

        if (txtNombre.getText().trim().isEmpty()) {

            message = "No has escrito un Nombre.\n";
        }

        if (txtApellidos.getText().trim().isEmpty()) {

            message += "No has escrito un Apellido.\n";
        }

        if (txtCorreo.getText().trim().isEmpty()) {

            message += "No has escrito un Correo.\n";
        }

        if (cmbEntidad.getItemCount() != 0) {

            message += "Debes de seleccionar una Entidad.\n";
        }

        if (cmbCiudad.getItemCount() != 0) {

            message += "Debes de seleccionar una Ciudad.\n";
        }

        if (cmbRol.getItemCount() != 0) {

            message += "Debes de seleccionar un Rol.\n";
        }

        if (txtContraseña.getText().trim().isEmpty()) {

            message += "No has escrito una Contraseña.\n";

        }

        if (txtReEscribir.getText().trim().isEmpty()) {

            message += "Necesitas repetir la contraseña.\n";

        }

        if (!message.isEmpty()) {

            JOptionPane.showMessageDialog(this, message, "Entrada al Sistema", JOptionPane.ERROR_MESSAGE);

        }

    }

    public static boolean validarEmailFuerte(String email) {
        boolean status = false;
        String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            status = true;
        } else {
            status = false;
        }
        return status;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panelAdministracion = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        panelNombres = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        lblEntidad = new javax.swing.JLabel();
        lblCiudad = new javax.swing.JLabel();
        lblRol = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        panelTab = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableParticipantes = new javax.swing.JTable();
        panelCajas = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        cmbEntidad = new javax.swing.JComboBox<>();
        cmbCiudad = new javax.swing.JComboBox<>();
        cmbRol = new javax.swing.JComboBox<>();
        lblReEscriba = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        txtContraseña = new javax.swing.JPasswordField();
        txtReEscribir = new javax.swing.JPasswordField();

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

        panelAdministracion.setLayout(new java.awt.BorderLayout());

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Administración de Participantes");
        panelAdministracion.add(lblTitulo, java.awt.BorderLayout.PAGE_START);

        panelNombres.setMinimumSize(new java.awt.Dimension(120, 334));
        panelNombres.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombre.setText("Nombre");
        panelNombres.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 100, 30));

        lblApellido.setText("Apellidos");
        panelNombres.add(lblApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 100, 30));

        lblCorreo.setText("Correo");
        panelNombres.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 100, 30));

        lblEntidad.setText("Entidad");
        panelNombres.add(lblEntidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 100, 30));

        lblCiudad.setText("Ciudad");
        panelNombres.add(lblCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 100, 30));

        lblRol.setText("Rol");
        panelNombres.add(lblRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 100, 30));

        lblContraseña.setText("Contraseña");
        panelNombres.add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 100, 30));

        panelAdministracion.add(panelNombres, java.awt.BorderLayout.LINE_START);

        panelTab.setPreferredSize(new java.awt.Dimension(737, 150));

        tableParticipantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tableParticipantes);

        javax.swing.GroupLayout panelTabLayout = new javax.swing.GroupLayout(panelTab);
        panelTab.setLayout(panelTabLayout);
        panelTabLayout.setHorizontalGroup(
            panelTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 771, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelTabLayout.setVerticalGroup(
            panelTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTabLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelAdministracion.add(panelTab, java.awt.BorderLayout.PAGE_END);

        panelCajas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        panelCajas.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 310, 30));

        txtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidosKeyTyped(evt);
            }
        });
        panelCajas.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 310, 30));

        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoKeyTyped(evt);
            }
        });
        panelCajas.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 310, 30));

        cmbEntidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una Entidad", "Aguascalientes ", "Baja California", "Baja California Sur ", "Campeche ", "Chiapas ", "Chihuahua ", "Coahuila ", "Colima", "Distrito Federal ", "Durango ", "Guanajuato", "Guerrero ", "Hidalgo ", "Jalisco", "Estado de México ", "Michoacán ", "Morelos", "Nayarit", "Nuevo León ", "Oaxaca ", "Querétaro", "Puebla", "Quintana Roo", "San Luis Potosí", "Sinaloa", "Sonora", "Tabasco", "Tamaulipas", "Tlaxcala", "Veracruz", "Yucatán", "Zacatecas  " }));
        panelCajas.add(cmbEntidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 310, 30));

        cmbCiudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una Ciudad" }));
        panelCajas.add(cmbCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 310, 30));

        cmbRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona un Rol", "Estudiante", "Docente" }));
        cmbRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRolActionPerformed(evt);
            }
        });
        panelCajas.add(cmbRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 310, 30));

        lblReEscriba.setText("Re-escribirla");
        panelCajas.add(lblReEscriba, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 120, 30));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        panelCajas.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 130, 50));

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        panelCajas.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 130, 50));

        txtContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContraseñaKeyTyped(evt);
            }
        });
        panelCajas.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 210, 30));

        txtReEscribir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtReEscribirKeyTyped(evt);
            }
        });
        panelCajas.add(txtReEscribir, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 210, 30));

        panelAdministracion.add(panelCajas, java.awt.BorderLayout.CENTER);

        getContentPane().add(panelAdministracion, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void cmbRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbRolActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:

        this.setVisible(false);
        new ViewGrupo().setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        boolean status = validarEmailFuerte(txtCorreo.getText());
        if (status) {

        } else {
            JOptionPane.showMessageDialog(null, "Escriba un correo valido");

        }
        validacionNull();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();

        if (txtNombre.getText().length() > 49) {

            evt.consume();
        }

        if (!(Character.isAlphabetic(car))) {//si no es alfabetco

            evt.consume();//no lo despliega
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        if (txtApellidos.getText().length() > 999) {
            evt.consume();
        }

        if (!(Character.isAlphabetic(car))) {//si no es alfabetco
            evt.consume();//no lo despliega
        }
    }//GEN-LAST:event_txtApellidosKeyTyped

    private void txtCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyTyped
        // TODO add your handling code here:

        if (txtCorreo.getText().length() > 149) {

            evt.consume();

        }
    }//GEN-LAST:event_txtCorreoKeyTyped

    private void txtContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraseñaKeyTyped
        // TODO add your handling code here:
        if (txtContraseña.getText().length() > 14) {

            evt.consume();

        }
    }//GEN-LAST:event_txtContraseñaKeyTyped

    private void txtReEscribirKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtReEscribirKeyTyped
        if (txtReEscribir.getText().length() > 14) {

            evt.consume();

        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtReEscribirKeyTyped

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
            java.util.logging.Logger.getLogger(ViewAdministracionParticipanteDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAdministracionParticipanteDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAdministracionParticipanteDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAdministracionParticipanteDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
            public void run() {
                try {
                    UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");//Se importa el estilo para poder hacer uso de el en los paneles superiores
                    new ViewAdministracionParticipanteDocente().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ViewAdministracionParticipanteDocente.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(ViewAdministracionParticipanteDocente.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(ViewAdministracionParticipanteDocente.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(ViewAdministracionParticipanteDocente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cmbCiudad;
    private javax.swing.JComboBox<String> cmbEntidad;
    private javax.swing.JComboBox<String> cmbRol;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCiudad;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblEntidad;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblReEscriba;
    private javax.swing.JLabel lblRol;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panelAdministracion;
    private javax.swing.JPanel panelCajas;
    private javax.swing.JPanel panelNombres;
    private javax.swing.JPanel panelTab;
    private javax.swing.JTable tableParticipantes;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtReEscribir;
    // End of variables declaration//GEN-END:variables
}
