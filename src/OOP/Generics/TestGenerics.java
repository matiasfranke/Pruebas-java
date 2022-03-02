package OOP.Generics;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestGenerics {

    public static void main(String[] args) {
        // La interfaz List es un buen ejemplo del uso de generics
        List<String> lista = new ArrayList<>(); // A aprtir de Java 8 no es mas necesario volver a aclarar la clase cuando se hace el new
        System.out.println("Imprimo Lista de texto");
        lista.addAll(Arrays.asList("a","b","c","d"));

        for (String texto : lista) {
            System.out.println(texto);
        }


        List<Integer> otraLista = new ArrayList<>();
        // si descomentamos la siguiente linea vemos un error de compilacion ya que queremos agregar Strings a una lista de enteros
        // otraLista.addAll(Arrays.asList("a","b","c","d"));
        System.out.println("Imprimo Lista de enteros");
        otraLista.addAll(Arrays.asList(1,2,3,4));
        for (Integer entero : otraLista) {
            System.out.println(entero);
        }



    }
}
