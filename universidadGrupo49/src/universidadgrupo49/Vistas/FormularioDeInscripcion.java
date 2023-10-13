
package universidadgrupo49.Vistas;

import java.awt.Color;
import java.awt.Container;
import universidadgrupo49.AccesoADatos.AlumnoData;
import universidadgrupo49.AccesoADatos.InscripcionData;
import universidadgrupo49.AccesoADatos.MateriaData;

import universidadgrupo49.Entidades.Alumno;
import universidadgrupo49.Entidades.Inscripcion;
import universidadgrupo49.Entidades.Materia;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JInternalFrame;
import javax.swing.table.DefaultTableModel;

import java.io.IOException; // Agregar import para exportar Datos (Excel)-*- 
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Usuario
 */
public class FormularioDeInscripcion extends javax.swing.JInternalFrame {
    
    Exportar obj; // Creamos nuestro Obj de Clase-*- 
    
    private List<Materia> listaMat;
    private List<Alumno> listaAlu;
    
    private InscripcionData inscrData;
    private MateriaData matData;
    private AlumnoData aluData;
    
    
    private DefaultTableModel modelo;
    
    
    public FormularioDeInscripcion() { // dentro constructor 
        initComponents();
        
        aluData = new AlumnoData();
        boolean estado = false;        // inicializo variable estado-*-
        listaAlu = aluData.listarAlumnos(estado);
        modelo = new DefaultTableModel();
        
        inscrData = new InscripcionData();
        matData = new MateriaData();
        
        cargaAlumnos();
        armarCabeceraTabla(); 

       JInternalFrame internalFrame = new JInternalFrame();     //
       Container contentPane = internalFrame.getContentPane();  //
       contentPane.setBackground(new Color(121, 148, 52));      //cambio color 
       this.add(internalFrame);                                 //  fondo
    }

                 // METODO CARGA ALUMNOS    
    
    private void cargaAlumnos() {
    AlumnoData alumnoData = new AlumnoData(); // instancia AlumnoData
    List<Alumno> listaAlumnos = alumnoData.listarAlumnos(true); // recupera todos los Alumnos
    cboxAlumno.removeAllItems(); // limpia comboBox
           
    for (Alumno alumno : listaAlumnos) {
        cboxAlumno.addItem(alumno); // agrega cada Alumno al comboBox-*-
    }
}
    
                 // METODO ARMAR CABECERA TABLA             
    
    private void armarCabeceraTabla(){
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("ID");                             //
        filaCabecera.add("Nombre");                         //titulos tabla-*-
        filaCabecera.add("Año");                            //
        
        for (Object rec : filaCabecera) {
            modelo.addColumn(rec);
        }
        
        jTableMaterias.setModel(modelo);
    }
    
                 // METODO BORRAR FILA TABLA
    
