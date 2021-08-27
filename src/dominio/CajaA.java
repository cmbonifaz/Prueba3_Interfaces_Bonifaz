package dominio;

public class CajaA {

    private String nombre;
    private double saldo;
    private int nCuenta;
    private static int contador;

    public CajaA(String nombre, double saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
        this.nCuenta = CajaA.contador++;
    }

    public int getNroCuenta() {
        return nCuenta;
    }
}
