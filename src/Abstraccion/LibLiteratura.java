package Abstraccion;

public class LibLiteratura extends Libros{
    public LibLiteratura(String titulo, String autor) {
        super(titulo, autor);
    }

    @Override
    public void start() {
        System.out.println("Se muestra el libro Literatura:"+getTitulo() +" "+getAutor());
    }
}
