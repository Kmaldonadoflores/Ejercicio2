import com.azul.tooling.in.Model;

import java.util.List;

public class Autobus {
    String place;
    Integer numero;
    Model modelo;
    List<Linea>lineas;

    public Autobus(String place, Integer numero, Model modelo, List<Linea> lineas) {
        this.place = place;
        this.numero = numero;
        this.modelo = modelo;
        this.lineas = lineas;
    }
}
