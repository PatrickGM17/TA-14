package TA14;

public class Main {
    public static void main(String[] args) {

        Matricula matricula = new Matricula("2022-2");
        Cursos curso = new Cursos("Programacion orientada a objetos");
        Docente docente = new Docente("Freddy", "Clayderman", 17568452, 1994, 2022);
        Cursos curso2 = new Cursos("Marketing digital");
        Docente docente2 = new Docente("Juan", "Huapalla", 71648861, 1991, 2022);
        Alumno alumno = new Alumno("Patrick", "Gomez Montero", 72368029, 2002, 2022, 2019110473);

        matricula.mostrarSemestre();

        matricula.getNombre();
        curso.mostrarCurso();
        curso.getNombre();
        System.out.println();
        docente.mostrarDatos2();
        docente.calcularEdad();
        System.out.println();
        curso2.getNombre();
        curso2.mostrarCurso();
        docente2.mostrarDatos2();
        docente2.calcularEdad();
        System.out.println("Alumno matiruculado:");
        alumno.mostrarDatos();
        alumno.calcularEdad();
    }

}
