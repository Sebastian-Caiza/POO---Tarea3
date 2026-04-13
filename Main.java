//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Ejercicios Clase Libros
        Libro l1 = new Libro("La conquista de America", "Antonio Espino", 2013);
        Libro l2 = new Libro("Chulla Vida", "Alejandro Rivadeneria", 2007);

        l1.imprimir();
        l2.imprimir();

        System.out.println();
         //Ejercicio Clase Productos
        Producto p1 = new Producto("Chocolate", 1.75f, 5);
        Producto p2 = new Producto();
        p2.nombre = "Jabon";
        p2.precio = 1.25f;
        p2.cantidad = 2;
        Producto p3 = new Producto();

        p1.imprimir();
        p2.imprimir();
        p3.imprimir();

        //Ejercicio Clase Cuenta Bancaria

        CuentaBancaria usuario1 = new CuentaBancaria("Sebasian Caiza ", 500);
        usuario1.mostrarInformacion();
        usuario1.depositar(50);
        usuario1.retirar(100);
        usuario1.mostrarInformacion();

        //1. Ejercicio Estudiante

        Estudiante e1 = new Estudiante("Ana", 9);

        e1.setNota(11);
        e1.mostrar();

        //2. Ejercicio Persona
        Persona pe1 = new Persona();

        pe1.setEdad(20);
        System.out.println("--------------");
        System.out.println("Edad: " + pe1.getEdad());

        pe1.setEdad(-5);
    }
}