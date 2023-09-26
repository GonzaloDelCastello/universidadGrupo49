
package universidadgrupo49.Vistas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import universidadgrupo49.AccesoADatos.AlumnoData;
import universidadgrupo49.AccesoADatos.InscripcionData;
import universidadgrupo49.AccesoADatos.MateriaData;
import universidadgrupo49.Entidades.Alumno;
import universidadgrupo49.Entidades.Inscripcion;
import universidadgrupo49.Entidades.Materia;

/**
 *
 * @author Usuario
 */
public class ConsultaAlumnoPorMateriaVista extends javax.swing.JInternalFrame {
  
    
    private List<Materia> listaMat;
    private List<Alumno> listaAlu;
    
    private InscripcionData inscrData;
    private MateriaData matData;
    private AlumnoData aluData;
    
    
    private DefaultTableModel modelo;
    
        
    
    public ConsultaAlumnoPorMateriaVista() {
        initComponents();
        
        aluData = new AlumnoData();
        boolean estado = false;        // inicializo variable estado-*-
        listaAlu = aluData.listarAlumnos(estado);
        modelo = new DefaultTableModel();
        
        inscrData = new InscripcionData();
        matData = new MateriaData();
        
        cargaInscripcion();
        armarCabeceraTabla(); 
      //  cargaAlumnos();
    }
    
    
                  // METODO SELECCIONAR MATERIA         
     
    private void cargaInscripcion() {
    MateriaData matData = new MateriaData(); // instancia MateriaData
    List<Materia> materias = matData.listarMaterias(true); // recupera todos las materias
    
    cboxMateria.removeAllItems(); // limpia comboBox
           
    for (Materia materia : materias) {
       cboxMateria.addItem(materia); // agrega cada Materia al comboBox-*-
    }
}
    
    
                 // ARMAR CABECERA
    
     private void armarCabeceraTabla(){
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("ID");                             //
        filaCabecera.add("DNI");                         //titulos tabla-*-
        filaCabecera.add("Apellido");                       //
        filaCabecera.add("Nombre");
        
        
        for (Object rec : filaCabecera) {
            modelo.addColumn(rec);
        }
        
        jTAlumno.setModel(modelo);
    }  
     
     
     
     
                 // METODO CARGA TABLA ALUMNOS    
    
//    private void cargaAlumnos() {
//    AlumnoData alumnoData = new AlumnoData(); // crear una instancia AlumnoData
//    List<Inscripcion> inscripciones = inscrData.obtenerAlumnosXMateria(cboxMateria.getSelectedItem())); // recupera los estudiantes de DB
//    DefaultTableModel model = (DefaultTableModel) jTAlumno.getModel(); // obtener el modelo de tabla
//    model.setRowCount(0); // limpia la tabla
//    for (Inscripcion inscripcion : inscripciones) {
//        Object[] row = {inscripcion.getAlumno().getIdAlumno(), inscripcion.getAlumno().getDni(), inscripcion.getAlumno().getApellido(), inscripcion.getAlumno().getNombre()};
//        model.addRow(row); // agraga a cada alumno a la tabla
//    }
//}
     
             // MATERIA SELECCIONADA
               
     public String materiaSeleccionada(List<String> listaMaterias, String materiaSeleccionada) {
    for (String materia : listaMaterias) {
        if (materia.equals(materiaSeleccionada)) {
            return materia;
        }
    }
    return null;
}
     
     
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTAlumno = new javax.swing.JTable();
        cboxMateria = new javax.swing.JComboBox<>();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setClosable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setText("Listado de Alumnos por Materia");

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setText("Seleccione una materia");

        jTAlumno.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTAlumno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "DNI", "Apellido", "Nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTAlumno);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(cboxMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(15, 15, 15))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboxMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    


    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Materia> cboxMateria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTAlumno;
    // End of variables declaration//GEN-END:variables
}
