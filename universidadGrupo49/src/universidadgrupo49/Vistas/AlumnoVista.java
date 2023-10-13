package universidadgrupo49.Vistas;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadgrupo49.AccesoADatos.AlumnoData;
import universidadgrupo49.Entidades.Alumno;

public class AlumnoVista extends javax.swing.JInternalFrame {

    private AlumnoData ad = new AlumnoData();  // creamos variable de tipo 'AlumnoData'
    private Alumno alumno = null;               // inicializamos el alumno.

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
        btnBuscar = new javax.swing.JButton();
        jDCFechaNacim = new com.toedter.calendar.JDateChooser();
        btnLimpiar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jRBEstado = new javax.swing.JRadioButton();
        btnAlternancia = new javax.swing.JToggleButton();
        jLabel6 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "POWERED BY GRUPO {49}", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 10), new java.awt.Color(0, 51, 51))); // NOI18N
        setToolTipText("");
        setPreferredSize(new java.awt.Dimension(735, 450));
        setVisible(true);

        jLAlumno.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLAlumno.setForeground(new java.awt.Color(255, 255, 255));
        jLAlumno.setText("Alumnos");

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Documento");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Apellido");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Estado");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fecha de Nacimiento");

        jTFDocumento.setBackground(new java.awt.Color(235, 237, 202));
        jTFDocumento.setForeground(new java.awt.Color(235, 237, 202));
        jTFDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFDocumentoKeyPressed(evt);
            }
        });

        jTFApellido.setBackground(new java.awt.Color(235, 237, 202));
        jTFApellido.setForeground(new java.awt.Color(235, 237, 202));

        jTFNombre.setBackground(new java.awt.Color(235, 237, 202));
        jTFNombre.setForeground(new java.awt.Color(235, 237, 202));

        btnBuscar.setBackground(new java.awt.Color(41, 84, 171));
        btnBuscar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidadgrupo49/recursos/lupa.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setToolTipText("<html><body style='background-color: #b543e6; color: #080603; font-family: Arial; font-size: 10px; font-weight: bold;'>Debe ingresar el <b>DNI</b> sin puntos <br> y el Estado del Alumno.</body></html>");
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

        jDCFechaNacim.setBackground(new java.awt.Color(235, 237, 202));

        btnLimpiar.setBackground(new java.awt.Color(157, 161, 158));
        btnLimpiar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidadgrupo49/recursos/escoba.png"))); // NOI18N
        btnLimpiar.setText("Limpiar pantalla");
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

        jRBEstado.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jRBEstado.setForeground(new java.awt.Color(255, 255, 255));
        jRBEstado.setSelected(true);
        jRBEstado.setText("Activo");

        btnAlternancia.setForeground(new java.awt.Color(255, 255, 255));
        btnAlternancia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidadgrupo49/recursos/sol_y_luna.png"))); // NOI18N
        btnAlternancia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAlternanciaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAlternanciaMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAlternanciaMouseReleased(evt);
            }
        });
        btnAlternancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlternanciaActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidadgrupo49/recursos/usuarios.png"))); // NOI18N

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAlternancia, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTFNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFApellido, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jTFDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnBuscar))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(257, 257, 257)
                                .addComponent(jLAlumno)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnLimpiar)
                        .addGap(33, 33, 33)
                        .addComponent(btnEliminar)
                        .addGap(41, 41, 41)
                        .addComponent(btnGuardar)
                        .addGap(45, 45, 45)
                        .addComponent(btnSalir)
                        .addContainerGap(74, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jDCFechaNacim, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jRBEstado))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAlternancia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLAlumno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTFDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTFApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jRBEstado))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDCFechaNacim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5))
                        .addGap(24, 24, 24)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnEliminar)
                    .addComponent(btnLimpiar)
                    .addComponent(btnSalir))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

                          // BOTON BUSCAR  
    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        try {
            int dni = Integer.parseInt(jTFDocumento.getText());
            boolean estado = jRBEstado.isSelected();
            alumno = ad.buscarAlumnoDNI(dni, estado);

            jTFApellido.setText(alumno.getApellido());
            jTFNombre.setText(alumno.getNombre());
            Date date = Date.from(alumno.getFechaNacimiento().atStartOfDay(ZoneId.systemDefault()).toInstant());
            jDCFechaNacim.setDate(date);

        } catch (NumberFormatException nbe) {
            JOptionPane.showMessageDialog(this, "Debe ingresar números en el campo DNI.");
        } catch (NullPointerException npe) {
            JOptionPane.showMessageDialog(this, "El alumno que busca no existe.");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

                          // BOTON LIMPIAR PANTALLA 
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

        jTFDocumento.setText("");
        jTFApellido.setText("");
        jTFNombre.setText("");
        jRBEstado.setSelected(true);
        jDCFechaNacim.setDate(null);
        alumno = null; // inicializamos-*-
    }//GEN-LAST:event_btnLimpiarActionPerformed

                          // BOTON GUARDAR
 
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        String dniString = jTFDocumento.getText();
        if (dniString.length() != 8 || !dniString.matches("[0-9]+")) {
            JOptionPane.showMessageDialog(this, "El DNI debe tener 8 números.");
            return; //Sale del metodo
        }
        int dni = Integer.parseInt(dniString);
        
        

