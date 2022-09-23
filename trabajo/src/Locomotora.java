public class Locomotora {
    public Locomotora(int codigo) {
        this.codigo = codigo;
    }

    int codigo;

    public Locomotora(int codigo, Tren tren) {
        this.codigo = codigo;
        this.tren = tren;
    }

    Tren tren;

    @Override
    public String toString() {
        return "Locomotora{" +
                "codigo=" + codigo +
                ", tren=" + tren +
                '}';
    }

    public Locomotora() {

    }
}
