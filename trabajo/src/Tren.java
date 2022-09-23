public class Tren {
    @Override
    public String toString() {
        return "Tren{" +
                "codigo=" + codigo +
                '}';
    }

    public Tren(int codigo) {
        this.codigo = codigo;
    }

    int codigo;
}
