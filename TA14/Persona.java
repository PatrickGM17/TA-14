package TA14;

   abstract class Persona{
    protected String nombres;
    protected String apellidos;
    protected int dni;
    protected int fechaNacimiento;
    protected int fechaActual;

    Persona(String nombres, String apellidos, int dni, int fechaNacimiento, int fechaActual){
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaActual = fechaActual;

    }
    public String getApellidos() {
        return apellidos;
    }
    public int getDni() {
        return dni;
    }
    public int getFechaNacimiento() {
        return fechaNacimiento;
    }
    public String getNombres() {
        return nombres;
    }
    public int getFechaActual() {
        return fechaActual;
    }

    public Integer calcularEdad(){
        int edad;
        edad = getFechaActual() - getFechaNacimiento();
        return edad;

    }
}