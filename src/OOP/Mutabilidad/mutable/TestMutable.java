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

    }
}
