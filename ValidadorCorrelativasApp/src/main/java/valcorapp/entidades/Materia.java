package valcorapp.entidades;

import java.util.ArrayList;
import java.util.List;

public class Materia {

    private String materia;
    private List<Materia> correlativas = new ArrayList<>();


    public boolean puedeCursar(Alumno alumno) {
        if (this.getCorrelativas().isEmpty()) {
            return true;
        } else {
            boolean materiaNoAprobada = true;
            for (Materia materiaCorrelativa: this.getCorrelativas()) {
                materiaNoAprobada = alumno.getMateriasAprobados().contains(materiaCorrelativa);
                if (!materiaNoAprobada) {
                    return false;
                }
            }
            return true;
        }
    }
    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }

    public void setCorrelativas(List<Materia> correlativas) {
        this.correlativas = correlativas;
    }
}
