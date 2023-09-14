/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo49.AccesoADatos;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadgrupo49.Entidades.Materia;

/**
 *
 * @author Usuario
 */
public class MateriaData {
    
    private Connection con = null;
    
    public MateriaData () {
        con = Conexion.getConexion();
    }
    
    public void guardarMateria (Materia materia) {
        String sql = "INSERT INTO materia (nombre, anio, estado) VALUES (?, ?, ?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setBoolean(3, materia.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                materia.setIdMateria(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Materia añadida correctamente.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla" + ex.getMessage());
        }
    }
    
    public void modificarMateria (Materia materia){
        String sql = "UPDATE materia SET nombre=?, anio=? WHERE idMateria=?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setInt(3, materia.getIdMateria());
            int cargado = ps.executeUpdate();
            
            if (cargado == 1) {
                JOptionPane.showMessageDialog(null, "Materia modificada correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No existe la materia.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla" + ex.getMessage());
        }
        
    }
    
    public void eliminarMateria(int id){
        
        String sql ="UPDATE materia SET estado = 0 WHERE idMateria=?";
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1,id);
            int cargado = ps.executeUpdate();
            
            if(cargado == 1){
                JOptionPane.showMessageDialog(null, "Materia eliminada correctamente.");
            }else{
                JOptionPane.showMessageDialog(null, "Fallo la eliminacion.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla materia"+ex.getMessage());
        }
    }
}
