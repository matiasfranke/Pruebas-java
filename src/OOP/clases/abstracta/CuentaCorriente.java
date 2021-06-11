package OOP.clases.abstracta;

public class CuentaCorriente extends Cuenta{
    @Override
    public long extraccion() {
        System.out.println("extraccion cuenta corriente");
        return 0;
    }
}
