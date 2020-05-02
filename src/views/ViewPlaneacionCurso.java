package views;

//import java.text.DateFormat;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.swing.UIManager;
//import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import utils.UtileriasStyle;

/**
 * Descripción RF13 Planeación de un curso
 *
 * @author Luis Lira
 * @author llira GSI1333
 */
public class ViewPlaneacionCurso extends javax.swing.JFrame {

    //DateFormat VariableFecha = DateFormat.getDateInstance();
    //Encabezado de las columnas
    private String[] encabezadoColumna = {"Actividad", "Fecha programada",
        "Fecha Pro", "Producto", "Instrumento", "Eliminar"};
    //Definiendo el modelo de la tabla
    private DefaultTableModel modelo = new DefaultTableModel(null, encabezadoColumna);

    /**
     * Creates new form PlaneacionCurso
     */
    public ViewPlaneacionCurso() {
        initComponents();
        UtileriasStyle.centrarVentana(this);//centra la ventana en cualquier resolución 
        UtileriasStyle.initStyle(panelContacto.getComponents());//le da formato a el panel 
        UtileriasStyle.initStyle(panelBoton.getComponents());//le da formato a el panel
        tableActividad.setModel(modelo);//Llamando a la tabla
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        panelBoton = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        panelContacto = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jComboBox5 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jComboBox6 = new javax.swing.JComboBox<>();
        jComboBox7 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableActividad = new javax.swing.JTable();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

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
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(650, 600));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 255));
        jLabel1.setText("Planeación del curso");
        getContentPane().add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jButton1.setText("Regresar");

        jButton2.setText("Imprimir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonLayout = new javax.swing.GroupLayout(panelBoton);
        panelBoton.setLayout(panelBotonLayout);
        panelBotonLayout.setHorizontalGroup(
            panelBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(panelBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap())
        );
        panelBotonLayout.setVerticalGroup(
            panelBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2))
        );

        getContentPane().add(panelBoton, java.awt.BorderLayout.LINE_END);

        panelContacto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Nombre de Curso");
        panelContacto.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 140, -1));

        jLabel3.setText("Unidad temática");
        panelContacto.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 140, -1));

        jLabel4.setText("Tema");
        panelContacto.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 66, 140, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Introducción a la programación" }));
        panelContacto.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 225, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Introducción a la computadora" }));
        panelContacto.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 225, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "¿Qué es una computadora?" }));
        panelContacto.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 225, -1));
        panelContacto.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 101, 414, 10));

        jLabel5.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel5.setText("Plan clase");
        panelContacto.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 117, -1, -1));

        jLabel6.setText("No. sesión");
        panelContacto.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 143, 170, -1));

        jLabel7.setText("Actividad");
        panelContacto.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 169, 170, -1));

        jLabel8.setText("Momento");
        panelContacto.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 170, -1));

        jLabel9.setText("Producto de aprendizaje");
        panelContacto.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 170, -1));

        jLabel10.setText("Instrumento Eval.");
        panelContacto.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 170, -1));

        jLabel11.setText("Ponderación");
        panelContacto.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 170, -1));

        jLabel12.setText("Fecha de Entrega");
        panelContacto.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 170, -1));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sesión 1" }));
        panelContacto.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, -1, -1));
        panelContacto.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 164, -1));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Apertura" }));
        panelContacto.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, -1, -1));
        panelContacto.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 163, -1));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lista de cotejo" }));
        panelContacto.add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, -1, -1));

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1" }));
        panelContacto.add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, -1, -1));

        jButton3.setText("Agregar");
        panelContacto.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 110, -1));
        panelContacto.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 414, 10));

        tableActividad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tableActividad);

        panelContacto.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 373, 90));
        panelContacto.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 150, -1));

        getContentPane().add(panelContacto, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewPlaneacionCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPlaneacionCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPlaneacionCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPlaneacionCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //try {
                    //UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");//para darle formato a el diseño 
                    new ViewPlaneacionCurso().setVisible(true);
//                } catch (ClassNotFoundException ex) {
//                    Logger.getLogger(ViewPlaneacionCurso.class.getName()).log(Level.SEVERE, null, ex);
//                } catch (InstantiationException ex) {
//                    Logger.getLogger(ViewPlaneacionCurso.class.getName()).log(Level.SEVERE, null, ex);
//                } catch (IllegalAccessException ex) {
//                    Logger.getLogger(ViewPlaneacionCurso.class.getName()).log(Level.SEVERE, null, ex);
//                } catch (UnsupportedLookAndFeelException ex) {
//                    Logger.getLogger(ViewPlaneacionCurso.class.getName()).log(Level.SEVERE, null, ex);
//                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel panelBoton;
    private javax.swing.JPanel panelContacto;
    private javax.swing.JTable tableActividad;
    // End of variables declaration//GEN-END:variables
}