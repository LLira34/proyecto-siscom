package views;

import dao.impl.ParticipanteDAOImplHibernate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import modelo.Participante;
import utils.UtileriasStyle;

/**
 *
 * @author Alondra Guerra Quintero alo.marvel1@gmail.com
 */
public class ViewRecuperarContrasena extends javax.swing.JFrame {

    public ViewRecuperarContrasena() {
        initComponents();
        UtileriasStyle.centrarVentana(this);//Metodo para centrar el JFrame cuando éste se ejecute
        UtileriasStyle.initStyle(panelIngresoCorreo.getComponents());//Se le va a aplicar al estilo de la utileria al panel principal
        UtileriasStyle.initStyle(panelRecuperarContrasena.getComponents());//Se le va a aplicar al estilo de la utileria al panel
        UtileriasStyle.initStyle(panelTitulo.getComponents());//Se le va a aplicar al estilo de la utileria al panel
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelIngresoCorreo = new javax.swing.JPanel();
        panelTitulo = new javax.swing.JPanel();
        labelTituloRecuperar = new javax.swing.JLabel();
        panelRecuperarContrasena = new javax.swing.JPanel();
        lblCorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        lblTituloCorreo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        panelIngresoCorreo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTitulo.setMaximumSize(new java.awt.Dimension(800, 50));
        panelTitulo.setMinimumSize(new java.awt.Dimension(800, 50));
        panelTitulo.setPreferredSize(new java.awt.Dimension(800, 50));

        labelTituloRecuperar.setFont(new java.awt.Font("Bookman Old Style", 3, 36)); // NOI18N
        labelTituloRecuperar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTituloRecuperar.setText("Recuperar Contraseña");

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelTituloRecuperar, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addComponent(labelTituloRecuperar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelIngresoCorreo.add(panelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 70));

        panelRecuperarContrasena.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        panelRecuperarContrasena.setMaximumSize(new java.awt.Dimension(700, 450));
        panelRecuperarContrasena.setMinimumSize(new java.awt.Dimension(700, 450));
        panelRecuperarContrasena.setPreferredSize(new java.awt.Dimension(700, 450));

        lblCorreo.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        lblCorreo.setText("Correo Electrónico");

        txtCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCorreoFocusLost(evt);
            }
        });
        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelRecuperarContrasenaLayout = new javax.swing.GroupLayout(panelRecuperarContrasena);
        panelRecuperarContrasena.setLayout(panelRecuperarContrasenaLayout);
        panelRecuperarContrasenaLayout.setHorizontalGroup(
            panelRecuperarContrasenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRecuperarContrasenaLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblCorreo)
                .addGap(51, 51, 51)
                .addComponent(txtCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                .addGap(147, 147, 147))
        );
        panelRecuperarContrasenaLayout.setVerticalGroup(
            panelRecuperarContrasenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRecuperarContrasenaLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(panelRecuperarContrasenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(337, Short.MAX_VALUE))
        );

        panelIngresoCorreo.add(panelRecuperarContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 720, 200));

        btnBuscar.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        panelIngresoCorreo.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 450, 122, 47));

        lblTituloCorreo.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        lblTituloCorreo.setText("Correo Electrónico");
        panelIngresoCorreo.add(lblTituloCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelIngresoCorreo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelIngresoCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyTyped
        if (txtCorreo.getText().length() > 14) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCorreoKeyTyped
//Metodo para establecer que tenga contenido y un patron correcto
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        String message = "";//Variable por el cual se va a mandar el mensaje de error

        if (txtCorreo.getText().trim().isEmpty()) {//Si etá vacio entonces
            message = "El correo debe tener un valor. \n";//Se le otorga el contenido a la varable mensaje

        }
        if (!message.isEmpty()) {//Si la variable esta vacia
            JOptionPane.showMessageDialog(this, message, "Entrada al Sistema", JOptionPane.ERROR_MESSAGE);//Se ejecuta el Joption con el contenido de la variable de messagr
            txtCorreo.requestFocus();
        } else {

            ParticipanteDAOImplHibernate dao = new ParticipanteDAOImplHibernate();//Llama a la clase de  ParticipanteDAOImplHibernate
            boolean email = dao.recpContrasena(txtCorreo.getText());//Se obtiene el valor de la caja de texto y le asgina el valor de email

            if (email) {//Conprueba que existe el correo
                new ViewRegistro().setVisible(true);//Enlace a la siguiente pantalla
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(this, "No existe el correo");//Manda mensaje de que no existe correo
                txtCorreo.requestFocus();
            }
        }

    }//GEN-LAST:event_btnBuscarActionPerformed


    private void txtCorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoFocusLost
    }//GEN-LAST:event_txtCorreoFocusLost
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
                new ViewRecuperarContrasena().setVisible(true);

            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel labelTituloRecuperar;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblTituloCorreo;
    private javax.swing.JPanel panelIngresoCorreo;
    private javax.swing.JPanel panelRecuperarContrasena;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JTextField txtCorreo;
    // End of variables declaration//GEN-END:variables
}
