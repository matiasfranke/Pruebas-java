package OOP.Generics.nuestrogeneric;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestGenerics {

    public static void main(String[] args) {
        // Generamos una clase persona con un campo generico
        Persona<String> personaTexto = new Persona<>("Pepe", "11.222.333"); // A aprtir de Java 8 no es mas necesario volver a aclarar la clase cuando se hace el new
        System.out.println("Imprimo persona genric con dni string");
        System.out.println(personaTexto);

        Persona<Integer> personaNumero = new Persona<>("Pepe", 11222333);
        System.out.println("Imprimo persona genric con dni numero");
        System.out.println(personaNumero);

    }
}
