package TA14;

public class Matricula {
    private int contador;
    private String nombre;
    private Cursos[] cursos;
    private Alumno[] alumno;
    Matricula(String nombre){
        this.nombre = nombre;
        this.contador = 0;
        this.cursos = new Cursos[2];
        this.alumno = new Alumno[1];
    }
    public void setCurso(Cursos cursos) {

        this.cursos[this.contador++] = cursos;
    }

    public Cursos[] getCursos() {
        return cursos;
    }
    public void setAlumno(Alumno alumnos) {

        this.alumno[this.contador++] = alumnos;
    }

    public Alumno[] getAlumno() {
        return alumno;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void mostrarSemestre(){
        System.out.println("El ciclo de estudios es: "+getNombre());
        System.out.println();
    }
}