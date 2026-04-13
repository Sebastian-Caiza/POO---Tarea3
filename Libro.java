import com.sun.management.UnixOperatingSystemMXBean;

public class Libro {

    String titulo, autor;
    int publicacion;

    public Libro(String titulo, String autor, int publicacion){

        this.autor = autor;
        this.titulo = titulo;
        this.publicacion = publicacion;

    }

    public  void imprimir(){

        System.out.println("----------------");
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Fecha de publicacion: " + publicacion);

    }


}
