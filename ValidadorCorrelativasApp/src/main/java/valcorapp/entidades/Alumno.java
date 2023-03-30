package valcorapp.entidades;

import java.util.ArrayList;
import java.util.List;

public class Alumno {

    private String nombre;
    private String legajo;
    private List<Materia> materiasAprobados = new ArrayList<>();


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public List<Materia> getMateriasAprobados() {
        return materiasAprobados;
    }

    public void setMateriasAprobados(List<Materia> materiasAprobados) {
        this.materiasAprobados = materiasAprobados;
    }
}
