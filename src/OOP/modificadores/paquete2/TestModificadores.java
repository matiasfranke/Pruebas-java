package OOP.clases.modificadores.paquete2;

import OOP.clases.abstracta.CajaAhorro;
import OOP.clases.abstracta.Cuenta;
import OOP.clases.abstracta.CuentaCorriente;
import OOP.clases.modificadores.paquete1.ClasePaquete1;

public class TestModificadores {
    public static void main(String[] args) {
        ClasePaquete1 clasePaquete1 = new ClasePaquete1("atributoPrivado","atributoPublico","atributoProtected", "atributoPaquete");
        // atibuto privado
        System.out.println(clasePaquete1.getAtributoPrivado());
        // -> no compila System.out.println(clasePaquete1.atributoPrivado);

        // atibuto publico
        System.out.println(clasePaquete1.atributoPublico);

        // atibuto atributoProtected
        // -> no compila System.out.println(clasePaquete1.atributoProtected);
        System.out.println(clasePaquete1.getAtributoProtected());

        // atibuto atributoPaquete
        System.out.println(clasePaquete1.getAtributoPaquete());
        // -> no compila System.out.println(clasePaquete1.atributoPaquete);
    }
}
