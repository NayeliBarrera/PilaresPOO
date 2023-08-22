package Abstraccion;

public class Main {
    public static void main(String[] args) {
        Libros LibCientifico = new LibCientifico("Los Origenes de las especies","Charles Darwin");
        Libros LibLiteratura = new LibLiteratura("Cien años de soledad","Gabriel Garcia Marquez");

        LibCientifico.start();
        LibLiteratura.start();
    }
}
