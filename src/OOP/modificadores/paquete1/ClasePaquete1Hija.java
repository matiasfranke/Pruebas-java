package OOP.clases.modificadores.paquete1;

public class ClasePaquete1Hija extends ClasePaquete1 {


    public ClasePaquete1Hija(String atributoPrivado, String atributoPublico, String atributoProtected, String atributoPaquete){
        super(atributoPrivado,  atributoPublico,  atributoProtected,  atributoPaquete);
    }

    public String getAtributoProtectedHija() {
        return this.atributoProtected;
    }
    // no compila
//    public String getAtributoPrivadoHija() {
//        return this.atributoPrivado;
//    }
}
