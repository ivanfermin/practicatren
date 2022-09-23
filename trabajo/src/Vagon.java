public class Vagon {
    Tren tren;

    @Override
    public String toString() {
        return "Vagon{" +
                "tren=" + tren +
                ", capacidad=" + capacidad +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    public Vagon(Integer capacidad) {

        this.capacidad = capacidad;
        this.tipo = tipo;
    }

    Integer capacidad;
    String tipo;
}
