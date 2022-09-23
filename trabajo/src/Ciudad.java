public class Ciudad {
    @Override
    public String toString() {
        return "Ciudad{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    public Ciudad(String nombre) {
        this.nombre = nombre;
    }

    String nombre;
}
