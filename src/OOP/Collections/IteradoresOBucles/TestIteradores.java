package OOP.Collections.IteradoresOBucles;


import java.util.*;

public class TestIteradores {

    public static void main(String[] args) {
        // defino una lista y la recorro de diferentes maneras
        List<String> lista = new ArrayList<>();
        lista.addAll(Arrays.asList("a","b","c","d","e","f","g"));

        System.out.println("Imprimo Lista con un FOR");
        for(int i=0;i<lista.size();i++) {
            System.out.println(lista.get(i));
        }
        System.out.println("=======================================");
        System.out.println("Imprimo Lista con un FOR EACH");
        for (String elemento : lista) {
            System.out.println(elemento);
        }
        System.out.println("=======================================");
        System.out.println("Imprimo Lista con un WHILE");
        int j = 0;
        while(j < lista.size()) {
            System.out.println(lista.get(j));
            j++; // incremento el valor de j, equivalente a j= j+1;
        }
        System.out.println("=======================================");
        System.out.println("Imprimo Lista con un DO WHILE"); // A diferencia de while, siempre ejecuta al menos una iteracion

        int k = 0;
        do {
            if (lista.size() > 0) { // checkeo que tenga al menos 1 elemento ya que la primera iteracion la hace siempre
                System.out.println(lista.get(k));
            }
            k++;
        } while (k < lista.size());

        System.out.println("=======================================");
        System.out.println("Imprimo Lista con un ITERATOR");
        Iterator<String> it = lista.iterator();
        // Se combina con un while
        while(it.hasNext()) { // Evalua si tiene otro elemento o llegó al final
            System.out.println(it.next()); // itera hasta que la colección termine;
        }


    }
}
