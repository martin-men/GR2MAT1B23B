package epn.edu.ec.prueba1ib_grupo2_ma;

import java.math.BigDecimal;

public class Registro {
    private String titulo, usuario, fecha;

    public Registro(String titulo, String usuario, String fecha) {
        this.titulo = titulo;
        this.usuario = usuario;
        this.fecha = fecha;
    }

    public String getUsuario() {
        return usuario;
    }

    @Override
    public String toString() {
        return "<tr>"
                + "<td>" + titulo + "</td>"
                + "<td>" + usuario + "</td>"
                + "<td>" + fecha + "</td>"
                + "</tr>";
    }
}
