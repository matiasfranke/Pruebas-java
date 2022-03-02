package OOP.Collections.Queues;


import java.util.*;

public class TestQueues {

    public static void main(String[] args) {
        // La cola responde a la estructura FIFO (first in, first out) igual que una cola en al vida real
        Queue<String> cola = new PriorityQueue<>();
        System.out.println("Agrego a la cola \"a\", \"b\", \"c\", \"d\"");
        cola.add("a");
        cola.add("b");
        cola.add("c");
        cola.add("d");
        System.out.println("Imprimo Cola tomando elemento con peek, toma el primer elemento pero no lo remueve");
        System.out.println(cola.peek());
        System.out.println("Vuelvo a usar peek, el elemento sigue siendo el mismo");
        System.out.println(cola.peek());
        System.out.println("Uso el metodo poll, toma el elemento y lo remueve de la cola");
        System.out.println(cola.poll());
        System.out.println("Vuelvo a usar poll, toma el elemento siguiente al que removio antes");
        System.out.println(cola.poll());
        System.out.println("Uso remove, el uso es similar a poll, la diferencia es q si la cola esta vacia remove tira una exceptrion");
        System.out.println(cola.remove());

    }
}
