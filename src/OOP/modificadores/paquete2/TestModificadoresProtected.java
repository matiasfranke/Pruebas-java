package OOP.clases.modificadores.paquete2;

import OOP.clases.modificadores.paquete1.ClasePaquete1;
import OOP.clases.modificadores.paquete1.ClasePaquete1Hija;

public class TestModificadoresProtected {
    public static void main(String[] args) {
        ClasePaquete1Hija clasePaquete1Hija = new ClasePaquete1Hija("atributoPrivado","atributoPublico","atributoProtected", "atributoPaquete");
        // atibuto atributoProtected
        System.out.println(clasePaquete1Hija.getAtributoProtectedHija());

    }
}
