package OOP.modificadores.paquete2;

import OOP.modificadores.paquete1.ClasePaquete1Hija;

public class TestModificadoresProtected {
    public static void main(String[] args) {
        ClasePaquete1Hija clasePaquete1Hija = new ClasePaquete1Hija("atributoPrivado","atributoPublico","atributoProtected", "atributoPaquete");
        // atibuto atributoProtected
        System.out.println(clasePaquete1Hija.getAtributoProtectedHija());

    }
}
