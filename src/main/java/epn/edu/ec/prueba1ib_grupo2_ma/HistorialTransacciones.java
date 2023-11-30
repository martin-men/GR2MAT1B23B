package epn.edu.ec.prueba1ib_grupo2_ma;

import java.math.BigDecimal;
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
    public String mostrarHistorial(String usuario){
        String salida = formarCabeceraTabla();
        int cont = 0;
        for(Registro r : registros){
            if(r.getUsuario().equals(usuario)){
                salida += r.toString();
                cont++;
            }
        }
        if (cont==0){
            return "<div>No existen registros anteriores</div>";
        }
        return salida;
    }
    private String formarCabeceraTabla(){
        return "<table>"
                + "<tr>"
                + "<th>Libro</th>"
                + "<th>Nombre</th>"
                + "<th>Fecha</th>"
                + "</tr>";
    }

}
