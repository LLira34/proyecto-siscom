package views;

import javax.swing.JOptionPane;
import utils.Utilerias;
import utils.UtileriasStyle;

/**
 * Descripción: Pantalla para registrar un nuevo curso
 * @author Miguel Angel Rangel Martinez
 * @version 1.0
 */
public class ViewRegistroCurso extends javax.swing.JFrame {

    public ViewRegistroCurso() {
        initComponents();
        //Se aplican los estilos a todos los componentes de la forma
        UtileriasStyle.initStyle(panPrincipal.getComponents());
        UtileriasStyle.initStyle(panCentral.getComponents());
        UtileriasStyle.initStyle(panInferior.getComponents());
        UtileriasStyle.initStyle(panTipoCurso.getComponents());
        //Se utiliza un metodo para centrar la ventana
        Utilerias.centrarVentana(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngroupCurso = new javax.swing.ButtonGroup();
        panPrincipal = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        panInferior = new javax.swing.JPanel();
        btnGenerar = new javax.swing.JButton();
        panCentral = new javax.swing.JPanel();
        lblAsignatura = new javax.swing.JLabel();
        cmbAsignatura = new javax.swing.JComboBox<>();
        lblTipoCurso = new javax.swing.JLabel();
        panTipoCurso = new javax.swing.JPanel();
        optCurso = new javax.swing.JRadioButton();
        optTaller = new javax.swing.JRadioButton();
        lblNombreCurso = new javax.swing.JLabel();
        txtNombreCurso = new javax.swing.JTextField();
        panSpace = new javax.swing.JPanel();
        panSpace0 = new javax.swing.JPanel();
        lblDescripcion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        lblObjetivo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtObjetivo = new javax.swing.JTextArea();
        lblCompetencias = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtCompetencias = new javax.swing.JTextArea();
        lblBienvenida = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtBienvenida = new javax.swing.JTextArea();
        lblRequerimientos = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtRequerimientos = new javax.swing.JTextArea();
        panSpace1 = new javax.swing.JPanel();
        panSpace2 = new javax.swing.JPanel();
        lblFechaInicio = new javax.swing.JLabel();
        txtFechaInicio = new javax.swing.JTextField();
        lblFechaFin = new javax.swing.JLabel();
        txtFechaFin = new javax.swing.JTextField();
        lblHorasTotales = new javax.swing.JLabel();
        cmbHorasTotales = new javax.swing.JComboBox<>();
        lblHorasSemana = new javax.swing.JLabel();
        cmbHorasSemana = new javax.swing.JComboBox<>();
        panSpace3 = new javax.swing.JPanel();
        panSpace4 = new javax.swing.JPanel();
        lblActivo = new javax.swing.JLabel();
        chkActivo = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panPrincipal.setLayout(new java.awt.BorderLayout());

        lblTitulo.setText("Registro de nuevo curso");
        panPrincipal.add(lblTitulo, java.awt.BorderLayout.PAGE_START);

        panInferior.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        btnGenerar.setText("Generar");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });
        panInferior.add(btnGenerar);

        panPrincipal.add(panInferior, java.awt.BorderLayout.PAGE_END);

        panCentral.setLayout(new java.awt.GridLayout(8, 4));

        lblAsignatura.setText("Asignatura");
        panCentral.add(lblAsignatura);

        cmbAsignatura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Selecciona una asignatura -", "item" }));
        panCentral.add(cmbAsignatura);

        lblTipoCurso.setText("Tipo de curso");
        panCentral.add(lblTipoCurso);

        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout();
        flowLayout1.setAlignOnBaseline(true);
        panTipoCurso.setLayout(flowLayout1);

        btngroupCurso.add(optCurso);
        optCurso.setText("Curso");
        panTipoCurso.add(optCurso);

        btngroupCurso.add(optTaller);
        optTaller.setText("Taller");
        panTipoCurso.add(optTaller);

        panCentral.add(panTipoCurso);

        lblNombreCurso.setText("Nombre del curso");
        panCentral.add(lblNombreCurso);

