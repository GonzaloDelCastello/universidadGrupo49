/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo49.Vistas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidadgrupo49.AccesoADatos.AlumnoData;
import universidadgrupo49.AccesoADatos.InscripcionData;
import universidadgrupo49.Entidades.Alumno;
import universidadgrupo49.Entidades.Inscripcion;
import universidadgrupo49.Entidades.Materia;

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
        jBSalir = new javax.swing.JButton();
        jTFDni = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jBBuscar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jBModificarNota = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);

        jLabel1.setText("Carga de Notas");

        jLabel2.setText("Buscar alumno:");

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

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jTFDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFDniActionPerformed(evt);
            }
        });

        jLabel3.setText("Dni:");

        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jLabel4.setText("Inscripciones:");

        jBModificarNota.setText("Modificar nota");
        jBModificarNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarNotaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jBModificarNota)
                                        .addGap(204, 204, 204)
                                        .addComponent(jBSalir))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(53, 53, 53)
                                .addComponent(jTFDni, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBBuscar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jBBuscar))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSalir)
                    .addComponent(jBModificarNota)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFDniActionPerformed

    private void borrarFilaTabla() {

        int indice = modelo.getRowCount() - 1;

        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);

        }
    }
    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed

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


    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBModificarNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarNotaActionPerformed
        int filaSect = jTListaInscripciones.getSelectedRow();
        double nuevaNota = 0;
        try {
            int idMateria = (Integer) modelo.getValueAt(filaSect, 0);
//            JOptionPane.showMessageDialog(this, idMateria);
            while (nuevaNota <= 0 || nuevaNota > 10) {
                nuevaNota = Double.parseDouble(JOptionPane.showInputDialog(this, "Ingrese la nueva nota"));
                if (nuevaNota <= 0 || nuevaNota > 10) {
                    JOptionPane.showMessageDialog(this, "Ingrese una nota válida");
                    
                } else {
                    ins.actualizarNota(alumno.getIdAlumno(), idMateria, nuevaNota);
                    jBBuscar.doClick();
                    JOptionPane.showMessageDialog(this, "La nueva nota es: " + nuevaNota);

                }

            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "Debe elegir una materia");
        }

    }//GEN-LAST:event_jBModificarNotaActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBModificarNota;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFDni;
    private javax.swing.JTable jTListaInscripciones;
    // End of variables declaration//GEN-END:variables
}