// Comprobar si el dni ya existe en la base de datos-*-
        if (ad.buscarAlumnoDNI(dni, false) != null) {
            JOptionPane.showMessageDialog(this, "El DNI ya existe en la base de datos.");
            return; //Sale del metodo
        }

        String nombre = jTFNombre.getText();
        String apellido = jTFApellido.getText();

        if (nombre.isEmpty() || apellido.isEmpty()) {
            JOptionPane.showInternalMessageDialog(this, "No puede haber campos vacíos!!");
            return; //Sale del metodo
        } else if (!nombre.matches("[a-zA-Z]{5,25}")) {
            JOptionPane.showInternalMessageDialog(this, "El nombre debe tener solo letras mayúsculas o minúsculas, sin caracteres especiales, hasta 25 caracteres.");
            return; //Sale del metodo
        } else if (!apellido.matches("[a-zA-Z]{3,15}")) {
            JOptionPane.showInternalMessageDialog(this, "El apellido debe tener solo letras mayúsculas o minúsculas, sin caracteres especiales, hasta 15 caracteres.");
            return; //Sale del metodo
        }

        Date date = jDCFechaNacim.getDate();
        if (date == null) {
            JOptionPane.showInternalMessageDialog(this, "La fecha de nacimiento es inválida.");
            return; //Sale del metodo
        }
        LocalDate fechaNac = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate fechaMinima = LocalDate.now().minusYears(16);

        if (fechaNac.isAfter(fechaMinima)) {
            JOptionPane.showInternalMessageDialog(this, "La fecha de nacimiento debe ser anterior a " + fechaMinima.toString());
            return; //Sale del metodo
        }

        Boolean estado = jRBEstado.isSelected();

        if (alumno == null) {
            alumno = new Alumno(dni, apellido, nombre, fechaNac, estado);
            ad.guardarAlumno(alumno);

        } else {
            alumno.setDni(dni);
            alumno.setApellido(apellido);
            alumno.setNombre(nombre);
            alumno.setFechaNacimiento(fechaNac);
            alumno.setEstado(jRBEstado.isSelected());
            ad.modificarAlumno(alumno);
        }
        btnLimpiar.doClick();

    }//GEN-LAST:event_btnGuardarActionPerformed

    
                          // BOTON ELIMINAR
    
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        try {
            ad.eliminarAlumno(alumno.getIdAlumno());
            btnLimpiar.doClick();
        } catch (NullPointerException npe) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un alumno.");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    // EVENTO TECLADO CAPTURA ENTER EN EL CAMPO DNI. ACCIONA EL BOTON BUSCAR.
    private void jTFDocumentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFDocumentoKeyPressed
       
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnBuscar.doClick();
        }
    }//GEN-LAST:event_jTFDocumentoKeyPressed

    
                         // EVENT0 PRESIONAR BTN-*-
    
    private void btnEliminarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMousePressed
      
         Color myColor = new Color(235, 52, 143); // creo mí color personalizado-*-
              
             btnEliminar.setBackground(myColor);
        
    }//GEN-LAST:event_btnEliminarMousePressed

    
                         // EVENT0 SOLTAR BTN-*-
    
    private void btnEliminarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseReleased
       
        Color myColor = new Color(224,9,78); // creo mí color personalizado-*-
              
             btnEliminar.setBackground(myColor);
        
        
    }//GEN-LAST:event_btnEliminarMouseReleased

                         // EVENTO BTN HOVER-*-1°Entered-*-
     
    private void btnGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseEntered
        
         Color myColor = new Color(12, 71, 6); // creo mí color personalizado-*-
              
         btnGuardar.setBackground(myColor);
        
        
    }//GEN-LAST:event_btnGuardarMouseEntered

                       // EVENTO BTN HOVER-*-3°Released-*-
    
    
    private void btnGuardarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseReleased
      
         try {
            TimeUnit.MILLISECONDS.sleep(300);
            
            // En caso de haber funciones van aquí dentro-*-
            
        } catch (InterruptedException ex) {
            Logger.getLogger(ConsultaAlumnoPorMateriaVista.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnGuardarMouseReleased

                      // EVENTO BTN HOVER-*-2°Exited-*-        
    
    private void btnGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseExited
 
        btnGuardar.setBackground(new Color(35,153,67));
        
    }//GEN-LAST:event_btnGuardarMouseExited

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

                 // BTN ALTERNANCIA-*-
    
     private Color defaultColor  = new Color (121, 148, 52); // mí color x defecto-*-
    
    private void btnAlternanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlternanciaActionPerformed
        
        Container c = getContentPane();
        
        if (btnAlternancia.isSelected()) {
        
            c.setBackground(Color.BLACK);
            
        } else {
           
            if(defaultColor != null) {
                            
            c.setBackground(defaultColor);
              
         
       }
    }//GEN-LAST:event_btnAlternanciaActionPerformed
    }
    
                       // EVENTO BTN HOVER-*-1°Entered-*-
    
    private void btnAlternanciaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlternanciaMouseEntered
        
         Color myColor = new Color(150, 101, 168); // creo mí color personalizado-*-
              
         btnAlternancia.setBackground(myColor);
        
    }//GEN-LAST:event_btnAlternanciaMouseEntered

                      // EVENTO BTN HOVER-*-2°Exited-*-
    
    private void btnAlternanciaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlternanciaMouseExited
        
        btnAlternancia.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btnAlternanciaMouseExited

                      // EVENTO BTN HOVER-*-3°Released-*-
     
    private void btnAlternanciaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlternanciaMouseReleased

         try {
            TimeUnit.MILLISECONDS.sleep(300);
            
            // En caso de haber funciones van aquí dentro-*-
            
        } catch (InterruptedException ex) {
            Logger.getLogger(ConsultaAlumnoPorMateriaVista.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnAlternanciaMouseReleased
                      // BOTON SALIR
    
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
    private javax.swing.JToggleButton btnAlternancia;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private com.toedter.calendar.JDateChooser jDCFechaNacim;
    private javax.swing.JLabel jLAlumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRBEstado;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JTextField jTFApellido;
    private javax.swing.JTextField jTFDocumento;
    private javax.swing.JTextField jTFNombre;
    // End of variables declaration//GEN-END:variables
}
