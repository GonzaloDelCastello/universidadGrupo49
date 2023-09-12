/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo49.Prueba;

import java.time.LocalDate;
import universidadgrupo49.AccesoADatos.AlumnoData;
import universidadgrupo49.Entidades.Alumno;

/**
 *
 * @author Usuario
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Conexion.getConexion();
        Alumno Lionel = new Alumno(1, 123,"Messi","El Gran Lionel",LocalDate.of(1990,4,23),true);
        AlumnoData alu = new AlumnoData();
//        alu.guardarAlumno(Lionel);
        alu.modificarAlumno(Lionel);
             
    }
    
}
