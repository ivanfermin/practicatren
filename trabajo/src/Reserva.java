import java.util.Date;

public class Reserva {
    String localizador;
    Date fechadeEmicion;
    Ciudad ciudadOrigen;
    Ciudad ciudadDestino;
    Trayecto trayecto;

    @Override
    public String toString() {
        return "Reserva{" +
                "localizador='" + localizador + '\'' +
                ", fechadeEmicion=" + fechadeEmicion +
                ", ciudadOrigen=" + ciudadOrigen +
                ", ciudadDestino=" + ciudadDestino +
                ", trayecto=" + trayecto +
                '}';
    }

    public Reserva(String localizador, Date fechadeEmicion, Ciudad ciudadOrigen, Ciudad ciudadDestino, Trayecto trayecto) {
        this.localizador = localizador;
        this.fechadeEmicion = fechadeEmicion;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.trayecto = trayecto;
    }
}
