/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo49.Vistas;

import javax.swing.JOptionPane;
import universidadgrupo49.AccesoADatos.MateriaData;
import universidadgrupo49.Entidades.Materia;

/**
 *
 * @author Usuario
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
        jBBuscar = new javax.swing.JButton();
        jBNuevo = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jBModificar1 = new javax.swing.JButton();
        jRBEstado = new javax.swing.JRadioButton();

        jCheckBox1.setText("jCheckBox1");

        setClosable(true);
        setMaximizable(true);

        jLabel1.setText("Materia");

        jLabel2.setText("Codigo");

        jLabel3.setText("Nombre");

        jLabel4.setText("Año");

        jLabel5.setText("Estado");

        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jBNuevo.setText("Limpiar Pantalla");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBModificar1.setText("Salir");
        jBModificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificar1ActionPerformed(evt);
            }
        });

        jRBEstado.setSelected(true);
        jRBEstado.setText("Activo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBModificar1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jTAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRBEstado))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTNombre))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                                .addComponent(jBBuscar)))
                        .addGap(67, 67, 67))))
            .addGroup(layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jLabel1))
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
                    .addComponent(jBBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jRBEstado))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNuevo)
                    .addComponent(jBEliminar)
                    .addComponent(jBGuardar)
                    .addComponent(jBModificar1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBModificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificar1ActionPerformed
       dispose();

    }//GEN-LAST:event_jBModificar1ActionPerformed
    
    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        try {
            int id = Integer.parseInt(jTCodigo.getText());
             boolean estado = jRBEstado.isSelected();
            materiaActual = mateData.buscarMateria(id, estado);
            
            if(materiaActual !=null){
            
            jTNombre.setText(materiaActual.getNombre());
            int anio = materiaActual.getAnio();
            String anioStr = Integer.toString(anio);
            jTAnio.setText(anioStr);
            }
        } catch (NumberFormatException nbe) {
            JOptionPane.showMessageDialog(this, "El campo Codigo solo acepta números.");
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "No existe la materia.");
        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        limpiarPantalla();
        materiaActual = null; 
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
       try{
            String nombre = jTNombre.getText();
            int anio = Integer.parseInt(jTAnio.getText());
            boolean estado = jRBEstado.isSelected();
            if (jTNombre.getText().isEmpty() || jTAnio.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Error de carga, datos o campos vacios");
                return;
            }
            
            if (materiaActual == null) {
                materiaActual = new Materia(nombre, anio, estado);
                mateData.guardarMateria(materiaActual);
            } else {
                materiaActual.setNombre(nombre);
                materiaActual.setAnio(anio);
                materiaActual.setEstado(estado);
                mateData.modificarMateria(materiaActual);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error de carga,ingrese solo numeros");
        }
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        if(materiaActual != null){
        mateData.eliminarMateria(materiaActual.getIdMateria());
        materiaActual = null;
        limpiarPantalla();
        }else{
            JOptionPane.showMessageDialog(this, "No existe la materia");
        }
    }//GEN-LAST:event_jBEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBModificar1;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRBEstado;
    private javax.swing.JTextField jTAnio;
    private javax.swing.JTextField jTCodigo;
    private javax.swing.JTextField jTNombre;
    // End of variables declaration//GEN-END:variables

    public void limpiarPantalla(){
        jTCodigo.setText("");
        jTNombre.setText("");
        jTAnio.setText("");
        jRBEstado.setSelected(true);
    }
 
}
