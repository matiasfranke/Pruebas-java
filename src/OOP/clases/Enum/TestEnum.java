package OOP.clases.Enum;


public class TestEnum {
    public static void main(String[] args) {
       System.out.println("Imprimo constante del Enum: ");
       System.out.println(EnumEstados.ONLINE);
       System.out.println("Imprimo constante obteniendola a partir de un metodo en el enum: ");
       System.out.println(EnumEstados.fromValue("OFFLINE"));
       String estado = "ONLINE";
        System.out.println("Uso enum en condicion para imprimir: ");
       if (EnumEstados.ONLINE.name().equals(estado)) {
           System.out.println("es online!");
       }
    }
}
