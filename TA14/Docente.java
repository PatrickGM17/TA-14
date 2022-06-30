package TA14;

public class Docente extends Persona{
    Docente(String nombres, String apellidos, Integer dni, Integer fechaNacido, Integer fechaActual) {
        super(nombres, apellidos, dni, fechaNacido,fechaActual);
    }

    public void mostrarDatos2(){
        System.out.println ("Docente: " + getNombres() + " " +  getApellidos() + "\n"+
                "DNI del docente: " +getDni()+ "\n"); }

    @Override
    public Integer calcularEdad(){
        int edad;
        edad = getFechaActual() - getFechaNacimiento();
        System.out.println("Edad del docente:"+edad );
        return edad;
    }
}
