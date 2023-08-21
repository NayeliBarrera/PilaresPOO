package Herencia1;

class Automovil extends Vehiculo {
    private int puertas;

    public Automovil(String marca, String modelo, int puertas) {
        super(marca, modelo);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Puertas: " + puertas);
    }
}
