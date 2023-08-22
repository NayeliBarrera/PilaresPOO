package Encapsulamiento;

import javax.print.Doc;

public class Main {
    public static void main(String[] args) {
        Doctor miDoctor = new Doctor();
        miDoctor.setNombre("Brandon Mena");
        miDoctor.setEspecialidad("Traumatologia");
        miDoctor.setEdad(28);

        System.out.println("Nombre del Doctor asignado: "+ miDoctor.getNombre());
        System.out.println("Especialidad:"+ miDoctor.getEspecialidad());
        System.out.println("Edad del Doctor: "+ miDoctor.getEdad());
    }
}
