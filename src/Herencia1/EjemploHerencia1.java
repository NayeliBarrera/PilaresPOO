package Herencia1;

class Motocicleta extends Vehiculo {
    private boolean tieneMaletero;

    public Motocicleta(String marca, String modelo, boolean tieneMaletero) {
        super(marca, modelo);
        this.tieneMaletero = tieneMaletero;
    }

    public boolean tieneMaletero() {
        return tieneMaletero;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tiene Maletero: " + tieneMaletero);
    }
}
public class EjemploHerencia1 {
    public static void main(String[] args) {
        Automovil auto = new Automovil("Toyota", "Corolla", 4);
        Motocicleta moto = new Motocicleta("Honda", "CBR500R", false);

        System.out.println("Información del Automóvil:");
        auto.mostrarInformacion();

        System.out.println("\nInformación de la Motocicleta:");
        moto.mostrarInformacion();
    }
}