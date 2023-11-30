package epn.edu.ec.prueba1ib_grupo2_ma;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class GestorUsuariosTest {
    public static  GestorUsuarios gestorUsuarios = null;

    @BeforeClass
    public static void setUpClass() {
        gestorUsuarios = new GestorUsuarios();
        gestorUsuarios.inicializarDatos();
    }

    @Test
    public void given_valid_user_password_when_login_then_true() {
        assertTrue(gestorUsuarios.validarUsuarioContrasenia("mario14", "@rielMario144"));
    }

    @Test
    public void given_valid_user_code_when_recover_password_then_password() {
        assertNotEquals("<br><div><h2>¡No se puede recuperar la contraseña porque el código ingresado es incorrecto!</h2></div>", gestorUsuarios.recuperarContrasenia("mario14", "00001"));
    }
}