    private void borrarFilaTabla(){
        
        int indice = modelo.getRowCount() -1;
        
        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);
            
        }
    }
    
                // METODO MATERIAS NO INSCRIPTAS
    
    private void cargaDatosNoInscriptas(){
        //borrarFilaTabla();
        Alumno selec = (Alumno) cboxAlumno.getSelectedItem();
        listaMat = inscrData.obtenerMateriasNoCursadas(selec.getIdAlumno());
        for (Materia materia : listaMat) {
            modelo.addRow(new Object[] {materia.getIdMateria(), materia.getNombre(), materia.getAnio()});
        }
    }
    
    
                // METODO MATERIAS INSCRIPTAS
    
    private void cargaDatosInscriptas(){
        //borrarFilaTabla();
        Alumno selec = (Alumno) cboxAlumno.getSelectedItem();
        List <Materia> lista = inscrData.obtenerMateriasCursadas(selec.getIdAlumno());
              
        for (Materia materia : lista) {
            modelo.addRow(new Object[] {materia.getIdMateria(), materia.getNombre(), materia.getAnio()});
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cboxAlumno = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        radioNoInscriptas = new javax.swing.JRadioButton();
        radioInscriptas = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMaterias = new javax.swing.JTable();
        btnAnularIncrip = new javax.swing.JButton();
        btnInscribir = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnExportar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "POWERED BY GRUPO {49}", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 10), new java.awt.Color(0, 51, 51))); // NOI18N
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(735, 450));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel2.setText("Formulario de Inscripcion");

        jLabel3.setText("Seleccione un alumno:");

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setText("Listado de Materias");

        radioNoInscriptas.setText("Materias No Inscriptas");
        radioNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNoInscriptasActionPerformed(evt);
            }
        });

        radioInscriptas.setText("Materias Inscriptas");
        radioInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioInscriptasActionPerformed(evt);
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

        btnAnularIncrip.setBackground(new java.awt.Color(224, 9, 78));
        btnAnularIncrip.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnAnularIncrip.setForeground(new java.awt.Color(0, 0, 0));
        btnAnularIncrip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidadgrupo49/recursos/basura.png"))); // NOI18N
        btnAnularIncrip.setText("Anular Inscripción");
        btnAnularIncrip.setEnabled(false);
        btnAnularIncrip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAnularIncripMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAnularIncripMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAnularIncripMouseReleased(evt);
            }
        });
        btnAnularIncrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnularIncripActionPerformed(evt);
            }
        });

        btnInscribir.setBackground(new java.awt.Color(35, 153, 67));
        btnInscribir.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnInscribir.setForeground(new java.awt.Color(0, 0, 0));
        btnInscribir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidadgrupo49/recursos/agregar-usuario.png"))); // NOI18N
        btnInscribir.setText("Inscribir");
        btnInscribir.setEnabled(false);
        btnInscribir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInscribirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInscribirMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnInscribirMouseReleased(evt);
            }
        });
        btnInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInscribirActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(0, 204, 204));
        btnSalir.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(0, 0, 0));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidadgrupo49/recursos/salida.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnSalirMouseReleased(evt);
            }
        });
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnExportar.setBackground(new java.awt.Color(255, 255, 51));
        btnExportar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnExportar.setForeground(new java.awt.Color(0, 0, 0));
        btnExportar.setText("Exportar Datos");
        btnExportar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExportarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExportarMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnExportarMouseReleased(evt);
            }
        });
        btnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidadgrupo49/recursos/inscripcion.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btnInscribir)
                        .addGap(47, 47, 47)
                        .addComponent(btnAnularIncrip)
                        .addGap(44, 44, 44)
                        .addComponent(btnSalir)
                        .addGap(42, 42, 42)
                        .addComponent(btnExportar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(radioInscriptas)
                            .addComponent(jLabel3))))
                .addContainerGap(63, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(275, 275, 275))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(28, 28, 28)
                        .addComponent(radioNoInscriptas)
                        .addGap(141, 141, 141))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cboxAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(132, 132, 132))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cboxAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(radioInscriptas)
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(radioNoInscriptas)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInscribir)
                    .addComponent(btnAnularIncrip)
                    .addComponent(btnSalir)
                    .addComponent(btnExportar))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

                   // MATERIAS INSCRIPTAS
    
    private void radioInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioInscriptasActionPerformed
       
           borrarFilaTabla();
           radioNoInscriptas.setSelected(false);
           cargaDatosInscriptas();
           btnAnularIncrip.setEnabled(true);
           btnInscribir.setEnabled(false);
    }//GEN-LAST:event_radioInscriptasActionPerformed

                   // MATERIAS NO INSCRIPTAS
    
    private void radioNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNoInscriptasActionPerformed
      
           borrarFilaTabla();
           radioInscriptas.setSelected(false);
           cargaDatosNoInscriptas();
           btnAnularIncrip.setEnabled(false);
           btnInscribir.setEnabled(true);
                    
    }//GEN-LAST:event_radioNoInscriptasActionPerformed

                   // MATERIAS INSCRIPTAS 
    
    private void btnInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInscribirActionPerformed
    
        int filaSect = jTableMaterias.getSelectedRow();
        if (filaSect!= -1) {
                         // casteamos 
            Alumno a = (Alumno)cboxAlumno.getSelectedItem(); // devuelve Object
                           // casteamos  
            int idMateria = (Integer)modelo.getValueAt(filaSect, 0);
                                   // casteamos    
            String nombreMateria = (String)modelo.getValueAt(filaSect, 1);
                       // casteamos                
            int anio = (Integer)modelo.getValueAt(filaSect, 2);
            
            Materia mat = new Materia(idMateria, nombreMateria, anio, true);
            
            Inscripcion ins = new Inscripcion(a,mat,0);
            
            inscrData.guardarInscripcion(ins);
            borrarFilaTabla();
        
    }//GEN-LAST:event_btnInscribirActionPerformed
    }
    
                   // ANULAR INSCRIPCION
    
    private void btnAnularIncripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnularIncripActionPerformed
        
           int filaSect = jTableMaterias.getSelectedRow();
           if (filaSect!= -1) {
                         // casteamos 
           Alumno a = (Alumno)cboxAlumno.getSelectedItem(); // devuelve Object
                         // casteamos  
           int idMateria = (Integer)modelo.getValueAt(filaSect, 0);
       
           inscrData.borrarInscripcionMateriaAlumno(a.getIdAlumno(), idMateria);
           borrarFilaTabla();
          
    }//GEN-LAST:event_btnAnularIncripActionPerformed
    }
    
                      // BOTON SALIR-*-
         String [] botones = {"SI", "NO", "CANCELAR"};
    
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        
    //     dispose();
         
        
         // mensaje solitario-*-
         //--------------------------------------------------------------------
                                         // null muestra msg centro pantalla
         // JOptionPane.showMessageDialog(this, "Mostar Mensaje");
                                         // this muestra msg centro formulario
         // JOptionPane.showMessageDialog(this, "Mostar Mensaje \n salto de línea");
        
         // salto de línea msg-*- 

         //--------------------------------------------------------------------
         
