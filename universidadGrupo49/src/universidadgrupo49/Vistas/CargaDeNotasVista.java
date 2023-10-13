/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo49.Vistas;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidadgrupo49.AccesoADatos.AlumnoData;
import universidadgrupo49.AccesoADatos.InscripcionData;
import universidadgrupo49.Entidades.Alumno;
import universidadgrupo49.Entidades.Inscripcion;

/**
 *
 * @author Juan Manuel
 */
public class CargaDeNotasVista extends javax.swing.JInternalFrame {

    private AlumnoData ad = new AlumnoData();
    private Alumno alumno = null;

    private InscripcionData ins = new InscripcionData();
    private List<Inscripcion> inscripciones = new ArrayList<>();

    private DefaultTableModel modelo;

    public CargaDeNotasVista() {
        initComponents();

        modelo = new DefaultTableModel();

        armarCabeceraTabla();
    }

    private void armarCabeceraTabla() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("Código");                             //
        filaCabecera.add("Nombre");                         //titulos tabla-*-
        filaCabecera.add("Nota");                            //

        for (Object rec : filaCabecera) {
            modelo.addColumn(rec);
        }

        jTListaInscripciones.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTListaInscripciones = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        jTFDni = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Powered by Grupo {49}", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 10), new java.awt.Color(0, 51, 51))); // NOI18N
        setPreferredSize(new java.awt.Dimension(735, 450));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setText("Carga de Notas");

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setText("Buscar Alumno");

        jTListaInscripciones.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTListaInscripciones);

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

        jTFDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFDniKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setText("DNI:");

        btnBuscar.setBackground(new java.awt.Color(41, 84, 171));
        btnBuscar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidadgrupo49/recursos/lupa.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setToolTipText("<html><body style='background-color: #b543e6; color: #080603; font-family: Arial; font-size: 10px; font-weight: bold;'>Ingrese el DNI del Alumno</body></html>");
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

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setText("Inscripciones");

        btnModificar.setBackground(new java.awt.Color(35, 153, 67));
        btnModificar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(0, 0, 0));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidadgrupo49/recursos/editar.png"))); // NOI18N
        btnModificar.setText("Modificar nota");
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnModificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnModificarMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnModificarMouseReleased(evt);
            }
        });
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
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

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidadgrupo49/recursos/cargar_notas.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(325, 325, 325))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBuscar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnModificar)
                                    .addGap(51, 51, 51)
                                    .addComponent(btnLimpiar)
                                    .addGap(56, 56, 56)
                                    .addComponent(btnSalir))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)))
                        .addContainerGap(141, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(275, 275, 275))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(46, 46, 46)
                        .addComponent(jTFDni, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(305, 305, 305))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar)
                    .addComponent(btnLimpiar)
                    .addComponent(btnSalir))
                .addGap(191, 191, 191))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void borrarFilaTabla() {

        int indice = modelo.getRowCount() - 1;

        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);

        }
    }
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        try {
            borrarFilaTabla();
            int dni = Integer.parseInt(jTFDni.getText());
            alumno = ad.buscarAlumnoDNI(dni, true);
            if (alumno != null) {

                inscripciones = ins.obtenerInscripcionesPorAlumno(alumno.getIdAlumno());
                for (Inscripcion inscrip : inscripciones) {
                    modelo.addRow(new Object[]{inscrip.getMateria().getIdMateria(), inscrip.getMateria().getNombre(), inscrip.getNota()});
                }
//                JOptionPane.showMessageDialog(this, "Alumno encontrado");
            } else {
                JOptionPane.showMessageDialog(this, "Alumno no encontrado");
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Solo se aceptan números en el campo DNI");
        }


    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        int filaSect = jTListaInscripciones.getSelectedRow();
        double nuevaNota = 0;
        try {
            int idMateria = (Integer) modelo.getValueAt(filaSect, 0);
            while (nuevaNota <= 0 || nuevaNota > 10) {
                nuevaNota = Double.parseDouble(JOptionPane.showInputDialog(this, "Ingrese la nueva nota"));
                if (nuevaNota <= 0 || nuevaNota > 10) {
                    JOptionPane.showMessageDialog(this, "Ingrese una nota válida");
                    
                } else {
                    ins.actualizarNota(alumno.getIdAlumno(), idMateria, nuevaNota);
                    btnBuscar.doClick();
                    JOptionPane.showMessageDialog(this, "La nueva nota es: " + nuevaNota);

                }

            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "Debe elegir una materia");
        }

    }//GEN-LAST:event_btnModificarActionPerformed

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

    private void jTFDniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFDniKeyPressed
                                        
        
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnBuscar.doClick();
        }    }//GEN-LAST:event_jTFDniKeyPressed

             // LIMPIAR PANTALLA DNI- JTABLE -*-
    
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        
        limpiarPantalla();
        
    }//GEN-LAST:event_btnLimpiarActionPerformed

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
    
    private void btnModificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseEntered
        
         Color myColor = new Color(12, 71, 6); // creo mí color personalizado-*-
              
         btnModificar.setBackground(myColor);
        
    }//GEN-LAST:event_btnModificarMouseEntered
                  // EVENTO BTN HOVER-*-2°Exited-*-
    
    private void btnModificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseExited
     
        btnModificar.setBackground(new Color(35,153,67));
         
    }//GEN-LAST:event_btnModificarMouseExited

                 // EVENTO BTN HOVER-*-3°Released-*-   
    
    private void btnModificarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseReleased
       
        try {
            TimeUnit.MILLISECONDS.sleep(300);
            
            // En caso de haber funciones van aquí dentro-*-
            
        } catch (InterruptedException ex) {
            Logger.getLogger(ConsultaAlumnoPorMateriaVista.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnModificarMouseReleased

    
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
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFDni;
    private javax.swing.JTable jTListaInscripciones;
    // End of variables declaration//GEN-END:variables


public void limpiarPantalla() {
        jTFDni.setText("");
      //  jTListaInscripciones.setText(""); 
        DefaultTableModel model = (DefaultTableModel) jTListaInscripciones.getModel();
        model.setRowCount(0);
        
    }

}
