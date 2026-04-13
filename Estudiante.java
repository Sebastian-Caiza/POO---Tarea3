public class Estudiante {

    private String nombre;
    private double nota;

    public Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        setNota(nota);
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
        }
    }

    public void mostrar() {
        System.out.println("------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Nota: " + nota);
    }
}
