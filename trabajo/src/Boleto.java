public class Boleto {
    Tren tren;
    Trayecto trayecto;
    Tramo tramo;
    Integer numeroVagon;
    Integer fila;

    @Override
    public String toString() {
        return "Boleto{" +
                "tren=" + tren +
                ", trayecto=" + trayecto +
                ", tramo=" + tramo +
                ", numeroVagon=" + numeroVagon +
                ", fila=" + fila +
                ", posicion=" + posicion +
                '}';
    }

    Character posicion;

    public Boleto(Tren tren, Trayecto trayecto, Tramo tramo, Integer numeroVagon, Integer fila, Character posicion) {
        this.tren = tren;
        this.trayecto = trayecto;
        this.tramo = tramo;
        this.numeroVagon = numeroVagon;
        this.fila = fila;
        this.posicion = posicion;
    }
}
