import javax.swing.*;
import java.awt.color.ProfileDataException;

public class Producto {

    String nombre;
    float precio;
    int cantidad;

    public Producto(String nombre, float precio, int cantidad){

        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;

    }

    public Producto(){
    }

    public void imprimir(){

        System.out.println("----------------");
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad: " + cantidad);

    }

}

