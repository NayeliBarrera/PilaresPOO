package Abstraccion;

public  class LibCientifico extends Libros {
    public LibCientifico(String titulo, String autor) {
        super(titulo, autor);
    }

    @Override
    public void start() {
        System.out.println("Se muestra el libro Cientifico:"+getTitulo() +" "+getAutor());
    }


}
