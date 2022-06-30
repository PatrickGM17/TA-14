package TA14;

public class Cursos{
    private int contador;
    private String nombre;
    private Docente[] docente;
    Cursos(String nombre){
        this.nombre = nombre;
        this.contador = 0;
        this.docente =new Docente[1];
    }
    public void setDocente(Docente docente) {

        this.docente[this.contador++] = docente;
    }

    public Docente[] getDocente() {
        return docente;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void mostrarCurso(){
        System.out.println("Curso matriculado: "+getNombre());
    }
}