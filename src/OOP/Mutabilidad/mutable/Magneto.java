package OOP.Mutabilidad.mutable;

public class Magneto {
    public Magneto(String superpoder) {
        this.superpoder = superpoder;
    }

    public String getSuperpoder() {
        return superpoder;
    }

    public void setSuperpoder(String superpoder) {
        this.superpoder = superpoder;
    }

    private String superpoder;

    @Override
    public String toString() {
        return "Magneto{" +
                "superpoder='" + superpoder + '\'' +
                '}';
    }
}
