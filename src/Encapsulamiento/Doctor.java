package Encapsulamiento;

public class Doctor {
    private String Nombre;
    private String Especialidad;
    private int edad;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String especialidad) {
        Especialidad = especialidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad >= 0){
        this.edad = edad;
    } else {
            System.out.println("La edad es erronea.");
}
    }
}
