package OOP.Mutabilidad.inmutable;

public final class EjemploClaseInmutable {
    final private String name;
    final private int regNo;

    public EjemploClaseInmutable(String name, int regNo)
    {
        this.name = name;
        this.regNo = regNo;
    }
    public String getName()
    {
        return name;
    }
    public int getRegNo()
    {
        return regNo;
    }

    @Override
    public String toString() {
        return "EjemploClaseInmutable{" +
                "name='" + name + '\'' +
                ", regNo=" + regNo +
                '}';
    }
}
