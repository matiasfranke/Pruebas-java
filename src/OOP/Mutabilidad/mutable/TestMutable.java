package OOP.Mutabilidad.mutable;

public class TestMutable {
    public static void main(String[] args) {
        // Magneto es una clase mutable, es decir q podemos cambiar su estrado luego de su creacion
        System.out.println("Magneto es una clase mutable, es decir q podemos cambiar su estrado luego de su creacion.");
        Magneto magneto = new Magneto("Super magnetismo");
        System.out.println("Superpoder: " + magneto);

        // Al ser mutable cuando le aplique una modificacion el estado cambiara
        System.out.println("Al ser mutable cuando le aplique una modificacion el estado cambiara");
        magneto.setSuperpoder("Imancito de heladera");
        System.out.println("luego de intentar cambiar el estado: " + magneto);

    }
}
