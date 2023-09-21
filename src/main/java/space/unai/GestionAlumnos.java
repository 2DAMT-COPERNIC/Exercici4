package space.unai;
/*
 * AUTHOR: UNAI MEDINA FERNÁNDEZ
 * CURSO: 2 DAM
 * FECHA: 21/09/2023
 */

public class GestionAlumnos {

    private static Alumno al1;
    private static Alumno al2;

    private static void hardcode() {
        al1 = new Alumno(43, "Unai Medina");
        al2 = new Alumno(33, "Pol Ribera");

        al1.getNotas().insertarNota(1);
        al1.getNotas().insertarNota(2);
        al1.getNotas().insertarNota(3);

        al2.getNotas().insertarNota(4);
        al2.getNotas().insertarNota(5);
        al2.getNotas().insertarNota(6);

        for (Alumno alumno : Alumno.getAlumnos()) {
            for (int y = 0; y < alumno.getNotas().getList().size(); y++) {
                System.out.println("Nota (" + alumno.getNom() + ") #" + (y + 1) + ": " + alumno.getNotas().getList().get(y));
            }
        }
    }

    public static void main(String[] args) {
        hardcode();

        Alumno.getAlumnos().forEach(alumno -> {
            System.out.println(alumno.getNom());
        });
    }
}
