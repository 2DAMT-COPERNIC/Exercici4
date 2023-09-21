package space.unai;
/*
 * AUTHOR: UNAI MEDINA FERNÁNDEZ
 * CURSO: 2 DAM
 * FECHA: 21/09/2023
 */

import java.util.ArrayList;
import java.util.List;


public class Alumno {

    private static final List<Alumno> alumnos = new ArrayList<>();
    private int matricula;
    private String nom;
    private Notas notas;

    public Alumno(int matricula, String nom) {
        this.matricula = matricula;
        this.nom = nom;
        this.notas = new Notas(matricula);

        alumnos.add(this);
    }


    public static Alumno getAlumnoById(int id) {
        for (Alumno alumno : alumnos) {
            if (alumno.matricula == id) {
                return alumno;
            }
        }
        return null;
    }

    public String getNom() {
        return nom;
    }

    public int getId() {
        return matricula;
    }

    public Notas getNotas() {
        return notas;
    }

    public static List<Alumno> getAlumnos() {
        return alumnos;
    }
}
