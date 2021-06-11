package OOP.clases.abstracta;

public class CajaAhorro extends Cuenta{
    @Override
    public long extraccion() {
        System.out.println("extraccion caja de ahorro");
        return 0;
    }
}
