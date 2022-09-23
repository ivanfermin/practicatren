public class Trayecto {
    Ciudad origen;
    Ciudad destino;

    @Override
    public String toString() {
        return "Trayecto{" +
                "origen=" + origen +
                ", destino=" + destino +
                '}';
    }

    public Trayecto(Ciudad origen, Ciudad destino) {
        this.origen = origen;
        this.destino = destino;
    }
}
