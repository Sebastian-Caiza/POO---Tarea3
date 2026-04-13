public class CuentaBancaria {

    private  String nombreTiular;
    private double saldo;

    public CuentaBancaria(String nombreTiular, double saldo){

        this.nombreTiular = nombreTiular;
        this.saldo = saldo;

    }

    public void mostrarInformacion(){

        System.out.println("------------------");
        System.out.println("Nombre: " + nombreTiular);
        System.out.println("Saldo:" + saldo + "$");

    }

    public void depositar(double monto){
        if (monto > 0){
            this.saldo += monto;
            System.out.println("Desposito realizado correctamente");
        }
        else {
            System.out.println("Error! No se permiten cantidades negativas");
        }
    }

    public void retirar(double retiro){
        if (retiro > 0){
            saldo -= retiro;
            System.out.println("Retiro realizado correctamente");
        }
        else {
            System.out.println("Error! No se permiten cantidades negativas");
        }
    }
}
