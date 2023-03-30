package valcorapp.entidades;

import valcorapp.servicio.ServicioFile;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Date;

public class Inscripcion {

    private Alumno alumno;
    private Materia materia;
    private LocalDate fecha;
    private ServicioFile servicioFile = new ServicioFile();

    public boolean aprobada() throws IOException {
        if (this.getMateria().puedeCursar(this.getAlumno())) {
            if (this.verificarInscripcionPrevia(this)) {
                System.out.println("Ya esta inscripto, no se puede inscribir mas veces");
                return false;
            } else {
                return servicioFile.registrarInscripcion(this);
            }
        }
        System.out.println("Intentando inscribirse a :"  + this.getMateria().getMateria());
        System.out.println("No puede cursar esta materia");
        return false;
    }

    private boolean verificarInscripcionPrevia(Inscripcion inscripcion) {
        return servicioFile.verificarInscripcionPublic(inscripcion);
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String grabarInscripcionAArchivo() {
        return this.getMateria().getMateria().concat(" ").concat(this.getAlumno().getLegajo()).concat( " ")
                .concat(this.getAlumno().getNombre());
    }
}
