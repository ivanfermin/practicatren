import java.util.Date;

public class Tramo {
    Ciudad origen;
    Ciudad destino;
    Date horasalida;

    @Override
    public String toString() {
        return "Tramo{" +
                "origen=" + origen +
                ", destino=" + destino +
                ", horasalida=" + horasalida +
                ", duracion=" + duracion +
                '}';
    }

    Double duracion;

    public Tramo(Ciudad origen, Ciudad destino, Date horasalida, Double duracion) {
        this.origen = origen;
        this.destino = destino;
        this.horasalida = horasalida;
        this.duracion = duracion;
    }
}