//          int i =  JOptionPane.showConfirmDialog(this, "¿Estas seguro?"); 
//  M        
//  E        // Indice 0 equivale a Si-*-
//  N        // Indice 1 equivale a No-*-
//  S        // Indice equivale a Cancelar-*-
//  A       if (i == 0) {
//  J            JOptionPane.showMessageDialog(this, "Hasta la proxima");
//  E            System.exit(i); //Salir de la Pantalla-*-
//            
//  S      } else if (i == 1)  {
//  A            JOptionPane.showMessageDialog(this, "Que bueno volver a verte");
//  L           
//  I      } 

         //---------------------------------------------------------------------
          
//                     -*-SWITCH-*-  + inicio del Metodo String....
//
//         String [] botones = {"SI", "NO", "CANCELAR"};
//         int x = JOptionPane.showInternalOptionDialog(this, "¿Te vas?", "Powered by Grupo [49]", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, botones, botones[0]);
//                                                            // Msg        // Titulo
//        switch (x) {
//            case 0:
//                JOptionPane.showMessageDialog(this, "Gracias por visitarnos");
//                dispose();// System.exit(x); //Salir de la Aplicación-*-
//                 break;
//            case 1:
//                JOptionPane.showMessageDialog(this, ":D");
//               // setVisible(false);
//                break;
//            case 2:
//                JOptionPane.showMessageDialog(this, "Anímate");
//               // setVisible(false);
//                break;
//            default:
//              // setVisible(false);
//                break;
//        }                                           
                            


// -----------------------  -*-IF-*-  + inicio del Metodo String....

     int x = JOptionPane.showOptionDialog(this, "¿Te gusto esta página", "Elije una respuesta", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, botones, botones[0]);
                                             //mensaje               //titulo                                                                                      //String                 

        if (x == 0) {
            JOptionPane.showMessageDialog(this, "Gracias por tu visita!!!");
            dispose();
        } else if (x == 1) {
            JOptionPane.showMessageDialog(this, " :}D ");
        }
                                      
    }//GEN-LAST:event_btnSalirActionPerformed
