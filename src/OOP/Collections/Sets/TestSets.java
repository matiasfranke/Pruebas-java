package OOP.Collections.Sets;


import java.util.*;

public class TestSets {

    public static void main(String[] args) {
        // La principal caracteristica de un set es q no permite elementos duplicados. Si ponemos un elemento q ya existe lo pisa
        Set<String> set = new HashSet<>();
        System.out.println("Imprimo Set luego de intentar agregar \"a\", \"b\", \"c\", \"a\"");
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("a");

        for (String elemento : set) {
            System.out.println(elemento);
        }
        // Al igual que list puedo usar otras implementaciones
    }
}
