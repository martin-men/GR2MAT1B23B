package epn.edu.ec.prueba1ib_grupo2_ma;

public class Usuario {

    private String nombreUsuario;
    private String contrasenia;
    private String codigoSeguridad;

    public Usuario(String nombreUsuario, String contrasenia, String codigoSeguridad) {
        this.nombreUsuario = nombreUsuario;
        this. contrasenia = contrasenia;
        this.codigoSeguridad = codigoSeguridad;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getCodigoSeguridad() {
        return codigoSeguridad;
    }

    public void setCodigoSeguridad(String codigoSeguridad) {
        this.codigoSeguridad = codigoSeguridad;
    }
}