        txtNombreCurso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreCursoKeyTyped(evt);
            }
        });
        panCentral.add(txtNombreCurso);

        javax.swing.GroupLayout panSpaceLayout = new javax.swing.GroupLayout(panSpace);
        panSpace.setLayout(panSpaceLayout);
        panSpaceLayout.setHorizontalGroup(
            panSpaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        panSpaceLayout.setVerticalGroup(
            panSpaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 69, Short.MAX_VALUE)
        );

        panCentral.add(panSpace);

        javax.swing.GroupLayout panSpace0Layout = new javax.swing.GroupLayout(panSpace0);
        panSpace0.setLayout(panSpace0Layout);
        panSpace0Layout.setHorizontalGroup(
            panSpace0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        panSpace0Layout.setVerticalGroup(
            panSpace0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 69, Short.MAX_VALUE)
        );

        panCentral.add(panSpace0);

        lblDescripcion.setText("Descripción");
        panCentral.add(lblDescripcion);

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        panCentral.add(jScrollPane1);

        lblObjetivo.setText("Objetivo");
        panCentral.add(lblObjetivo);

        txtObjetivo.setColumns(20);
        txtObjetivo.setRows(5);
        jScrollPane2.setViewportView(txtObjetivo);

        panCentral.add(jScrollPane2);

        lblCompetencias.setText("Competencias");
        panCentral.add(lblCompetencias);

        txtCompetencias.setColumns(20);
        txtCompetencias.setRows(5);
        jScrollPane3.setViewportView(txtCompetencias);

        panCentral.add(jScrollPane3);

        lblBienvenida.setText("Bienvenida");
        panCentral.add(lblBienvenida);

        txtBienvenida.setColumns(20);
        txtBienvenida.setRows(5);
        jScrollPane4.setViewportView(txtBienvenida);

        panCentral.add(jScrollPane4);

        lblRequerimientos.setText("Requerimientos");
        panCentral.add(lblRequerimientos);

        txtRequerimientos.setColumns(20);
        txtRequerimientos.setRows(5);
        jScrollPane5.setViewportView(txtRequerimientos);

        panCentral.add(jScrollPane5);

        javax.swing.GroupLayout panSpace1Layout = new javax.swing.GroupLayout(panSpace1);
        panSpace1.setLayout(panSpace1Layout);
        panSpace1Layout.setHorizontalGroup(
            panSpace1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        panSpace1Layout.setVerticalGroup(
            panSpace1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 69, Short.MAX_VALUE)
        );

        panCentral.add(panSpace1);

        javax.swing.GroupLayout panSpace2Layout = new javax.swing.GroupLayout(panSpace2);
        panSpace2.setLayout(panSpace2Layout);
        panSpace2Layout.setHorizontalGroup(
            panSpace2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        panSpace2Layout.setVerticalGroup(
            panSpace2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 69, Short.MAX_VALUE)
        );

        panCentral.add(panSpace2);

        lblFechaInicio.setText("Fecha inicio");
        panCentral.add(lblFechaInicio);

        txtFechaInicio.setText("JCALENDAR - CAMBIO");
        panCentral.add(txtFechaInicio);

        lblFechaFin.setText("Fecha fin");
        panCentral.add(lblFechaFin);

        txtFechaFin.setText("JCALENDAR - CAMBIO");
        panCentral.add(txtFechaFin);

        lblHorasTotales.setText("Horas totales");
        panCentral.add(lblHorasTotales);

        cmbHorasTotales.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "0" }));
        panCentral.add(cmbHorasTotales);

        lblHorasSemana.setText("Horas semana");
        panCentral.add(lblHorasSemana);

        cmbHorasSemana.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "0" }));
        panCentral.add(cmbHorasSemana);

        javax.swing.GroupLayout panSpace3Layout = new javax.swing.GroupLayout(panSpace3);
        panSpace3.setLayout(panSpace3Layout);
        panSpace3Layout.setHorizontalGroup(
            panSpace3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        panSpace3Layout.setVerticalGroup(
            panSpace3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 69, Short.MAX_VALUE)
        );

        panCentral.add(panSpace3);

        javax.swing.GroupLayout panSpace4Layout = new javax.swing.GroupLayout(panSpace4);
        panSpace4.setLayout(panSpace4Layout);
        panSpace4Layout.setHorizontalGroup(
            panSpace4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        panSpace4Layout.setVerticalGroup(
            panSpace4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 69, Short.MAX_VALUE)
        );

        panCentral.add(panSpace4);

        lblActivo.setText("Activo");
        panCentral.add(lblActivo);

        chkActivo.setText("Activo");
        panCentral.add(chkActivo);

        panPrincipal.add(panCentral, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        //Validacion de nulos
        String message = "";
        
        if(cmbAsignatura.getSelectedIndex() == 0){
            message+="Tienes que seleccionar una asignatura";
            
        }
        
        if(btngroupCurso.getSelection()==null){
            message+="Tienes que seleccionar si es un curso o taller";
            
        }
        
        if(txtNombreCurso.getText().trim().isEmpty()){
            message+="El nombre es obligatorio";
            
        }
        
        if(txtDescripcion.getText().trim().isEmpty()){
            message+="La descripcion es obligatoria";
            
        }
        
        if(txtObjetivo.getText().trim().isEmpty()){
            message+="El objetivo es obligatorio";
            
        }
        
        if(txtCompetencias.getText().trim().isEmpty()){
            message+="El campo competencias es obligatorio";
            
        }
        
        if(txtRequerimientos.getText().trim().isEmpty()){
            message+="El campo requerimientos es obligatorio";
            
        }
        
        if(txtFechaInicio.getText().trim().isEmpty()){
            message+="La fecha de inicio es obligatoria";
            
        }
        
        if(txtFechaFin.getText().trim().isEmpty()){
            message+="La fecha de fin es obligatoria";
            
        }
        
        if(cmbHorasTotales.getSelectedIndex()==0){
            message+="Tienes que seleccionar las horas totales";
            
        }
        
        if(cmbHorasSemana.getSelectedIndex()==0){
            message+="Tienes que seleccionar las horas semana";
            
        }
        
        if(!message.isEmpty()){
            JOptionPane.showMessageDialog(this, message, "Registro curso", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //Codigo para generar el curso
        //Crea y abre la pantalla de docente
        this.setVisible(false);
        new ViewPrincipalDocente().setVisible(true);
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void txtNombreCursoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreCursoKeyTyped
        //Validacion de la longitud maxima
        if(txtNombreCurso.getText().length()>150){
           evt.consume();
        }
    }//GEN-LAST:event_txtNombreCursoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerar;
    private javax.swing.ButtonGroup btngroupCurso;
    private javax.swing.JCheckBox chkActivo;
    private javax.swing.JComboBox<String> cmbAsignatura;
    private javax.swing.JComboBox<String> cmbHorasSemana;
    private javax.swing.JComboBox<String> cmbHorasTotales;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblActivo;
    private javax.swing.JLabel lblAsignatura;
    private javax.swing.JLabel lblBienvenida;
    private javax.swing.JLabel lblCompetencias;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblFechaFin;
    private javax.swing.JLabel lblFechaInicio;
    private javax.swing.JLabel lblHorasSemana;
    private javax.swing.JLabel lblHorasTotales;
    private javax.swing.JLabel lblNombreCurso;
    private javax.swing.JLabel lblObjetivo;
    private javax.swing.JLabel lblRequerimientos;
    private javax.swing.JLabel lblTipoCurso;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JRadioButton optCurso;
    private javax.swing.JRadioButton optTaller;
    private javax.swing.JPanel panCentral;
    private javax.swing.JPanel panInferior;
    private javax.swing.JPanel panPrincipal;
    private javax.swing.JPanel panSpace;
    private javax.swing.JPanel panSpace0;
    private javax.swing.JPanel panSpace1;
    private javax.swing.JPanel panSpace2;
    private javax.swing.JPanel panSpace3;
    private javax.swing.JPanel panSpace4;
    private javax.swing.JPanel panTipoCurso;
    private javax.swing.JTextArea txtBienvenida;
    private javax.swing.JTextArea txtCompetencias;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtFechaFin;
    private javax.swing.JTextField txtFechaInicio;
    private javax.swing.JTextField txtNombreCurso;
    private javax.swing.JTextArea txtObjetivo;
    private javax.swing.JTextArea txtRequerimientos;
    // End of variables declaration//GEN-END:variables
}
