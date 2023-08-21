package Polimorfismo;

public class EjemploPolimorfismo {
    public static void hacerRuidoDeAnimal(Animal animal) {
        animal.hacerSonido();
    }

    public static void main(String[] args) {
        Animal animal1 = new Perro();
        Animal animal2 = new Gato();

        hacerRuidoDeAnimal(animal1);
        hacerRuidoDeAnimal(animal2);

    }
}