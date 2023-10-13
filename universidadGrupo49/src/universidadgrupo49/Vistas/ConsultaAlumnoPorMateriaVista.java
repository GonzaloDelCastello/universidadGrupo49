
package universidadgrupo49.Vistas;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import universidadgrupo49.AccesoADatos.AlumnoData;
import universidadgrupo49.AccesoADatos.InscripcionData;
import universidadgrupo49.AccesoADatos.MateriaData;
import universidadgrupo49.Entidades.Alumno;
import universidadgrupo49.Entidades.Inscripcion;
import universidadgrupo49.Entidades.Materia;
import javax.swing.table.DefaultTableColumnModel;

import java.util.concurrent.TimeUnit; // para delay btn
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;

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
   //     imagen_gif_guardar();      // Se coloca aquí para que corra desde el inicio-*-
    
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
    
    
                           // MODIFICAR EL TAMAÑO DEL ICONO_GIF-*-
    
//    public final void imagen_gif_guardar(){
//        
//        ImageIcon check_gif;
//        check_gif = new ImageIcon(getClass().getResource("../recursos/check_gif.gif"));
//        Icon gif = new ImageIcon(check_gif.getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT));
//        btnGuardar.setIcon(gif);
//    }
    
    

                           // METODO SELECCIONAR MATERIA         
     
    private void cargarMaterias(){
   
    cboxMateria.removeAllItems(); // limpia comboBox
    listaMat.forEach((materia) -> {
        cboxMateria.addItem(materia);// agrega cada Materia al comboBox-*-
        });
}
                           // ARMAR CABECERA
    
     private void armarCabeceraTabla(){
         ArrayList<Object> filaCabecera = new ArrayList<>();
         filaCabecera.add("ID");                         //titulos tabla-*-
         filaCabecera.add("Apellido");                       //
         filaCabecera.add("Nombre");

         filaCabecera.forEach((rec) -> {
             modelo.addColumn(rec);
        });

         jTablaAlumnos.setModel(modelo); //aca
    }  
     
                          // METODO BORRAR FILAS DE LA TABLA  
     
    private void borrarFilasTablas(){
        int indice = modelo.getRowCount()-1;
        
        for(int i = indice;i>=0;i--){
            modelo.removeRow(i);
        }
    } 
              
                          // METODO CARGAR ALUMNOS 
    
    private void cargarAlumnos(){
        borrarFilasTablas();
        Materia selec = (Materia)cboxMateria.getSelectedItem();
        listaAlu = inscrData.obtenerAlumnosXMateria(selec.getIdMateria());
        listaAlu.forEach((m) -> {
            modelo.addRow(new Object []{m.getIdAlumno(),m.getApellido(),m.getNombre()});
        });
        
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
        btnSalir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnFace = new javax.swing.JButton();
        btnInsta = new javax.swing.JButton();
        btnTwit = new javax.swing.JButton();
        btnYouTube = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "POWERED BY GRUPO {49}", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 10), new java.awt.Color(0, 51, 51))); // NOI18N
        setPreferredSize(new java.awt.Dimension(735, 450));

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

        btnSalir.setBackground(new java.awt.Color(0, 204, 204));
        btnSalir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
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

        btnGuardar.setBackground(new java.awt.Color(140, 189, 230));
        btnGuardar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidadgrupo49/recursos/alumno.png"))); // NOI18N
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarMouseExited(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(75, 173, 57));

        btnFace.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidadgrupo49/recursos/face_icon.png"))); // NOI18N
        btnFace.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFaceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFaceMouseExited(evt);
            }
        });
        btnFace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFaceActionPerformed(evt);
            }
        });

        btnInsta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidadgrupo49/recursos/insta_icono.png"))); // NOI18N
        btnInsta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInstaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInstaMouseExited(evt);
            }
        });
        btnInsta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInstaActionPerformed(evt);
            }
        });

        btnTwit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidadgrupo49/recursos/twitter_icon.png"))); // NOI18N
        btnTwit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTwitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTwitMouseExited(evt);
            }
        });
        btnTwit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTwitActionPerformed(evt);
            }
        });

        btnYouTube.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidadgrupo49/recursos/youtube_icon.png"))); // NOI18N
        btnYouTube.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnYouTubeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnYouTubeMouseExited(evt);
            }
        });
        btnYouTube.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYouTubeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnFace, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnInsta, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTwit, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnYouTube)
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnFace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInsta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTwit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnYouTube, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Contactos ULP:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(176, 176, 176))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(0, 67, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(cboxMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSalir)))
                        .addGap(130, 130, 130))))
            .addGroup(layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cboxMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(195, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

                          // TABLA 
    
    private void cboxMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxMateriaActionPerformed
        cargarAlumnos(); //carga los alumnos a la tabla cuando segun lo que contenga el cbox
    }//GEN-LAST:event_cboxMateriaActionPerformed
   
    
         
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

     
                         // EVENTO BTN GIF
                            
    private void btnGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseEntered
        
    }//GEN-LAST:event_btnGuardarMouseEntered

    
                        // EVENTO BTN GIF
    
    private void btnGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseExited
        
    }//GEN-LAST:event_btnGuardarMouseExited
                  
    

                       // EFECTO HOVER X MOUSE Pasar x Arriba-*-
    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
    
             Color myColor = new Color(88, 144, 173); // creo mí color personalizado-*-
              
             btnSalir.setBackground(myColor);
        
        
    }//GEN-LAST:event_btnSalirMouseEntered
                       
                       // EFECTO HOVER X MOUSE Salir del Objeto-*-
    
    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        
            btnSalir.setBackground(new Color(0,204,204));
    }//GEN-LAST:event_btnSalirMouseExited

    
         // EVENTO SOLTAR BTN CON RETARDO-*- 
    
    private void btnSalirMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseReleased

        try {
            TimeUnit.MILLISECONDS.sleep(300);
            
            // En caso de haber funciones van aquí dentro-*-
            
        } catch (InterruptedException ex) {
            Logger.getLogger(ConsultaAlumnoPorMateriaVista.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }//GEN-LAST:event_btnSalirMouseReleased

    
                    // BTN FACE
    
    private void btnFaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFaceActionPerformed
    
        try {                    
        Desktop.getDesktop().browse(new URI("https://www.facebook.com/ulp.virtual/"));
    } catch (IOException | URISyntaxException ex) {
        ex.printStackTrace();
    }
               
    }//GEN-LAST:event_btnFaceActionPerformed

                    // BTN INSTA
    
    private void btnInstaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInstaActionPerformed
       
             
        try {                    
        Desktop.getDesktop().browse(new URI("https://www.instagram.com/ulpvirtual/reels/"));
    } catch (IOException | URISyntaxException ex) {
        ex.printStackTrace();
    }
        
    }//GEN-LAST:event_btnInstaActionPerformed

                     // BTN TWIT
    
    private void btnTwitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTwitActionPerformed
       
        try {                    
        Desktop.getDesktop().browse(new URI("https://twitter.com/ULPSanLuis"));
    } catch (IOException | URISyntaxException ex) {
        ex.printStackTrace();
    }
        
    }//GEN-LAST:event_btnTwitActionPerformed
      
                     // BTN YOUTUBE
     
    private void btnYouTubeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYouTubeActionPerformed
      
        try {                    
        Desktop.getDesktop().browse(new URI("https://www.youtube.com/user/ulpdigital"));
    } catch (IOException | URISyntaxException ex) {
        ex.printStackTrace();
    }
        
    }//GEN-LAST:event_btnYouTubeActionPerformed

                     // BTN FACE ENTERED-*-
    
    private void btnFaceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFaceMouseEntered
       
        btnFace.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
    }//GEN-LAST:event_btnFaceMouseEntered

                     // BTN FACE EXITED-*-
    
    private void btnFaceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFaceMouseExited
        
         btnFace.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        
    }//GEN-LAST:event_btnFaceMouseExited

    
                    // BTN INSTA ENTERED-*- 
    private void btnInstaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInstaMouseEntered
        
        btnInsta.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
    }//GEN-LAST:event_btnInstaMouseEntered

                   // BTN INSTA EXITED 
    
    private void btnInstaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInstaMouseExited
        
         btnInsta.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        
    }//GEN-LAST:event_btnInstaMouseExited

                    // BTN TWIT ENTERED-*- 
    
    private void btnTwitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTwitMouseEntered
       
        btnTwit.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnTwitMouseEntered

    
                     // BTN TWIT EXITED-*- 
    
    private void btnTwitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTwitMouseExited
        
        btnTwit.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        
    }//GEN-LAST:event_btnTwitMouseExited

                    // BTN YOUTUBE ENTERED-*-
    
    private void btnYouTubeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnYouTubeMouseEntered
       
        btnYouTube.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
    }//GEN-LAST:event_btnYouTubeMouseEntered

                    // BTN YOUTUBE EXITED-*-
    
    private void btnYouTubeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnYouTubeMouseExited
       
        btnYouTube.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        
    }//GEN-LAST:event_btnYouTubeMouseExited

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFace;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnInsta;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTwit;
    private javax.swing.JButton btnYouTube;
    private javax.swing.JComboBox<Materia> cboxMateria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablaAlumnos;
    // End of variables declaration//GEN-END:variables
}
