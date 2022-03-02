package OOP.Collections.Lists;


import OOP.Generics.nuestrogeneric.Persona;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TestLists {

    public static void main(String[] args) {
        // Es buena practica declarar una lista usando la interfaz y no su implementacion concreta
        List<String> lista = new ArrayList<>();
        System.out.println("Imprimo Lista con implementacion ArrayList");
        lista.addAll(Arrays.asList("a","b","c","d"));
        for (String elemento : lista) {
            System.out.println(elemento);
        }
        System.out.println("=======================================");
        System.out.println("agrego un elemento");
        lista.add("elemento nuevo");
        for (String elemento : lista) {
            System.out.println(elemento);
        }
        System.out.println("=======================================");
        System.out.println("remuevo un elemento");
        lista.remove("a");
        for (String elemento : lista) {
            System.out.println(elemento);
        }
        System.out.println("=======================================");
        System.out.println("obtengo un elemento por su posicion. en este caso la posicion 0"); // OJO ACA, SI EL LA POSICION NO EXITE TIRA UNA EXCEPTION
        System.out.println(lista.get(0));


        // Cambio implementacion a LinkedList
        System.out.println("=======================================");
        System.out.println("Imprimo Lista con implementacion LinkedList");
        lista = new LinkedList<>();
        lista.addAll(Arrays.asList("e","f","g","h"));
        for (String elemento : lista) {
            System.out.println(elemento);
        }
        // Es importante ver que es muy facil cambiar la implementacion si declaramos la lista usando la interfaz

    }
}
