
package universidadgrupo49.Vistas;



import java.time.LocalDate;
import java.time.ZoneId;

import java.util.Date;
import javax.swing.JOptionPane;

import universidadgrupo49.AccesoADatos.AlumnoData;
import universidadgrupo49.Entidades.Alumno;

/**
 *
 * @author Juan Manuel
 */
public class AlumnoVista extends javax.swing.JInternalFrame {

    private AlumnoData alu = new AlumnoData();  // creamos variable de tipo 'alu'
    private Alumno alumno = null;               // inicializamos el alumno-*- 
    
    
    
   
    public AlumnoVista() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jLAlumno = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTFDocumento = new javax.swing.JTextField();
        jTFApellido = new javax.swing.JTextField();
        jTFNombre = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JButton();
        jDCFechaNacim = new com.toedter.calendar.JDateChooser();
        jBLimpiar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jRBEstado = new javax.swing.JRadioButton();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setResizable(true);
        setVisible(true);

        jLAlumno.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLAlumno.setText("Alumno");

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel1.setText("Documento");

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setText("Apellido");

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setText("Estado");

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setText("Fecha de Nacimiento");

        jBBuscar.setBackground(new java.awt.Color(41, 84, 171));
        jBBuscar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jBBuscar.setForeground(new java.awt.Color(0, 0, 0));
        jBBuscar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\GitHub\\universidadGrupo49\\src\\universidadgrupo49\\recursos\\lupa.png")); // NOI18N
        jBBuscar.setText("Buscar");
        jBBuscar.setToolTipText("Para buscar debe indicar el DNI y el Estado del Alumno.");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jBLimpiar.setBackground(new java.awt.Color(157, 161, 158));
        jBLimpiar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jBLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        jBLimpiar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\GitHub\\universidadGrupo49\\src\\universidadgrupo49\\recursos\\escoba.png")); // NOI18N
        jBLimpiar.setText("Limpiar pantalla");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        jBEliminar.setBackground(new java.awt.Color(224, 9, 78));
        jBEliminar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jBEliminar.setForeground(new java.awt.Color(0, 0, 0));
        jBEliminar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\GitHub\\universidadGrupo49\\src\\universidadgrupo49\\recursos\\basura.png")); // NOI18N
        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBGuardar.setBackground(new java.awt.Color(35, 153, 67));
        jBGuardar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jBGuardar.setForeground(new java.awt.Color(0, 0, 0));
        jBGuardar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\GitHub\\universidadGrupo49\\src\\universidadgrupo49\\recursos\\guardar-datos.png")); // NOI18N
        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBSalir.setBackground(new java.awt.Color(0, 204, 204));
        jBSalir.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jBSalir.setForeground(new java.awt.Color(0, 0, 0));
        jBSalir.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\GitHub\\universidadGrupo49\\src\\universidadgrupo49\\recursos\\salida.png")); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jRBEstado.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jRBEstado.setSelected(true);
        jRBEstado.setText("Activo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jBLimpiar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(jBGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jRBEstado)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jDCFechaNacim, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTFNombre, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTFApellido, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jTFDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jBBuscar))))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLAlumno)
                .addGap(209, 209, 209))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLAlumno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTFDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTFApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jRBEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDCFechaNacim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBLimpiar)
                    .addComponent(jBEliminar)
                    .addComponent(jBGuardar)
                    .addComponent(jBSalir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

                 // BOTON BUSCAR            
    
    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        
        try {
            AlumnoData ad = new AlumnoData();
        int dni = Integer.parseInt(jTFDocumento.getText());
        boolean estado = jRBEstado.isSelected();
       Alumno alumno = ad.buscarAlumnoDNI(dni, estado);
        
            if (alumno!=null) {
                
            
        
        jTFApellido.setText(alumno.getApellido());
        jTFNombre.setText(alumno.getNombre());
        Date date = Date.from(alumno.getFechaNacimiento().atStartOfDay(ZoneId.systemDefault()).toInstant());
        jDCFechaNacim.setDate(date);
        }
            
        } catch (NumberFormatException nbe) {
            JOptionPane.showMessageDialog(this, "El campo DNI solo acepta números.");
        }
            
    }//GEN-LAST:event_jBBuscarActionPerformed
  
           // BOTON LIMPIAR PANTALLA 
    
    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        
        limpiarPantalla();
        alumno = null; // inicializamos-*-
    }//GEN-LAST:event_jBLimpiarActionPerformed

    
                 // BOTON GUARDAR
    
    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
                
     try{
     
         int dni = Integer.parseInt(jTFDocumento.getText());
        
         String nombre = jTFNombre.getText();
         
         String apellido = jTFApellido.getText();
         
        
         if (nombre.isEmpty() || apellido.isEmpty()) {
             JOptionPane.showInternalMessageDialog(this, "No puede haber campos vacíos!!");
             return; //Sale del metodo
         }      //  Arroja Error id duplicado -*- 
         
         
         Date date = jDCFechaNacim.getDate();  
                   
         
         LocalDate fechaNac = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
         
    
         Boolean estado = jRBEstado.isSelected(); 
         
         
              
           if (alumno==null) {
             
             alumno = new Alumno(dni,apellido,nombre,fechaNac, estado);
             alu.guardarAlumno(alumno);
              
             
         } else {
             alumno.setDni(dni);
             alumno.setApellido(apellido);
             alumno.setNombre(nombre);
             alumno.setFechaNacimiento(fechaNac);
             alu.modificarAlumno(alumno);
             

         }
        limpiarPantalla();         
        } catch (NumberFormatException nbe) {
            
            JOptionPane.showMessageDialog(this, "Debe ingresar un DNI válido!.");
        }
           
    }//GEN-LAST:event_jBGuardarActionPerformed

    
                   // BOTON ELIMINAR
    
    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
    
//          if (alumno!=null) {
//           
//          alu.eliminarAlumno(alumno.getIdAlumno());
//           
//          alumno = null; // inicializas
          borrar(); 
          limpiarPantalla();
//       } else {
//           
//           JOptionPane.showMessageDialog(this, "No hay un alumno seleccionado!.");
//        }
    }//GEN-LAST:event_jBEliminarActionPerformed
    
    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        
        dispose();
    
    }//GEN-LAST:event_jBSalirActionPerformed

    //metodo limpiar-*-
    
    private void limpiarPantalla(){
        jTFDocumento.setText("");
        jTFApellido.setText("");
        jTFNombre.setText("");
        jRBEstado.setSelected(true); 
        jDCFechaNacim.setDate(null);
    }
    
    //metodo borrar-*-
    
   private void borrar() {
    jTFDocumento.setText("");
    jTFNombre.setText("");
    jTFApellido.setText("");
    jDCFechaNacim.setDate(null);
    jRBEstado.setSelected(false);
  //  alu.eliminarAlumnoPorDni(WIDTH);



   }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBSalir;
    private com.toedter.calendar.JDateChooser jDCFechaNacim;
    private javax.swing.JLabel jLAlumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRBEstado;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JTextField jTFApellido;
    private javax.swing.JTextField jTFDocumento;
    private javax.swing.JTextField jTFNombre;
    // End of variables declaration//GEN-END:variables
}
