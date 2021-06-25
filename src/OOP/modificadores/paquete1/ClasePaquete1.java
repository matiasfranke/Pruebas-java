package OOP.clases.modificadores.paquete1;

public class ClasePaquete1 {
    private String atributoPrivado;
    public String atributoPublico;
    protected String atributoProtected;
    String atributoPaquete;

    public ClasePaquete1(String atributoPrivado,String atributoPublico,String atributoProtected,String atributoPaquete){
        this.atributoPrivado = atributoPrivado;
        this.atributoPublico = atributoPublico;
        this.atributoProtected = atributoProtected;
        this.atributoPaquete = atributoPaquete;
    }
    public String getAtributoPrivado() {
        return this.atributoPrivado;
    }

    public String getAtributoProtected() {
        return this.atributoProtected;
    }

    public String getAtributoPaquete() {
        return this.atributoPaquete;
    }
}
