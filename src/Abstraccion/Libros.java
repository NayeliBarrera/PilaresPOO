package Abstraccion;

public abstract class Libros {
    private String titulo;
    private String Autor;

    public Libros(String titulo, String autor) {
        this.titulo = titulo;
        this.Autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }
    public abstract void start();
}
