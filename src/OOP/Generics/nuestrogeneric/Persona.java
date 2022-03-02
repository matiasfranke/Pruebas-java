package OOP.Generics.nuestrogeneric;

public class Persona<E> {
    private String nombre;
    private E dni;

    public Persona(String nombre, E dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public E getDni() {
        return dni;
    }

    public void setDni(E dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", dni=" + dni +
                '}';
    }
}
