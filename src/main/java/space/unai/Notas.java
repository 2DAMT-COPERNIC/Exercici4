package space.unai;
/*
 * AUTHOR: UNAI MEDINA FERNÁNDEZ
 * CURSO: 2 DAM
 * FECHA: 21/09/2023
 */

import java.util.ArrayList;
import java.util.List;

public class Notas {

    static int alumno;
    static List<Integer> notas;

    public Notas(int expedient) {
        this.alumno = expedient;
        this.notas = new ArrayList<>(100);
    }

    public void insertarNota(int nota) {
        notas.add(nota);
        System.out.println("Añadida nota a " + Alumno.getAlumnoById(alumno).getNom() + ": " + nota);
    }

    public List<Integer> getList() {
        return notas;
    }
}
