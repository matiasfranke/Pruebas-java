package OOP.Mutabilidad.inmutable;

import OOP.polimorfismo.sobrecarga.Calculadora;

public class TestInmutable {
    public static void main(String[] args) {
        // String es una clase inmutable, no se puede cambiar su estado una vez creada
        System.out.println("String es una clase inmutable, no se puede cambiar su estado una vez creada.");
        String inmutable = "Hola";
        System.out.println("Original: " + inmutable);
        inmutable.replaceAll("Ho","Bo");
        // al ser inmutable por mas que le aplique una modificacion el estado no cambia
        System.out.println("al ser inmutable por mas que le aplique una modificacion el estado no cambia. inmutable.replaceAll(\"Ho\",\"Bo\");");
        System.out.println("luego de intentar cambiar el estado: " + inmutable);
        // el resultado debe guardarse en un nuevo objeto
        System.out.println("el resultado debe guardarse en un nuevo objeto. String nuevo = inmutable.replaceAll(\"Ho\",\"Bo\");");
        String nuevo = inmutable.replaceAll("Ho","Bo");
        System.out.println("resultado guardado en un nuevo objeto: " + nuevo);

        // =============================================================================
        // Tambien podemos testear nuestra clase inmutable de ejemplo
        System.out.println("=============================================================================");
        System.out.println("Tambien podemos testear nuestra clase inmutable de ejemplo.");
        EjemploClaseInmutable ejemploClaseInmutable = new EjemploClaseInmutable("Pepe", 1);
        System.out.println("Creo clase inmutable con valores pepe y 1: " + ejemploClaseInmutable);
        // Al tener todos sus campos privados e inmutables, no tener setters y no poder ser heredada no puedo modificar su estado. siempre va a ser el estado con el que fue creada
        System.out.println("Al tener todos sus campos privados, no tener setters y no poder ser heredada no puedo modificar su estado. siempre va a ser el estado con el que fue creada.");
        int numero = ejemploClaseInmutable.getRegNo();
        numero = numero +1;
        System.out.println("Creo clase inmutable con valores pepe y 1: " + ejemploClaseInmutable);
    }
}
