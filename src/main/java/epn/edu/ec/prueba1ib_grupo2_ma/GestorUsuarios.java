package epn.edu.ec.prueba1ib_grupo2_ma;

import jakarta.servlet.http.HttpServletRequest;

import java.util.ArrayList;
import java.util.List;

public class GestorUsuarios {
    private List<Usuario> usuariosRegistrados;

    public GestorUsuarios() {
        this.usuariosRegistrados = new ArrayList<Usuario>();
    }

    public void inicializarDatos(){
        this.usuariosRegistrados.add(new Usuario("mario14","@rielMario144","00001"));
        this.usuariosRegistrados.add(new Usuario("erick1509","D@niela17","00002"));
        this.usuariosRegistrados.add(new Usuario("ragnar1717","Fl@quito16","00003"));
        this.usuariosRegistrados.add(new Usuario("dudu69","@verosDav6969","00004"));
        this.usuariosRegistrados.add(new Usuario("demencial15","B@nda1256","00005"));
    }

    public boolean validarUsuario(String usuarioIngresado) {
        for (Usuario usuario : this.usuariosRegistrados) {
            if (usuario.getNombreUsuario().equals(usuarioIngresado)){
                return true;
            }
        }
        return false;
    }

    public boolean validarUsuarioContrasenia(String usuarioIngresado, String contraseniaIngresada) {
        for (Usuario usuario : this.usuariosRegistrados) {
            if (usuario.getNombreUsuario().equals(usuarioIngresado) &&
                    usuario.getContrasenia().equals(contraseniaIngresada)){
                return true;
            }
        }
        return false;
    }

    public String recuperarContrasenia(String usuarioIngresado, String codigoIngresado) {
        for (Usuario usuario : this.usuariosRegistrados) {
            if (usuario.getNombreUsuario().equals(usuarioIngresado) &&
                    usuario.getCodigoSeguridad().equals(codigoIngresado)){
                return usuario.getContrasenia();
            }
        }
        return "<br><div><h2>¡No se puede recuperar la contraseña porque el código ingresado es incorrecto!</h2></div>";
    }

    public String mostrarErrorIngreso(){
        String resultado = "<br><div><h2>Los datos ingresados son incorrectos. Vuelva a ingresarlos correctamente.</h2></div>";
        return resultado;
    }

}
