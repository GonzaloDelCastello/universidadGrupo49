
package universidadgrupo49.AccesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadgrupo49.Entidades.Alumno;


public class AlumnoData {
    private Connection con = null; //declaracion de con tipo conexion
    
    public AlumnoData(){ //aca se inicializamos
    
        con = Conexion.getConexion();  //aca se conecta la alumnodata con la bd
    }
    
    public void guardarAlumno (Alumno alumno){
    
        String sql ="INSERT INTO alumno (dni,apellido,nombre,fechaNacimiento, estado)"
                + "VALUES(?,?,?,?,?)"; // le enviamo a bd el mensaje de lo que vamos a cargar
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,alumno.getDni());
            ps.setString(2,alumno.getApellido() );
            ps.setString(3,alumno.getNombre());
            ps.setDate(4,Date.valueOf(alumno.getFechaNacimiento()));
            ps.setBoolean(5,alumno.isActivo());
            ps.executeUpdate();   
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                alumno.setIdAlumno(rs.getInt(1));
                JOptionPane.showMessageDialog(null,"Alumno añadido con exito!!!");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error a acceder a la tablaa de alumno"+ex.getMessage());
        }
    }
    
    public void modificarAlumno (Alumno alumno){
        
        String sql = "UPDATE alumno SET dni=?, apellido=?, nombre=?, fechaNacimiento=? WHERE idAlumno=?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));
            ps.setInt(5, alumno.getIdAlumno());
            int cargado = ps.executeUpdate();
            if (cargado == 1) {
                JOptionPane.showMessageDialog(null,"Alumno modificado con exito!");
            }
        ps.close();    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla" + ex.getMessage());
        }
    }
    
    public void eliminarAlumno (int id){

	try{
	String sql = "UPDATE alumno SET estado =0 WHERE idAlumno =?";
	PreparedStatement ps = con.prepareStatement(sql);
	ps.setInt(1,id);
        int fila = ps.executeUpdate();
	if(fila == 1){
	 JOptionPane.showMessageDialog(null,"Se eliminó el alumno.");
}
	ps.close();
}catch (SQLException e){
	JOptionPane.showMessageDialog(null,"Error al acceder a a tabla alumno");
}
}
}
