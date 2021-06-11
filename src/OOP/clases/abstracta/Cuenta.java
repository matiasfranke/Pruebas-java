package OOP.clases.abstracta;

public abstract class Cuenta {
    private String cbu;
    private String titular;
    private long numero;
    private boolean habilitada;

// getters y setters de los atributos de arriba

    // métodos que definen el comportamiento de la clase persona
    public abstract long extraccion();

    public void suspenderCuenta(){
        System.out.println("Cuenta suspendida");
    }

}
