
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
import javax.swing.table.DefaultTableColumnModel;


public class ConsultaAlumnoPorMateriaVista extends javax.swing.JInternalFrame {
    
    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };    
    private List<Materia> listaMat;
    private List<Alumno> listaAlu;
   
    private InscripcionData inscrData;
    private MateriaData matData;
    private AlumnoData aluData;
    
    public ConsultaAlumnoPorMateriaVista() {
        initComponents();
    
        aluData = new AlumnoData();
        matData = new MateriaData();
        boolean estado = false;        // inicializo variable estado-*-
        listaAlu = aluData.listarAlumnos(true);
        listaMat = matData.listarMaterias(true);
        
        modelo = new DefaultTableModel();
        
        inscrData = new InscripcionData();
        matData = new MateriaData();
        
        cargarMaterias();
        armarCabeceraTabla();
        cargarAlumnos();
    }

                  // METODO SELECCIONAR MATERIA         
     
    private void cargarMaterias(){
   
    cboxMateria.removeAllItems(); // limpia comboBox
           
    for (Materia materia : listaMat) {
       cboxMateria.addItem(materia);// agrega cada Materia al comboBox-*-
    }
}
     // ARMAR CABECERA
    
     private void armarCabeceraTabla(){
         ArrayList<Object> filaCabecera = new ArrayList<>();
         filaCabecera.add("ID");                         //titulos tabla-*-
         filaCabecera.add("Apellido");                       //
         filaCabecera.add("Nombre");

         for (Object rec : filaCabecera) {
             modelo.addColumn(rec);
         }

         jTablaAlumnos.setModel(modelo); //aca
    }  
    private void borrarFilasTablas(){
        int indice = modelo.getRowCount()-1;
        
        for(int i = indice;i>=0;i--){
            modelo.removeRow(i);
        }
    } 
     
    private void cargarAlumnos(){
        borrarFilasTablas();
        Materia selec = (Materia)cboxMateria.getSelectedItem();
        listaAlu = inscrData.obtenerAlumnosXMateria(selec.getIdMateria());
        for(Alumno m:listaAlu){
        modelo.addRow(new Object []{m.getIdAlumno(),m.getApellido(),m.getNombre()});
        
        }
        
    } 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cboxMateria = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablaAlumnos = new javax.swing.JTable();

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

        cboxMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxMateriaActionPerformed(evt);
            }
        });

        jTablaAlumnos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTablaAlumnos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(cboxMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 64, Short.MAX_VALUE))
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
                .addGap(80, 80, 80)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboxMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxMateriaActionPerformed
        cargarAlumnos(); //carga los alumnos a la tabla cuando segun lo que contenga el cbox
    }//GEN-LAST:event_cboxMateriaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Materia> cboxMateria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablaAlumnos;
    // End of variables declaration//GEN-END:variables
}
