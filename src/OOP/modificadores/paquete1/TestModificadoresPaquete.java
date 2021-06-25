package OOP.clases.modificadores.paquete1;

public class TestModificadoresPaquete {
    public static void main(String[] args) {
        ClasePaquete1 clasePaquete1 = new ClasePaquete1("atributoPrivado","atributoPublico","atributoProtected", "atributoPaquete");
        // atibuto atributoPaquete
        // aca si compila!
        System.out.println(clasePaquete1.atributoPaquete);
    }
}
