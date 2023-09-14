/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo49.Prueba;

import java.time.LocalDate;
import javax.swing.JOptionPane;
import universidadgrupo49.AccesoADatos.AlumnoData;
import universidadgrupo49.AccesoADatos.MateriaData;
import universidadgrupo49.Entidades.Alumno;
import universidadgrupo49.Entidades.Materia;

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
//        Alumno Ezequiel = new Alumno(3556852,"Fernandez","Laura",LocalDate.of(1988,7,10),true);
//        AlumnoData alu = new AlumnoData();
//        alu.guardarAlumno(Ezequiel);
//        alu.modificarAlumno(Lionel);
//          alu.eliminarAlumno(1);
        //alu.buscarAlumno(3);
       //Alumno alumno1 = alu.buscarAlumno(3);
//       Alumno alumno1 = alu.bucarAlumno(123444666,true);
//        for (Alumno alumno : alu.listarAlumnos(false)) {
//            System.out.println(alumno.toString());
//        }
        
//        System.out.println(alumno1.toString());

        Materia Info = new Materia(3,"Informatica", 2, false);
        MateriaData mat = new MateriaData();
//        mat.guardarMateria(Info);
        
//        JOptionPane.showMessageDialog(null, mat.buscarMateria(4, true));
//        mat.listarMaterias(true);
        for (Materia materia: mat.listarMaterias(true)){
            System.out.println(materia);
        }
    }
}
