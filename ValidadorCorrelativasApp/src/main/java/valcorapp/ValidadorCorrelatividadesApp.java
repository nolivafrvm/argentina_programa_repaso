package valcorapp;

import valcorapp.entidades.Alumno;
import valcorapp.entidades.Inscripcion;
import valcorapp.entidades.Materia;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class ValidadorCorrelatividadesApp {

    public static void main(String[] args) throws IOException {
        Alumno alumno = new Alumno();
        alumno.setLegajo("282023");
        alumno.setNombre("Juan Gomez");

        Materia materia_uno = new Materia();
        materia_uno.setMateria("Matematica I");

        alumno.getMateriasAprobados().add(materia_uno);

        Materia materia_dos = new Materia();
        materia_dos.setMateria("Matematica II");
        materia_dos.getCorrelativas().add(materia_uno);

//        Materia materia_tres = new Materia();
//        materia_tres.setMateria("Algebra");
//
//        materia_dos.getCorrelativas().add(materia_tres);

        Inscripcion inscripcion = new Inscripcion();
        inscripcion.setAlumno(alumno);
        inscripcion.setMateria(materia_dos);
        inscripcion.setFecha(LocalDate.now());

        boolean estadoInscripcion = inscripcion.aprobada();



        System.out.println("Estado de Inscripcion: " + estadoInscripcion);


    }

}
