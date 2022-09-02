import java.util.List;

public class Modelo {
    String capacidad;
    Double consumo;
    List<Autobus> autobuses;

    public Modelo(String capacidad, Double consumo, List<Autobus> autobuses) {
        this.capacidad = capacidad;
        this.consumo = consumo;
        this.autobuses = autobuses;
    }
}
