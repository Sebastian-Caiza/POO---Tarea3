public class Persona {

    private int edad;

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("Edad inválida");
        }
    }

    public int getEdad() {
        return edad;
    }
}
