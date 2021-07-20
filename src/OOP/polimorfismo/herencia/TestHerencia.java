package OOP.clases.abstracta;

public class TestCuenta {
    public static void main(String[] args) {
       // Cuenta cuenta = new Cuenta();
        Cuenta cuentaCorriente = new CuentaCorriente();
        Cuenta cajaDeAhorro = new CajaAhorro();
        cuentaCorriente.extraccion();
        cuentaCorriente.suspenderCuenta();

        cajaDeAhorro.extraccion();
        cajaDeAhorro.suspenderCuenta();
    }
}