//----------------------------------------------------------------------    

               // BOTON EXPORTAR 
    
    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed
    
        
        try {
            obj = new Exportar(); // mandar llamar la clase exportar
            obj.exportarExcel(jTableMaterias); // mandamos a llamar el metodo desde clase exportar
        } catch(IOException ex) {
            JOptionPane.showMessageDialog(this, "No se puede exportar los Datos"+ex.getMessage());
        }
    
    }//GEN-LAST:event_btnExportarActionPerformed

               // EVENTO BTN HOVER-*-1°Entered-*-
    
    private void btnInscribirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInscribirMouseEntered
        
         Color myColor = new Color(12, 71, 6); // creo mí color personalizado-*-
              
         btnInscribir.setBackground(myColor);
    }//GEN-LAST:event_btnInscribirMouseEntered

    
              // EVENTO BTN HOVER-*-2°Exited-*-
    
    private void btnInscribirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInscribirMouseExited
        
          btnInscribir.setBackground(new Color(35,153,67));
        
    }//GEN-LAST:event_btnInscribirMouseExited

             // EVENTO BTN HOVER-*-3°Released-*-
           
    private void btnInscribirMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInscribirMouseReleased
        
        
         try {
            TimeUnit.MILLISECONDS.sleep(300);
            
            // En caso de haber funciones van aquí dentro-*-
            
        } catch (InterruptedException ex) {
            Logger.getLogger(ConsultaAlumnoPorMateriaVista.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnInscribirMouseReleased

              // EVENTO para borrar
    
    private void btnAnularIncripMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnularIncripMouseEntered
               
    }//GEN-LAST:event_btnAnularIncripMouseEntered

    
             // EVENT0 PRESIONAR BTN-*-
    
    private void btnAnularIncripMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnularIncripMousePressed
       
        Color myColor = new Color(235, 52, 143); // creo mí color personalizado-*-
              
             btnAnularIncrip.setBackground(myColor);
        
    }//GEN-LAST:event_btnAnularIncripMousePressed

             // EVENT0 SOLTAR BTN-*-
    
    private void btnAnularIncripMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnularIncripMouseReleased
       
         Color myColor = new Color(224,9,78); // creo mí color personalizado-*-
              
             btnAnularIncrip.setBackground(myColor);
        
    }//GEN-LAST:event_btnAnularIncripMouseReleased

     
           // EVENTO BTN HOVER-*-1°Entered-*-
    
    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
       
          Color myColor = new Color(88, 144, 173); // creo mí color personalizado-*-
              
             btnSalir.setBackground(myColor);
        
    }//GEN-LAST:event_btnSalirMouseEntered

    
            // EVENTO BTN HOVER-*-2°Exited-*- 
    
    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
       
        btnSalir.setBackground(new Color(0,204,204));
        
    }//GEN-LAST:event_btnSalirMouseExited

            // EVENTO BTN HOVER-*-3°Released-*-
    
    private void btnSalirMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseReleased
       
        
          try {
            TimeUnit.MILLISECONDS.sleep(300);
            
            // En caso de haber funciones van aquí dentro-*-
                       
        } catch (InterruptedException ex) {
            Logger.getLogger(ConsultaAlumnoPorMateriaVista.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnSalirMouseReleased
              // EVENTO BTN HOVER-*-1°Entered-*-      
    
    private void btnExportarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExportarMouseEntered
        
         Color myColor = new Color(140, 143, 83); // creo mí color personalizado-*-
              
             btnExportar.setBackground(myColor);
                
    }//GEN-LAST:event_btnExportarMouseEntered
 
              // EVENTO BTN HOVER-*-2°Exited-*- 
    
    private void btnExportarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExportarMouseExited
       
        btnExportar.setBackground(new Color(255,255,51));
    }//GEN-LAST:event_btnExportarMouseExited

              
           // EVENTO BTN HOVER-*-3°Released-*- 
    
    private void btnExportarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExportarMouseReleased
       
        try {
            TimeUnit.MILLISECONDS.sleep(300);
            
            // En caso de haber funciones van aquí dentro-*-
            
        } catch (InterruptedException ex) {
            Logger.getLogger(ConsultaAlumnoPorMateriaVista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnExportarMouseReleased
        
    
    
    
    

    
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnularIncrip;
    private javax.swing.JButton btnExportar;
    private javax.swing.JButton btnInscribir;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<Alumno> cboxAlumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMaterias;
    private javax.swing.JRadioButton radioInscriptas;
    private javax.swing.JRadioButton radioNoInscriptas;
    // End of variables declaration//GEN-END:variables
}
