package OOP.Sorting;

public class PersonaComparable implements Comparable<PersonaComparable> {
    private String nombre;
    private String apellido;
    private Long dni;
    private Integer edad;

    public PersonaComparable() {
    }
    public PersonaComparable(String nombre) {
        this.nombre = nombre;
    }

    public PersonaComparable(String nombre, String apellido, Long dni, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
    }

    // getters y setters de los atributos de arriba
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    // metodos que definen el comportamiento de la clase persona

    public void come(){
        System.out.println(this.nombre + " ñom ñom ñom");
    }
    public void duerme(){
        System.out.println(this.nombre + " zzzZZz zZzzzZZz");
    }
    public void trabaja(){
        System.out.println(this.nombre + " Entra a google meets y pregunta si lo escuchan....");
    }


    @Override
    public int compareTo(PersonaComparable persona) {
        return this.edad - persona.edad;
    }
}
