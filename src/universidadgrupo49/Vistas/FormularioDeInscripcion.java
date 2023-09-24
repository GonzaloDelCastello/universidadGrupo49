
package universidadgrupo49.Vistas;

import universidadgrupo49.AccesoADatos.AlumnoData;
import universidadgrupo49.AccesoADatos.InscripcionData;
import universidadgrupo49.AccesoADatos.MateriaData;

import universidadgrupo49.Entidades.Alumno;
import universidadgrupo49.Entidades.Inscripcion;
import universidadgrupo49.Entidades.Materia;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Usuario
 */
public class FormularioDeInscripcion extends javax.swing.JInternalFrame {

//    
//    private List<Materia> listaMat;
//    private List<Alumno> listaAlu;
//    
//    private InscripcionData inscrData;
//    private MateriaData matData;
//    private AlumnoData aluData;
//    
//    
//    private DefaultTableModel modelo;
//    
    
    public FormularioDeInscripcion() { // dentro constructor 
        initComponents();
        
//        aluData = new AlumnoData();
//        listaAlu = aluData.listarAlumnos(isIcon);
//        modelo = new DefaultTableModel();
//        
//        inscrData = new InscripcionData();
//        matData = new MateriaData();
//        
//        cargaAlumnos();
//        armarCabeceraTabla(); 
       
       
       
    }

                 // METODO CARGA ALUMNOS
    
//    private void cargaAlumnos() {       // Carga ComboBox
//        for (Alumno item : listaAlu) {
//            cboxAlumno.addItem(item);
//        }
//    }
    
                 // METODO ARMAR CABECERA TABLA             
    
//    private void armarCabeceraTabla(){
//        ArrayList<Object> filaCabecera = new ArrayList<>();
//        filaCabecera.add("ID");
//        filaCabecera.add("Nombre");
//        filaCabecera.add("Año");
//        
//        for (Object rec : filaCabecera) {
//            modelo.addColumn(rec);
//        }
//        
//        jTableMaterias.setModel(modelo);
//    }
    
                 // METODO BORRAR FILA TABLA
    
//    private void borrarFilaTabla(){
//        
//        int indice = modelo.getRowCount() -1;
//        
//        for (int i = indice; i >= 0; i--) {
//            modelo.removeRow(i);
//            
//        }
//    }
    
                // METODO MATERIAS NO INSCRIPTAS
    
//    private void cargaDatosNoInscriptas(){
//        //borrarFilaTabla();
//        Alumno selec = (Alumno) cboxAlumno.getSelectedItem();
//        listaMat = inscrData.obtenerMateriasNoCursadas(selec.getIdAlumno());
//        for (Materia materia : listaMat) {
//            modelo.addRow(new Object[] {materia.getIdMateria(), materia.getNombre(), materia.getAnio()});
//        }
//    }
    
    
                // METODO MATERIAS INSCRIPTAS
    
//    private void cargaDatosInscriptas(){
//        //borrarFilaTabla();
//        Alumno selec = (Alumno) cboxAlumno.getSelectedItem();
//        List <Materia> lista = inscrData.obtenerMateriasCursadas(selec.getIdAlumno());
//              
//        for (Materia materia : lista) {
//            modelo.addRow(new Object[] {materia.getIdMateria(), materia.getNombre(), materia.getAnio()});
//        }
//    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cboxAlumno = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jRBMateriasNoInscriptas = new javax.swing.JRadioButton();
        jRBMateriasInscriptas = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMaterias = new javax.swing.JTable();
        jBAnularInscripcion = new javax.swing.JButton();
        jBIncribir = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);

        jLabel2.setText("Formulario de Inscripcion");

        jLabel3.setText("Seleccione un alumno:");

        jLabel1.setText("Listado de Materias");

        jRBMateriasNoInscriptas.setText("Materias No Inscriptas");
        jRBMateriasNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBMateriasNoInscriptasActionPerformed(evt);
            }
        });

        jRBMateriasInscriptas.setText("Materias Inscriptas");
        jRBMateriasInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBMateriasInscriptasActionPerformed(evt);
            }
        });

        jTableMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre ", "Año"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableMaterias);

        jBAnularInscripcion.setText("Anular Inscripción");
        jBAnularInscripcion.setEnabled(false);

        jBIncribir.setText("Inscribir");
        jBIncribir.setEnabled(false);
        jBIncribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIncribirActionPerformed(evt);
            }
        });

        jBSalir.setText("Salir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addComponent(jLabel2)
                .addContainerGap(196, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(75, 75, 75)
                                .addComponent(cboxAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jBIncribir)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBAnularInscripcion)
                                    .addGap(105, 105, 105)
                                    .addComponent(jBSalir))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jRBMateriasInscriptas)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRBMateriasNoInscriptas))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(220, 220, 220))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(cboxAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRBMateriasInscriptas, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRBMateriasNoInscriptas))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSalir)
                    .addComponent(jBAnularInscripcion)
                    .addComponent(jBIncribir))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

                   // MATERIAS INSCRIPTAS
    
    private void jRBMateriasInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBMateriasInscriptasActionPerformed
//       
//           borrarFilaTabla();
//           jRBMateriasNoInscriptas.setSelected(false);
//           cargaDatosInscriptas();
//           
//           
//           jBIncribir.setEnabled(true);
//           jBAnularInscripcion.setEnabled(false);
//           
    }//GEN-LAST:event_jRBMateriasInscriptasActionPerformed

                   // MATERIAS NO INSCRIPTAS
    
    private void jRBMateriasNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBMateriasNoInscriptasActionPerformed
      
//           borrarFilaTabla();
//           jRBMateriasInscriptas.setSelected(false);
//           cargaDatosNoInscriptas();
//           
//           
//           jBIncribir.setEnabled(false);
//           jBAnularInscripcion.setEnabled(true);
           
           
    }//GEN-LAST:event_jRBMateriasNoInscriptasActionPerformed

    private void jBIncribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIncribirActionPerformed
    
//        int filaSect = jTableMaterias.getSelectedRow();
//        if (filaSect!= -1) {
//                         // casteamos 
//            Alumno a = (Alumno)cboxAlumno.getSelectedItem();
//                           // casteamos  
//            int idMateria = (Integer)modelo.getValueAt(filaSect, 0);
//                                   // casteamos    
//            String nombreMateria = (String)modelo.getValueAt(filaSect, 1);
//                       // casteamos                
//            int anio = (Integer)modelo.getValueAt(filaSect, 2);
//            
//            Materia mat = new Materia(idMateria, nombreMateria, anio, true);
//            
//            Inscripcion ins = new Inscripcion(a,mat,0);
//            
//            inscrData.guardarInscripcion(ins);
//            borrarFilaTabla();
//        
    }//GEN-LAST:event_jBIncribirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Alumno> cboxAlumno;
    private javax.swing.JButton jBAnularInscripcion;
    private javax.swing.JButton jBIncribir;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRBMateriasInscriptas;
    private javax.swing.JRadioButton jRBMateriasNoInscriptas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMaterias;
    // End of variables declaration//GEN-END:variables
}
