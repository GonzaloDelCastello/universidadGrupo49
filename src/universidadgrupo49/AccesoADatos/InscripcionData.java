
package universidadgrupo49.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;
import universidadgrupo49.Entidades.Inscripcion;


public class InscripcionData {
    private Connection con = null;
    private MateriaData md;
    private AlumnoData ad;
    public InscripcionData(){
        this.con = Conexion.getConexion();
    }
    public void guardarInscripcion (Inscripcion insc){
    
        String sql ="INSERT INTO inscripcion (idAlumno,idMateria,nota) VALUES (?,?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,insc.getAlumno().getIdAlumno());
            ps.setInt(2,insc.getMateria().getIdMateria());
            ps.setDouble(3,insc.getNota());
            ps.executeUpdate();
           ResultSet rs = ps.getGeneratedKeys();
           if(rs.next()){
               insc.setIdInscripcion(rs.getInt(1));
               JOptionPane.showMessageDialog(null,"Inscripcion registrada");
           }else{
               JOptionPane.showMessageDialog(null,"No se registro la inscripcion");
           }
           ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla inscripcion"+ex.getMessage());
        }
    
    }
    
    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria ){
        
        String sql="DELETE FROM inscripcion WHERE idAlumno=? AND idMateria=?";
        
        
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            int carga= ps.executeUpdate();
            if(carga==1){
                JOptionPane.showMessageDialog(null,"Inscripcion borrada con éxito");
            } else {
                JOptionPane.showMessageDialog(null,"No se pudo borrar la inscripción");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"No se pudo ingresar a la tabla"+ex.getMessage());
        }
        
    }
}
