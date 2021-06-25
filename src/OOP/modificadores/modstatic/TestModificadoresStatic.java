package OOP.modificadores.modstatic;

public class TestModificadoresStatic {
    public static void main(String[] args) {
        Atributoestatico atributoestatico1 = new Atributoestatico("azul","cuadrado");
        Atributoestatico atributoestatico2 = new Atributoestatico("rojo","triangulo");
        // prueba 1
        System.out.println("Prueba 1 ====dos instancias distintas, se pisa el estatico===");
        System.out.println(atributoestatico1.getForma());
        System.out.println(atributoestatico1.getColor());

        System.out.println(atributoestatico2.getForma());
        System.out.println(atributoestatico2.getColor());

        // cual seria el output hasta aca??
        atributoestatico2.setColor("amarillo");

        // prueba 2
        System.out.println("Prueba 2 ======cambio el color en una instancia y afecta a las dos==========");
        System.out.println(atributoestatico1.getForma());
        System.out.println(atributoestatico1.getColor());

        System.out.println(atributoestatico2.getForma());
        System.out.println(atributoestatico2.getColor());

        // prueba 3
        System.out.println("Prueba 3 ========tomo el color de la clase directo============");
        System.out.println(Atributoestatico.color);

        // prueba 4
        System.out.println("Prueba 3 ====cambio el color en la clase directo========");
        Atributoestatico.color = "gris";
        System.out.println(atributoestatico1.getForma());
        System.out.println(atributoestatico1.getColor());

        System.out.println(atributoestatico2.getForma());
        System.out.println(atributoestatico2.getColor());

        // prueba 5
        System.out.println("Prueba 5 =======constante de java======");
        System.out.println(Atributoestatico.CONSTANTE_DE_JAVA);

        // no compila Atributoestatico.CONSTANTE_DE_JAVA = "sdfsdf";
        // no compila atributoestatico2.CONSTANTE_DE_JAVA = "sdfsdfsdfs";

    }
}
