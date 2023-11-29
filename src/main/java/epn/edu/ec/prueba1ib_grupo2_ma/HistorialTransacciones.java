package epn.edu.ec.prueba1ib_grupo2_ma;

import java.util.ArrayList;
import java.util.List;

public class HistorialTransacciones {
    private List<Registro> registros;

    public HistorialTransacciones() {
        registros = new ArrayList<>();
    }
    public void agregarRegistro(String titulo, String fecha, String usuario){
        registros.add(new Registro(titulo,usuario,fecha));
    }
}
