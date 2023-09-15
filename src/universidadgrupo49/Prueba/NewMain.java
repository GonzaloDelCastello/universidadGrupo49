/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo49.Prueba;

import java.time.LocalDate;
import javax.swing.JOptionPane;
import universidadgrupo49.AccesoADatos.AlumnoData;
import universidadgrupo49.AccesoADatos.InscripcionData;
import universidadgrupo49.AccesoADatos.MateriaData;
import universidadgrupo49.Entidades.Alumno;
import universidadgrupo49.Entidades.Inscripcion;
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
//        Alumno messi = new Alumno(1,123,"Messi","El Gran Lionel",LocalDate.of(1990,4,23),false);
        AlumnoData alu = new AlumnoData();
//        alu.guardarAlumno(Ezequiel);
//        alu.modificarAlumno(Lionel);
//          alu.eliminarAlumno(1);
//        alu.buscarAlumno(3, true);
       //Alumno alumno1 = alu.buscarAlumno(3);
//       Alumno alumno1 = alu.bucarAlumno(123444666,true);
//        for (Alumno alumno : alu.listarAlumnos(false)) {
//            System.out.println(alumno.toString());
//        }
        
//        System.out.println(alumno1.toString());

//        Materia mates = new Materia(1,"Matemáticas", 1, true);
        MateriaData mat = new MateriaData();
//        mat.buscarMateria(2, true);
//        mat.guardarMateria(Info);
        
//        JOptionPane.showMessageDialog(null, mat.buscarMateria(4, true));
//        mat.listarMaterias(true);
//        for (Materia materia: mat.listarMaterias(true)){
//            System.out.println(materia);
//        }


          Alumno eze = alu.buscarAlumno(2, true);
          Materia leng = mat.buscarMateria(2, true);
          Inscripcion inscripcion = new Inscripcion(eze, leng, 6.5);
          InscripcionData insc = new InscripcionData();
          insc.guardarInscripcion(inscripcion);
    }
}
