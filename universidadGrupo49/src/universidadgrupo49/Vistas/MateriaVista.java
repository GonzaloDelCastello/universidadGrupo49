
package universidadgrupo49.Vistas;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadgrupo49.AccesoADatos.InscripcionData;
import universidadgrupo49.AccesoADatos.MateriaData;
import universidadgrupo49.Entidades.Alumno;
import universidadgrupo49.Entidades.Materia;

/**
 *
 * @author Usuario Toby959
 */
public class MateriaVista extends javax.swing.JInternalFrame {

    private MateriaData mateData = new MateriaData();  // creamos un objeto de ateriaData
    private Materia materiaActual = null; // creamos un objeto de materia inicializada en null

    public MateriaVista() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTCodigo = new javax.swing.JTextField();
        jTNombre = new javax.swing.JTextField();
        jTAnio = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jRBEstado = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "POWERED BY GRUPO {49}", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 10), new java.awt.Color(0, 51, 51))); // NOI18N
        setPreferredSize(new java.awt.Dimension(735, 450));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setText("Materias");

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setText("Codigo");

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setText("Año");

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setText("Estado");

        jTCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTCodigoKeyPressed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(41, 84, 171));
        btnBuscar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidadgrupo49/recursos/lupa.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setToolTipText("<html><body style='background-color: #b543e6; color: #080603; font-family: Arial; font-size: 10px; font-weight: bold;'>Debe ingresar numeros enteros, <br>sin caracteres especiales</body></html>");
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnBuscarMouseReleased(evt);
            }
        });
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(157, 161, 158));
        btnLimpiar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidadgrupo49/recursos/escoba.png"))); // NOI18N
        btnLimpiar.setText("Limpiar Pantalla");
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseReleased(evt);
            }
        });
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(224, 9, 78));
        btnEliminar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidadgrupo49/recursos/basura.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEliminarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnEliminarMouseReleased(evt);
            }
        });
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(35, 153, 67));
        btnGuardar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidadgrupo49/recursos/guardar-datos.png"))); // NOI18N
        btnGuardar.setText("Guardar / Modificar");
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnGuardarMouseReleased(evt);
            }
        });
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
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

        jRBEstado.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jRBEstado.setSelected(true);
        jRBEstado.setText("Activo");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidadgrupo49/recursos/materias.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btnLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 203, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addGap(43, 43, 43)
                .addComponent(btnSalir)
                .addGap(35, 35, 35))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBuscar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jRBEstado)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(btnEliminar)))
                        .addGap(225, 225, 225))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(328, 328, 328))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(313, 313, 313))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jRBEstado))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnEliminar)
                    .addComponent(btnGuardar)
                    .addComponent(btnSalir))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 
                 // BOTON SALIR-*-
         String [] botones = {"SI", "NO", "CANCELAR"};
        
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        
          int x = JOptionPane.showOptionDialog(this, "¿Te gusto esta página", "Elije una respuesta", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, botones, botones[0]);
                                             //mensaje               //titulo                                                                                      //String                 

        if (x == 0) {
            JOptionPane.showMessageDialog(this, "Gracias por tu visita!!!");
            dispose();
        } else if (x == 1) {
            JOptionPane.showMessageDialog(this, " :}D ");
        }

    }//GEN-LAST:event_btnSalirActionPerformed

                 // BOTON BUSCAR
    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            int id = Integer.parseInt(jTCodigo.getText());
            boolean estado = jRBEstado.isSelected();
            materiaActual = mateData.buscarMateria(id, estado);

            if (materiaActual != null) {

                jTNombre.setText(materiaActual.getNombre());
                int anio = materiaActual.getAnio();
                String anioStr = Integer.toString(anio);
                jTAnio.setText(anioStr);
            }
        } catch (NumberFormatException nbe) {
            JOptionPane.showMessageDialog(this, "El campo Codigo solo acepta números.");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "No existe la materia.");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

                 // BOTON LIMPIAR
    
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarPantalla();
        materiaActual = null;
    }//GEN-LAST:event_btnLimpiarActionPerformed

    
                 // BOTON GUARDAR
    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            String nombre = jTNombre.getText();
            int anio = Integer.parseInt(jTAnio.getText());
            boolean estado = jRBEstado.isSelected();
            if (jTNombre.getText().isEmpty() || jTAnio.getText().isEmpty()) { // VALIDA QUE NO HAYA CAMPOS VACIOS EN NOMBRE Y AÑO
                JOptionPane.showMessageDialog(this, "Error de carga, datos o campos vacios");
                return;
            }

            if (materiaActual == null) { // VERIFICA SI LA MATERIA YA EXISTE EN LA BD
                materiaActual = new Materia(nombre, anio, estado);
                mateData.guardarMateria(materiaActual);
                JOptionPane.showMessageDialog(this, "Materia añadida correctamente.");
            } else { // SI LA MATERIA YA EXISTE, LA SOBREESCRIBE O MODIFICA
                materiaActual.setNombre(nombre);
                materiaActual.setAnio(anio);
                materiaActual.setEstado(estado);
                mateData.modificarMateria(materiaActual);
            }
            limpiarPantalla();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error de carga, verifique los datos.");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

                 // BOTON ELIMINAR 
    
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            InscripcionData insData = new InscripcionData();
        List<Alumno> aluXMat = insData.obtenerAlumnosXMateria(materiaActual.getIdMateria());

        
            if (aluXMat.isEmpty()) { //valida que la materia no tenga alumnos inscriptos
                mateData.eliminarMateria(materiaActual.getIdMateria());
                materiaActual = null;
                limpiarPantalla();
            } else {
                JOptionPane.showMessageDialog(this, "La materia contiene alumnos inscriptos. No se puede eliminar.");
            }
        } catch (NullPointerException npe) {
            JOptionPane.showMessageDialog(this, "No existe la materia");
        }
        

        
    }//GEN-LAST:event_btnEliminarActionPerformed

                 // METODO BUSCAR CON UN CLIK  -*-DNI-*- 
    private void jTCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCodigoKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnBuscar.doClick();
        }
    }//GEN-LAST:event_jTCodigoKeyPressed

             // EVENTO BTN HOVER-*-1°Entered-*-
    
    private void btnBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseEntered
        
        
         Color myColor = new Color(15, 28, 128); // creo mí color personalizado-*-
              
         btnBuscar.setBackground(myColor);
    }//GEN-LAST:event_btnBuscarMouseEntered

    
             // EVENTO BTN HOVER-*-2°Exited-*-
    
    private void btnBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseExited
        
         btnBuscar.setBackground(new Color(41,84,171));
        
    }//GEN-LAST:event_btnBuscarMouseExited

           // EVENTO BTN HOVER-*-3°Released-*- 
    
    private void btnBuscarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseReleased
        
         try {
            TimeUnit.MILLISECONDS.sleep(300);
            
            // En caso de haber funciones van aquí dentro-*-
            
        } catch (InterruptedException ex) {
            Logger.getLogger(ConsultaAlumnoPorMateriaVista.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnBuscarMouseReleased

             // EVENTO BTN HOVER-*-1°Entered-*-
    
    private void btnLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseEntered
       
        Color myColor = new Color(213, 230, 224); // creo mí color personalizado-*-
              
         btnLimpiar.setBackground(myColor);
        
        
    }//GEN-LAST:event_btnLimpiarMouseEntered

             // EVENTO BTN HOVER-*-2°Exited-*-
    
    private void btnLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseExited
       
         btnLimpiar.setBackground(new Color(157,161,158));
        
    }//GEN-LAST:event_btnLimpiarMouseExited

             // EVENTO BTN HOVER-*-3°Released-*- 
    
    private void btnLimpiarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseReleased
       
         try {
            TimeUnit.MILLISECONDS.sleep(300);
            
            // En caso de haber funciones van aquí dentro-*-
            
        } catch (InterruptedException ex) {
            Logger.getLogger(ConsultaAlumnoPorMateriaVista.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnLimpiarMouseReleased

           // PRESIONAR BTN ELIMINAR
    
    private void btnEliminarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMousePressed
        
         Color myColor = new Color(235, 52, 143); // creo mí color personalizado-*-
              
             btnEliminar.setBackground(myColor);
        
        
    }//GEN-LAST:event_btnEliminarMousePressed

            // SOLTAR BTN ELIMINAR  
    
    private void btnEliminarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseReleased
        
        
        Color myColor = new Color(224,9,78); // creo mí color personalizado-*-
              
             btnEliminar.setBackground(myColor);
        
        
    }//GEN-LAST:event_btnEliminarMouseReleased

                  // EVENTO BTN HOVER-*-1°Entered-*-
    
    private void btnGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseEntered
        
          Color myColor = new Color(12, 71, 6); // creo mí color personalizado-*-
              
         btnGuardar.setBackground(myColor);
        
        
    }//GEN-LAST:event_btnGuardarMouseEntered

                 // EVENTO BTN HOVER-*-2°Exited-*-
    
    private void btnGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseExited
       
         btnGuardar.setBackground(new Color(35,153,67));
        
    }//GEN-LAST:event_btnGuardarMouseExited

                 // EVENTO BTN HOVER-*-3°Released-*-
    
    private void btnGuardarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseReleased
       
        try {
            TimeUnit.MILLISECONDS.sleep(300);
            
            // En caso de haber funciones van aquí dentro-*-
            
        } catch (InterruptedException ex) {
            Logger.getLogger(ConsultaAlumnoPorMateriaVista.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnGuardarMouseReleased

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

    
       

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRBEstado;
    private javax.swing.JTextField jTAnio;
    private javax.swing.JTextField jTCodigo;
    private javax.swing.JTextField jTNombre;
    // End of variables declaration//GEN-END:variables

    
           // BOTON LIMPIAR
    
    public void limpiarPantalla() {
        jTCodigo.setText("");
        jTNombre.setText("");
        jTAnio.setText("");
        jRBEstado.setSelected(true);
    }

}
