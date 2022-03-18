package OOP.Sorting;


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestSorting {

    public static void main(String[] args) {

        System.out.println("Sort comparable y comparator");
        List<PersonaComparable> personasComparable = Arrays.asList(
            new PersonaComparable("Pepe","Pompin", 11222333l, 66),
            new PersonaComparable("Juan","Delospalotes", 29222333l, 40),
            new PersonaComparable("Peppa","Pig", 33222333l, 33),
            new PersonaComparable("Guillermo","Portales", 9222333l, 70),
            new PersonaComparable("Esteban","Trabajos", 11111333l, 67)
        );

        List<PersonaComparator> personasComparator = Arrays.asList(
                new PersonaComparator("Pepe","Pompin", 11222333l, 66),
                new PersonaComparator("Juan","Delospalotes", 29222333l, 40),
                new PersonaComparator("Peppa","Pig", 33222333l, 33),
                new PersonaComparator("Guillermo","Portales", 9222333l, 70),
                new PersonaComparator("Esteban","Trabajos", 11111333l, 67)
        );

        System.out.println("============ COMPARABLE ==================");
        System.out.println("Lista Comparable sin ordenar:");
        for (PersonaComparable personaComparable : personasComparable) {
            System.out.println(personaComparable.getNombre() + " edad: " + personaComparable.getEdad());
        }
        System.out.println("Lista Comparable ordenada:");
        Collections.sort(personasComparable);
        for (PersonaComparable personaComparable : personasComparable) {
            System.out.println(personaComparable.getNombre() + " edad: " + personaComparable.getEdad());
        }

        System.out.println("============ COMPARATOR ==================");
        System.out.println("Lista Comparator sin ordenar:");
        for (PersonaComparator personaComparator : personasComparator) {
            System.out.println(personaComparator.getNombre() + " edad: " + personaComparator.getEdad());
        }

        System.out.println("Lista Comparator ordenada:");
        Collections.sort(personasComparator,
            new Comparator<PersonaComparator>() {
                public int compare(PersonaComparator s1, PersonaComparator s2) {
                    return s1.getEdad() - s2.getEdad();
                }
            }
        );
        for (PersonaComparator personaComparator : personasComparator) {
            System.out.println(personaComparator.getNombre() + " edad: " + personaComparator.getEdad());
        }




    }
}
