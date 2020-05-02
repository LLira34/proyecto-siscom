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
//import utils.SiscomException;
import utils.UtileriasStyle;

/**
 * Descripción: Pantalla para ingresar al sistema
 * @author Miguel Angel Rangel Martinez
 * @version 1.0
 */
public class ViewEntrada extends javax.swing.JFrame {

    public ViewEntrada() {
        initComponents();
        UtileriasStyle.centrarVentana(this);//Se centra la ventana dependiendo de la resolución
        UtileriasStyle.initStyle(panPrincipal.getComponents());//Se aplica el estilo correspondiente al panel principal
        UtileriasStyle.initStyle(panContenido.getComponents());//Se aplica el estilo correspondiente al panel contenido
        UtileriasStyle.initStyle(panEntrada.getComponents());//Se aplica el estilo correspondiente al panel de entrada de datos
        UtileriasStyle.initStyle(panAcciones.getComponents());        //Se aplica el estilo correspondiente al panel de botones
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panContenido = new javax.swing.JPanel();
        panEntrada = new javax.swing.JPanel();
        lblCorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        lblContrasenia = new javax.swing.JLabel();
        txtContrasenia = new javax.swing.JPasswordField();
        panAcciones = new javax.swing.JPanel();
        btnRecuperar = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();
        btnRegistrarse = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setUndecorated(true);
        setResizable(false);

        panPrincipal.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sistema de competencias");
        jLabel1.setOpaque(true);
        panPrincipal.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        panContenido.setLayout(new java.awt.BorderLayout());

        panEntrada.setBorder(javax.swing.BorderFactory.createEmptyBorder(100, 1, 10, 160));
        panEntrada.setLayout(new java.awt.GridLayout(2, 2, 20, 2));

        lblCorreo.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblCorreo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCorreo.setText("Correo electrónico:");
        panEntrada.add(lblCorreo);

        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoKeyTyped(evt);
            }
        });
        panEntrada.add(txtCorreo);

        lblContrasenia.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblContrasenia.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblContrasenia.setText("Constraseña:         ");
        panEntrada.add(lblContrasenia);

        txtContrasenia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContraseniaKeyTyped(evt);
            }
        });
        panEntrada.add(txtContrasenia);

        panContenido.add(panEntrada, java.awt.BorderLayout.PAGE_START);

        panAcciones.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 200, 200, 200));
        panAcciones.setLayout(new java.awt.GridLayout(4, 1));

        btnRecuperar.setText("¿Desea recuperar su contraseña?");
        btnRecuperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecuperarActionPerformed(evt);
            }
        });
        panAcciones.add(btnRecuperar);

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        panAcciones.add(btnIngresar);

        btnRegistrarse.setText("Registrarse");
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });
        panAcciones.add(btnRegistrarse);

        panContenido.add(panAcciones, java.awt.BorderLayout.CENTER);

        panPrincipal.add(panContenido, java.awt.BorderLayout.CENTER);

        getContentPane().add(panPrincipal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        String message = "";

        //Valida el email
        if(txtCorreo.getText().isEmpty()){
            message+="El correo electrónico es obligatorio\n";
        }
        if(!validaEmail(txtCorreo.getText())){
            message+="El correo electrónico es inválido\n";
        }
        //Obtiene el password desde la caja de texto correspondiente
        String password = new String(txtContrasenia.getPassword());
        //valida el password
        if(password.isEmpty()){
            message+="La contraseña es obligatoria\n";
        }
        if(!validaPassword(password)){
            message+="La contraseña es inválida";
        }
        
        if(!message.isEmpty()){
            JOptionPane.showMessageDialog(this, message, "Entrada al sistema", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //Si todas las validaciones son correctas se continua con la ejecucion
        //Se crea un nuevo objeto de la clase ParticipanteDAOImplHibernate
        ParticipanteDAOImplHibernate participanteDAO = new ParticipanteDAOImplHibernate();
        //Se llama al metodo login obteniendo una lista con los participantes que coincidan con los parametros enviados
        List<Participante> participante = participanteDAO.login(txtCorreo.getText(), password);
        
        if(participante.isEmpty()){
            //FALTA AGREGAR LOS OTROS MENSAJES, NECESITO MODIFICAR LOS DAO IMPLEMENTS PARA AGREGAR LOS METODOS CORRESPONDIENTES
            JOptionPane.showMessageDialog(this,"Correo o contraseña incorrectas o no existentes","Entrada al sistema",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //Comprueba que el participante este activo
        if(participante.get(0).getActivo()){
            //Comprueba si es un estudiante o docente
            if(participante.get(0).getRol().equals("estudiante")){
                //Crea y abre la pantalla de estudiante
                this.setVisible(false);
                new ViewPrincipalEstudiante().setVisible(true);
            }else{
                //Crea y abre la pantalla de docente
                this.setVisible(false);
                new ViewPrincipalDocente().setVisible(true);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Participante no activo", "Entrada al sistema", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        //Crea y abre la pantalla de Registro
        this.setVisible(false);
        new ViewRegistro().setVisible(true);
    }//GEN-LAST:event_btnRegistrarseActionPerformed

    private void btnRecuperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecuperarActionPerformed
        //Crea y abre la pantalla de recuperacion de contraseña
        this.setVisible(false);
        new ViewRecuperarConstrasena().setVisible(true);
    }//GEN-LAST:event_btnRecuperarActionPerformed

    private void txtCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyTyped
        //Se valida la longitud maxima del campo
        if(txtCorreo.getText().length() >= 150)
            evt.consume();
    }//GEN-LAST:event_txtCorreoKeyTyped

    private void txtContraseniaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraseniaKeyTyped
        //Se valida la longitud maxima del campo
        if(new String(txtContrasenia.getPassword()).length() >= 15)
            evt.consume();
    }//GEN-LAST:event_txtContraseniaKeyTyped

    
    //Metodos insertados para la validacion, en espera de aprobacion para agregar a las utilerias
    public static boolean validaEmail(String email) {
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher matcher = pattern.matcher(email);
        return matcher.find();
    }
    
    
    public static boolean validaPassword(String password) {
        if(!(password.length()>=6))
            return false;
        if(!password.matches(".*[A-ZÑ].*"))
            return false;
        if(!password.matches(".*[a-zñ].*"))
            return false;
        if(!password.matches(".*\\W.*"))
            return false;
        return true;
    }
    //////////////////////////////////////////////////////////////////////////////////////

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");  // Importará la utilería jtattoo para mostrar el estilo predeterminado para los componetes
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ViewEntrada.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(ViewEntrada.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ViewEntrada.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(ViewEntrada.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewEntrada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnRecuperar;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblContrasenia;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JPanel panAcciones;
    private javax.swing.JPanel panContenido;
    private javax.swing.JPanel panEntrada;
    private javax.swing.JPanel panPrincipal;
    private javax.swing.JPasswordField txtContrasenia;
    private javax.swing.JTextField txtCorreo;
    // End of variables declaration//GEN-END:variables
}
