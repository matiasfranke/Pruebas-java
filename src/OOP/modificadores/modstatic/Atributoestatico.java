package OOP.modificadores.modstatic;

public class Atributoestatico {

    public static final String CONSTANTE_DE_JAVA = "soy una constante";
    public static String color;
    private String forma;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        Atributoestatico.color = color;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public Atributoestatico(String color, String forma) {
        this.color = color;
        this.forma = forma;
    }
}
