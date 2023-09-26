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

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setText("Materia");

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setText("Codigo");

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setText("Año");

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setText("Estado");

        jBBuscar.setBackground(new java.awt.Color(41, 84, 171));
        jBBuscar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jBBuscar.setForeground(new java.awt.Color(0, 0, 0));
        jBBuscar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\GitHub\\universidadGrupo49\\src\\universidadgrupo49\\recursos\\lupa.png")); // NOI18N
        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jBNuevo.setBackground(new java.awt.Color(157, 161, 158));
        jBNuevo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jBNuevo.setForeground(new java.awt.Color(0, 0, 0));
        jBNuevo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\GitHub\\universidadGrupo49\\src\\universidadgrupo49\\recursos\\escoba.png")); // NOI18N
        jBNuevo.setText("Limpiar Pantalla");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
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

        jBModificar1.setBackground(new java.awt.Color(0, 204, 204));
        jBModificar1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jBModificar1.setForeground(new java.awt.Color(0, 0, 0));
        jBModificar1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\GitHub\\universidadGrupo49\\src\\universidadgrupo49\\recursos\\salida.png")); // NOI18N
        jBModificar1.setText("Salir");
        jBModificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificar1ActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(jBEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBModificar1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRBEstado))))
                .addGap(0, 0, Short.MAX_VALUE))
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
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNuevo)
                    .addComponent(jBEliminar)
                    .addComponent(jBGuardar)
                    .addComponent(jBModificar1))
                .addContainerGap(9, Short.MAX_VALUE))
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
