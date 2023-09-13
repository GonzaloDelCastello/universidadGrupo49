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
        Alumno Ezequiel = new Alumno( 123444666,"Perez","Ezequiel",LocalDate.of(1999,7,21),true);
        AlumnoData alu = new AlumnoData();
        //alu.guardarAlumno(Ezequiel);
//        alu.modificarAlumno(Lionel);
//          alu.eliminarAlumno(1);
        //alu.buscarAlumno(3);
       //Alumno alumno1 = alu.buscarAlumno(3);
       Alumno alumno1 = alu.bucarAlumno(123444666);
        System.out.println(alumno1.toString());

    }
    
    
}
